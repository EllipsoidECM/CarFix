package com.ellipsoidecm.carfix.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Notification_Details extends AppCompatActivity implements PaymentResultListener {

    TextView OE,Brand,Local,Used;
    String OE_val,Brand_val,Local_val,Used_val,ticket_id;

    Button send,cancel;
    CheckBox c1,c2,c3,c4;
    int total=0;

    String myres="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification__details);

        setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);



        c1= (CheckBox)findViewById(R.id.OE_box);
        c2 = (CheckBox) findViewById(R.id.Brand_box);
        c3 = (CheckBox) findViewById(R.id.Local_box);
        c4 = (CheckBox) findViewById(R.id.Used_box);

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
        cancel = (Button) findViewById(R.id.reject_proc);



        setTitle("Ticket: "+ticket_id);

        OE.setText(OE_val);
        Brand.setText(Brand_val);
        Local.setText(Local_val);
        Used.setText(Used_val);

        OE_val ="N/A";
        Brand_val = "N/A";
        Local_val="N/A";
        Used_val ="N/A";

        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                                               @Override
                                               public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
                                                    if(isChecked)
                                                    {c2.setChecked(false);
                                                     c3.setChecked(false);
                                                     c4.setChecked(false);

                                                        Brand_val = "N/A";
                                                        Local_val="N/A";
                                                        Used_val ="N/A";
                                                    }
                                               }
                                           }
        );

        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                                          @Override
                                          public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
                                              if(isChecked)
                                              {c1.setChecked(false);
                                              c3.setChecked(false);
                                              c4.setChecked(false);
                                                  OE_val ="N/A";
                                                  Local_val="N/A";
                                                  Used_val ="N/A";
                                              }
                                          }
                                      }
        );

        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                                          @Override
                                          public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
                                              if(isChecked)
                                              {c2.setChecked(false);
                                                  c1.setChecked(false);
                                                  c4.setChecked(false);
                                                  OE_val ="N/A";
                                                  Brand_val = "N/A";
                                                  Used_val ="N/A";
                                              }
                                          }
                                      }
        );

        c4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                                          @Override
                                          public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
                                              if(isChecked)
                                              {c2.setChecked(false);
                                                  c1.setChecked(false);
                                                  c3.setChecked(false);
                                                  OE_val ="N/A";
                                                  Brand_val = "N/A";
                                                  Local_val="N/A";
                                              }
                                          }
                                      }
        );

//
//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                RadioButton rb = (RadioButton) group.findViewById(checkedId);
//                if (null != rb && checkedId > -1) {
//                    Toast.makeText(Notification_Details.this, rb.getText(), Toast.LENGTH_SHORT).show();
//                }
//
//            }
//        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do nothing for now
            }
        });


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                total=0;

                if(isNumber(OE_val))
                {total=total+Integer.parseInt(OE_val);}
                if(isNumber(Brand_val))
                {total=total+Integer.parseInt(Brand_val);}
                if(isNumber(Local_val))
                {total=total+Integer.parseInt(Local_val);}
                if(isNumber(Used_val))
                {total=total+Integer.parseInt(Used_val);}

                Toast.makeText(Notification_Details.this,"Total: "+total,Toast.LENGTH_SHORT).show();


                startPayment();

            }
        });

    }

    public static boolean isNumber(String string) {
        try {
            Long.parseLong(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void startPayment() {
        /*
          You need to pass current activity in order to let Razorpay create CheckoutActivity
         */

        final Activity activity = this;

        final Checkout co = new Checkout();

        try {

            User user = SharedPrefManager.getInstance(this).getUser();

            JSONObject options = new JSONObject();
            options.put("name", "Ellipsoid ECM");
            options.put("description", " Charges");
            //You can omit the image option to fetch the image from dashboard
          //  options.put("image", "https://rzp-mobile.s3.amazonaws.com/images/rzp.png");
            options.put("currency", "INR");
            options.put("amount", total*100+"");

            JSONObject preFill = new JSONObject();
            preFill.put("email", user.getEmail());
            preFill.put("contact", user.getUsername());

            options.put("prefill", preFill);

            co.open(activity, options);
        } catch (Exception e) {
            Toast.makeText(activity, "Error in payment: " + e.getMessage(), Toast.LENGTH_SHORT)
                    .show();
            e.printStackTrace();
        }
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

    private static final String TAG = Notification_Details.class.getSimpleName();


    /**
     * The name of the function has to be
     * onPaymentSuccess
     * Wrap your code in try catch, as shown, to ensure that this method runs correctly
     */
    @SuppressWarnings("unused")
    @Override
    public void onPaymentSuccess(String razorpayPaymentID) {
        try {
            Toast.makeText(this, "Payment Successful: " + razorpayPaymentID, Toast.LENGTH_SHORT).show();
           // Toast.makeText(getApplicationContext(),OE_val+" "+Brand_val+" "+Local_val+" "+Used_val,Toast.LENGTH_SHORT).show();
            sendToServer("http://ellipsoid.esy.es/repairstation_API/selected_price.php");
        } catch (Exception e) {
            Log.e(TAG, "Exception in onPaymentSuccess", e);
        }
    }

    /**
     * The name of the function has to be
     * onPaymentError
     * Wrap your code in try catch, as shown, to ensure that this method runs correctly
     */
    @SuppressWarnings("unused")
    @Override
    public void onPaymentError(int code, String response) {
        try {
            Toast.makeText(this, "Payment failed: " + code + " " + response, Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Log.e(TAG, "Exception in onPaymentError", e);
        }
    }



}
