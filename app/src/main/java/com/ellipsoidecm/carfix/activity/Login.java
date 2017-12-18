//package com.ellipsoidecm.carfix.activity;
//
//import android.content.Context;
//import android.content.Intent;
//import android.content.SharedPreferences;
//import android.os.AsyncTask;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.text.TextUtils;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ProgressBar;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.android.volley.AuthFailureError;
//import com.android.volley.Request;
//import com.android.volley.RequestQueue;
//import com.android.volley.Response;
//import com.android.volley.VolleyError;
//import com.android.volley.toolbox.StringRequest;
//import com.android.volley.toolbox.Volley;
//import com.ellipsoidecm.carfix.R;
//import com.ellipsoidecm.carfix.others.MySingleton;
//import com.ellipsoidecm.carfix.others.RequestHandler;
//import com.ellipsoidecm.carfix.others.SharedPrefManager;
//import com.ellipsoidecm.carfix.others.URLs;
//import com.ellipsoidecm.carfix.others.User;
//
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Login extends AppCompatActivity {
//
//    EditText editTextUsername, editTextPassword;
//    String app_server_url = "http://ellipsoid.esy.es/repairstation_API/fcm_insert.php";
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//
//
//
//        editTextUsername = (EditText) findViewById(R.id.mobilenumber);
//        editTextPassword = (EditText) findViewById(R.id.password);
//
//        //fcm
//
//
//
//        findViewById(R.id.login_button).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                userLogin();
//
//
//
//            }
//        });
//
//        //if user presses on not registered
//        findViewById(R.id.signup).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //open register screen
//
//                SharedPreferences sharedPreferences= getApplicationContext().getSharedPreferences(getString(R.string.FCM_PREF), Context.MODE_PRIVATE);
//                final String token=sharedPreferences.getString(getString(R.string.FCM_TOKEN),"");
//                StringRequest stringRequest = new StringRequest(Request.Method.POST, app_server_url, new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//
//                    }
//                }, new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//
//                    }
//                }){
//                    @Override
//                    protected Map<String ,String> getParams() throws AuthFailureError {
//                        Map<String,String> params = new HashMap<String,String>();
//                        params.put("fcm_token",token);
//                        return params;
//                    }
//                };
//                MySingleton.getmInstance(Login.this).addToRequestque(stringRequest);
//
//
//
//                Intent intent = new Intent(Login.this,Signup.class);
//                startActivity(intent);
//            }
//        });
//    }
//
//    String username,password;
//
//    private void userLogin() {
//        //first getting the values
//          username = editTextUsername.getText().toString();
//          password = editTextPassword.getText().toString();
//
//        //validating inputs
//        if (TextUtils.isEmpty(username)) {
//            editTextUsername.setError("Please enter your username");
//            editTextUsername.requestFocus();
//            return;
//        }
//
//        if (TextUtils.isEmpty(password)) {
//            editTextPassword.setError("Please enter your password");
//            editTextPassword.requestFocus();
//            return;
//        }
//
//        addtoserver();
//        //if everything is fine
//
//
//    }
//
//    private void addtoserver() {
//
//
//
//
//        StringRequest stringRequest = new StringRequest(Request.Method.POST, URLs.URL_LOGIN,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//
//                        if(response.contains("successful"))
//                        {
//
//
//
//                            startActivity(new Intent(Login.this,MainActivity.class));
//
//
//                        }
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Toast.makeText(Login.this, error.toString(), Toast.LENGTH_LONG).show();
//                    }
//                }) {
//            @Override
//            protected Map<String, String> getParams() {
//                Map<String, String> params = new HashMap<String, String>();
//                params.put("username",username);
//
//                params.put("password",password);
//
//                return params;
//            }
//
//        };
//
//
//        RequestQueue requestQueue = Volley.newRequestQueue(this);
//        requestQueue.add(stringRequest);
//
//
//
//    }
//
//}
