package com.ellipsoidecm.carfix.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.ellipsoidecm.carfix.NOT_API.Noty_API;
import com.ellipsoidecm.carfix.R;
import com.ellipsoidecm.carfix.listItems.Hero;
import com.ellipsoidecm.carfix.others.NotificationModel;
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

public class NotificationActivity extends AppCompatActivity {

    public List<NotificationModel> heroList;
    NotificationAdapter adapter;
    ListView listView;

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView= (ListView) findViewById(R.id.notify_list);
        heroList = new ArrayList<>();
        setTitle("Notifications");

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        user = SharedPrefManager.getInstance(this).getUser();


        performreq(Noty_API.URL_VIEW+user.getId());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(this,MainActivity.class));
                return true;
        }

        return super.onOptionsItemSelected(item);
    }




    JSONArray object;

    private void performreq(String url) {

//        User user = SharedPrefManager.getInstance(this).getUser();



        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                       //  Toast.makeText(NotificationActivity.this, response, Toast.LENGTH_LONG).show();

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
                        Toast.makeText(NotificationActivity.this, error.toString(), Toast.LENGTH_LONG).show();
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
        heroList.clear();

        try {
            for (int i = 0; i < array.length(); i++) {

                JSONObject obj = array.getJSONObject(i);

                heroList.add(new NotificationModel(
                        obj.getString("ticket_id"),
                        obj.getString("oe_price"),
                        obj.getString("branded_price"),
                        obj.getString("local_price"),
                        obj.getString("used_price"),
                        obj.getString("oe_name"),
                        obj.getString("branded_name"),
                        obj.getString("local_name"),
                        obj.getString("used_name")
                ));
            }

         //   Toast.makeText(getApplicationContext(),heroList.get(1).getTicket_id(),Toast.LENGTH_SHORT).show();

            adapter = new NotificationAdapter(heroList);

            listView.setAdapter(adapter);
            adapter.notifyDataSetChanged();



        }catch(Exception e){}
    }


    public class NotificationAdapter extends ArrayAdapter<NotificationModel> {
        List<NotificationModel> heroList = new ArrayList<NotificationModel>();

      //  private Context context;




        public NotificationAdapter(List<NotificationModel> herolist) {
            // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
            // the second argument is used when the ArrayAdapter is populating a single TextView.
            // Because this is a custom adapter for two TextViewsw, the adapter is not
            // going to use this second argument, so it can be any value. Here, we used 0.
            super(NotificationActivity.this, R.layout.notification_list, herolist);
            this.heroList = herolist;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Check if the existing view is being reused, otherwise inflate the view
//            View listItemView = convertView;
//            if (listItemView == null) {
//                listItemView = LayoutInflater.from(getContext()).inflate(
//                        R.layout.notification_list, parent, false);
//            }

            final LayoutInflater inflater = getLayoutInflater();

            View listItemView = inflater.inflate(R.layout.notification_list,null,true);

            TextView tickettext =(TextView) listItemView.findViewById(R.id.tick_id);

            final NotificationModel noty = heroList.get(position);



            listItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(NotificationActivity.this, Notification_Details.class);
                    intent.putExtra("Ticket_id",noty.getTicket_id());
                    intent.putExtra("OE_value",noty.getOE_price());
                    intent.putExtra("Brand_value",noty.getBrand_price());
                    intent.putExtra("Local_value",noty.getLocal_price());
                    intent.putExtra("Used_value",noty.getUsed_price());
                    intent.putExtra("oe_name",noty.getOe_name());
                    intent.putExtra("branded_name",noty.getBranded_name());
                    intent.putExtra("local_name",noty.getLocal_name());
                    intent.putExtra("used_name",noty.getUsed_name());
                    startActivity(intent);
                }
            });




            tickettext.setText(noty.getTicket_id());

            return listItemView;
        }
    }






}
