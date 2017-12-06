package com.ellipsoidecm.carfix.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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

import java.util.HashMap;
import java.util.Map;

public class Step3 extends AppCompatActivity {

    TextView brand, year, model, variant, classification, type, sparename, partnumber;

    ImageView finalimage;

    Button edit, cont;

    public static final String INSERT_URL = "http://ellipsoid.esy.es/repairstation_API/cart.php";
    public static final String KEY_BRAND = "brand";
    public static final String KEY_YEAR = "year";
    public static final String KEY_MODEL = "model";
    public static final String KEY_VARIANT = "variant";
    public static final String KEY_BODY = "body";
    public static final String KEY_PART = "part";
    public static final String KEY_PARTNAME = "partname";
    public static final String KEY_PARTNUMBER = "partnumber";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step3);

        brand = (TextView) findViewById(R.id.cbrand);
        year = (TextView) findViewById(R.id.cyear);
        model = (TextView) findViewById(R.id.cmodel);
        variant = (TextView) findViewById(R.id.cvariant);
        classification = (TextView) findViewById(R.id.cclassification);
        type = (TextView) findViewById(R.id.ctype);
        sparename = (TextView) findViewById(R.id.cpartname);
        partnumber = (TextView) findViewById(R.id.cpartno);

        finalimage = (ImageView) findViewById(R.id.finalimage);

        Bundle extras = getIntent().getExtras();
        byte[] byteArray = extras.getByteArray("CAPTUREDIMAGE");
        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        finalimage.setImageBitmap(bmp);

        String finalbrand = getIntent().getStringExtra("SBRAND");
        String finalyear = getIntent().getStringExtra("SYEAR");
        String finalmodel = getIntent().getStringExtra("SMODEL");
        String finalvariant = getIntent().getStringExtra("SVARIANT");
        String finalclassification = getIntent().getStringExtra("HC");
        String finaltype = getIntent().getStringExtra("LC");
        String finalpartname = getIntent().getStringExtra("SNAME");
        String finalpartnumer = getIntent().getStringExtra("SPARTNUMBER");


        brand.setText(finalbrand);
        year.setText(finalyear);
        model.setText(finalmodel);
        variant.setText(finalvariant);
        classification.setText(finalclassification);
        type.setText(finaltype);
        sparename.setText(finalpartname);
        partnumber.setText(finalpartnumer);

        edit = (Button) findViewById(R.id.edit);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Step3.this, Step2.class);
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

    private void addtocart() {

        final String fbrand = brand.getText().toString();
        final String fyear = year.getText().toString();
        final String fmodel = model.getText().toString();
        final String fvariant = variant.getText().toString();
        final String fclassification = classification.getText().toString();
        final String ftype = type.getText().toString();
        final String fpartname = sparename.getText().toString();
        final String fpartnumber = partnumber.getText().toString();

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
                params.put(KEY_BRAND, fbrand);
                params.put(KEY_YEAR, fyear);
                params.put(KEY_MODEL, fmodel);
                params.put(KEY_VARIANT, fvariant);
                params.put(KEY_BODY, fclassification);
                params.put(KEY_PART, ftype);
                params.put(KEY_PARTNAME, fpartname);
                params.put(KEY_PARTNUMBER, fpartnumber);
                return params;
            }

        };


        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);



    }


}
