
package com.ellipsoidecm.carfix.activity;


        import android.content.Intent;
        import android.content.SharedPreferences;
        import android.os.Bundle;
        import android.os.Handler;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.Toast;

        import com.ellipsoidecm.carfix.R;
        import com.ellipsoidecm.carfix.others.ApplicationUtility;

public class Splash extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        boolean checkConnection=new ApplicationUtility().checkConnection(this);
        if (checkConnection){

            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {

                    SharedPreferences preferences = getSharedPreferences("default", MODE_PRIVATE);
                    Boolean isLoggedIn = preferences.getBoolean("isLoggedIn", false);


                    if (isLoggedIn) {
                        Intent i = new Intent(Splash.this, MainActivity.class);
                        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                        startActivity(i);

                    } else {

                        Intent i = new Intent(Splash.this, LoginActivity.class);
                        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                        startActivity(i);
                    }
                }
            }, SPLASH_TIME_OUT);

        } else {

            Toast.makeText(getApplicationContext(), "Connection not Found... Kindly Check Connection",
                    Toast.LENGTH_LONG).show();

        }


    }
}