package com.ellipsoidecm.carfix.activity;

import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.ellipsoidecm.carfix.R;
import com.ellipsoidecm.carfix.others.Utility;
import com.google.android.gms.tasks.OnCompleteListener;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static android.provider.MediaStore.Files.FileColumns.MEDIA_TYPE_IMAGE;
import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Step2 extends AppCompatActivity {

    String shc = "";
    String slc = "";
    String sp="";


    String sname="";

    String spartnumer="";

    Spinner sh, sl, spart;
    Button  refresh;
    Button next1;
    EditText et1, et4;
    TextView brand,Year,Model,Varient;


    private Uri fileUri;
    private ImageView imgPreview, camera;

    public static final int MY_REQUEST_CAMERA   = 10;
    public static final int MY_REQUEST_WRITE_CAMERA   = 11;
    public static final int CAPTURE_CAMERA   = 12;

    public static final int MY_REQUEST_READ_GALLERY   = 13;
    public static final int MY_REQUEST_WRITE_GALLERY   = 14;
    public static final int MY_REQUEST_GALLERY   = 15;

    private BottomSheetBehavior selectPhotoBehaviour;
    ImageButton back_button;

    public File filen = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step2);

        setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        final String brandname = getIntent().getStringExtra("BRAND");
        final String yearname = getIntent().getStringExtra("YEAR");
        final String modelname = getIntent().getStringExtra("MODEL");
        final String variantname = getIntent().getStringExtra("VARIANT");

        brand = (TextView) findViewById(R.id.s2_brand);
        Year = (TextView) findViewById(R.id.s2_year);
        Model = (TextView) findViewById(R.id.s2_model);
        Varient = (TextView) findViewById(R.id.s2_varient);

        brand.setText(brandname);
        Year.setText(yearname);
        Model.setText(modelname);
        Varient.setText(variantname);



        sh = (Spinner) findViewById(R.id.spinnerhc);
        sl = (Spinner) findViewById(R.id.spinnerlc);
        spart = (Spinner) findViewById(R.id.spinnerpart);
        back_button = (ImageButton) findViewById(R.id.s2_back);

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Step2.this,MainActivity.class));
            }
        });



        sh.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                String sp2 = String.valueOf(sh.getSelectedItem());

                if (sp2.contentEquals("Body")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Interior");
                    list.add("Exterior");
                    list.add("Exhaust");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    sl.setAdapter(dataAdapter1);
                }
                if (sp2.contentEquals("Engine")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Head");
                    list.add("Block");
                    list.add("Fuel injection(CRDI,TFSI)");
                    list.add("Cooling system");
                    list.add("Turbo Booster");
                    list.add("EGR valve");
                    list.add("Timing");
                    list.add("Foundations & Mountings");
                    list.add("Oil Cooler");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    sl.setAdapter(dataAdapter1);
                }
                if (sp2.contentEquals("Suspension")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Bush kit");
                    list.add("Shock absorber");
                    list.add("Ball joints");
                    list.add("Tie Rod Ends");
                    list.add("Stabler links");
                    list.add("Lower and Upper arms");
                    list.add("Sensors");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    sl.setAdapter(dataAdapter1);
                }
                if (sp2.contentEquals("A/C-Heater")) {
                    List<String> list = new ArrayList<String>();
                    list.add("A/C Cooling Coil");
                    list.add("Cooling Condenser");
                    list.add("A/C compressor");
                    list.add("High speed cooling fan outer");
                    list.add("Dashboard cooling blower");
                    list.add("Lower and Upper arms");
                    list.add("Thermistor");
                    list.add("Pressure valve");
                    list.add("Piping");
                    list.add("Switch");
                    list.add("Sensor");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    sl.setAdapter(dataAdapter1);
                }
                if (sp2.contentEquals("Electrical and Electronics")) {
                    List<String> list = new ArrayList<String>();
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
                    list.add("Air bag controller module(SRS)");
                    list.add("ABS control module");
                    list.add("ESP control module");
                    list.add("Central locking");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    sl.setAdapter(dataAdapter1);
                }

                if (sp2.contentEquals("Transmission")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Auto");
                    list.add("Manual");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    sl.setAdapter(dataAdapter1);
                }
                if (sp2.contentEquals("Braking")) {
                    List<String> list = new ArrayList<String>();
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

                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    sl.setAdapter(dataAdapter1);
                }

                if (sp2.contentEquals("Steering Box")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Hydrolic");
                    list.add("EPS");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    sl.setAdapter(dataAdapter1);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sl.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                String sp3 = String.valueOf(sl.getSelectedItem());

                if (sp3.contentEquals("Interior")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Dashboard");
                    list.add("Dashboard electronic switches");
                    list.add("A/C Blower grills");
                    list.add("Speedometer");
                    list.add("Gearshifter");
                    list.add("Door pads");
                    list.add("Door locks");
                    list.add("Door internal lockset");
                    list.add("Seat belt");
                    list.add("Seats");
                    list.add("Floor matting");
                    list.add("Roof");
                    list.add("Roof lights");
                    list.add("Body glasses");
                    list.add("Stearing");
                    list.add("Power window motors");
                    list.add("Central locking");
                    list.add("Door glass channels");
                    list.add("Inner door handles");
                    list.add("Rear view mirror");
                    list.add("Door pad clips");
                    list.add("Ignition keybody");
                    list.add("Audio systems(front door pads speakers)");
                    list.add("Audio systems(rear door pads speakers)");
                    list.add("Sunshades");
                    list.add("Sensors");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }

                if (sp3.contentEquals("Exterior")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Total body");
                    list.add("Front bumper");
                    list.add("Rear Bumper");
                    list.add("Head lights");
                    list.add("Grilles");
                    list.add("Monogram");
                    list.add("Bumper fork lamps");
                    list.add("Outer Door Handels");
                    list.add("Mud flaps");
                    list.add("fender seals ");
                    list.add("Indicators");
                    list.add("Side view Mirrors");
                    list.add("Body door beadings");
                    list.add("Body door rubber  beadings sets");
                    list.add("Wipers");
                    list.add("Tail lamps");
                    list.add("Body and Dicky lock set");
                    list.add("Bonnet");
                    list.add("Left Fender");
                    list.add("Right Fender");
                    list.add("Front Right Door");
                    list.add("Front Left Door");
                    list.add("Rear Right Door");
                    list.add("Rear Left Door");
                    list.add("Dicky");
                    list.add("Rear Quater Panels");
                    list.add("Door Pillers");
                    list.add("Foot Boards");
                    list.add("Total Chase");
                    list.add("Front Cross member");
                    list.add("Door Strip Beading set");
                    list.add("Front Glass");
                    list.add("Rear Glass");
                    list.add("Front Right Door Glass");
                    list.add("Front Left Door Glass");
                    list.add("Front Left Quarter Glass");
                    list.add("Front Right Quarter Glass");
                    list.add("Rear Right Door Glass");
                    list.add("Rear Left Door Glass");
                    list.add("Rear Right Quarter Glass");
                    list.add("Rear Left Quarter Glass");
                    list.add("Roof Beadings");
                    list.add("Car Glass Beading Set");
                    list.add("Sensors");

                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }

                if (sp3.contentEquals("Exhaust")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Silencer");
                    list.add("Silencer Front Muffler");
                    list.add("Silencer Rear Muffler");
                    list.add("Silencer pipe");
                    list.add("catalytic converter");
                    list.add("Flexible Joints");
                    list.add("Muffler Brackets");
                    list.add("Sensors");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }

                if (sp3.contentEquals("Head")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Camshaft");
                    list.add("Camshaft Bullets");
                    list.add("Rocker Arms");
                    list.add("Valves and Guides");
                    list.add("Vaccum Pump");
                    list.add("Head oil Seals");
                    list.add("Head Wall door Cover");
                    list.add("Oil Cap");
                    list.add("Head Gasket");
                    list.add("Head Packing Kit");
                    list.add("Sensors");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }

                if (sp3.contentEquals("Block")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Sleeves");
                    list.add("Piston");
                    list.add("Piston Rings");
                    list.add("Crankshaft");
                    list.add("Crankshaft Main Bearings");
                    list.add("Crank Oil Seals");
                    list.add("Oil Circulation Pump");
                    list.add("Connectings");
                    list.add("Connecting Bearings");
                    list.add("Connecting Bearings and Locks");
                    list.add("Oil Sump");
                    list.add("Timing Wheel");
                    list.add("Timing Belt Tensioners");
                    list.add("Sensors");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }

                if (sp3.contentEquals("Fuel injection(CRDI,TFSI)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("High Speed Fuel Pump");
                    list.add("Common Rail");
                    list.add("Rail Pressure Switch");
                    list.add("Rail Pressure Solenoid");
                    list.add("Diesel Filter & Temperature Switch");
                    list.add("Injectors");
                    list.add("Diesel Tank Fuel Pump");
                    list.add("Diesel Overflow Pipes");
                    list.add("Diesel Return Pipe");
                    list.add("Diesel Fuel Pump Motor");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Cooling system")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Radiator");
                    list.add("Radiator Host Pipes");
                    list.add("Water Pump");
                    list.add("Thermostat valve body");
                    list.add("Radiator Fan Electronic");
                    list.add("Radiator Fan Hydrolic");
                    list.add("Oil Cooler");
                    list.add("Coolent Box");
                    list.add("Inter Cooler Pipes");
                    list.add("Inter Cooler");
                    list.add("Sensors");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Turbo Booster")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Electronic Turbo");
                    list.add("Vacuum Turbo");
                    list.add("Sensors");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }

                if (sp3.contentEquals("EGR valve")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Electronic");
                    list.add("Vacuum");
                    list.add("Engine To EGR Valve Connected Hose");
                    list.add("Sensors");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }

                if (sp3.contentEquals("Timing")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Timing Belt");
                    list.add("Timing wheels");
                    list.add("Timing Tensioner");
                    list.add("Diesel Pump Timing Wheels");
                    list.add("Sensors");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }

                if (sp3.contentEquals("Foundations & Mountings")) {
                    List<String> list = new ArrayList<String>();
                    list.add("A-Engine Foundation");
                    list.add("B-Gear Box Foundation");
                    list.add("C-Gear Box Foundation");
                    list.add("D-Gear Box Foundation");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Oil Cooler")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Bush kit")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Shock absorber")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Ball joints")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Tie Rod Ends")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Stabler links")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Lower and Upper arms")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Engine Sensors")) {
                    List<String> list = new ArrayList<String>();
                    list.add("ABS Sensor");
                    list.add("EPS Sensor");
                    list.add("Brakeshoe Sensor");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("A/C Cooling Coil")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Cooling Condenser")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("A/C compressor")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("High speed cooling fan outer")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Dashboard cooling blower")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Thermistor")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Pressure valve")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Piping")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Switch")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("A/C Sensor")) {
                    List<String> list = new ArrayList<String>();
                    list.add("A/C Thermostat Sensor");
                    list.add("A/C Gas Pressure Switch");
                    list.add("Fan Resistance Sensor");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Bonnet compartment Fuse box")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Inner body compartment box")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("wiring kit")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Alternator")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Battery")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Ignition sockets")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Head lights and wipes combination switch \t")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Power Windows")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("ECM")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("PCM")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("BCM")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Immobilizer")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("cluster(speedometer)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("EPS Module")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Air bag controller module(SRS")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("ABS control module")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("ESP control module")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Central locking")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Auto")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Manual")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Calipers")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Wheel drums")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Drum bearing with ABS")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Drum bearing without ABS")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Drive shaft/Axle")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Rare Brake shoes");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Front Brake shoes")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Brake cylinder(wheel)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }if (sp3.contentEquals("Brake cylinder Master")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Hand Brake cable")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Hydrolic")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Hydrolic")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Hydrolic")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Hydrolic")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Hydrolic")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Hydrolic")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Hydrolic")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }
                if (sp3.contentEquals("Hydrolic")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Sparate Classiication");
                    ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Step2.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter1.notifyDataSetChanged();
                    spart.setAdapter(dataAdapter1);
                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        et1 = (EditText) findViewById(R.id.et1);
        et4 = (EditText) findViewById(R.id.et4);

        et1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setFocusable(true);
            }
        });

        et4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et4.setFocusable(true);
            }
        });

        next1 = (Button) findViewById(R.id.nexts);

//        refresh = (Button) findViewById(R.id.refresh);
//        refresh.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                et1.setText("");
//                et4.setText("");
//            }
//        });

        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{

                //Bitmap capturedimage = BitmapFactory.decodeResource(getResources(),R.id.imagehive);
                Bitmap capturedimage = ((BitmapDrawable) imgPreview.getDrawable()).getBitmap();
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                capturedimage.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] byteArray = stream.toByteArray();

                     shc = sh.getSelectedItem().toString();
                      slc = sl.getSelectedItem().toString();

                      sp=spart.getSelectedItem().toString();




                     sname = et1.getText().toString();

                 spartnumer = et4.getText().toString();

                Intent intent = new Intent(Step2.this, Step3.class);
                intent.putExtra("HC", shc);
                intent.putExtra("LC", slc);
                intent.putExtra("SP",sp);
                intent.putExtra("SNAME", sname);
                intent.putExtra("SPARTNUMBER", spartnumer);
                intent.putExtra("SBRAND", brandname);
                intent.putExtra("SYEAR", yearname);
                intent.putExtra("SMODEL", modelname);
                intent.putExtra("SVARIANT", variantname);
                intent.putExtra("CAPTUREDIMAGE", byteArray);

                startActivity(intent);}
                catch (Exception e){Log.d("in next",e.toString());}

            }
        });

        imgPreview = (ImageView) findViewById(R.id.image);
        camera = (ImageView) findViewById(R.id.camera);

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkPermissionCW();

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


    private void checkPermissionCW(){
        int permissionCheck = ContextCompat.checkSelfPermission(Step2.this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    Step2.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, MY_REQUEST_WRITE_CAMERA);
        } else {
            checkPermissionCA();
        }
    }

    private void checkPermissionCA(){
        int permissionCheck = ContextCompat.checkSelfPermission(Step2.this, Manifest.permission.CAMERA);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    Step2.this, new String[]{Manifest.permission.CAMERA}, MY_REQUEST_CAMERA);
        } else {
            catchPhoto();
        }
    }

    private void catchPhoto() {
        filen = getFile();
        if(filen!=null) {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            try {
                Uri photocUri = Uri.fromFile(filen);
                intent.putExtra(android.provider.MediaStore.EXTRA_OUTPUT, photocUri);
                startActivityForResult(intent, CAPTURE_CAMERA);
            } catch (ActivityNotFoundException e) {

            }
        } else {
            Toast.makeText(Step2.this, "please check your sdcard status", Toast.LENGTH_SHORT).show();
        }
    }

    public File getFile(){

        File fileDir = new File(Environment.getExternalStorageDirectory()
                + "/Android/data/"
                + getApplicationContext().getPackageName()
                + "/Files");

        if (!fileDir.exists()){
            if (!fileDir.mkdirs()){
                return null;
            }
        }
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss",
                Locale.getDefault()).format(new Date());

        File mediaFile = new File(fileDir.getPath() + File.separator + "IMG_" + timeStamp + ".jpg");
        return mediaFile;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (resultCode != RESULT_OK){
            Log.e("msg", "photo not get");
            return;
        }

        switch (requestCode) {

            case CAPTURE_CAMERA:
                fileUri=Uri.parse("file:///" + filen);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 8;
                final Bitmap bitmap = BitmapFactory.decodeFile(fileUri.getPath(),
                    options);
                imgPreview.setImageBitmap(bitmap);

                break;





        }
    }

    public void onRequestPermissionsResult (int requestCode, String[] permissions,  int[] grantResults)
    {

        switch (requestCode) {
            case MY_REQUEST_CAMERA:
                catchPhoto();
                break;
            case MY_REQUEST_WRITE_CAMERA:
                checkPermissionCA();
                break;

        }
    }

//
//    private void checkPermissionWG(){
//        int permissionCheck = ContextCompat.checkSelfPermission(Step2.this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
//        // int permissionCheck2 = ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.WRITE_EXTERNAL_STORAGE);
//        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
//            ActivityCompat.requestPermissions(
//                    Step2.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, MY_REQUEST_WRITE_GALLERY);
//        } else {
//            getPhotos();
//        }
//    }
//    private void getPhotos() {
//        Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
//        photoPickerIntent.setType("image/*");
//        startActivityForResult(photoPickerIntent, MY_REQUEST_GALLERY);
//    }


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


    @Override
    public void onBackPressed() {
        //do nothing
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
