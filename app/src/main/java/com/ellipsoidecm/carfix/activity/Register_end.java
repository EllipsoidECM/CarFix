package com.ellipsoidecm.carfix.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ellipsoidecm.carfix.R;

import org.w3c.dom.Text;

public class Register_end extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_end);

        TextView reg_end = (TextView) findViewById(R.id.reg_response);
        reg_end.setText("Hey "+getIntent().getStringExtra("username")+" Thanks for registration, Please Log in after two min.");
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent i = new Intent(Register_end.this, LoginActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);



            }
        }, SPLASH_TIME_OUT);

    }
}
