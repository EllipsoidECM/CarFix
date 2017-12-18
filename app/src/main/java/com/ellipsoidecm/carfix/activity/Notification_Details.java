package com.ellipsoidecm.carfix.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.ellipsoidecm.carfix.Manifest;
import com.ellipsoidecm.carfix.NOT_API.Noty_API;
import com.ellipsoidecm.carfix.R;
import com.ellipsoidecm.carfix.others.SharedPrefManager;
import com.ellipsoidecm.carfix.others.URLs;
import com.ellipsoidecm.carfix.others.User;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.HashMap;
import java.util.Map;

public class Notification_Details extends AppCompatActivity {

    TextView OE,Brand,Local,Used;
    String OE_val,Brand_val,Local_val,Used_val,ticket_id;

    Button send,cancel;

    String myres="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification__details);

        setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);



        Bundle extras = getIntent().getExtras();

        OE_val =getIntent().getStringExtra("OE_value");
        ticket_id =getIntent().getStringExtra("Ticket_id");
        Brand_val = getIntent().getStringExtra("Brand_value");
        Local_val=getIntent().getStringExtra("Local_value");
        Used_val = getIntent().getStringExtra("Used_value");




        OE = (TextView)findViewById(R.id.OE_value);
        Brand = (TextView) findViewById(R.id.Brand_value);
        Local = (TextView) findViewById(R.id.Local_value);
        Used = (TextView) findViewById(R.id.Used_value);
        send = (Button)findViewById(R.id.accept_proc);



        setTitle("Ticket: "+ticket_id);

        OE.setText(OE_val);
        Brand.setText(Brand_val);
        Local.setText(Local_val);
        Used.setText(Used_val);

        OE_val ="N/A";
        Brand_val = "N/A";
        Local_val="N/A";
        Used_val ="N/A";


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),OE_val+" "+Brand_val+" "+Local_val+" "+Used_val,Toast.LENGTH_SHORT).show();
               sendToServer("http://ellipsoid.esy.es/repairstation_API/selected_price.php");
            }
        });



    }

    public void checkBoxSelection(View view)
    { boolean checked = ((CheckBox)view).isChecked();
        switch (view.getId())
        {
            case R.id.OE_box:
                if(checked)
                {OE_val=getIntent().getStringExtra("OE_value");}


                else {OE_val="N/A";}
                break;
            case R.id.Brand_box:
                if(checked)
                { Brand_val=getIntent().getStringExtra("Brand_value"); }
                else {
                    Brand_val="N/A";
                    }

                break;
            case R.id.Local_box:
                if(checked)
                {   Local_val=getIntent().getStringExtra("Local_value"); }
                else {
                    Local_val="N/A";
                    }

                break;
            case R.id.Used_box:
                if(checked)
                { Used_val=getIntent().getStringExtra("Used_value"); }
                else { Used_val="N/A";
                    }

                break;
        }

    }

    private void sendToServer(String url) {







        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(Notification_Details.this, response, Toast.LENGTH_LONG).show();

                        if(response.contains("success"))
                        {   performreq(Noty_API.URL_Delete+ticket_id);
                            startActivity(new Intent(Notification_Details.this,MainActivity.class));

                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Notification_Details.this, error.toString(), Toast.LENGTH_LONG).show();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();

               User user = SharedPrefManager.getInstance(Notification_Details.this).getUser();


                params.put("mechanic_id",user.getId()+"");
                    params.put("ticket_id",ticket_id);
                    params.put("oe_price",OE_val);
                    params.put("branded_price",Brand_val);
                    params.put("local_price",Local_val);
                    params.put("used_price",Used_val);


                return params;
            }

        };


        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);



    }



    private void performreq(String url) {

//        User user = SharedPrefManager.getInstance(this).getUser();



        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        // Toast.makeText(Cart.this, response, Toast.LENGTH_LONG).show();

                        try {







                        } catch (Exception e) {
                            e.printStackTrace();
                        }


                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Notification_Details.this, error.toString(), Toast.LENGTH_LONG).show();
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





    }



}
