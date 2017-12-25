package com.ellipsoidecm.carfix.activity;

import android.app.Activity;
import android.app.Dialog;
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
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.ellipsoidecm.carfix.Manifest;
import com.ellipsoidecm.carfix.NOT_API.Noty_API;
import com.ellipsoidecm.carfix.R;
import com.ellipsoidecm.carfix.listItems.Hero;
import com.ellipsoidecm.carfix.others.CustomVolleyRequest;
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

    TextView OE,Brand,Local,Used,OE_det,Local_det,Used_det,Brand_det;
    String OE_val,Brand_val,Local_val,Used_val,ticket_id,payment_mode,oe_name,brand_name,local_name,used_name;
    private NetworkImageView tick_image;


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

        tick_image = (NetworkImageView) findViewById(R.id.ticket_image);





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
        oe_name = getIntent().getStringExtra("oe_name");
        brand_name=getIntent().getStringExtra("branded_name");
        local_name=getIntent().getStringExtra("local_name");
        used_name=getIntent().getStringExtra("used_name");



        OE = (TextView)findViewById(R.id.OE_value);
        Brand = (TextView) findViewById(R.id.Brand_value);
        Local = (TextView) findViewById(R.id.Local_value);
        Used = (TextView) findViewById(R.id.Used_value);
        send = (Button)findViewById(R.id.accept_proc);
        cancel = (Button) findViewById(R.id.reject_proc);
        OE_det = (TextView) findViewById(R.id.OE_name);
        Local_det = (TextView) findViewById(R.id.Local_name);
        Brand_det = (TextView) findViewById(R.id.Brand_name);
        Used_det = (TextView) findViewById(R.id.Used_name);

        OE_det.setText(OE_det.getText()+"\n("+oe_name+")");
        Local_det.setText(Local_det.getText()+"\n("+local_name+")");
        Brand_det.setText(Brand_det.getText()+"\n("+brand_name+")");
        Used_det.setText(Used_det.getText()+"\n("+used_name+")");



        setTitle("Ticket: "+ticket_id);

        getimage();

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

        final User user = SharedPrefManager.getInstance(this).getUser();


        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performreq(Noty_API.URL_Delete+ticket_id);
                startActivity(new Intent(Notification_Details.this,NotificationActivity.class));
            }
        });


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final Dialog pay_dialog = new Dialog(Notification_Details.this);
                pay_dialog.setContentView(R.layout.payment_mode);

                pay_dialog.show();

               RadioGroup radioGroup = (RadioGroup) pay_dialog.findViewById(R.id.myRadioGroup);

                radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        // find which radio button is selected
                        if(checkedId == R.id.cod) {
                            payment_mode="COD";
                        } else if(checkedId == R.id.online) {
                            payment_mode = "ONLINE";
                        }
                    }

                });

                final Button pay_button = (Button) pay_dialog.findViewById(R.id.proceed);

                pay_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(payment_mode.equals("COD")){
                            sendToServer("http://ellipsoid.esy.es/repairstation_API/selected_price.php");
                            Toast.makeText(getApplicationContext(),"Cod",Toast.LENGTH_SHORT).show();
                            pay_mode();
                            performreq(Noty_API.URL_Delete+ticket_id);
                            startActivity(new Intent(Notification_Details.this,MainActivity.class));


                        }
                        else if(payment_mode.equals("ONLINE")){
                            startPayment();
                        }
                    }
                });

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


              //  startPayment();

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

    ImageLoader imageLoader;

    private void loadImage(){
        String url = img_url;
        if(url.equals("")){
            Toast.makeText(this,"Please enter a URL",Toast.LENGTH_LONG).show();
            return;
        }

        imageLoader = CustomVolleyRequest.getInstance(this.getApplicationContext())
                .getImageLoader();
        imageLoader.get(url, ImageLoader.getImageListener(tick_image,
                R.drawable.ac, android.R.drawable
                        .ic_dialog_alert));
        tick_image.setImageUrl(url, imageLoader);
    }

    String img_url;
JSONArray object;

    private void getimage() {

//        User user = SharedPrefManager.getInstance(this).getUser();



        StringRequest stringRequest = new StringRequest(Request.Method.POST, "http://ellipsoid.esy.es/repairstation_API/show_notification_ticket.php?id="+ticket_id,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        // Toast.makeText(Cart.this, response, Toast.LENGTH_LONG).show();

                        try {



                            object = new JSONArray(response);

                            JSONObject mainobj=object.getJSONObject(0);
                            img_url = mainobj.getString("url");
                            loadImage();

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

    private void pay_mode() {

  //      User user = SharedPrefManager.getInstance(this).getUser();



        StringRequest stringRequest = new StringRequest(Request.Method.POST, "http://ellipsoid.esy.es/repairstation_API/mode_of_payment.php?id="+ticket_id,
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
                params.put("mode_of_payment",payment_mode);

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

            performreq(Noty_API.URL_Delete+ticket_id);
            pay_mode();


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
//
//    private void refreshlist(JSONArray array) {
//
//        try {
//            for (int i = 0; i < array.length(); i++) {
//
//                JSONObject obj = array.getJSONObject(i);
//
//                heroList.add(new Hero(
//                        obj.getInt("id"),
//                        obj.getString("slc"),
//                        obj.getString("brand"),
//                        obj.getString("model"),
//                        obj.getString("date")
//                ));
//            }
//
//            adapter = new Cart.HeroAdapter(heroList);
//            listView.setAdapter(adapter);
//            adapter.notifyDataSetChanged();
//
//
//
//        }catch(Exception e){}
//    }




}
