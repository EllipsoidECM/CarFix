package com.ellipsoidecm.carfix.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
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
import com.ellipsoidecm.carfix.R;
import com.ellipsoidecm.carfix.others.RequestHandler;
import com.ellipsoidecm.carfix.others.SharedPrefManager;
import com.ellipsoidecm.carfix.others.URLs;
import com.ellipsoidecm.carfix.others.User;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Adil on 30-11-2017.
 */

public class Signup extends AppCompatActivity {

    ImageView two;
    EditText reg_name, reg_email, reg_pass,reg_bname,reg_mobile,reg_address;
    RadioGroup radioGroupGender;

  //  String url = "http://ellipsoid.esy.es/DispatchAPI/Api.php?apicall=signup";
    String mobile,address, fcm,bname,name,email,password;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        two = (ImageView) findViewById(R.id.logofont2);
//        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/fontopo.ttf");
//        two.setTypeface(custom_font);

        //if the user is already logged in we will directly start the profile activity
        SharedPreferences sharedPreferences = getSharedPreferences("default", MODE_PRIVATE);

        if (sharedPreferences.getBoolean("isLoggedIn",false)) {
            finish();
            startActivity(new Intent(this, MainActivity.class));
            return;
        }

        reg_name = (EditText) findViewById(R.id.reg_name);
        reg_email = (EditText) findViewById(R.id.reg_mail);
        reg_pass = (EditText) findViewById(R.id.reg_pass);
        reg_bname = (EditText) findViewById(R.id.reg_bname);
        reg_mobile=(EditText) findViewById(R.id.reg_mobile);
        reg_address = (EditText) findViewById(R.id.reg_address);


        findViewById(R.id.buttonRegister).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if user pressed on button register
                //here we will register the user to server

              //  registerUser();

                addtoserver();

            }
        });

        findViewById(R.id.textViewLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if user pressed on login
                //we will open the login screen
                finish();
                startActivity(new Intent(Signup.this, LoginActivity.class));
            }
        });

    }

    private void addtoserver() {

        mobile = reg_mobile.getText().toString();
        name = reg_name.getText().toString();
        password = reg_pass.getText().toString();
        email = reg_email.getText().toString();
        address = reg_address.getText().toString();

        SharedPreferences sharedPreferences= getApplicationContext().getSharedPreferences(getString(R.string.FCM_PREF), Context.MODE_PRIVATE);
        final String token=sharedPreferences.getString(getString(R.string.FCM_TOKEN),"");

        bname = reg_bname.getText().toString();





        StringRequest stringRequest = new StringRequest(Request.Method.POST, URLs.URL_REGISTER,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                       // Toast.makeText(Signup.this, response, Toast.LENGTH_LONG).show();


                        try {

                            JSONObject root = new JSONObject(response);
                            String error = root.getString("error");

                            JSONObject user = root.getJSONObject("user");
                            String username = user.getString("username");
                          //  Toast.makeText(Signup.this,""+error,Toast.LENGTH_SHORT).show();

                            if (error.contains("false")) {
                                Intent intent = new Intent(Signup.this, Register_end.class);
                                intent.putExtra("username", username);
                                startActivity(intent);

                            }

                        }catch (Exception e){
                            Toast.makeText(Signup.this,"error in Json",Toast.LENGTH_SHORT).show();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Signup.this, error.toString(), Toast.LENGTH_LONG).show();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();
                params.put("username",mobile);
                params.put("address",address);
                params.put("fcm",token);
                params.put("bname",bname);
                params.put("name",name);
                params.put("email",email);
                params.put("password",password);
            //    params.put("gender","n/a");

                return params;
            }

        };


        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);



    }



}
