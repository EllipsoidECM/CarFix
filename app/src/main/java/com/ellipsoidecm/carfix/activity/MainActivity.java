package com.ellipsoidecm.carfix.activity;


import android.app.ActionBar;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.provider.ContactsContract;
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
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.ellipsoidecm.carfix.NOT_API.Noty_API;
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
import com.ellipsoidecm.carfix.others.NotificationModel;
import com.ellipsoidecm.carfix.others.RequestHandler;
import com.ellipsoidecm.carfix.others.SharedPrefManager;
import com.ellipsoidecm.carfix.others.User;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    View actionView,actionView1;
    TextView textCartItemCount;
    //    public static int mCartItemCount = 0;
    private static final int CODE_GET_REQUEST = 1024;
    private static final int CODE_POST_REQUEST = 1025;
    public List<Hero> heroList;
    public List<NotificationModel> heroList1;


    private BroadcastReceiver broadcastReceiver;
    Drawable drawable;
    LayerDrawable iconLayer = null;

    public static int navItemIndex = 0;

    public static int mCartCount = 0;

    public static int mNotyCount = 0;

    //  public static final String TOKEN_BROADCAST = "myfcmtokenbroadcast";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        heroList = new ArrayList<>();

        heroList1 = new ArrayList<>();


        User user = SharedPrefManager.getInstance(this).getUser();

        performreq("http://ellipsoid.esy.es/repairstation_API/showcart.php?id=" + user.getId());
        performreq1(Noty_API.URL_VIEW+user.getId());


        Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "Select Car Details", Snackbar.LENGTH_SHORT);
        snackbar.show();

        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.FCM_PREF), Context.MODE_PRIVATE);


        //   Log.d("tokenbroad",sharedPreferences.getString())


        FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
        tx.replace(R.id.content, new Home());
        tx.commit();

        SharedPreferences.Editor editor = getSharedPreferences("default", MODE_PRIVATE).edit();
        editor.putBoolean("isLoggedIn", true);
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

    }

    TextView textNotyItemCount;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.main, menu);

        final MenuItem menuItem = menu.findItem(R.id.action_cart);
        final MenuItem menuItem1 = menu.findItem(R.id.action_notification);


        try {
            actionView = MenuItemCompat.getActionView(menuItem);
            actionView1 = MenuItemCompat.getActionView(menuItem1);

            textCartItemCount = (TextView) actionView.findViewById(R.id.cart_badge);
            setupBadge();

            textNotyItemCount = (TextView) actionView1.findViewById(R.id.notification_badge);
            setupBadge1();

            actionView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onOptionsItemSelected(menuItem);
                }
            });

            actionView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onOptionsItemSelected(menuItem1);
                }
            });

        } catch (Exception e) {
        }


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

    private void setupBadge1() {

        if (textNotyItemCount != null) {
            if (mNotyCount == 0) {
                if (textNotyItemCount.getVisibility() != View.GONE) {
                    textNotyItemCount.setVisibility(View.GONE);
                }
            } else {
                textNotyItemCount.setText(String.valueOf(Math.min(mNotyCount, 99)));
                if (textNotyItemCount.getVisibility() != View.VISIBLE) {
                    textNotyItemCount.setVisibility(View.VISIBLE);
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

        }

        return super.onOptionsItemSelected(item);
    }

    private void bellIcon() {
        startActivity(new Intent(MainActivity.this, NotificationActivity.class));
    }

    private void cartIcon() {

        Intent intent = new Intent(MainActivity.this, Cart.class);
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
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
                break;
            case R.id.nav_aboutus:
                fragment = new AboutUs();
                break;
            case R.id.nav_privacy:
                fragment = new PrivacyPolicy();
                break;
            case R.id.nav_help:
                startActivity(new Intent(MainActivity.this, FeedBack.class));
                break;
            case R.id.nav_how:
                startActivity(new Intent(MainActivity.this, HowItWorks.class));
                break;
            case R.id.nav_logout:

                SharedPreferences.Editor editor = getSharedPreferences("default", MODE_PRIVATE).edit();
                editor.putBoolean("isLoggedIn", false);
                editor.commit();

                startActivity(new Intent(MainActivity.this, LoginActivity.class));
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

    JSONArray object;

    private void performreq(String url) {

        User user = SharedPrefManager.getInstance(this).getUser();


        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        // Toast.makeText(Cart.this, response, Toast.LENGTH_LONG).show();

                        try {

                            object = new JSONArray(response);

                            refreshHeroList(object);


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this, error.toString(), Toast.LENGTH_LONG).show();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();


                return params;
            }

        };


        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

        try {
            refreshHeroList(object);

        } catch (Exception e) {
        }


    }


    private void refreshHeroList(JSONArray heroes) throws JSONException {
        // heroList.clear();


        try {
            for (int i = 0; i < heroes.length(); i++) {

                JSONObject obj = heroes.getJSONObject(i);

                heroList.add(new Hero(
                        obj.getInt("id"),
                        obj.getString("slc"),
                        obj.getString("brand"),
                        obj.getString("model"),
                        obj.getString("date")
                ));


                mCartCount = heroList.size();

                setupBadge();
            }

        }catch(Exception e){
            }
        }

    private void performreq1(String url) {

//        User user = SharedPrefManager.getInstance(this).getUser();



        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        // Toast.makeText(MainActivity.this, response, Toast.LENGTH_LONG).show();

                        try {

                            object = new JSONArray(response);

                            refreshlist(object);






                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this, error.toString(), Toast.LENGTH_LONG).show();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();


                return params;
            }

        };


        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);


        refreshlist(object);


    }


    private void refreshlist(JSONArray array) {
       heroList1.clear();

        try {
            for (int i = 0; i < array.length(); i++) {

                JSONObject obj = array.getJSONObject(i);

                heroList1.add(new NotificationModel(
                        obj.getString("ticket_id"),
                        obj.getString("oe_price"),
                        obj.getString("branded_price"),
                        obj.getString("local_price"),
                        obj.getString("used_price")
                ));
            }

            //  Toast.makeText(getApplicationContext(), array.length() + "", Toast.LENGTH_SHORT).show();

            //  Toast.makeText(getApplicationContext(),heroList.get(1).getTicket_id(),Toast.LENGTH_SHORT).show();

            mNotyCount = array.length();

            setupBadge1();
        }catch (Exception e){}


    }



}









