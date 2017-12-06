package com.ellipsoidecm.carfix.activity;


import android.app.ActionBar;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.design.widget.Snackbar;
//import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.ellipsoidecm.carfix.R;
import com.ellipsoidecm.carfix.cartAPI.API;
import com.ellipsoidecm.carfix.fragment.AboutUs;
import com.ellipsoidecm.carfix.fragment.Home;
import com.ellipsoidecm.carfix.fragment.Language;
import com.ellipsoidecm.carfix.fragment.MyAccount;
import com.ellipsoidecm.carfix.fragment.PrivacyPolicy;
import com.ellipsoidecm.carfix.fragment.Wallet;
import com.ellipsoidecm.carfix.listItems.Hero;
import com.ellipsoidecm.carfix.others.MySingleton;
import com.ellipsoidecm.carfix.others.RequestHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    View actionView;
    TextView textCartItemCount;
//    public static int mCartItemCount = 0;
private static final int CODE_GET_REQUEST = 1024;
    private static final int CODE_POST_REQUEST = 1025;
    public List<Hero> heroList;



    private BroadcastReceiver broadcastReceiver;
    Drawable drawable;
    LayerDrawable iconLayer= null;

    public static int navItemIndex = 0;

    public static int mCartCount=0;

  //  public static final String TOKEN_BROADCAST = "myfcmtokenbroadcast";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        heroList = new ArrayList<>();



        readHeroes();


        Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "Select Car Details", Snackbar.LENGTH_LONG);
        snackbar.show();

        SharedPreferences sharedPreferences= getApplicationContext().getSharedPreferences(getString(R.string.FCM_PREF), Context.MODE_PRIVATE);


     //   Log.d("tokenbroad",sharedPreferences.getString())


        FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
        tx.replace(R.id.content, new Home());
        tx.commit();

        SharedPreferences.Editor editor = getSharedPreferences("default", MODE_PRIVATE).edit();
        editor.putString("isLoggedIn", "true");
        editor.commit();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionabarbackground);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //add this line to display menu1 when the activity is loaded
        displaySelectedScreen(R.id.nav_view);

        if (savedInstanceState == null) {
            navItemIndex = 0;
            loadHomeFragment();
        }
    }



    private void loadHomeFragment() {

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.main, menu);

        final MenuItem menuItem = menu.findItem(R.id.action_cart);

        try {
            actionView = MenuItemCompat.getActionView(menuItem);

            textCartItemCount = (TextView) actionView.findViewById(R.id.cart_badge);
            setupBadge();

            actionView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onOptionsItemSelected(menuItem);
                }
            });

        }catch (Exception e){}




        return true;
    }

    private void setupBadge() {

        if (textCartItemCount != null) {
            if (mCartCount == 0) {
                if (textCartItemCount.getVisibility() != View.GONE) {
                    textCartItemCount.setVisibility(View.GONE);
                }
            } else {
                textCartItemCount.setText(String.valueOf(Math.min(mCartCount, 99)));
                if (textCartItemCount.getVisibility() != View.VISIBLE) {
                    textCartItemCount.setVisibility(View.VISIBLE);
                }
            }
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_cart:
                cartIcon();
                return true;
            case R.id.action_notification:
                bellIcon();
                return true;
            case R.id.mainlogout:

                SharedPreferences.Editor editor = getSharedPreferences("default", MODE_PRIVATE).edit();
                editor.putString("isLoggedIn", "false");
                editor.commit();
                startActivity(new Intent(MainActivity.this, Login.class));
                return true;

        }

        return super.onOptionsItemSelected(item);
    }

    private void bellIcon() {

    }

    private void cartIcon() {

        Intent intent = new Intent(MainActivity.this,Cart.class);
        startActivity(intent);
        finish();
    }

    private void displaySelectedScreen(int itemId) {

        //creating fragment object
        Fragment fragment = null;

        //initializing the fragment object which is selected
        switch (itemId) {
            case R.id.nav_home:
                fragment = new Home();
                break;
            case R.id.nav_wallet:
                fragment = new Wallet();
                break;
            case R.id.nav_cart:
                startActivity(new Intent(MainActivity.this, Cart.class));
                break;
            case R.id.nav_language:
                fragment = new Language();
                break;
            case R.id.nav_orders:
                startActivity(new Intent(MainActivity.this, Orders.class));
                break;
            case R.id.nav_profile:
                fragment = new MyAccount();
                break;
            case R.id.nav_aboutus:
                fragment = new AboutUs();
                break;
            case R.id.nav_privacy:
                fragment = new PrivacyPolicy();
                break;
            case R.id.nav_help:
                fragment = new PrivacyPolicy();
                break;
            case R.id.nav_how:
                startActivity(new Intent(MainActivity.this, HowItWorks.class));
                break;
            case R.id.nav_logout:

                SharedPreferences.Editor editor = getSharedPreferences("default", MODE_PRIVATE).edit();
                editor.putString("isLoggedIn", "false");
                editor.commit();
                startActivity(new Intent(MainActivity.this, Login.class));
                break;
        }

        //replacing the fragment
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content, fragment);
            ft.commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        //calling the method displayselectedscreen and passing the id of selected menu
        displaySelectedScreen(item.getItemId());
        return true;
    }

    private void readHeroes() {
        MainActivity.PerformNetworkRequest request = new MainActivity.PerformNetworkRequest(API.URL_READ_HEROES, null, CODE_GET_REQUEST);
        request.execute();
    }

    private class PerformNetworkRequest extends AsyncTask<Void, Void, String> {
        String url;
        HashMap<String, String> params;
        int requestCode;

        PerformNetworkRequest(String url, HashMap<String, String> params, int requestCode) {
            this.url = url;
            this.params = params;
            this.requestCode = requestCode;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            try {
                JSONObject object = new JSONObject(s);
                if (!object.getBoolean("error")) {
                   // Toast.makeText(getApplicationContext(), object.getString("message"), Toast.LENGTH_SHORT).show();
                    refreshHeroList(object.getJSONArray("heroes"));

                }
                else {                    Toast.makeText(getApplicationContext(),"Check Internet Connection", Toast.LENGTH_SHORT).show();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override
        protected String doInBackground(Void... voids) {
            RequestHandler requestHandler = new RequestHandler();

            if (requestCode == CODE_POST_REQUEST)
                return requestHandler.sendPostRequest(url, params);


            if (requestCode == CODE_GET_REQUEST)
                return requestHandler.sendGetRequest(url);

            return null;
        }


    }

    private void refreshHeroList(JSONArray heroes) throws JSONException {
       // heroList.clear();

        for (int i = 0; i < heroes.length(); i++) {
            JSONObject obj = heroes.getJSONObject(i);

            heroList.add(new Hero(
                    obj.getInt("id"),
                    obj.getString("partname"),
                    obj.getString("brand"),
                    obj.getString("model"),
                    obj.getString("date")
            ));
        }

        mCartCount=heroList.size();
        setupBadge();
    }




    }




