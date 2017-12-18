package com.ellipsoidecm.carfix.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.ellipsoidecm.carfix.R;
import com.ellipsoidecm.carfix.others.SharedPrefManager;
import com.ellipsoidecm.carfix.others.User;

import java.util.HashMap;
import java.util.Map;

public class Step3 extends AppCompatActivity {

    TextView brand, year, model, variant, hc, lc, slc, partnumber,part,partdescription;

    ImageView finalimage;

    Button edit, cont;

    public static final String INSERT_URL = "http://ellipsoid.esy.es/repairstation_API/cart.php";
    public static final String KEY_BRAND = "brand";
    public static final String KEY_YEAR = "year";
    public static final String KEY_MODEL = "model";
    public static final String KEY_VARIANT = "variant";
    public static final String KEY_HC = "hc";
    public static final String KEY_LC = "lc";
    public static final String KEY_SLC ="slc";
    public static final String KEY_PARTNAME = "partdescription";
    public static final String KEY_PARTNUMBER = "partnumber";
        String finalbrand,finalyear,finalmodel,finalvariant,finalHC,finalLC,finalSP,finalpartname,finalpartnumer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step3);

        setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        brand = (TextView) findViewById(R.id.cbrand);
        year = (TextView) findViewById(R.id.cyear);
        model = (TextView) findViewById(R.id.cmodel);
        variant = (TextView) findViewById(R.id.cvariant);
        hc = (TextView) findViewById(R.id.cclassification);
        lc = (TextView) findViewById(R.id.ctype);
        slc = (TextView) findViewById(R.id.cpartname);
        part = (TextView) findViewById(R.id.subpart);
        partnumber = (TextView) findViewById(R.id.cpartnumber);
        partdescription = (TextView) findViewById(R.id.csubpart);



        finalimage = (ImageView) findViewById(R.id.finalimage);

        Bundle extras = getIntent().getExtras();
        byte[] byteArray = extras.getByteArray("CAPTUREDIMAGE");
        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        finalimage.setImageBitmap(bmp);

          finalbrand = getIntent().getStringExtra("SBRAND");
         finalyear = getIntent().getStringExtra("SYEAR");
         finalmodel = getIntent().getStringExtra("SMODEL");
         finalvariant = getIntent().getStringExtra("SVARIANT");
         finalHC = getIntent().getStringExtra("HC");
         finalLC = getIntent().getStringExtra("LC");
         finalSP = getIntent().getStringExtra("SP");
         finalpartname = getIntent().getStringExtra("SNAME");
         finalpartnumer = getIntent().getStringExtra("SPARTNUMBER");


        brand.setText(finalbrand);
        year.setText(finalyear);
        model.setText(finalmodel);
        variant.setText(finalvariant);
        hc.setText(finalHC);
        lc.setText(finalLC);
        slc.setText(finalSP);
        partnumber.setText(finalpartnumer);
        partdescription.setText(finalpartname);
      //  partnumber.setText(finalpartnumer);
        part.setText(finalSP);

        edit = (Button) findViewById(R.id.edit);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Step3.this, Step2.class);
                intent.putExtra("BRAND",finalbrand);
                intent.putExtra("YEAR",finalyear);
                intent.putExtra("MODEL",finalmodel);
                intent.putExtra("VARIANT",finalvariant);

                startActivity(intent);
                finish();
            }
        });

        cont = (Button) findViewById(R.id.cont);
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Dialog step3 = new Dialog(Step3.this);
                step3.setContentView(R.layout.dialog_step3);

                step3.show();

                Button cancel = (Button) step3.findViewById(R.id.cancel);
                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        step3.dismiss();
                    }
                });

                Button cart = (Button) step3.findViewById(R.id.cart);
                cart.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addtocart();
                        step3.dismiss();
                        Intent intent = new Intent(Step3.this, Cart.class);
                        startActivity(intent);
                    }
                });
            }
        });
    }

    String fbrand="",fyear="",fmodel="",fvariant="",fhc="",flc="",fslc="",fpartnumber="",fpart="";


    User user;

    private void addtocart() {
        user = SharedPrefManager.getInstance(this).getUser();

        fbrand = brand.getText().toString();
        fyear = year.getText().toString();
        fmodel = model.getText().toString();
        fvariant = variant.getText().toString();
        fhc = hc.getText().toString();
        flc = lc.getText().toString();
        fslc = slc.getText().toString();
        fpartnumber = partnumber.getText().toString();
        fpart = part.getText().toString();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, INSERT_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(Step3.this, response, Toast.LENGTH_LONG).show();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Step3.this, error.toString(), Toast.LENGTH_LONG).show();
                    }
                }) {

            @Override
            protected Map<String, String> getParams() {


                Map<String, String> params = new HashMap<String, String>();
                params.put("mechanic_id",user.getId()+"");
                params.put(KEY_BRAND, fbrand);
                params.put(KEY_YEAR, fyear);
                params.put(KEY_MODEL, fmodel);
                params.put(KEY_VARIANT, fvariant);
                params.put(KEY_HC, fhc);
                params.put(KEY_LC,flc);
                params.put(KEY_SLC, fslc);
                params.put(KEY_PARTNAME, fpart);
                params.put(KEY_PARTNUMBER, fpartnumber);
                return params;
            }

        };


        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);



    }

    @Override
    public void onBackPressed() {

    }


}
