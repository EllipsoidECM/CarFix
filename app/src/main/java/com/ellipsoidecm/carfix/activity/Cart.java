package com.ellipsoidecm.carfix.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.ellipsoidecm.carfix.R;
import com.ellipsoidecm.carfix.adapter.CompletedTicketAdapter;
import com.ellipsoidecm.carfix.cartAPI.API;
import com.ellipsoidecm.carfix.config.ConfigTickets;
import com.ellipsoidecm.carfix.listItems.CompletedTicketItems;
import com.ellipsoidecm.carfix.listItems.Hero;
import com.ellipsoidecm.carfix.others.RequestHandler;
import com.ellipsoidecm.carfix.others.SharedPrefManager;
import com.ellipsoidecm.carfix.others.URLs;
import com.ellipsoidecm.carfix.others.User;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static android.view.View.GONE;

public class Cart extends AppCompatActivity {

    private static final int CODE_GET_REQUEST = 1024;
    private static final int CODE_POST_REQUEST = 1025;
    ProgressBar progressBar;
    ListView listView;

    Button checkout,shop;
    int count=0;
    ImageButton refresh;
    ImageButton backbutton;


    public List<Hero> heroList;

    HeroAdapter adapter;

    User user;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);



        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        listView = (ListView) findViewById(R.id.listViewHeroes);

        backbutton = (ImageButton) findViewById(R.id.backarrow);

        refresh = (ImageButton) findViewById(R.id.refreshbutton);

        heroList = new ArrayList<>();
        setTitle("Checkout");

        shop = (Button) findViewById(R.id.shop);
        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cart.this,Step2.class);
                startActivity(i);
                finish();
            }
        });


        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Cart.this,MainActivity.class));
            }
        });


        user = SharedPrefManager.getInstance(this).getUser();

        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                performreq("http://ellipsoid.esy.es/repairstation_API/showcart.php?id="+user.getId());
            }
        });



        performreq("http://ellipsoid.esy.es/repairstation_API/showcart.php?id="+user.getId());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // todo: goto back activity from here

                Intent intent = new Intent(Cart.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
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

                    refreshlist(object);
                    adapter.notifyDataSetChanged();






            } catch (JSONException e) {
                e.printStackTrace();
            }


                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Cart.this, error.toString(), Toast.LENGTH_LONG).show();
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







    class HeroAdapter extends ArrayAdapter<Hero> {
        List<Hero> heroList = new ArrayList<Hero>();

        public HeroAdapter(List<Hero> heroList) {
            super(Cart.this, R.layout.cart_list, heroList);
            this.heroList = heroList;
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = getLayoutInflater();
            View listViewItem = inflater.inflate(R.layout.cart_list, null, true);

            TextView textViewSpare = listViewItem.findViewById(R.id.cartspare);
            TextView textViewBrand = listViewItem.findViewById(R.id.cartbrand);
            TextView textViewModel = listViewItem.findViewById(R.id.cartmodel);
            TextView textViewDate = listViewItem.findViewById(R.id.cartdate);

            ImageView imageViewDelete = listViewItem.findViewById(R.id.delete);

            final Hero hero = heroList.get(position);

            textViewSpare.setText(hero.getSparePart());
            textViewBrand.setText(hero.getBrand());
            textViewModel.setText(hero.getModel());
            textViewDate.setText(hero.getDate());

            checkout = (Button) findViewById(R.id.checkout);
            checkout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final Dialog checkout = new Dialog(Cart.this);
                    checkout.setContentView(R.layout.dialog_checkout);

                    Button cancel = (Button) checkout.findViewById(R.id.cancelcheckout);
                    cancel.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            checkout.dismiss();
                        }
                    });

                    Button check = (Button) checkout.findViewById(R.id.checkoutbutton);
                    check.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            movehero(hero.getId());
                            movehome();
                            checkout.dismiss();


                        }
                    });

                    checkout.show();
                }
            });
            

            imageViewDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    AlertDialog.Builder builder = new AlertDialog.Builder(Cart.this);

                    builder.setTitle("Delete " + hero.getSparePart())
                            .setMessage("Are you sure you want to delete it?")
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {

                                    deleteHero(hero.getId());
                                }
                            })
                            .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            })
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();

                }
            });

            return listViewItem;
        }
    }

    private void movehome() {
        Intent i = new Intent(Cart.this,ThankYou.class);
        startActivity(i);
        finish();

    }

    private void deleteHero(int id) {

            performreq("http://ellipsoid.esy.es/repairstation_API/cart_delete.php?id="+id);
        performreq("http://ellipsoid.esy.es/repairstation_API/showcart.php?id="+user.getId());

//        PerformNetworkRequest request = new PerformNetworkRequest(API.URL_DELETE_HERO + id, null, CODE_GET_REQUEST);
//        request.execute();
    }

    private void movehero(int id) {
//        PerformNetworkRequest req = new PerformNetworkRequest( API.URL_MOVE_HERO + id,null,CODE_GET_REQUEST);
//        req.execute();
        performreq("http://ellipsoid.esy.es/repairstation_API/cart_move.php?id="+user.getId());
        performreq("http://ellipsoid.esy.es/repairstation_API/showcart.php?id="+user.getId());
        startActivity(new Intent(Cart.this,ThankYou.class));


    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }

    private void refreshlist(JSONArray array) {
        heroList.clear();

        try {
            for (int i = 0; i < array.length(); i++) {

                JSONObject obj = array.getJSONObject(i);

                heroList.add(new Hero(
                        obj.getInt("id"),
                        obj.getString("slc"),
                        obj.getString("brand"),
                        obj.getString("model"),
                        obj.getString("date")
                ));
        }

        adapter = new HeroAdapter(heroList);
            listView.setAdapter(adapter);
            adapter.notifyDataSetChanged();



        }catch(Exception e){}
    }






}
