package com.ellipsoidecm.carfix.activity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.ellipsoidecm.carfix.R;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static android.provider.MediaStore.Files.FileColumns.MEDIA_TYPE_IMAGE;

public class Body extends AppCompatActivity {

    Spinner sh, sl;
    Button next1;
    EditText et1, et2, et3, et4;

    private static final int CAMERA_CAPTURE_IMAGE_REQUEST_CODE = 100;

    private static final String IMAGE_DIRECTORY_NAME = "Hello Camera";

    private Uri fileUri;

    private ImageView imgPreview, camera;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_step2);




        final String brandname = getIntent().getStringExtra("BRAND");
        final String yearname = getIntent().getStringExtra("YEAR");
        final String modelname = getIntent().getStringExtra("MODEL");
        final String variantname = getIntent().getStringExtra("VARIANT");
        final String customernamename = getIntent().getStringExtra("CUSTOMERNAME");
        final String vehicleregnoname = getIntent().getStringExtra("VEHICLEREG");

        sh = (Spinner) findViewById(R.id.spinnerhc);
        sl = (Spinner) findViewById(R.id.spinnerlc);

        sh.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                String sp2 = String.valueOf(sh.getSelectedItem());

                if (sp2.contentEquals("Body")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Please Select");
                    list.add("Interior");
                    list.add("Exterior");
                    list.add("Exhaust");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Body.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    sl.setAdapter(dataAdapter1);
                }
                if (sp2.contentEquals("Engine")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Please Select");
                    list.add("Head");
                    list.add("Block");
                    list.add("Fuel injection(CRDI,TFSI)");
                    list.add("Cooling system");
                    list.add("Turbo Booster");
                    list.add("EGR Valve");
                    list.add("Timing");
                    list.add("Foundations & Mountings");
                    list.add("Oil Cooler");
                    ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(Body.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter2.notifyDataSetChanged();
                    sl.setAdapter(dataAdapter2);
                }
                if (sp2.contentEquals("Suspension")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Please Select");
                    list.add("Bush Kit");
                    list.add("Shock Absorber");
                    list.add("Ball joints");
                    list.add("Tie Rod Ends");
                    list.add("Stabler links");
                    list.add("Lower and Upper arms");
                    list.add("Sensors");
                    ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(Body.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter3.notifyDataSetChanged();
                    sl.setAdapter(dataAdapter3);
                }
                if (sp2.contentEquals("A/C-Heater")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Please Select");
                    list.add("A/C Cooling Coil");
                    list.add("Cooling Condenser");
                    list.add("A/C compressor");
                    list.add("High speed cooling fan outer");
                    list.add("Dashboard cooling blower");
                    list.add("Thermistor");
                    list.add("Pressure valve");
                    list.add("Piping");
                    list.add("Switch");
                    list.add("Sensor");
                    ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(Body.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter4.notifyDataSetChanged();
                    sl.setAdapter(dataAdapter4);
                }
                if (sp2.contentEquals("Electrical and Electronics")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Please Select");
                    list.add("Bonnet compartment Fuse box");
                    list.add("Inner body compartment box");
                    list.add("wiring kit");
                    list.add("Alternator");
                    list.add("Battery");
                    list.add("Ignition sockets");
                    list.add("Head lights and wipes combination switch");
                    list.add("Power Windows");
                    list.add("ECM");
                    list.add("PCM");
                    list.add("BCM");
                    list.add("Immobilizer");
                    list.add("cluster(speedometer)");
                    list.add("EPS Module");
                    list.add("Air bag controller module(SRS");
                    list.add("ABS control module");
                    list.add("ESP control module");
                    list.add("Central locking");


                    ArrayAdapter<String> dataAdapter5 = new ArrayAdapter<String>(Body.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter5.notifyDataSetChanged();
                    sl.setAdapter(dataAdapter5);
                }
                if (sp2.contentEquals("Transmission")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Please Select");
                    list.add("Auto");
                    list.add("Manual");

                    ArrayAdapter<String> dataAdapter6 = new ArrayAdapter<String>(Body.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter6.notifyDataSetChanged();
                    sl.setAdapter(dataAdapter6);
                }
                if (sp2.contentEquals("Braking")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Please Select");
                    list.add("Calipers");
                    list.add("Wheel drums");
                    list.add("Drum bearing with ABS");
                    list.add("Drum bearing without ABS");
                    list.add("Drive shaft/Axle");
                    list.add("Rare Brake shoes ");
                    list.add("Front Brake shoes");
                    list.add("Brake cylinder(wheel)");
                    list.add("Brake cylinder Master");
                    list.add("Hand Brake cable");
                    ArrayAdapter<String> dataAdapter7 = new ArrayAdapter<String>(Body.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter7.notifyDataSetChanged();
                    sl.setAdapter(dataAdapter7);
                }
                if (sp2.contentEquals("Steering Box")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Please Select");
                    list.add("Hydrolic");
                    list.add("EPS");
                    ArrayAdapter<String> dataAdapter8 = new ArrayAdapter<String>(Body.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter8.notifyDataSetChanged();
                    sl.setAdapter(dataAdapter8);
                }
                if (sp2.contentEquals("Sensors")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Please Select");
                    list.add("Engine Sensors");
                    list.add("Body Sensors");
                    list.add("Suspension Sensors");
                    list.add("A/C Heater and Sensors");
                    list.add("Electrical and Electronic Sensors");
                    list.add("Brake Sensors");
                    list.add("Steering Box Sensors");
                    list.add("Transmission Sensors");
                    ArrayAdapter<String> dataAdapter9 = new ArrayAdapter<String>(Body.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter9.notifyDataSetChanged();
                    sl.setAdapter(dataAdapter9);
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sl.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                RelativeLayout rel = (RelativeLayout) findViewById(R.id.vrel);
                rel.isClickable();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        et1 = (EditText) findViewById(R.id.et1);
        et4 = (EditText) findViewById(R.id.et4);

        next1 = (Button) findViewById(R.id.refresh);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et1.getText().toString().trim().equals("") || et2.getText().toString().trim().equals("")) {

                    et1.setError("Please Enter Spare Part Name");
                    et2.setError("Please Enter Spare Part Details");

                } else {


                    String shc = sh.getSelectedItem().toString();
                    String slc = sl.getSelectedItem().toString();

                    //Bitmap capturedimage = BitmapFactory.decodeResource(getResources(),R.id.imagehive);
                    Bitmap capturedimage = ((BitmapDrawable)imgPreview.getDrawable()).getBitmap();
                    ByteArrayOutputStream stream = new ByteArrayOutputStream();
                    capturedimage.compress(Bitmap.CompressFormat.PNG,100,stream);
                    byte[] byteArray = stream.toByteArray();

                    String sname = et1.getText().toString();
                    String sdetail = et2.getText().toString();
                    String scomments = et3.getText().toString();
                    String spartnumer = et4.getText().toString();

                    Intent intent = new Intent(Body.this, Body.class);
                    intent.putExtra("HC", shc);
                    intent.putExtra("LC", slc);
                    intent.putExtra("SNAME", sname);
                    intent.putExtra("SDETAILS", sdetail);
                    intent.putExtra("SCOMMENTS", scomments);
                    intent.putExtra("SPARTNUMBER",spartnumer);
                    intent.putExtra("SBRAND",brandname);
                    intent.putExtra("SYEAR",yearname);
                    intent.putExtra("SMODEL",modelname);
                    intent.putExtra("SVARIANT",variantname);
                    intent.putExtra("CAPTUREDIMAGE",byteArray);
                    intent.putExtra("SCNAME",customernamename);
                    intent.putExtra("SVREGNO",vehicleregnoname);

                    startActivity(intent);
                }
            }
        });

        imgPreview = (ImageView) findViewById(R.id.image);
        camera = (ImageView) findViewById(R.id.camera);

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                captureImage();

            }
        });

        if (!isDeviceSupportCamera()) {
            Toast.makeText(getApplicationContext(),
                    "Sorry! Your device doesn't support camera",
                    Toast.LENGTH_LONG).show();
            // will close the app if the device does't have camera
            finish();
        }


    }

    private boolean isDeviceSupportCamera() {
        if (getApplicationContext().getPackageManager().hasSystemFeature(
                PackageManager.FEATURE_CAMERA)) {
            // this device has a camera
            return true;
        } else {
            // no camera on this device
            return false;
        }
    }

    private void captureImage() {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        fileUri = getOutputMediaFileUri(MEDIA_TYPE_IMAGE);

        intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);

        // start the imagehive capture Intent
        startActivityForResult(intent, CAMERA_CAPTURE_IMAGE_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // if the result is capturing Image
        if (requestCode == CAMERA_CAPTURE_IMAGE_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                // successfully captured the imagehive
                // display it in imagehive view
                previewCapturedImage();
            } else if (resultCode == RESULT_CANCELED) {
                // user cancelled Image capture
                Toast.makeText(getApplicationContext(),
                        "User cancelled imagehive capture", Toast.LENGTH_SHORT)
                        .show();
            } else {
                // failed to capture imagehive
                Toast.makeText(getApplicationContext(),
                        "Sorry! Failed to capture imagehive", Toast.LENGTH_SHORT)
                        .show();
            }
        }
    }

    private void previewCapturedImage() {

        try {

            imgPreview.setVisibility(View.VISIBLE);

            // bimatp factory
            BitmapFactory.Options options = new BitmapFactory.Options();

            // downsizing imagehive as it throws OutOfMemory Exception for larger
            // images
            options.inSampleSize = 8;

            final Bitmap bitmap = BitmapFactory.decodeFile(fileUri.getPath(),
                    options);

            imgPreview.setImageBitmap(bitmap);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public Uri getOutputMediaFileUri(int type) {
        return Uri.fromFile(getOutputMediaFile(type));
    }

    private static File getOutputMediaFile(int type) {

        // External sdcard location
        File mediaStorageDir = new File(
                Environment
                        .getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                IMAGE_DIRECTORY_NAME);

        // Create the storage directory if it does not exist
        if (!mediaStorageDir.exists()) {
            if (!mediaStorageDir.mkdirs()) {
                Log.d(IMAGE_DIRECTORY_NAME, "Oops! Failed create "
                        + IMAGE_DIRECTORY_NAME + " directory");
                return null;
            }
        }

        // Create a media file name
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss",
                Locale.getDefault()).format(new Date());
        File mediaFile;
        if (type == MEDIA_TYPE_IMAGE) {
            mediaFile = new File(mediaStorageDir.getPath() + File.separator
                    + "IMG_" + timeStamp + ".jpg");
        } else {
            return null;
        }

        return mediaFile;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // save file url in bundle as it will be null on scren orientation
        // changes
        outState.putParcelable("file_uri", fileUri);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // get the file url
        fileUri = savedInstanceState.getParcelable("file_uri");
    }
}
