package com.ellipsoidecm.carfix.activity;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.ellipsoidecm.carfix.R;

public class Splash extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {


                SharedPreferences preferences = getSharedPreferences("default", MODE_PRIVATE);
                Boolean isLoggedIn = preferences.getBoolean("isLoggedIn", false);

                if (isLoggedIn) {
                    Intent i = new Intent(Splash.this, MainActivity.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                } else {

                    Intent i = new Intent(Splash.this, LoginActivity.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.push_left_out, R.anim.push_left_in);
                }
            }
        }, SPLASH_TIME_OUT);
    }
}