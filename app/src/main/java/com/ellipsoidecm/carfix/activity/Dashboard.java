package com.ellipsoidecm.carfix.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.ellipsoidecm.carfix.R;

import java.util.ArrayList;
import java.util.List;

public class Dashboard extends AppCompatActivity {

    Spinner s1, s3, s4;
    Button next;
    EditText customername, vehiclereg, s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        s1 = (Spinner) findViewById(R.id.spinner1);
        s2 = (EditText) findViewById(R.id.spinner2);
        customername = (EditText)findViewById(R.id.customername);
        vehiclereg = (EditText) findViewById(R.id.vehiclereg);
        s3 = (Spinner) findViewById(R.id.spinner3);
        s4 = (Spinner) findViewById(R.id.spinner4);

        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                String sp1 = String.valueOf(s1.getSelectedItem());

                if (sp1.contentEquals("Ashok Layland")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("LEYLAND STILE");
                    list.add("LEYLAND DOST");
                    ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter);
                }

                if (sp1.contentEquals("Aston Martin")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("MARTIN DB11");
                    list.add("MARTIN DB9(body type-couple)");
                    list.add("MARTIN DB9(body type-Convertible)");
                    list.add("MARTIN DBS");
                    list.add("MARTIN DBS VOLANTE");
                    list.add("MARTIN RAPIDE");
                    list.add("MARTIN VANQUISH(2012-now)");
                    list.add("MARTIN VANQUISH(2013-now)");
                    list.add("MARTIN VANTAGE(2009-now)");
                    list.add("MARTIN VANTAGE(2010-now)");
                    ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter2.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter2);
                }
                if (sp1.contentEquals("Audi")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("A3 (8P7)");
                    list.add("A3 (8V7)");
                    list.add("A3(2017-now)");
                    list.add("A3(2015-2016)");
                    list.add("A3 Cabriolet");
                    list.add("A4 (8E2, B6)");
                    list.add("A4 (8EC, B7)");
                    list.add("A4 (8K2, B8)");
                    list.add("A4 (8W, B9)");
                    list.add("RS5");
                    list.add("A6 (4F2, C6)");
                    list.add("A6 (4G2, C7)");
                    list.add("A7");
                    list.add("A8 (4E_)");
                    list.add("A8 (4H_)");
                    list.add("Q3 (8U)");
                    list.add("Q3");
                    list.add("Q5 (8R)");
                    list.add("Q7 (4L)");
                    list.add("R8(2007-now)");
                    list.add("R8(2010-now)  ");
                    list.add("TT (8N3)");
                    list.add("TT (8J3)");
                    list.add("TT");
                    ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter3.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter3);
                }

                if (sp1.contentEquals("BMW")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1 (F20)");
                    list.add("3 (E90)");
                    list.add("3 (F30)");
                    list.add("3 (F80 M3)");
                    list.add("3 GT (F34)");
                    list.add("4 (F82)");
                    list.add("5 (E60)");
                    list.add("5 GT (F07)");
                    list.add("5 (F10)");
                    list.add("6 (F06)");
                    list.add("6 (F13)");
                    list.add("7 (F02)");
                    list.add("7 (G12)");
                    list.add("7 (G11)");
                    list.add("i8");
                    list.add("X1 (E84)");
                    list.add("X1 (F48)");
                    list.add("X3 (F25)");
                    list.add("X5 M (F85)");
                    list.add("X5 (F15)");
                    list.add("X5 (E70)");
                    list.add("X6  M (F86)");
                    list.add("X6 (F16)");
                    list.add("X6 (E71)");
                    list.add("X6 (E71)");
                    list.add("Z4 (E89)");
                    ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter4.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter4);
                }
                if (sp1.contentEquals("Chevrolet")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("AVEO");
                    list.add("AVEO U-VA");
                    list.add("BEAT");
                    list.add("CAPTIVA");
                    list.add("CAPTIVA REFRESH");
                    list.add("CRUZE");
                    list.add("ENJOY");
                    list.add("FORESTER");
                    list.add("OPTRA");
                    list.add("OPTRA MAGNUM");
                    list.add("OPTRA S-RV");
                    list.add("SAIL");
                    list.add("SAIL HATCH");
                    list.add("SPARK");
                    list.add("TAVERA(2004-2013)");
                    list.add("TAVERA(2017-now)");
                    list.add("TRAILBLAZER");
                    ArrayAdapter<String> dataAdapter5 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter5.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter5);
                }
                if (sp1.contentEquals("Daewoo")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("CIELO Saloon");
                    list.add("MATIZ");
                    ArrayAdapter<String> dataAdapter6 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter6.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter6);
                }
                if (sp1.contentEquals("Datsun")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("GO");
                    list.add("GO +");
                    list.add("REDI GO");
                    ArrayAdapter<String> dataAdapter7 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter7.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter7);
                }
                if (sp1.contentEquals("Fiat")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("ABARTH 595");
                    list.add("AVVENTURA");
                    list.add("ABARTH AVVENTURA");
                    list.add("LINEA(2015-now)");
                    list.add("LINEA(2017-now)");
                    list.add("LINEA CLASSIC");
                    list.add("LINEA (323)");
                    list.add("PALIO");
                    list.add("PALIO (188)");
                    list.add("PALIO STILE");
                    list.add("PETRA");
                    list.add("PUNTO (199)(2005-2011)");
                    list.add("PUNTO (199)(2008-2014)");
                    list.add("PUNTO EVO (199)");
                    list.add("ABARTH PUNTO");
                    list.add("PUNTO EVO");
                    list.add("EVO PURE");
                    list.add("SIENA (372)");
                    list.add("UNO (146 A/E)");
                    list.add("URBAN CROSS");
                    ArrayAdapter<String> dataAdapter8 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter8.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter8);
                }
                if (sp1.contentEquals("Force")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("GURKHA(2013-now)(Body type: Convertible)");
                    list.add("GURKHA(2013-now)(Body type: Off-road vehicles)");
                    list.add("GURKHA");
                    list.add("ONE");
                    list.add("TRAX");
                    ArrayAdapter<String> dataAdapter9 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter9.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter9);
                }
                if (sp1.contentEquals("Ford")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("CLASSIC");
                    list.add("ECOSPORT");
                    list.add("ENDEAVOUR(2003-2006)");
                    list.add("ENDEAVOUR(2007-2013)");
                    list.add("ENDEAVOUR(2014-now)");
                    list.add("FIESTA(2005-2007)");
                    list.add("FIESTA(2008-2011)");
                    list.add("FIESTA(2011-2012)");
                    list.add("FIESTA(2012-now)");
                    list.add("FIGO");
                    list.add("FIGO ASPIRE");
                    list.add("FIGO NEXT GEN");
                    list.add("FUSION");
                    list.add("IKON");
                    list.add("IKON II");
                    list.add("MONDEO");
                    list.add("MUSTANG GT");
                    ArrayAdapter<String> dataAdapter10 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter10.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter10);
                }
                if (sp1.contentEquals("Honda")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("ACCORD VII");
                    list.add("ACCORD VI");
                    list.add("ACCORD IX");
                    list.add("ACCORD");
                    list.add("AMAZE");
                    list.add("BRIO");
                    list.add("BR-V");
                    list.add("CITY III");
                    list.add("CITY IV");
                    list.add("CITY (GM)");
                    list.add("CITY");
                    list.add("CITY F/L");
                    list.add("CIVIC VIII");
                    list.add("CIVIC IX (FB, FG)");
                    list.add("IKON II");
                    list.add("CR-V Mk III (RE)");
                    list.add("CR-V  IV (RE)");
                    list.add("JAZZ(2009-2011)");
                    list.add("JAZZ(2015-now)");
                    list.add("MOBILIO");
                    list.add("WRV");
                    ArrayAdapter<String> dataAdapter11 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter11.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter11);
                }
                if (sp1.contentEquals("Hyundai")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("ACCENT/ VIVA");
                    list.add("CRETA");
                    list.add("ELANTRA(2004-2007)");
                    list.add("FLUIDIC ELANTRA");
                    list.add("ELANTRA(2016-now)");
                    list.add("EON");
                    list.add("GETZ(2004-2007)");
                    list.add("GETZ(2007-2010)");
                    list.add("i10");
                    list.add("GRAND i10");
                    list.add("GRAND i10 F/L");
                    list.add("i20(2008-2012)");
                    list.add("i20(2008-2012)");
                    list.add("i20(2008-2012)");
                    list.add("SANTRO");
                    list.add("i20 ELITE");
                    list.add("i20(2012-2014)");
                    list.add("i20 ACTIVE");
                    list.add("Santa Fe II (CM)");
                    list.add("SANTA FE III (DM)");
                    list.add("SANTRO XING");
                    list.add("SONATA IV (EF-B) GOLD");
                    list.add("SONATA V (NF) EMBERA/TRANSFORM");
                    list.add("SONATA VI (YF) FLUDIC");
                    list.add("TERRACAN (HP)");
                    list.add("TUCSON 1st Gen");
                    list.add("TUCSON 2nd GEN");
                    list.add("VERNA");
                    list.add("VERNA FLUIDIC(2011-2014)");
                    list.add("VERNA FLUIDIC(2014-now)");
                    list.add("XCENT(2013-now)");
                    list.add("Xcent(2017-now)");
                    ArrayAdapter<String> dataAdapter12 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter12.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter12);
                }
                if (sp1.contentEquals("ISUZU")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("D-Max");
                    list.add("D-Max V-cross");
                    list.add("MU-7");
                    list.add("MUX");
                    ArrayAdapter<String> dataAdapter13 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter13.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter13.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter13);
                }
                if (sp1.contentEquals("Jaguar")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("F-TYPE(2012-now)");
                    list.add("F-TYPE(2013-now)");
                    list.add("S-TYPE (CCX)");
                    list.add("XE 2.0");
                    list.add("XF (_J05_, CC9)");
                    list.add("XF (CC9)");
                    list.add("XJ (X350, X358)");
                    list.add("XJ (X35_, _J12_, _J24_)");
                    list.add("XK 8 (QDV)");
                    list.add("XK 8 (QEV)");
                    list.add("XK (_J43_)");
                    list.add("XK (_J43_) body-couple");
                    list.add("X-TYPE(CF1)");
                    list.add("X-TYPE");
                    ArrayAdapter<String> dataAdapter14 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter14.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter14.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter14);
                }
                if (sp1.contentEquals("Land Rover")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("DISCOVERY(2004-2009)");
                    list.add("DISCOVERY(2009-2013)");
                    list.add("DISCOVERY SPORT");
                    list.add("FREELANDER 2");
                    list.add("RANGE ROVER Mk III (LM)");
                    list.add("RANGE ROVER IV (LG)");
                    list.add("RANGE ROVER EVOQUE (LV)");
                    list.add("RANGE ROVER EVOQUE");
                    list.add("RANGE ROVER EVOQUE CONVERTIABLE");
                    list.add("RANGE ROVER SPORT (LS)");
                    list.add("RANGE ROVER SPORT (LW)");
                    ArrayAdapter<String> dataAdapter15 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter15.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter15.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter15);
                }
                if (sp1.contentEquals("Mahindra")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("BOLERO PICKUP");
                    list.add("BOLERO");
                    list.add("BOLERO INVADER");
                    list.add("BOLERO CAMPER");
                    list.add("BOLERO MAXI TRUCK");
                    list.add("COMMANDER");
                    list.add("GENIO SC");
                    list.add("GENIO DC");
                    list.add("GIO (2009)");
                    list.add("IMPERIO SC");
                    list.add("IMPERIO DC");
                    list.add("JEETO");
                    list.add("KUV100");
                    list.add("MARSHAL");
                    list.add("MAXX");
                    list.add("MAXX PICK UP");
                    list.add("MAXXIMO MINI VAN");
                    list.add("MAXXIMO PlUS");
                    list.add("NUVOSPORT");
                    list.add("QUANTO");
                    list.add("REVA-E20");
                    list.add("REVA-E2oPlus");
                    list.add("REXTON");
                    list.add("SAVARI");
                    list.add("Scorpio 1st Gen");
                    list.add("Scorpio 1st Gen F/L");
                    list.add("Scorpio 2nd Gen");
                    list.add("Scorpio 3rd Gen");
                    list.add("Scorpio Getaway Ver 1");
                    list.add("Scorpio Getaway Ver 2");
                    list.add("Supro");
                    list.add("Supro Mini Truck");
                    list.add("THAR");
                    list.add("TUV 300");
                    list.add("VERITO");
                    list.add("VERITO F/L");
                    list.add("VERITO VIBE");
                    list.add("eVERITO");
                    list.add("VERITO EXECUTIVE");
                    list.add("XUV 500");
                    list.add("XUV 500 2ND GEN");
                    list.add("XYLO 1ST GEN");
                    list.add("XYLO 2ND GEN");
                    list.add("XYLO 3RD GEN");
                    ArrayAdapter<String> dataAdapter16 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter16.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter16.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter16);
                }
                if (sp1.contentEquals("Maruti Suzuki")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("800(1997)");
                    list.add("800(2000)");
                    list.add("ALTO");
                    list.add("ALTO K10");
                    list.add("ALTO 800");
                    list.add("A-STAR");
                    list.add("BALENO ALTURA");
                    list.add("BALENO 1ST GEN");
                    list.add("BALENO 2ND GEN");
                    list.add("CELERIO");
                    list.add("CIAZ");
                    list.add("EECO");
                    list.add("ERTIGA");
                    list.add("ESTEEM");
                    list.add("GRAND VITARA");
                    list.add("GYPSY");
                    list.add("Ignis");
                    list.add("KIZASHI");
                    list.add("OMNI 1ST GEN");
                    list.add("OMNI 2ND GEN");
                    list.add("OMNI 3RD GEN");
                    list.add("RITZ");
                    list.add("RITZ 2ND GEN");
                    list.add("S-CROSS");
                    list.add("STINGRAY");
                    list.add("SWIFT 1ST GEN");
                    list.add("SWIFT 2ND GEN");
                    list.add("SWIFT DZIRE 1ST GEN");
                    list.add("SWIFT DZIRE 2ND GEN");
                    list.add("SWIFT DZIRE 3RD GEN");
                    list.add("SX4");
                    list.add("SX4 1st F/L");
                    list.add("SX4 2nd F/L");
                    list.add("VERSA");
                    list.add("BREZZA");
                    list.add("WAGON R (2000-2003)");
                    list.add("WAGON R (2003-2006)");
                    list.add("WAGON R (2006-2010)");
                    list.add("WAGON R (2010-2012)");
                    list.add("Wagon R (2012-NOW)");
                    list.add("ZEN");
                    list.add("ZEN CLASSIC");
                    list.add("ZEN 2ND GEN");
                    list.add("ZEN ESTILO 2ND GEN");
                    list.add("ZEN ESTILO 1ST GEN");
                    ArrayAdapter<String> dataAdapter17 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter17.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter17.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter17);
                }
                if (sp1.contentEquals("Mercdes-Benz")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("A-CLASS (W176");
                    list.add("B-CLASS (W245))");
                    list.add("C-CLASS (W203)");
                    list.add("C-CLASS (CL203)");
                    list.add("C-CLASS (W204)");
                    list.add("C-CLASS (W205)");
                    list.add("CLA (C117)");
                    list.add("CLS (C219)");
                    list.add("E-CLASS (W211)");
                    list.add("E-CLASS (W212)");
                    list.add("E-CLASS Coupe (C207)");
                    list.add("E 63");
                    list.add("E-CLASS");
                    list.add("G-CLASS (W463)");
                    list.add("G-CLASS (W461)");
                    list.add("GLA-CLASS (X156)");
                    list.add("GLA-CLASS");
                    list.add("GLC");
                    list.add("GL-CLASS (X164)");
                    list.add("GL-CLASS (X166)");
                    list.add("GLE");
                    list.add("GLS");
                    list.add("M-CLASS (W163) (1998 - 2005) \t");
                    list.add("M-CLASS (W164) (2005)");
                    list.add("M-CLASS (W166) \t");
                    list.add("R350");
                    list.add("S-CLASS (W220)");
                    list.add("S-CLASS (W222)");
                    list.add("S-CLASS Coupe (C217)");
                    list.add("SLC-43 AMG (R172)");
                    list.add("SLK (R171)");
                    list.add("SLK (R172)");
                    ArrayAdapter<String> dataAdapter18 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter18.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter18.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter18);
                }
                if (sp1.contentEquals("Mini")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("F55");
                    list.add("F56");
                    list.add("R56");
                    list.add("Roadster (R59");
                    list.add("COUNTRYMAN (R60)");
                    list.add("PACEMAN (R61)");
                    ArrayAdapter<String> dataAdapter19 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter19.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter19.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter19);
                }
                if (sp1.contentEquals("Mitsubushi")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("CEDIA");
                    list.add("LANCER Mk VI");
                    list.add("LANCER EVOLUTION X");
                    list.add("MONTERO");
                    list.add("Outlander XL");
                    list.add("OUTLANDER");
                    list.add("PAJERO SFX");
                    list.add("PAJERO SPORT");
                    ArrayAdapter<String> dataAdapter20 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter20.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter20.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter20);
                }
                if (sp1.contentEquals("Nissan")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("EVALIA");
                    list.add("GT-R (R35) (2008)");
                    list.add("MICRA (K13K)(2010-2013)");
                    list.add("MICRA (K13K)(2013-now)");
                    list.add("MICRA ACTIVE (MK13K/MK13KK)");
                    list.add("MICRA");
                    list.add("SUNNY (N17K)");
                    list.add("SUNNY (N17KK)");
                    list.add("TEANA (J31)");
                    list.add("TEANA (J32/J32K)");
                    list.add("TERRANO");
                    list.add("X-TRAIL (T31)");
                    list.add("X-TRAIL (T30) (2001 - 2005)");
                    ArrayAdapter<String> dataAdapter21 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter21.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter21.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter21);
                }
                if (sp1.contentEquals("Renault")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("DUSTER(2012-now)");
                    list.add("DUSTER(2017-now)");
                    list.add("FLUENCE");
                    list.add("KOLEOS");
                    list.add("KWID");
                    list.add("LODGY");
                    list.add("LOGAN");
                    list.add("PULSE");
                    list.add("SCALA");
                    ArrayAdapter<String> dataAdapter22 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter22.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter22.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter22);
                }
                if (sp1.contentEquals("Skoda")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("FABIA");
                    list.add("LAURA (1Z3)");
                    list.add("OCTAVIA (1U2)");
                    list.add("OCTAVIA (5E3)");
                    list.add("OCTAVIA");
                    list.add("RAPID (NA2)");
                    list.add("RAPID");
                    list.add("SUPERB Saloon (3U4)");
                    list.add("SUPERB (3T4)");
                    list.add("SUPERB");
                    list.add("YETI (5L)");
                    ArrayAdapter<String> dataAdapter23 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter23.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter23.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter23);
                }
                if (sp1.contentEquals("TATA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("207");
                    list.add("ACE");
                    list.add("SUPER ACE");
                    list.add("ACE ZIP");
                    list.add("ACE REFRESH");
                    list.add("ARIA");
                    list.add("ARIA LET");
                    list.add("BOLT");
                    list.add("HEXA");
                    list.add("INDICA V2 XETA");
                    list.add("INDICA EV2");
                    list.add("INDICA V2");
                    list.add("INDICA VISTA");
                    list.add("INDICA VISTA REFRESH");
                    list.add("INDICA VISTA TECH");
                    list.add("SUPERB");
                    list.add("INDIGO");
                    list.add("INDIGO XL");
                    list.add("INDIGO CS");
                    list.add("INDIGO eCS");
                    list.add("INDIGO MARINA");
                    list.add("MAGIC");
                    list.add("MAGIC IRIS (2007)");
                    list.add("MANZA");
                    list.add("MANZA CLUB CLASS");
                    list.add("MOVUS");
                    list.add("NANO");
                    list.add("NANO TWIST");
                    list.add("NANO Gen X");
                    list.add("SAFARI");
                    list.add("SAFARI DiCOR");
                    list.add("SAFARI DiCOR F/L");
                    list.add("SAFARI STORME");
                    list.add("SAFARI STORME LET");
                    list.add("SUMO");
                    list.add("SUMO VICTA");
                    list.add("SUMO GOLD");
                    list.add("SUMO GRANDE");
                    list.add("TELCOLINE");
                    list.add("TIAGO");
                    list.add("TIGOR");
                    list.add("VENTURE");
                    list.add("WINGER");
                    list.add("XENON XT");
                    list.add("XENON");
                    list.add("ZEST");
                    ArrayAdapter<String> dataAdapter24 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter24.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter24.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter24);
                }
                if (sp1.contentEquals("Toyota")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("CAMRY XV30");
                    list.add("CAMRY XV40");
                    list.add("CAMRY XV50");
                    list.add("COROLLA E120 (IX gen)");
                    list.add("COROLLA ALTIS E140 (X gen)");
                    list.add("COROLLA ALTIS E170 (XI gen)(2014-2017)");
                    list.add("ETIOS");
                    list.add("ETIOS LIVA");
                    list.add("ETIOS CROSS");
                    list.add("PLATINUM ETIOS");
                    list.add("ETIOS LIVA F/L");
                    list.add("FORTUNER 1st GEN");
                    list.add("FORTUNER 1st GEN F/L");
                    list.add("INNOVA(2005-2012)");
                    list.add("INNOVA(2012-2015)");
                    list.add("INNOVA CRYSTA");
                    list.add("LAND CRUISER J100");
                    list.add("LAND CRUISER J200(2007-2015)");
                    list.add("LAND CRUISER J200(2012-now)");
                    list.add("LAND CRUISER PRADO J120");
                    list.add("LAND CRUISER PRADO J150(2009-2015)");
                    list.add("LAND CRUISER PRADO J150(2013-now)");
                    list.add("PRIUS(2012-2015)");
                    list.add("PRIUS(2017-now)");
                    ArrayAdapter<String> dataAdapter25 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter25.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter25.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter25);
                }
                if (sp1.contentEquals("VOLVO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("S60(2011-2015)");
                    list.add("S60 Cross Country");
                    list.add("S60(2016-now");
                    list.add("S80(1999-2006)");
                    list.add("S80(2007-2015)");
                    list.add("S90");
                    list.add("V40 Cross Country");
                    list.add("V40");
                    list.add("XC60(2008-2015)");
                    list.add("XC60(2016-now)");
                    list.add("XC90(2005-2014)");
                    list.add("XC90(2016-now)");
                    ArrayAdapter<String> dataAdapter26 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter26.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter26.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter26);
                }
                if (sp1.contentEquals("Volkswagen")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("AMEO");
                    list.add("BEETLE (9C1, 1C1)");
                    list.add("JETTA 6");
                    list.add("PASSAT (362)");
                    list.add("PASSAT");
                    list.add("PASSAT (A32)");
                    list.add("POLO (6R, 6C)");
                    list.add("GTI");
                    list.add("TIGUAN");
                    list.add("TOUAREG (7P5");
                    list.add("VENTO (60)");
                    list.add("VENTO IV (162)");
                    ArrayAdapter<String> dataAdapter27 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter27.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter27.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter27);
                }
                if (sp1.contentEquals("Opel")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("ASTRA");
                    list.add("CORSA");
                    list.add("VECTRA C (2002)");
                    ArrayAdapter<String> dataAdapter28 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter28.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter28.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter28);
                }
                if (sp1.contentEquals("Porsche")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("911 (997)(2004-now)");
                    list.add("911 (997)(2005-now)");
                    list.add("911 (997)(2006-now)");
                    list.add("911 (991)Body type: Convertible");
                    list.add("911 (991)Body type:  Coupe");
                    list.add("911 (991)(2014-now)Body type:  Targa");
                    list.add("BOXSTER (987)");
                    list.add("BOXSTER (981)");
                    list.add("CAYENNE");
                    list.add("CAYMAN (987)");
                    list.add("CAYMAN (981)");
                    list.add("MACAN");
                    list.add("PANAMERA");
                    ArrayAdapter<String> dataAdapter29 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter29.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter29.notifyDataSetChanged();
                    s3.setAdapter(dataAdapter29);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                String model = String.valueOf(s3.getSelectedItem());

                if (model.contentEquals("LEYLAND DOST")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Variant");
                    ArrayAdapter<String> dataAdapter100 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter100.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter100.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter100);
                }
                if (model.contentEquals("LEYLAND STILE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Variant");
                    ArrayAdapter<String> dataAdapter101 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter101.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter101.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter101);
                }
                if (model.contentEquals("MARTIN DB11")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Variant");
                    ArrayAdapter<String> dataAdapter102 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter102.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter102.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter102);
                }
                if (model.contentEquals("MARTIN DB9(body type-couple)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Variant");
                    ArrayAdapter<String> dataAdapter103 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter103.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter103.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter103);
                }
                if (model.contentEquals("MARTIN DB9(body type-Convertible)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Variant");
                    ArrayAdapter<String> dataAdapter104 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter104.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter104.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter104);
                }
                if (model.contentEquals("MARTIN DBS")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Variant");
                    ArrayAdapter<String> dataAdapter105 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter105.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter105.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter105);
                }
                if (model.contentEquals("MARTIN DBS VOLANTE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Variant");
                    ArrayAdapter<String> dataAdapter106 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter106.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter106.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter106);
                }
                if (model.contentEquals("MARTIN RAPIDE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Variant");
                    ArrayAdapter<String> dataAdapter107 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter107.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter107.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter107);
                }
                if (model.contentEquals("MARTIN VANQUISH(2012-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Variant");
                    ArrayAdapter<String> dataAdapter108 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter108.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter108.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter108);
                }
                if (model.contentEquals("MARTIN VANQUISH(2013-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Variant");
                    ArrayAdapter<String> dataAdapter109 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter109.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter109.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter109);
                }
                if (model.contentEquals("MARTIN VANQUISH(2009-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Variant");
                    ArrayAdapter<String> dataAdapter110 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter110.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter110.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter110);
                }
                if (model.contentEquals("MARTIN VANQUISH(2010-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Variant");
                    ArrayAdapter<String> dataAdapter111 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter111.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter111.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter111);
                }
                if (model.contentEquals("A3 (8P7)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 TFSI / 1.2L / Petrol");
                    list.add("1.4 TFSI / 1.4L / Petrol");
                    list.add("1.6/ 1.6L / Petrol");
                    list.add("1.6 TDI / 1.6L / Diesel");
                    list.add("1.9 TDI / 1.9L / Diesel");
                    list.add("2.0 TDI / 2.0L / Diesel");
                    list.add("2.0 TDI / 2.0L Diesel / 140 h.p.");
                    list.add("2.0 TFSI / 2.0L / Petrol");

                    ArrayAdapter<String> dataAdapter112 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter112.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter112.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter112);
                }
                if (model.contentEquals("A3 (8V7)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4TFSI / 1.4L / petrol / 140h.p");
                    list.add("1.4TFSI / 1.4L / petrol / 125h.p");
                    list.add("1.4TFSI / 1.4L / petrol / 150h.p");
                    list.add("1.6TDI / 1.6L / diesel / 110h.p");
                    list.add("1.8TFSI / 1.8L / petrol / 180h.p");
                    list.add("1.8TFSI / 1.8L / petrol / 170h.p");
                    list.add("1.8TFSI quattro / 1.8L / petrol / 180h.p");
                    list.add("2.0TDI / 2.0L / Diesel / 136h.p");
                    list.add("2.0TDI / 2.0L / Diesel / 150h.p");
                    list.add("2.0TDI / 2.0L / Diesel / 184h.p");

                    ArrayAdapter<String> dataAdapter113 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter113.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter113.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter113);
                }
                if (model.contentEquals("A3(2017-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Petrol / 148h.p");
                    list.add("2.0 / 2.0L / Diesel / 141h.p");
                    ArrayAdapter<String> dataAdapter114 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter114.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter114.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter114);
                }
                if (model.contentEquals("A3(2015-2016)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.8 / 1.8L / Petrol / 180h.p");
                    list.add("2.0 / 2.0L / Diesel / 143h.p");
                    ArrayAdapter<String> dataAdapter115 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter115.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter115.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter115);
                }
                if (model.contentEquals("A3 Cabriolet")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Petrol / 148h.p");
                    list.add("1.8 / 1.8L / Petrol / 177h.p");
                    ArrayAdapter<String> dataAdapter116 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter116.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter116.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter116);
                }
                if (model.contentEquals("A4 (8E2, B6)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.8T / 1.8L / Petrol / 150h.p");
                    list.add("1.8T / 1.8L / Petrol / 170h.p");
                    list.add("1.8T / 1.8L / Petrol / 163h.p");
                    list.add("1.8T / 1.8L / Petrol / 190h.p");
                    list.add("1.9TDI / 1.9L / Diesel / 101h.p");
                    list.add("1.9TDI / 1.9L / Diesel / 116h.p");
                    list.add("1.9TDI quattro / 1.9L / Diesel / 130h.p");
                    list.add("2.0 / 2.0L / Petrol / 130h.p");
                    list.add("2.0FSI  / 2.0L / Petrol / 150h.p");
                    list.add("2.4 / 2.4L / Petrol / 163h.p");
                    list.add("2.5D / 2.5L / Diesel / 179h.p");
                    list.add("2.5TDI / 2.5L / Diesel / 155h.p");
                    list.add("2.5TDI / 2.5L / Diesel / 163h.p");
                    list.add("3.0 / 3.0L / Petrol / 220h.p");
                    list.add("3.0quattro / 3.0L / Petrol / 218h.p");
                    ArrayAdapter<String> dataAdapter117 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter117.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter117.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter117);
                }
                if (model.contentEquals("A4 (8EC, B7)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.6 / 1.6L / Petrol / 102h.p");
                    list.add("1.8 T quattro / 1.8L / Petrol / 163h.p");
                    list.add("1.9 TDI  / 1.9L / Diesel / 116h.p");
                    list.add("2.0 /  2.0L / Petrol / 130h.p");
                    list.add("2.0 FSI /  2.0L / Petrol / 150h.p");
                    list.add("2.0 TDI /  2.0L / Diesel / 136h.p");
                    list.add("2.0 TDI /  2.0L / Diesel / 140h.p");
                    list.add("2.0 TDI /  2.0L / Diesel / 121h.p");
                    list.add("2.0FSI  / 2.0L / Petrol / 150h.p");
                    list.add("2.0 TDI /  2.0L / Diesel / 126h.p");
                    list.add("2.0 TDI /  2.0L / Diesel / 170h.p");
                    list.add("2.0 TDI  quattro/  2.0L / Diesel / 163h.p");
                    list.add("2.0 TFSI /  2.0L / Petrol / 220h.p");
                    list.add("2.0 TFSI /  2.0L / Petrol / 170h.p");
                    list.add("2.0 TFSI quattro /  2.0L / Petrol / 200h.p");
                    list.add("2.5 TDI /  2.5L / Diesel / 163h.p");
                    list.add("2.7 TDI /  2.7L / Diesel / 163h.p");
                    list.add("2.7 TDI /  2.7L / Diesel / 180h.p");
                    list.add("3.0 quattro / 3.0L / Petrol / 218h.p");
                    list.add("3.0 TDI quattro / 3.0L / Diesel / 204h.p");
                    list.add("3.2 FSI / 3.2L / Petrol / 255h.p");

                    ArrayAdapter<String> dataAdapter118 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter118.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter118.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter118);
                }
                if (model.contentEquals("A4 (8K2, B8)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.8 TFSI / 1.8L / Petrol / 120h.p");
                    list.add("1.8 TFSI quattro / 1.8L / Petrol / 170h.p");
                    list.add("1.8 TFSI quattro / 1.8L / Petrol / 160h.p");
                    list.add("2.0TDI / 2.0L / Diesel / 136h.p");
                    list.add("2.0TDI / 2.0L / Diesel / 120h.p");
                    list.add("2.0TDI / 2.0L / Diesel / 163h.p");
                    list.add("2.0TDI quattro / 2.0L / Diesel / 150h.p");
                    list.add("2.0TDI quattro / 2.0L / Diesel / 190h.p");
                    list.add("2.0TDI quattro / 2.0L / Diesel / 143h.p");
                    list.add("2.0TDI quattro / 2.0L / Diesel / 177h.p");
                    list.add("2.0TFSI / 2.0L / Petrol / 211h.p");
                    list.add("2.0TFSI / 2.0L / Petrol / 220h.p");
                    list.add("2.0 TFSI quattro/ 2.0L / Petrol / 224h.p");
                    list.add("2.0 TFSI quattro/ 2.0L / Petrol / 180h.p");
                    list.add("2.7 TDI / 2.7L / Diesel / 163h.p");
                    list.add("2.7 TDI / 2.7L / Diesel / 190h.p");
                    list.add("3.0 TDI / 3.0L / Diesel / 240h.p");
                    list.add("3.0 TDI quattro / 3.0L / Diesel / 211h.p");
                    list.add("3.0 TDI quattro / 3.0L / Diesel / 240h.p");
                    list.add("3.0 TDI quattro / 3.0L / Diesel / 245h.p");
                    list.add("3.0 TFSI quattro / 3.0L / Petrol / 272h.p");
                    list.add("3.2 FSI quattro / 3.2L / Petrol / 265h.p");
                    ArrayAdapter<String> dataAdapter119 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter119.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter119.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter119);
                }
                if (model.contentEquals("A4 (8W, B9)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 TFSI / 1.4L / Petrol / 148h.p");
                    ArrayAdapter<String> dataAdapter120 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter120.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter120.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter120);
                }
                if (model.contentEquals("RS5")) {
                    List<String> list = new ArrayList<>();
                    list.add("Variant");
                    list.add("4.2 / 4.2L/Petrol / 44h.p");
                    ArrayAdapter<String> dataAdapter121 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter121.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter121.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter121);
                }
                if (model.contentEquals("A6 (4F2, C6)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 TDI / 2.0L / Diesel / 140h.p");
                    list.add("2.0 TDI / 2.0L / Diesel / 121h.p");
                    list.add("2.0 TDI / 2.0L / Diesel / 170h.p");
                    list.add("2.0 TDI / 2.0L / Diesel / 163h.p");
                    list.add("2.0 TFSI / 2.0L / Petrol / 170h.p");
                    list.add("2.4 quattro / 2.4L / Petrol / 177h.p");
                    list.add("2.7 TDI / 2.7L / Diesel / 163h.p");
                    list.add("2.7 TDI / 2.7L / Diesel / 190h.p");
                    list.add("2.7 TDI quattro / 2.7L / Diesel / 180h.p");
                    list.add("2.7 TDI quattro / 2.7L / Diesel / 190h.p");
                    list.add("2.8 FSI / 2.8L / Petrol / 210h.p");
                    list.add("2.8 FSI / 2.8L / Petrol / 220h.p");
                    list.add("2.8 FSI / 2.8L / Petrol / 190h.p");
                    list.add("3.0 / 3.0L / Petrol / 218h.p");
                    list.add("3.0 / 3.0L / Petrol / 290h.p");
                    list.add("3.0 TDI / 3.0L / Diesel / 232h.p");
                    list.add("3.0 TDI quattro / 3.0L / Diesel / 225h.p");
                    list.add("3.0 TDI quattro / 3.0L / Diesel / 240h.p");
                    list.add("3.2 / 3.2L / Petrol / 265h.p");
                    list.add("3.2 FSI quattro / 3.2L / Petrol / 255h.p");
                    list.add("3.2 FSI quattro / 3.2L / Petrol / 249h.p");
                    list.add("4.2 FSI quattro / 4.2L / Petrol / 350h.p");
                    list.add("4.2  quattro / 4.2L / Petrol / 355h.p");
                    list.add("5.0 RS6  quattro / 5.0L / Petrol / 580h.p");
                    ArrayAdapter<String> dataAdapter122 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter122.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter122.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter122);
                }
                if (model.contentEquals("A6 (4G2, C7)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 TDI / 2.0L / Diesel / 177h.p");
                    list.add("2.0 TDI / 2.0L / Diesel / 163h.p");
                    list.add("2.0 TDI / 2.0L / Diesel / 190h.p");
                    list.add("2.0 TFSI / 2.0L / Petrol / 211h.p");
                    list.add("2.0 TFSI / 2.0L / Petrol / 180h.p");
                    list.add("2.0 TFSI / 2.0L / Petrol / 220h.p");
                    list.add("2.8 FSI quattro / 2.8L / Petrol / 204h.p");
                    list.add("3.0 TDI  / 3.0L / Diesel / 204h.p");
                    list.add("3.0 TDI quattro / 3.0L / Diesel / 245h.p");
                    list.add("3.0 TDI quattro / 3.0L / Diesel / 204h.p");
                    list.add("3.0 TDI quattro / 3.0L / Diesel / 313h.p");
                    list.add("3.0 TDI quattro / 3.0L / Diesel / 313h.p");
                    list.add("3.0 TDI quattro / 3.0L / Diesel / 239h.p");
                    list.add("3.0 TFSI quattro / 3.0L / Petrol / 310h.p");
                    list.add("3.0 TFSI quattro / 3.0L / Petrol / 300h.p");
                    ArrayAdapter<String> dataAdapter123 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter123.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter123.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter123);
                }
                if (model.contentEquals("A7")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0  quattro / 3.0L / Diesel / 241h.p");
                    ArrayAdapter<String> dataAdapter124 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter124.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter124.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter124);
                }
                if (model.contentEquals("A8 (4E_)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.8  FSI / 2.8L /Petrol / 210h.p");
                    list.add("2.8  FSI / 2.8L /Petrol / 231h.p");
                    list.add("3.0  / 3.0L /Petrol / 220h.p");
                    list.add("3.0  / 3.0L /Petrol / 218h.p");
                    list.add("3.0 TDI quattro / 3.0L /Diesel / 233h.p");
                    list.add("3.0 TDI quattro / 3.0L /Diesel / 211h.p");
                    list.add("3.2 FSI quattro / 3.2L / Petrol / 260h.p");
                    list.add("3.7 quattro / 3.7L / Petrol / 280h.p");
                    list.add("4.0 TDI quattro / 4.0L / Diesel / 275h.p");
                    list.add("4.2 FSI quattro / 4.2L / Petrol / 350h.p");
                    list.add("4.2  quattro / 4.2L / Petrol / 305h.p");
                    list.add("4.2  quattro / 4.2L / Petrol / 355h.p");
                    list.add("4.2 TDI quattro / 4.2L / Diesel / 320h.p");
                    list.add("4.2  quattro / 4.2L / Diesel / 326h.p");
                    list.add("6.0 W12 quattro / 6.0L / Petrol / 450h.p");
                    ArrayAdapter<String> dataAdapter125 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter125.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter125.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter125);
                }
                if (model.contentEquals("A8 (4H_)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 TDI / 3.0L / Diesel / 204h.p");
                    list.add("3.0 TDI quattro / 3.0L / Diesel / 250h.p");
                    list.add("3.0 TDI quattro / 3.0L / Diesel / 211h.p");
                    list.add("3.0 TDI quattro / 3.0L / Diesel / 239h.p");
                    list.add("3.0 TDI quattro / 3.0L / Diesel / 258h.p");
                    list.add("3.0 TFSI quattro / 3.0L / Petrol / 333h.p");
                    list.add("3.0 TFSI quattro / 3.0L / Petrol / 290h.p");
                    list.add("3.0 TFSI quattro / 3.0L / Petrol / 310h.p");
                    list.add("4.0 TFSI quattro / 4.0L / Petrol / 420h.p");
                    list.add("4.0 TFSI quattro / 4.0L / Petrol / 435h.p");
                    list.add("4.2 FSI quattro / 4.2L / Petrol / 371h.p");
                    list.add("4.2 TDI quattro / 4.2L / Diesel / 351h.p");
                    list.add("4.2 TDI quattro / 4.2L / Diesel / 385h.p");
                    ArrayAdapter<String> dataAdapter126 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter126.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter126.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter126);
                }
                if (model.contentEquals("Q3 (8U)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 TFSI / 1.4L / Petrol / 150h.p");
                    list.add("2.0 TDI / 2.0L / Diesel / 140h.p");
                    list.add("2.0 TDI / 2.0L / Diesel / 136h.p");
                    list.add("2.0 TDI / 2.0L / Diesel / 177h.p");
                    list.add("2.0 TDI quattro / 2.0L / Diesel / 163h.p");
                    list.add("2.0 TFSI quattro / 2.0L / Petrol / 170h.p");
                    list.add("2.0 TFSI quattro / 2.0L / Petrol / 211h.p");
                    ArrayAdapter<String> dataAdapter127 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter127.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter127.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter127);
                }
                if (model.contentEquals("Q3")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Diesel / 150h.p");
                    list.add("2.0 / 2.0L / Diesel / 184h.p");
                    ArrayAdapter<String> dataAdapter128 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter128.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter128.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter128);
                }
                if (model.contentEquals("Q5 (8R)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 TDI / 2.0L / Diesel / 143h.p");
                    list.add("2.0 TDI quattro / 2.0L / Diesel / 170h.p");
                    list.add("2.0 TDI quattro / 2.0L / Diesel / 163h.p");
                    list.add("2.0 TDI quattro / 2.0L / Diesel / 136h.p");
                    list.add("2.0 TDI quattro / 2.0L / Diesel / 136h.p");
                    list.add("2.0 TDI quattro / 2.0L / Diesel / 136h.p");
                    list.add("3.0 TFSI quattro / 3.0L / Petrol / 290h.p");
                    list.add("2.0 TDI quattro / 2.0L / Diesel / 177h.p");
                    list.add("2.0 TDI quattro / 2.0L / Diesel / 150h.p");
                    list.add("2.0 TDI quattro / 2.0L / Diesel / 190h.p");
                    list.add("2.0 TFSI hybrid quattro / 2.0L / Hybrid / 211h.p");
                    list.add("2.0 TFSI quattro / 2.0L / Petrol / 180h.p");
                    list.add("4.2 TDI quattro / 4.2L / Diesel / 385h.p");
                    list.add("2.0 TFSI quattro / 2.0L / Petrol / 220h.p");
                    list.add("3.0 TDI quattro / 3.0L / Diesel / 240h.p");
                    list.add("3.0 TDI quattro / 3.0L / Diesel / 211h.p");
                    list.add("3.0 TDI quattro / 3.0L / Diesel / 250h.p");
                    list.add("3.0 TDI quattro / 3.0L / Diesel / 245h.p");
                    list.add("3.0 TDI quattro / 3.0L / Diesel / 258h.p");
                    list.add("3.0 TFSI quattro / 3.0L / Petrol / 272h.p");
                    list.add("3.2 FSI quattro / 3.2L / Petrol / 270h.p");
                    ArrayAdapter<String> dataAdapter129 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter129.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter129.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter129);
                }
                if (model.contentEquals("Q7 (4L)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0TDI / 3.0L / Diesel / 233h.p");
                    list.add("3.0TDI / 3.0L / Diesel / 211h.p");
                    list.add("3.0TDI / 3.0L / Diesel / 240h.p");
                    list.add("3.0TDI / 3.0L / Diesel / 224h.p");
                    list.add("3.0 TDI / 3.0L / Diesel / 204h.p");
                    list.add("3.0 TDI / 3.0L / Diesel / 245h.p");
                    list.add("3.0 TFSI / 3.0L / Petrol / 272h.p");
                    list.add("3.6 FSI / 3.6L / Petrol / 280h.p");
                    list.add("4.2 FSI / 4.2L / Petrol / 350h.p");
                    list.add("4.2 TDI / 4.2L / Diesel / 326h.p");
                    list.add("4.2 TDI / 4.2L / Diesel / 340h.p");
                    list.add("6.0 TDI / 6.0L / Diesel / 500h.p");
                    ArrayAdapter<String> dataAdapter130 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter130.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter130.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter130);
                }
                if (model.contentEquals("R8(2007-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("4.2FSI quattro / 4.2L / Petrol / 420h.p");
                    list.add("4.2FSI quattro / 4.2L / Petrol / 430h.p");
                    list.add("5.2FSI quattro / 5.2L / Petrol / 525h.p");
                    list.add("5.2FSI quattro / 5.2L / Petrol / 560h.p");
                    list.add("5.2FSI quattro / 5.2L / Petrol / 549h.p");
                    list.add("5.2FSI quattro / 5.2L / Petrol / 570h.p");
                    ArrayAdapter<String> dataAdapter131 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter131.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter131.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter131);
                }
                if (model.contentEquals("R8(2010-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("4.2FSI quattro / 4.2L / Petrol / 430h.p");
                    list.add("5.2 FSI quattro / 5.2L / Petrol / 525h.p");
                    list.add("5.2 FSI quattro / 5.2L / Petrol / 560h.p");
                    list.add("5.2 FSI quattro / 5.2L / Petrol / 549h.p");
                    ArrayAdapter<String> dataAdapter132 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter132.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter132.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter132);
                }
                if (model.contentEquals("TT (8N3)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.8 T quattro / 1.8L / Petrol / 180h.p");
                    list.add("3.2 VR6 quattro / 3.2L / Petrol / 250h.p");
                    ArrayAdapter<String> dataAdapter133 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter133.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter133.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter133);
                }
                if (model.contentEquals("TT (8J3)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.8TFSI / 1.8L / Petrol / 160h.p");
                    list.add("2.0TFSI / 2.0L / Petrol / 200h.p");
                    list.add("3.6 V6 quattro / 3.2L / Petrol / 250h.p");
                    list.add("45 TFSI / 2.0L / Petrol / 211h.p");
                    ArrayAdapter<String> dataAdapter134 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter134.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter134.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter134);
                }
                if (model.contentEquals("TT")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 TDI / 2.0L / Diesel / 184h.p");
                    ArrayAdapter<String> dataAdapter135 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter135.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter135.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter135);
                }
                if (model.contentEquals("1 (F20)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("116i / 1.6L / Petrol / 136h.p");
                    list.add("3.6 V6 quattro / 3.2L / Petrol / 250h.p");
                    list.add("118d(LCI) / 2.0L / Diesel / 150h.p");
                    ArrayAdapter<String> dataAdapter136 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter136.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter136.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter136);
                }
                if (model.contentEquals("3 (E90)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("320d M47N2 / 2.0L / Diesel / 163h.p");
                    list.add("320d N47 / 2.0L / Diesel / 177h.p");
                    list.add("320d N47(LCI) / 2.0L / Diesel / 184h.p");
                    list.add("320d N47N(LCI) / 2.0L / Diesel / 163h.p");
                    list.add("320i (LCI) / 2.0L / Petrol / 156h.p");
                    list.add("320i N46 / 2.0L / Petrol / 150h.p");
                    list.add("320i N46N / 2.0L / Petrol / 170h.p");
                    list.add("325i (LCI) / 2.5L / Petrol / 218h.p");
                    list.add("325i N52 / 2.5L / Petrol / 218h.p");
                    list.add("325i N52N / 2.5L / Petrol / 218h.p");
                    list.add("330i (LCI) / 3.0L / Petrol / 218h.p");
                    list.add("320d / 2.0L / Diesel / 184h.p");
                    list.add("320d (LCI) / 2.0L / Diesel / 190h.p");
                    list.add("320i / 2.0L / Petrol / 184h.p");
                    list.add("320i (LCI) / 2.0L / Petrol / 184h.p");
                    list.add("328i / 2.0L / Petrol / 245h.p");
                    ArrayAdapter<String> dataAdapter137 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter137.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter137.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter137);
                }
                if (model.contentEquals("3 (F80 M3)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("M3 / 3.0L / Petrol / 431h.p");
                    ArrayAdapter<String> dataAdapter138 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter138.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter138.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter138);
                }
                if (model.contentEquals("3 GT (F34)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("M4 / 3.0L / Petrol / 431h.p");
                    ArrayAdapter<String> dataAdapter139 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter139.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter139.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter139);
                }
                if (model.contentEquals("4 (F82)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("520d / 2.0L / Diesel / 177h.p");
                    list.add("523i / 2.5L / Petrol / 190h.p");
                    list.add("525d / 3.0L / Diesel / 197h.p");
                    list.add("525i / 2.5L / Petrol / 218h.p");
                    list.add("530d / 3.0L / Diesel / 235h.p");
                    list.add("530i / 3.0L / Petrol / 272h.p");
                    ArrayAdapter<String> dataAdapter140 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter140.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter140.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter140);
                }
                if (model.contentEquals("5 (E60)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("530d / 3.0L / Diesel / 245h.p");
                    ArrayAdapter<String> dataAdapter141 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter141.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter141.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter141);
                }
                if (model.contentEquals("5 GT (F07)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("520d / 2.0L / Diesel / 184h.p");
                    list.add("520d B47 (LCI) / 2.0L / Diesel / 190h.p");
                    list.add("520d N47N (LCI) / 2.0L / Diesel / 184h.p");
                    list.add("520i / 2.0L / Petrol / 184h.p");
                    list.add("520i (LCI) / 2.0L / Petrol / 184h.p");
                    list.add("523i / 2.5L / Petrol / 204h.p");
                    list.add("525d N47S1/ 2.0L / Diesel / 218h.p");
                    list.add("525d N57/ 3.0L / Diesel / 204h.p");
                    list.add("530d (LCI)/ 3.0L / Diesel / 258h.p");
                    list.add("530d N57/ 3.0L / Diesel / 245h.p");
                    list.add("530d N57N/ 3.0L / Diesel / 258h.p");
                    list.add("530d N57N/ 3.0L / Diesel / 258h.p");
                    list.add("M5/ 4.4L / Petrol / 560h.p");
                    ArrayAdapter<String> dataAdapter142 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter142.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter142.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter142);
                }
                if (model.contentEquals("5 (F10)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("640d / 3.0L / Diesel / 313h.p");
                    list.add("640d (LCI) / 3.0L / Diesel / 313h.p");
                    list.add("M6 / 4.4L / Petrol / 560h.p");
                    list.add("M6 (LCI) / 4.4L / Petrol / 560h.p");
                    list.add("M6  / 4.4L / Petrol / 575h.p");
                    ArrayAdapter<String> dataAdapter143 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter143.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter143.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter143);
                }
                if (model.contentEquals("6 (F06)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("M6  / 4.4L / Petrol / 575h.p");
                    ArrayAdapter<String> dataAdapter144 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter144.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter144.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter144);
                }
                if (model.contentEquals("6 (F13)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("730d / 3.0L / Diesel / 545h.p");
                    list.add("730d (LCI) / 3.0L / Diesel / 558h.p");
                    list.add("Hybrid 7L (LCI) / 3.0L / Hybrid / 320h.p");
                    list.add("730Ld / 3.0L / Diesel / 265h.p");
                    list.add("M6  / 4.4L / Petrol / 575h.p");
                    list.add("750Li / 3.0L / Petrol / 236h.p");
                    ArrayAdapter<String> dataAdapter145 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter145.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter145.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter145);
                }
                if (model.contentEquals("7 (F02)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 / 3.0L / Diesel / 265h.p");
                    list.add("4.4 / 4.4L / Petrol / 450h.p");
                    list.add("M760Li 6.6 / 6.6L / Petrol / 610h.p");
                    ArrayAdapter<String> dataAdapter146 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter146.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter146.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter146);
                }
                if (model.contentEquals("7 (G12)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 / 3.0L / Diesel / 265h.p");
                    ArrayAdapter<String> dataAdapter147 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter147.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter147.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter147);
                }
                if (model.contentEquals("7 (G11)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 / 3.0L / Diesel / 265h.p");
                    list.add("4.4 / 4.4L / Petrol / 450h.p");
                    list.add("M760Li 6.6 / 6.6L / Petrol / 610h.p");
                    ArrayAdapter<String> dataAdapter148 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter148.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter148.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter148);
                }
                if (model.contentEquals("i8")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("20d / 2.0L / Diesel / 190h.p");
                    list.add("4.4 / 4.4L / Petrol / 450h.p");
                    list.add("20dX / 2.0L / Diesel / 190h.p");
                    ArrayAdapter<String> dataAdapter149 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter149.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter149.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter149);
                }
                if (model.contentEquals("X1 (E84)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("20dX B47 / 2.0L / Diesel / 190h.p");
                    ArrayAdapter<String> dataAdapter150 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter150.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter150.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter150);
                }
                if (model.contentEquals("X1 (F48)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("20dX N47N / 2.0L / Diesel / 184h.p");
                    ArrayAdapter<String> dataAdapter151 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter151.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter151.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter151);
                }
                if (model.contentEquals("X3 (F25)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("20dX / 3.0L / Diesel / 258h.p");
                    ArrayAdapter<String> dataAdapter151 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter151.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter151.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter151);
                }
                if (model.contentEquals("X5 M (F85)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("M / 4.4L / Petrol / 575h.p");
                    ArrayAdapter<String> dataAdapter152 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter152.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter152.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter152);
                }
                if (model.contentEquals("X5 (F15)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("30dX / 3.0L / Diesel / 258h.p");
                    list.add("30iX / 3.0L / Petrol / 306h.p");
                    ArrayAdapter<String> dataAdapter151 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter151.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter151.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter151);
                }
                if (model.contentEquals("X5 (E70)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0d / 3.0L / Diesel / 235h.p");
                    ArrayAdapter<String> dataAdapter152 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter152.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter152.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter152);
                }
                if (model.contentEquals("X6  M (F86)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("M / 4.4L / Petrol / 575h.p");
                    ArrayAdapter<String> dataAdapter152 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter152.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter152.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter152);
                }
                if (model.contentEquals("X6 (F16)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("40dX / 3.0L / Diesel / 313h.p");
                    ArrayAdapter<String> dataAdapter153 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter153.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter153.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter153);
                }
                if (model.contentEquals("X6 (E71)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("30dX / 3.0L / Diesel / 235h.p");
                    ArrayAdapter<String> dataAdapter154 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter154.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter154.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter154);
                }
                if (model.contentEquals("Z4 (E89)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("35i / 3.0L / Petrol / 306h.p");
                    ArrayAdapter<String> dataAdapter154 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter154.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter154.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter154);
                }
                if (model.contentEquals("AVEO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Petrol / 94h.p");
                    list.add("1.4 / 1.4L / Petrol / 101h.p");
                    list.add("1.6 / 1.6L / Petrol / 105h.p");
                    list.add("1.6 / 1.6L / Petrol / 110h.p");
                    ArrayAdapter<String> dataAdapter155 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter155.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter155.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter155);
                }
                if (model.contentEquals("AVEO U-VA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 84h.p");
                    ArrayAdapter<String> dataAdapter156 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter156.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter156.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter156);
                }
                if (model.contentEquals("BEAT")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.0 / 1.0L / Diesel / 63h.p");
                    list.add("1.2 / 1.2L / Petrol / 82h.p");
                    list.add("1.2 LPG / 1.2L / Petrol / 82h.p");
                    ArrayAdapter<String> dataAdapter157 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter157.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter157.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter157);
                }
                if (model.contentEquals("CAPTIVA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Diesel / 126h.p");
                    list.add("2.2 / 2.2L / Diesel / 163h.p");
                    list.add("2.2 4WD / 2.2L / Diesel / 163h.p");
                    list.add("2 4WD / 2.0L / Diesel / 126h.p");
                    ArrayAdapter<String> dataAdapter158 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter158.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter158.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter158);
                }
                if (model.contentEquals("CAPTIVA REFRESH")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Diesel / 150h.p");
                    list.add("2.2 AWD / 2.2L / Diesel / 184h.p");
                    ArrayAdapter<String> dataAdapter159 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter159.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter159.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter159);
                }
                if (model.contentEquals("CRUZE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Diesel / 163h.p");
                    list.add("2.0 / 2.0L / Diesel / 166h.p");
                    ArrayAdapter<String> dataAdapter160 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter160.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter160.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter160);
                }
                if (model.contentEquals("ENJOY")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 / 1.3L / Diesel / 78h.p");
                    list.add("1.4 / 1.4L / Petrol / 104h.p");
                    list.add("1.4 / 1.4L / Petrol / 104h.p");
                    ArrayAdapter<String> dataAdapter161 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter161.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter161.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter161);
                }
                if (model.contentEquals("FORESTER")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Petrol / 120h.p");
                    ArrayAdapter<String> dataAdapter162 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter162.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter162.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter162);
                }
                if (model.contentEquals("OPTRA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.6 / 1.6L / Petrol / 104h.p");
                    list.add("1.8 / 1.8L / Petrol / 115h.p");
                    ArrayAdapter<String> dataAdapter163 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter163.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter163.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter163);
                }
                if (model.contentEquals("OPTRA MAGNUM")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add(" 2.0 / 2.0L / Diesel / 121h.p");
                    list.add("2.0 / 2.0L / Petrol / 120h.p");
                    ArrayAdapter<String> dataAdapter164 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter164.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter164.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter164);
                }
                if (model.contentEquals("OPTRA S-RV")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.6 / 1.6L / Petrol / 101h.p");
                    ArrayAdapter<String> dataAdapter165 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter165.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter165.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter165);
                }
                if (model.contentEquals("SAIL")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 86h.p");
                    list.add("1.3 / 1.3L / Diesel / 78h.p");
                    ArrayAdapter<String> dataAdapter166 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter166.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter166.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter166);
                }
                if (model.contentEquals("SAIL HATCH")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 86h.p");
                    list.add("1.3 / 1.3L / Diesel / 78h.p");
                    ArrayAdapter<String> dataAdapter167 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter167.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter167.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter167);
                }
                if (model.contentEquals("SPARK")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.8 / 0.8L / Petrol / 52h.p");
                    list.add("1.0 / 1.0L / Petrol / 67h.p");
                    list.add("1.0 / 1.0L / Petrol / 65h.p");
                    ArrayAdapter<String> dataAdapter168 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter168.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter168.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter168);
                }
                if (model.contentEquals("TAVERA(2004-2013)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Diesel / 107h.p");
                    list.add("2.5 / 2.5L / Diesel / 80h.p");
                    ArrayAdapter<String> dataAdapter169 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter169.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter169.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter169);
                }
                if (model.contentEquals("TAVERA(2017-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Diesel / 78h.p");
                    list.add("2.5 / 2.5L / Diesel / 78h.p");
                    ArrayAdapter<String> dataAdapter170 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter170.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter170.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter170);
                }
                if (model.contentEquals("TRAILBLAZER")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.8 2WD / 2.8L / Diesel / 198h.p");
                    list.add("1.2 / 1.2L / Petrol / 67h.p");
                    ArrayAdapter<String> dataAdapter171 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter171.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter171.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter171);
                }
                if (model.contentEquals("CIELO Saloon")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("No Varaint");
                    ArrayAdapter<String> dataAdapter172 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter172.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter172.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter172);
                }
                if (model.contentEquals("MATIZ")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("No Varaint");
                    ArrayAdapter<String> dataAdapter173 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter173.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter173.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter173);
                }
                if (model.contentEquals("GO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 67h.p");
                    ArrayAdapter<String> dataAdapter174 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter174.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter174.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter174);
                }
                if (model.contentEquals("GO +")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 68h.p");
                    ArrayAdapter<String> dataAdapter172 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter172.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter172.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter172);
                }
                if (model.contentEquals("REDI GO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.8 / 0.8L / Petrol / 53h.p");
                    ArrayAdapter<String> dataAdapter176 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter176.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter176.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter176);
                }
                if (model.contentEquals("ABARTH 595")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Petrol / 160h.p");
                    ArrayAdapter<String> dataAdapter177 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter177.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter177.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter177);
                }
                if (model.contentEquals("AVVENTURA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 / 1.3L / Diesel / 93h.p");
                    list.add("1.4 / 1.4L / Petrol / 90h.p");
                    ArrayAdapter<String> dataAdapter178 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter178.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter178.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter178);
                }
                if (model.contentEquals("ABARTH AVVENTURA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Petrol / 140h.p");
                    ArrayAdapter<String> dataAdapter179 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter179.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter179.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter179);
                }
                if (model.contentEquals("LINEA(2015-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 / 1.3L / Diesel / 93h.p");
                    list.add("1.4 / 1.4L / Petrol / 114h.p");
                    ArrayAdapter<String> dataAdapter180 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter180.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter180.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter180);
                }
                if (model.contentEquals("LINEA(2017-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 / 1.3L / Diesel / 91.7h.p");
                    list.add("1.4 / 1.4L / Petrol / 123.2h.p");
                    list.add("1.4 / 1.4L / Petrol / 88.8h.p");
                    ArrayAdapter<String> dataAdapter181 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter181.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter181.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter181);
                }
                if (model.contentEquals("LINEA CLASSIC")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 / 1.3L / Diesel / 75h.p");
                    list.add("1.4 / 1.4L / Petrol / 88.7h.p");
                    ArrayAdapter<String> dataAdapter182 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter182.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter182.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter182);
                }
                if (model.contentEquals("LINEA (323)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 / 1.3L / Diesel / 90h.p");
                    list.add("1.3 / 1.3L / Diesel / 95h.p");
                    list.add("1.4 / 1.4L / Petrol / 77h.p");
                    list.add("1.4 / 1.4L / Petrol / 114h.p");
                    list.add("1.4 / 1.4L / Petrol / 120h.p");
                    list.add("1.4 / 1.4L / Petrol / 152h.p");
                    list.add("1.4 / 1.4L / Petrol / 90h.p");
                    list.add("1.6 / 1.6L / Petrol / 109h.p");
                    list.add("1.6 / 1.6L / Diesel / 105h.p");
                    list.add("1.8 / 1.8L / Petrol / 131h.p");
                    list.add("1.9 / 1.9L / Petrol / 128h.p");
                    list.add("1.9 / 1.9L / Petrol / 126h.p");
                    list.add("1.9 / 1.9L / Petrol / 132h.p");
                    list.add("1.8 Flex / 1.8L / Petrol / 126h.p");
                    list.add("1.9 Flex / 1.9L / Petrol / 132h.p");
                    list.add("variant");
                    list.add("variant");

                    ArrayAdapter<String> dataAdapter183 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter183.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter183.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter183);
                }
                if (model.contentEquals("PALIO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.0 / 1.0L / Petrol / 61h.p");
                    list.add("1.1 / 1.1L / Petrol / 54h.p");
                    list.add("1.1 / 1.1L / Petrol / 54h.p");
                    list.add("1.2 / 1.2L / Petrol / 68h.p");
                    list.add("1.4 / 1.4L / Petrol / 69h.p");

                    ArrayAdapter<String> dataAdapter184 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter184.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter184.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter184);
                }
                if (model.contentEquals("PALIO (188)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 80h.p");
                    list.add("1.3 / 1.3L / Diesel / 70h.p");
                    list.add("1.4 / 1.4L / Petrol / 95h.p");
                    list.add("1.4 / 1.4L / Petrol / 97h.p");

                    ArrayAdapter<String> dataAdapter185 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter185.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter185.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter185);
                }
                if (model.contentEquals("PALIO STILE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.1 / 1.1L / Petrol / 57h.p");
                    list.add("1.3 / 1.3L / Diesel / 75h.p");
                    list.add("1.6 / 1.6L / Petrol / 100h.p");

                    ArrayAdapter<String> dataAdapter186 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter186.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter186.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter186);
                }
                if (model.contentEquals("PETRA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.6 / 1.6L / Petrol / 100h.p");
                    list.add("1.2 / 1.2L / Petrol / 60h.p");
                    list.add("1.3 / 1.3L / Diesel / 90h.p");
                    list.add("1.3 / 1.3L / Diesel / 76h.p");
                    list.add("1.4 / 1.4L / Petrol / 77h.p");
                    list.add("1.4 / 1.4L / Petrol / 90h.p");

                    ArrayAdapter<String> dataAdapter187 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter187.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter187.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter187);
                }
                if (model.contentEquals("PUNTO (199)(2005-2011)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 69h.p");
                    list.add("1.3 / 1.3L / Diesel / 75h.p");
                    list.add("1.4 / 1.4L / Petrol / 78h.p");

                    ArrayAdapter<String> dataAdapter188 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter188.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter188.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter188);
                }
                if (model.contentEquals("PUNTO (199)(2008-2014)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Petrol / 78h.p");

                    ArrayAdapter<String> dataAdapter189 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter189.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter189.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter189);
                }
                if (model.contentEquals("PUNTO EVO (199)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 69h.p");
                    list.add("1.3 / 1.3L / Diesel / 75h.p");
                    list.add("1.3 / 1.3L / Diesel / 95h.p");
                    list.add("1.4 / 1.4L / Petrol / 90h.p");

                    ArrayAdapter<String> dataAdapter189 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter189.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter189.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter189);
                }
                if (model.contentEquals("ABARTH PUNTO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4I TJET/ 1.4L / Petrol / 145h.p");

                    ArrayAdapter<String> dataAdapter190 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter190.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter190.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter190);
                }
                if (model.contentEquals("PUNTO EVO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 / 1.3L / Diesel / 92h.p");

                    ArrayAdapter<String> dataAdapter191 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter191.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter191.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter191);
                }
                if (model.contentEquals("EVO PURE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 67h.p");
                    list.add("1.3 / 1.3L / Diesel / 75h.p");

                    ArrayAdapter<String> dataAdapter192 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter192.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter192.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter192);
                }
                if (model.contentEquals("SIENA (372)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Petrol / 85h.p");
                    list.add("1.6 / 1.6L / Petrol / 115h.p");
                    list.add("1.7 / 1.7L / Diesel / 72h.p");

                    ArrayAdapter<String> dataAdapter193 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter193.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter193.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter193);
                }
                if (model.contentEquals("UNO (146 A/E)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 60h.p");
                    list.add("1.3 / 1.3L / Petrol / 71h.p");

                    ArrayAdapter<String> dataAdapter194 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter194.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter194.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter194);
                }
                if (model.contentEquals("URBAN CROSS")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 / 1.3L / Diesel / 92h.p");
                    list.add("1.4 / 1.4L / Petrol / 138h.p");

                    ArrayAdapter<String> dataAdapter195 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter195.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter195.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter195);
                }
                if (model.contentEquals("GURKHA(2013-now)(Body type: Convertible)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.6 / 2.6L / Diesel / 82h.p");
                    list.add("2.6 4X4 / 2.6L / Diesel / 82h.p");
                    ArrayAdapter<String> dataAdapter196 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter196.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter196.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter196);
                }
                if (model.contentEquals("GURKHA(2013-now)(Body type: Off-road vehicles)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.6 / 2.6L / Diesel / 82h.p");

                    ArrayAdapter<String> dataAdapter197 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter197.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter197.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter197);
                }
                if (model.contentEquals("GURKHA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.6 / 2.6L / Diesel / 80.8h.p");

                    ArrayAdapter<String> dataAdapter198 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter198.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter198.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter198);
                }
                if (model.contentEquals("ONE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2 / 2.2L / Diesel / 141h.p");

                    ArrayAdapter<String> dataAdapter199 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter199.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter199.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter199);
                }
                if (model.contentEquals("TRAX")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.6 / 2.6L / Diesel / 76h.p");

                    ArrayAdapter<String> dataAdapter200 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter200.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter200.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter200);
                }
                if (model.contentEquals("CLASSIC")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Diesel / 68h.p");
                    list.add("1.6 / 1.6L / Petrol / 101h.p");

                    ArrayAdapter<String> dataAdapter201 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter201.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter201.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter201);
                }
                if (model.contentEquals("ECOSPORT")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.0 / 1.0L / Petrol / 123h.p");
                    list.add("1.5 / 1.5L / Petrol / 109h.p");
                    list.add("1.5 / 1.5L / Diesel / 91h.p");

                    ArrayAdapter<String> dataAdapter202 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter202.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter202.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter202);
                }
                if (model.contentEquals("ENDEAVOUR(2003-2006)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5 / 2.5L / Diesel / 116h.p");

                    ArrayAdapter<String> dataAdapter203 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter203.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter203.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter203);
                }
                if (model.contentEquals("ENDEAVOUR(2007-2013)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5 4X2/ 2.5L / Diesel / 142h.p");
                    list.add("3.0 4X2/ 3.0L / Diesel / 154h.p");
                    list.add("3.0 4X4/ 3.0L / Diesel / 154h.p");

                    ArrayAdapter<String> dataAdapter205 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter205.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter205.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter205);
                }
                if (model.contentEquals("ENDEAVOUR(2014-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5 / 2.5L / Diesel / 143h.p");
                    list.add("2.5 4X4 / 2.5L / Diesel / 143h.p");
                    list.add("3.0 / 3.0L / Diesel / 156h.p");

                    ArrayAdapter<String> dataAdapter206 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter206.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter206.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter206);
                }
                if (model.contentEquals("FIESTA(2005-2007)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.6 / 1.6L / Petrol / 99h.p");

                    ArrayAdapter<String> dataAdapter207 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter207.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter207.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter207);
                }
                if (model.contentEquals("FIESTA(2008-2011)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Diesel / 68h.p");
                    list.add("1.6 / 1.6L / Petrol / 101h.p");

                    ArrayAdapter<String> dataAdapter208 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter208.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter208.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter208);
                }
                if (model.contentEquals("FIESTA(2011-2012)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Diesel / 70h.p");
                    list.add("1.6 / 1.6L / Diesel / 95h.p");

                    ArrayAdapter<String> dataAdapter209 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter209.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter209.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter209);
                }
                if (model.contentEquals("FIESTA(2012-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Petrol / 95h.p");
                    list.add("1.6 / 1.6L / Petrol / 98h.p");
                    list.add("1.6 / 1.6L / Diesel / 90h.p");

                    ArrayAdapter<String> dataAdapter210 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter210.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter210.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter210);
                }
                if (model.contentEquals("FIGO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 71h.p");
                    list.add("1.4 / 1.4L / Diesel / 69h.p");

                    ArrayAdapter<String> dataAdapter211 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter211.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter211.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter211);
                }
                if (model.contentEquals("FIGO ASPIRE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 88h.p");
                    list.add("1.5 / 1.5L / Diesel / 100h.p");
                    list.add("1.5 / 1.5L / Petrol / 112h.p");

                    ArrayAdapter<String> dataAdapter212 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter212.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter212.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter212);
                }
                if (model.contentEquals("FIGO NEXT GEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 88h.p");
                    list.add("1.5 / 1.5L / Diesel / 100h.p");
                    list.add("1.5 / 1.5L / Petrol / 112h.p");

                    ArrayAdapter<String> dataAdapter213 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter213.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter213.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter213);
                }
                if (model.contentEquals("FUSION")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Diesel / 68h.p");

                    ArrayAdapter<String> dataAdapter214 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter214.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter214.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter214);
                }
                if (model.contentEquals("IKON")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 / 1.3L / Diesel / 68h.p");
                    list.add("1.3 / 1.3L / Petrol / 68h.p");
                    list.add("1.8 / 1.8L / Diesel /43.3h.p");

                    ArrayAdapter<String> dataAdapter215 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter215.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter215.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter215);
                }
                if (model.contentEquals("IKON II")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.6 / 1.6L / Petrol /95h.p");

                    ArrayAdapter<String> dataAdapter216 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter216.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter216.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter216);
                }
                if (model.contentEquals("MONDEO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0/ 2.0L / Diesel /114h.p");
                    list.add("2.0/ 2.0L / Petrol /143h.p");

                    ArrayAdapter<String> dataAdapter217 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter217.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter217.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter217);
                }
                if (model.contentEquals("MUSTANG GT")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("5.0L VB/ 5.0L / Petrol /395h.p");

                    ArrayAdapter<String> dataAdapter218 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter218.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter218.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter218);
                }
                if (model.contentEquals("ACCORD VII")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.4 / 2.4L / Petrol / 204h.p");
                    list.add("3.0 / 3.0L / Petrol / 221h.p");

                    ArrayAdapter<String> dataAdapter219 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter219.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter219.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter219);
                }
                if (model.contentEquals("ACCORD VI")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.4 / 2.4L / Petrol / 170h.p");

                    ArrayAdapter<String> dataAdapter220 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter220.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter220.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter220);
                }
                if (model.contentEquals("ACCORD IX")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.4 / 2.4L / Petrol / 192h.p");
                    list.add("3.5 / 3.5L / Petrol / 282h.p");

                    ArrayAdapter<String> dataAdapter221 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter221.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter221.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter221);
                }
                if (model.contentEquals("ACCORD")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Hybrid / 143h.p");

                    ArrayAdapter<String> dataAdapter222 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter222.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter222.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter222);
                }
                if (model.contentEquals("AMAZE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 88h.p");
                    list.add("1.5 / 1.5L / Diesel / 100h.p");

                    ArrayAdapter<String> dataAdapter223 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter223.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter223.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter223);
                }
                if (model.contentEquals("BRIO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 88h.p");
                    list.add("1.3 / 1.3L / Petrol / 99h.p");

                    ArrayAdapter<String> dataAdapter224 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter224.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter224.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter224);
                }
                if (model.contentEquals("BR-V")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5 / 1.5L / Diesel / 99h.p");
                    list.add("1.5 / 1.5L / Petrol / 117h.p");

                    ArrayAdapter<String> dataAdapter225 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter225.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter225.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter225);
                }
                if (model.contentEquals("CITY III")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5 / 1.5L / Petrol / 105h.p");

                    ArrayAdapter<String> dataAdapter226 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter226.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter226.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter226);
                }
                if (model.contentEquals("CITY IV")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5 / 1.5L / Petrol / 90h.p");

                    ArrayAdapter<String> dataAdapter227 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter227.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter227.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter227);
                }
                if (model.contentEquals("CITY (GM)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Petrol / 99h.p");
                    list.add("1.5 / 1.5L / Petrol / 120h.p");

                    ArrayAdapter<String> dataAdapter228 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter228.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter228.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter228);
                }
                if (model.contentEquals("CITY")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5 / 1.5L / Diesel / 100h.p");
                    list.add("1.5 / 1.5L / Petrol / 119h.p");

                    ArrayAdapter<String> dataAdapter228 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter228.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter228.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter228);
                }
                if (model.contentEquals("CITY F/L")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5 / 1.5L / Petrol / 117.3h.p");
                    list.add("1.5 / 1.5L / Diesel / 98.6h.p");

                    ArrayAdapter<String> dataAdapter229 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter229.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter229.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter229);
                }
                if (model.contentEquals("CIVIC VIII")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.8 / 1.8L / Petrol / 141h.p");

                    ArrayAdapter<String> dataAdapter230 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter230.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter230.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter230);
                }
                if (model.contentEquals("CIVIC IX (FB, FG)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.8 / 1.8L / Petrol / 141h.p");

                    ArrayAdapter<String> dataAdapter231 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter231.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter231.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter231);
                }
                if (model.contentEquals("CR-V Mk III (RE)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Petrol / 150h.p");
                    list.add("2.4 4WD / 2.4L / Petrol / 168h.p");
                    list.add("2.4 4WD / 2.4L / Petrol / 166h.p");

                    ArrayAdapter<String> dataAdapter232 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter232.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter232.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter232);
                }
                if (model.contentEquals("CR-V  IV (RE)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Petrol / 155h.p");
                    list.add("2.0 AT / 2.0L / Petrol / 155h.p");
                    list.add("2.4 AWD / 2.4L / Petrol / 177h.p");

                    ArrayAdapter<String> dataAdapter233 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter233.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter233.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter233);
                }
                if (model.contentEquals("JAZZ(2009-2011)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 90h.p");

                    ArrayAdapter<String> dataAdapter234 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter234.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter234.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter234);
                }
                if (model.contentEquals("JAZZ(2015-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5 / 1.5L / Diesel / 100h.p");

                    ArrayAdapter<String> dataAdapter235 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter235.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter235.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter235);
                }
                if (model.contentEquals("MOBILIO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5 / 1.5L / Diesel / 100h.p");
                    list.add("1.5 / 1.5L / Petrol / 118h.p");

                    ArrayAdapter<String> dataAdapter236 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter236.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter236.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter236);
                }
                if (model.contentEquals("WRV")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 88.7h.p");
                    list.add("1.5 / 1.5L / Diesel / 98.6h.p");

                    ArrayAdapter<String> dataAdapter237 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter237.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter237.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter237);
                }
                if (model.contentEquals("ACCENT/ VIVA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5 / 1.5L / Petrol / 94h.p");
                    list.add("1.5 CRDi/ 1.5L / Diesel / 82h.p");
                    list.add("1.6/ 1.6L / Petrol / 105h.p");

                    ArrayAdapter<String> dataAdapter238 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter238.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter238.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter238);
                }
                if (model.contentEquals("CRETA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 CRDi / 1.4L / Diesel / 90h.p");
                    list.add("1.6 CRDi / 1.6L / Diesel / 128h.p");
                    list.add("1.6/ 1.6L / Petrol / 105h.p");

                    ArrayAdapter<String> dataAdapter239 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter239.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter239.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter239);
                }
                if (model.contentEquals("ELANTRA(2004-2007)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.8 / 1.8L / Petrol / 125h.p");
                    list.add("2.0 / 2.0L / Diesel / 112h.p");

                    ArrayAdapter<String> dataAdapter240 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter240.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter240.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter240);
                }
                if (model.contentEquals("FLUIDIC ELANTRA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.6 / 1.6L / Diesel / 128h.p");
                    list.add("1.8 / 1.8L / Petrol / 150h.p");

                    ArrayAdapter<String> dataAdapter241 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter241.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter241.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter241);
                }
                if (model.contentEquals("ELANTRA(2016-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.6 / 1.6L / Diesel / 128h.p");
                    list.add("2.0 / 2.0L / Petrol / 152h.p");

                    ArrayAdapter<String> dataAdapter242 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter242.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter242.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter242);
                }
                if (model.contentEquals("EON")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.8 / 0.8L / Petrol / 56h.p");
                    list.add("1.0 / 1.0L / Petrol / 69h.p");

                    ArrayAdapter<String> dataAdapter243 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter243.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter243.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter243);
                }
                if (model.contentEquals("GETZ(2004-2007)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.1 / 1.1L / Petrol / 61h.p");
                    list.add("1.3 / 1.3L / Petrol");

                    ArrayAdapter<String> dataAdapter244 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter244.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter244.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter244);
                }
                if (model.contentEquals("GETZ(2007-2010)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.1 / 1.1L / Petrol / 66h.p");
                    list.add("1.3 / 1.3L / Petrol");
                    list.add("1.5 / 1.5L / Diesel ");

                    ArrayAdapter<String> dataAdapter245 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter245.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter245.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter245);
                }
                if (model.contentEquals("i10")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.1 / 1.1L / Petrol / 67h.p");
                    list.add("1.1 / 1.1L / Petrol / 69h.p");
                    list.add("1.2 / 1.2L / Petrol / 80h.p");
                    list.add("1.2 / 1.2L / Petrol / 86h.p");

                    ArrayAdapter<String> dataAdapter246 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter246.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter246.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter246);
                }
                if (model.contentEquals("GRAND i10")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.0 LPG/CNG / 1.0L / Petrol / 66h.p");
                    list.add("1.1 CRDi  / 1.1L / Diesel / 70h.p");
                    list.add("1.2  / 1.2L / Petrol / 83h.p");

                    ArrayAdapter<String> dataAdapter247 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter247.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter247.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter247);
                }
                if (model.contentEquals("GRAND i10 F/L")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2  / 1.2L / Petrol / 82h.p");
                    list.add("1.2  / 1.2L / Diesel / 75h.p");

                    ArrayAdapter<String> dataAdapter248 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter248.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter248.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter248);
                }
                if (model.contentEquals("i20(2008-2012)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2  / 1.2L / Petrol / 78h.p");
                    list.add("1.4  / 1.4L / Petrol / 101h.p");
                    list.add("1.4 CRDi / 1.4L / Diesel / 90h.p");
                    list.add("1.4 CRDi / 1.4L / Diesel / 75h.p");
                    list.add("1.4 CRDi / 1.4L / Diesel / 75h.p");

                    ArrayAdapter<String> dataAdapter249 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter249.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter249.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter249);
                }
                if (model.contentEquals("i20(2008-2012)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 83h.p");
                    list.add("1.4 CRDi / 1.4L / Diesel / 90h.p");

                    ArrayAdapter<String> dataAdapter250 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter250.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter250.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter250);
                }
                if (model.contentEquals("i20 ELITE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 CRDi / 1.4L / Diesel / 90h.p");

                    ArrayAdapter<String> dataAdapter251 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter251.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter251.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter251);
                }
                if (model.contentEquals("i20(2012-2014)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 83h.p");
                    list.add("1.4/ 1.4L/ Petrol / 101h.p");
                    list.add("1.4 CRDi / 1.4L / Diesel / 90h.p");

                    ArrayAdapter<String> dataAdapter252 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter252.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter252.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter252);
                }
                if (model.contentEquals("i20 ACTIVE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 83h.p");
                    list.add("1.4 CRDi / 1.4L / Diesel / 90h.p");

                    ArrayAdapter<String> dataAdapter253 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter253.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter253.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter253);
                }
                if (model.contentEquals("i20 ACTIVE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 83h.p");
                    list.add("1.4 CRDi / 1.4L / Diesel / 90h.p");

                    ArrayAdapter<String> dataAdapter254 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter254.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter254.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter254);
                }
                if (model.contentEquals("Santa Fe II (CM)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2 CRDi / 2.2L / Diesel / 197h.p");
                    list.add("2.4 / 2.4L / Petrol / 174h.p");

                    ArrayAdapter<String> dataAdapter254 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter254.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter254.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter254);
                }
                if (model.contentEquals("SANTA FE III (DM)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2 / 2.2L /Diesel / 197h.p");
                    ArrayAdapter<String> dataAdapter255 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter255.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter255.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter255);
                }
                if (model.contentEquals("SANTRO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.0 / 1.0L /Petrol / 54h.p");
                    list.add("1.1 / 1.1L /Petrol / 58h.p");
                    ArrayAdapter<String> dataAdapter256 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter256.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter256.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter256);
                }
                if (model.contentEquals("SANTRO XING")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.1 / 1.1L /Petrol / 58h.p");
                    list.add("1.1 / 1.1L /Petrol / 61h.p");
                    ArrayAdapter<String> dataAdapter257 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter257.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter257.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter257);
                }
                if (model.contentEquals("SONATA IV (EF-B) GOLD")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L /Petrol / 144h.p");
                    list.add("2.7 V6 / 2.7L /Petrol / 175h.p");
                    list.add("2.0 CRDi Embera / 2.0L /Diesel / 140h.p");
                    list.add("2.0 CRDi Transform / 2.0L /Diesel / 148h.p");
                    list.add("2.4 Embera / 2.4L /Petrol / 162h.p");
                    ArrayAdapter<String> dataAdapter258 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter258.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter258.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter258);
                }
                if (model.contentEquals("SONATA V (NF) EMBERA/TRANSFORM")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.4 Transform / 2.4L /Petrol / 173h.p");
                    ArrayAdapter<String> dataAdapter259 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter259.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter259.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter259);
                }
                if (model.contentEquals("SONATA VI (YF) FLUDIC")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.4 Transform / 2.4L /Petrol / 181h.p");
                    ArrayAdapter<String> dataAdapter260 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter260.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter260.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter260);
                }
                if (model.contentEquals("TERRACAN (HP)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.9 CRDi / 2.9L / Diesel / 150h.p");
                    ArrayAdapter<String> dataAdapter261 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter261.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter261.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter261);
                }
                if (model.contentEquals("TUCSON 1st Gen")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 CRDi / 2.0L / Diesel / 113h.p");
                    list.add("2.0 CRDi (turbo) / 2.0L / Diesel / 150h.p");
                    ArrayAdapter<String> dataAdapter262 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter262.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter262.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter262);
                }
                if (model.contentEquals("TUCSON 2nd GEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0  / 2.0L / Petrol / 153h.p");
                    list.add("2.0 / 2.0L / Diesel / 185h.p");
                    ArrayAdapter<String> dataAdapter263 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter263.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter263.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter263);
                }
                if (model.contentEquals("VERNA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5 CRDi / 1.5L / Diesel / 110h.p");
                    list.add("1.6 / 1.6L / Petrol / 112h.p");
                    ArrayAdapter<String> dataAdapter264 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter264.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter264.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter264);
                }
                if (model.contentEquals("VERNA FLUIDIC(2011-2014)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Petrol / 107h.p");
                    list.add("1.4 CRDi / 1.4L / Diesel / 90h.p");
                    list.add("1.6 / 1.6L / Petrol / 123h.p");
                    list.add("1.6 CRDi / 1.6L / Diesel / 128h.p");
                    ArrayAdapter<String> dataAdapter265 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter265.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter265.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter265);
                }
                if (model.contentEquals("VERNA FLUIDIC(2014-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Petrol / 107h.p");
                    list.add("1.4 CRDi / 1.4L / Diesel / 90h.p");
                    list.add("1.6 CRDi / 1.6L / Diesel / 128h.p");
                    ArrayAdapter<String> dataAdapter266 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter266.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter266.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter266);
                }
                if (model.contentEquals("XCENT(2013-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.0 CNG / 1.0L / Petrol / 69h.p");
                    list.add("1.1 CRDi / 1.1L / Diesel / 70h.p");
                    list.add("1.2 / 1.2L / Petrol / 83h.p");
                    ArrayAdapter<String> dataAdapter267 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter267.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter267.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter267);
                }
                if (model.contentEquals("Xcent(2017-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Diesel / 74h.p");
                    ArrayAdapter<String> dataAdapter268 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter268.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter268.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter268);
                }
                if (model.contentEquals("D-Max")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5 / 2.5L / Diesel / 134h.p");
                    ArrayAdapter<String> dataAdapter269 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter269.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter269.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter269);
                }
                if (model.contentEquals("D-Max V-cross")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5 / 2.5L / Diesel / 134h.p");
                    ArrayAdapter<String> dataAdapter270 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter270.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter270.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter270);
                }
                if (model.contentEquals("MU-7")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 / 3.0L / Diesel / 163h.p");
                    ArrayAdapter<String> dataAdapter271 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter271.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter271.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter271);
                }
                if (model.contentEquals("MUX")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 / 3.0L / Diesel / 175h.p");
                    ArrayAdapter<String> dataAdapter271 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter271.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter271.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter271);
                }
                if (model.contentEquals("F-PACE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Diesel / 177h.p");
                    list.add("3.0 / 3.0L / Diesel / 296h.p");
                    ArrayAdapter<String> dataAdapter273 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter273.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter273.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter273);
                }
                if (model.contentEquals("F-TYPE(2012-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 / 3.0L / Petrol / 340h.p");
                    list.add("3.0 / 3.0L / Petrol / 381h.p");
                    list.add("5.0 / 5.0L / Petrol / 495h.p");
                    ArrayAdapter<String> dataAdapter274 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter274.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter274.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter274);
                }
                if (model.contentEquals("F-TYPE(2013-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 / 3.0L / Petrol / 340h.p");
                    list.add("3.0 / 3.0L / Petrol / 381h.p");
                    list.add("5.0 / 5.0L / Petrol / 551h.p");
                    list.add("5.0 / 5.0L / Petrol / 495h.p");
                    ArrayAdapter<String> dataAdapter275 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter275.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter275.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter275);
                }
                if (model.contentEquals("S-TYPE (CCX)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5 / 2.5L / Petrol / 200h.p");
                    list.add("2.7 / 2.7L / Diesel / 207h.p");
                    list.add("3.0 / 3.0L / Petrol / 238h.p");
                    list.add("3.0 / 3.0L / Petrol / 234h.p");
                    list.add("3.0 / 3.0L / Petrol / 230h.p");
                    list.add("4.0 / 4.0L / Petrol / 276h.p");
                    list.add("4.0 / 4.0L / Petrol / 281h.p");
                    list.add("4.2 / 4.2L / Petrol / 405h.p");
                    list.add("4.2 / 4.2L / Petrol / 396h.p");
                    list.add("4.2 / 4.2L / Petrol / 298h.p");
                    list.add("4.2 / 4.2L / Petrol / 305h.p");

                    ArrayAdapter<String> dataAdapter276 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter276.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter276.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter276);
                }
                if (model.contentEquals("XE 2.0")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("XE 2.0 / 2.0L / Petrol / 197h.p");
                    ArrayAdapter<String> dataAdapter277 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter277.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter277.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter277);
                }
                if (model.contentEquals("XF (_J05_, CC9)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Petrol / 241h.p");
                    list.add("2.2 / 2.2L / Diesel / 163h.p");
                    list.add("2.2 / 2.2L / Diesel / 190h.p");
                    list.add("2.2 / 2.2L / Diesel / 200h.p");
                    list.add("2.7 / 2.7L / Diesel / 207h.p");
                    list.add("3.0 / 3.0L / Petrol / 243h.p");
                    list.add("3.0 / 3.0L / Petrol / 238h.p");
                    list.add("3.0 / 3.0L / Petrol / 241h.p");
                    list.add("3.0 / 3.0L / Diesel / 211h.p");
                    list.add("3.0 / 3.0L / Diesel / 275h.p");
                    list.add("3.0 / 3.0L / Petrol / 340h.p");
                    list.add("4.2 / 4.2L / Petrol / 298h.p");
                    list.add("4.2 / 4.2L / Petrol / 416h.p");
                    list.add("4.2 / 4.2L / Petrol / 296h.p");
                    list.add("4.2 / 4.2L / Petrol / 426h.p");
                    list.add("5.0 / 5.0L / Petrol / 296h.p");
                    list.add("5.0 / 5.0L / Petrol / 471h.p");
                    list.add("5.0 / 5.0L / Petrol / 385h.p");
                    list.add("5.0 / 5.0L / Petrol / 510h.p");
                    list.add("5.0 / 5.0L / Petrol / 550h.p");

                    ArrayAdapter<String> dataAdapter278 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter278.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter278.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter278);
                }
                if (model.contentEquals("XF (CC9)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2 / 2.2L / Diesel / 280h.p");
                    list.add("2.2 / 2.2L / Diesel / 163h.p");
                    list.add("3.0 / 3.0L / Diesel / 241h.p");
                    list.add("3.0 / 3.0L / Diesel / 275h.p");
                    list.add("5.0 / 5.0L / Petrol / 550h.p");

                    ArrayAdapter<String> dataAdapter279 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter279.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter279.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter279);
                }
                if (model.contentEquals("XJ (X350, X358)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.7 / 2.7L / Diesel / 207h.p");
                    list.add("3.0 / 3.0L / Petrol / 238h.p");
                    list.add("3.0 / 3.0L / Petrol / 243h.p");
                    list.add("3.5 / 3.5L / Petrol / 258h.p");
                    list.add("4.2 / 4.2L / Petrol / 395h.p");
                    list.add("4.2 / 4.2L / Petrol / 298h.p");
                    list.add("4.2 / 4.2L / Petrol / 407h.p");

                    ArrayAdapter<String> dataAdapter280 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter280.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter280.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter280);
                }
                if (model.contentEquals("XJ (X35_, _J12_, _J24_)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Petrol / 241h.p");
                    list.add("3.0 / 3.0L / Diesel / 275h.p");
                    list.add("3.0 / 3.0L / Petrol / 238h.p");
                    list.add("3.0 / 3.0L / Petrol / 340h.p");
                    list.add("5.0 / 5.0L / Petrol / 296h.p");
                    list.add("5.0 / 5.0L / Petrol / 471h.p");
                    list.add("5.0 / 5.0L / Petrol / 385h.p");
                    list.add("5.0 / 5.0L / Petrol / 510h.p");
                    list.add("5.0 / 5.0L / Petrol / 390h.p");
                    list.add("5.0 / 5.0L / Petrol / 550h.p");

                    ArrayAdapter<String> dataAdapter281 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter281.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter281.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter281);
                }
                if (model.contentEquals("XK 8 (QDV)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("4.0 / 4.0L / Petrol / 284h.p");
                    list.add("4.0 / 4.0L / Petrol / 363h.p");
                    list.add("4.0 / 4.0L / Petrol / 375h.p");
                    list.add("4.2 / 4.2L / Petrol / 396h.p");
                    list.add("4.2 / 4.2L / Petrol / 298h.p");
                    list.add("4.2 / 4.2L / Petrol / 375h.p");

                    ArrayAdapter<String> dataAdapter282 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter282.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter282.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter282);
                }
                if (model.contentEquals("XK 8 (QEV)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("4.0 / 4.0L / Petrol / 284h.p");
                    list.add("4.0 / 4.0L / Petrol / 363h.p");
                    list.add("4.0 / 4.0L / Petrol / 375h.p");
                    list.add("4.2 / 4.2L / Petrol / 396h.p");
                    list.add("4.2 / 4.2L / Petrol / 298h.p");
                    list.add("4.2 / 4.2L / Petrol / 375h.p");

                    ArrayAdapter<String> dataAdapter283 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter283.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter283.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter283);
                }
                if (model.contentEquals("XK (_J43_)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.6 / 3.6L / Petrol / 258h.p");
                    list.add("4.2 / 4.2L / Petrol / 416h.p");
                    list.add("4.2 / 4.2L / Petrol / 298h.p");
                    list.add("4.2 / 4.2L / Petrol / 426h.p");
                    list.add("4.2 / 4.2L / Petrol / 396h.p");
                    list.add("4.2 / 4.2L / Petrol / 296h.p");
                    list.add("4.2 / 4.2L / Petrol / 305h.p");
                    list.add("5.0 / 5.0L / Petrol / 510h.p");
                    list.add("5.0 / 5.0L / Petrol / 385h.p");
                    list.add("5.0 / 5.0L / Petrol / 296h.p");
                    list.add("5.0 / 5.0L / Petrol / 550h.p");
                    list.add("5.0 / 5.0L / Petrol / 558h.p");
                    ArrayAdapter<String> dataAdapter284 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter284.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter284.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter284);
                }
                if (model.contentEquals("XK (_J43_) body-couple")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.5 / 3.5L / Petrol / 258h.p");
                    list.add("4.2 / 4.2L / Petrol / 298h.p");
                    list.add("4.2 / 4.2L / Petrol / 396h.p");
                    list.add("4.2 / 4.2L / Petrol / 416h.p");
                    list.add("4.2 / 4.2L / Petrol / 426h.p");
                    list.add("4.2 / 4.2L / Petrol / 596h.p");
                    list.add("4.2 / 4.2L / Petrol / 305h.p");
                    list.add("5.0 / 5.0L / Petrol / 510h.p");
                    list.add("5.0 / 5.0L / Petrol / 385h.p");
                    list.add("5.0 / 5.0L / Petrol / 296h.p");
                    list.add("5.0 / 5.0L / Petrol / 530h.p");
                    list.add("5.0 / 5.0L / Petrol / 550h.p");
                    list.add("5.0 / 5.0L / Petrol / 558h.p");
                    list.add("2.0 / 2.0L / Petrol / 156h.p");
                    list.add("2.0 / 2.0L / Diesel / 130h.p");
                    list.add("2.2 / 2.2L / Diesel / 155h.p");
                    list.add("2.2 / 2.2L / Diesel / 150h.p");
                    list.add("2.2 / 2.2L / Diesel / 146h.p");
                    list.add("2.5 / 2.5L / Petrol / 196h.p");
                    list.add("2.5 / 2.5L / Petrol / 194h.p");
                    list.add("3.0 / 3.0L / Petrol / 234h.p");
                    list.add("3.0 / 3.0L / Petrol / 230h.p");
                    ArrayAdapter<String> dataAdapter285 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter285.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter285.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter285);
                }
                if (model.contentEquals("X-TYPE(CF1)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Petrol / 156h.p");
                    list.add("2.0 / 2.0L / Petrol / 156h.p");
                    list.add("2.0 / 2.0L / Diesel / 130h.p");
                    list.add("2.2 / 2.2L / Diesel / 155h.p");
                    list.add("2.2 / 2.2L / Diesel / 146h.p");
                    list.add("2.5 / 2.5L / Petrol / 196h.p");
                    list.add("2.5 / 2.5L / Petrol / 194h.p");
                    list.add("3.0 / 3.0L / Petrol / 230h.p");
                    list.add("3.0 / 3.0L / Petrol / 230h.p");
                    ArrayAdapter<String> dataAdapter286 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter286.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter286.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter286);
                }
                if (model.contentEquals("X-TYPE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Varaint");
                    ArrayAdapter<String> dataAdapter286 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter286.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter286.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter286);
                }
                if (model.contentEquals("BOLERO PICKUP")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5 / 2.5L / Diesel / 76h.p");
                    list.add("2.5 / 2.5L / Diesel / 95h.p");
                    list.add("2.5 / 2.5L / Diesel / 101h.p");
                    list.add("2.5 / 2.5L / Diesel / 63h.p");
                    list.add("2.5 4x4 / 2.5L / Diesel / 58h.p");
                    list.add("2.5 4x4 / 2.5L / Diesel / 95h.p");
                    list.add("2.5 4x4 / 2.5L / Diesel / 101h.p");
                    list.add("2.5 CNG / 2.5L / Diesel / 70h.p");
                    ArrayAdapter<String> dataAdapter287 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter287.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter287.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter287);
                }
                if (model.contentEquals("BOLERO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5 / 2.5L / Diesel / 68h.p");
                    list.add("2.5 / 2.5L / Diesel / 63h.p");
                    list.add("2.5 / 2.5L / Diesel / 73h.p");
                    list.add("2.5 / 2.5L / Diesel / 63h.p");
                    list.add("2.5 / 2.5L / Diesel / 54h.p");
                    list.add("2.5 / 2.5L / Diesel / 98h.p");
                    list.add("2.5 / 2.5L / Diesel / 98h.p");
                    list.add("2.5 / 2.5L / Diesel / 63h.p");
                    list.add("2.5 4X4 / 2.5L / Diesel / 68h.p");
                    list.add("2.5 4X4 / 2.5L / Diesel / 63h.p");
                    list.add("2.5 4X4 / 2.5L / Diesel / 54h.p");
                    list.add("POWER+ / 1.5L / Diesel / 70h.p");
                    ArrayAdapter<String> dataAdapter288 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter288.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter288.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter288);
                }
                if (model.contentEquals("BOLERO INVADER")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5 DI / 2.5L / Diesel / 58h.p");
                    list.add("2.5 GLX / 2.5L / Diesel / 72h.p");
                    ArrayAdapter<String> dataAdapter289 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter289.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter289.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter289);
                }
                if (model.contentEquals("BOLERO CAMPER")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5 / 2.5L / Diesel / 62h.p");
                    list.add("2.5 4X4 / 2.5L / Diesel / 63h.p");
                    list.add("2.5 GOLD / 2.5L / Diesel / 63h.p");
                    ArrayAdapter<String> dataAdapter290 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter290.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter290.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter290);
                }
                if (model.contentEquals("BOLERO MAXI TRUCK")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5 / 2.5L / Diesel / 63h.p");
                    ArrayAdapter<String> dataAdapter291 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter291.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter291.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter291);
                }
                if (model.contentEquals("COMMANDER")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5 / 2.5L / Diesel / 58h.p");
                    list.add("2.5 / 2.5L / Diesel / 63h.p");
                    list.add("2.5 4X4/ 2.5L / Diesel / 50h.p");
                    list.add("2.5 4X4/ 2.5L / Diesel / 58h.p");
                    list.add("2.5 4X4/ 2.5L / Diesel / 63h.p");
                    ArrayAdapter<String> dataAdapter292 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter292.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter292.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter292);
                }
                if (model.contentEquals("GENIO SC")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5 / 2.5L / Diesel / 75h.p");
                    ArrayAdapter<String> dataAdapter293 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter293.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter293.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter293);
                }
                if (model.contentEquals("GENIO SC")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5 / 2.5L / Diesel / 56h.p");
                    list.add("VX 2.5 / 2.5L / Diesel / 56h.p");
                    ArrayAdapter<String> dataAdapter294 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter294.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter294.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter294);
                }
                if (model.contentEquals("GIO (2009)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("MAHIN GIO 0.5D / 0.5L / Diesel / 10h.p");
                    ArrayAdapter<String> dataAdapter295 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter295.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter295.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter295);
                }
                if (model.contentEquals("IMPERIO SC")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5 / 2.5L / Diesel / 56h.p");
                    ArrayAdapter<String> dataAdapter296 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter296.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter296.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter296);
                }
                if (model.contentEquals("IMPERIO DC")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Variant");
                    ArrayAdapter<String> dataAdapter297 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter297.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter297.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter297);
                }
                if (model.contentEquals("JEETO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.6 BSIII / 0.6L / Diesel / 16h.p");
                    list.add("0.6 BSIII / 0.6L / Diesel / 11h.p");
                    ArrayAdapter<String> dataAdapter298 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter298.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter298.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter298);
                }
                if (model.contentEquals("KUV100")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 82h.p");
                    list.add("1.2 / 1.2L / Diesel / 77h.p");
                    ArrayAdapter<String> dataAdapter299 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter299.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter299.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter299);
                }
                if (model.contentEquals("MARSHAL")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5 / 2.5L / Diesel / 56h.p");
                    ArrayAdapter<String> dataAdapter300 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter300.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter300.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter300);
                }
                if (model.contentEquals("MAXX")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5 / 2.5L / Diesel / 62h.p");
                    list.add("2.5 4X4 / 2.5L / Diesel / 58h.p");
                    ArrayAdapter<String> dataAdapter301 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter301.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter301.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter301);
                }
                if (model.contentEquals("MAXX PICK UP")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5 / 2.5L / Diesel / 63h.p");
                    list.add("2.5 CNG/ 2.5L / Diesel / 70h.p");
                    ArrayAdapter<String> dataAdapter301 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter301.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter301.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter301);
                }
                if (model.contentEquals("MAXX PICK UP")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.9/ 0.9L / Diesel / 25h.p");
                    ArrayAdapter<String> dataAdapter302 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter302.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter302.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter302);
                }
                if (model.contentEquals("MAXXIMO MINI VAN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.9/ 0.9L / Diesel / 25h.p");
                    ArrayAdapter<String> dataAdapter303 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter303.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter303.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter303);
                }
                if (model.contentEquals("MAXXIMO PlUS")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.9/ 0.9L / Diesel / 25h.p");
                    list.add("var");
                    ArrayAdapter<String> dataAdapter304 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter304.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter304.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter304);
                }
                if (model.contentEquals("NUVOSPORT")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5/ 1.5L / Diesel / 100h.p");
                    ArrayAdapter<String> dataAdapter305 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter305.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter305.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter305);
                }
                if (model.contentEquals("QUANTO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5/ 1.5L / Diesel / 100h.p");
                    ArrayAdapter<String> dataAdapter306 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter306.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter306.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter306);
                }
                if (model.contentEquals("REVA-E20")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("E20 Electric / Electric motor / 25h.p");
                    ArrayAdapter<String> dataAdapter307 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter307.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter307.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter307);
                }
                if (model.contentEquals("REVA-E2oPlus")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("E20 Electric / Electric motor / 25h.p");
                    ArrayAdapter<String> dataAdapter308 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter308.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter308.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter308);
                }
                if (model.contentEquals("REXTON")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.7 RX6 /2.7L / Diesel / 162h.p");
                    list.add("2.7 RX7 /2.7L / Diesel / 184h.p");
                    ArrayAdapter<String> dataAdapter309 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter309.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter309.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter309);
                }
                if (model.contentEquals("SAVARI")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.7 RX6 /2.7L / Diesel / 162h.p");
                    ArrayAdapter<String> dataAdapter310 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter310.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter310.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter310);
                }
                if (model.contentEquals("Scorpio 1st Gen")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2 / 2.2L / Petrol / 115h.p");
                    list.add("2.6 CRDe / 2.6L / Diesel / 116h.p");
                    list.add("2.6 TURBO / 2.6L / Diesel / 109h.p");
                    ArrayAdapter<String> dataAdapter311 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter311.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter311.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter311);
                }
                if (model.contentEquals("Scorpio 1st Gen F/L")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2 / 2.2L / Diesel / 120h.p");
                    list.add("2.5 / 2.5L / Diesel / 75h.p");
                    list.add("2.6 / 2.6L / Diesel / 116h.p");
                    ArrayAdapter<String> dataAdapter312 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter312.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter312.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter312);
                }
                if (model.contentEquals("Scorpio 2nd Gen")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2 / 2.2L / Diesel / 120h.p");
                    list.add("2.5 / 2.5L / Diesel / 75h.p");
                    ArrayAdapter<String> dataAdapter312 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter312.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter312.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter312);
                }
                if (model.contentEquals("Scorpio 3rd Gen")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Diesel / 120h.p");
                    list.add("2.2 / 2.2L / Diesel / 120h.p");
                    list.add("2.5 / 2.5L / Diesel / 75h.p");
                    ArrayAdapter<String> dataAdapter313 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter313.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter313.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter313);
                }
                if (model.contentEquals("Scorpio Getaway Ver 1")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.6 / 2.6L / Diesel /115h.p");
                    ArrayAdapter<String> dataAdapter314 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter314.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter314.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter314);
                }
                if (model.contentEquals("Scorpio Getaway Ver 2")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.6 / 2.6L / Diesel /115h.p");
                    ArrayAdapter<String> dataAdapter315 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter315.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter315.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter315);
                }
                if (model.contentEquals("Supro")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.0 / 1.0L / Diesel /45h.p");
                    ArrayAdapter<String> dataAdapter316 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter316.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter316.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter316);
                }
                if (model.contentEquals("Supro Mini Truck")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.0 / 1.0L / Diesel /45h.p");
                    ArrayAdapter<String> dataAdapter317 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter317.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter317.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter317);
                }
                if (model.contentEquals("THAR")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5 / 2.5L / Diesel / 105h.p");
                    list.add("2.5 / 2.5L / Diesel / 64h.p");
                    list.add("2.5 4X4 / 2.5L / Diesel / 105h.p");
                    ArrayAdapter<String> dataAdapter318 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter318.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter318.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter318);
                }
                if (model.contentEquals("TUV 300")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5 / 1.5L / Diesel / 84h.p");
                    list.add("1.5 / 1.5L / Diesel / 100h.p");
                    ArrayAdapter<String> dataAdapter319 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter319.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter319.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter319);
                }
                if (model.contentEquals("VERITO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Petrol / 76h.p");
                    list.add("1.5 / 1.5L / Diesel / 66h.p");
                    ArrayAdapter<String> dataAdapter320 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter320.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter320.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter320);
                }
                if (model.contentEquals("VERITO F/L")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5 / 1.5L / Diesel / 65h.p");
                    ArrayAdapter<String> dataAdapter321 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter321.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter321.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter321);
                }
                if (model.contentEquals("VERITO VIBE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5 / 1.5L / Diesel / 64h.p");
                    ArrayAdapter<String> dataAdapter322 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter322.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter322.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter322);
                }
                if (model.contentEquals("eVERITO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("No Variant");
                    ArrayAdapter<String> dataAdapter323 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter323.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter323.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter323);
                }
                if (model.contentEquals("VERITO EXECUTIVE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5 EXE/ 1.5L / Diesel / 65h.pt");
                    ArrayAdapter<String> dataAdapter324 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter324.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter324.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter324);
                }
                if (model.contentEquals("XUV 500")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2/ 2.2L / Diesel / 140h.p");
                    list.add("2.2 AWD / 2.2L / Diesel / 140h.p");
                    ArrayAdapter<String> dataAdapter325 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter325.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter325.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter325);
                }
                if (model.contentEquals("XUV 500 2ND GEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2  / 2.2L / Diesel / 140h.p");
                    list.add("2.2 AWD / 2.2L / Diesel / 140h.p");
                    ArrayAdapter<String> dataAdapter326 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter326.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter326.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter326);
                }
                if (model.contentEquals("XYLO 1ST GEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5  / 2.5L / Diesel / 95h.p");
                    list.add("2.5  / 2.5L / Diesel / 114h.p");
                    ArrayAdapter<String> dataAdapter327 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter327.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter327.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter327);
                }
                if (model.contentEquals("XYLO 2ND GEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2  / 2.2L / Diesel / 120h.p");
                    list.add("2.5  / 2.5L / Diesel / 114h.p");
                    list.add("2.5  / 2.5L / Diesel / 95h.p");
                    ArrayAdapter<String> dataAdapter328 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter328.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter328.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter328);
                }
                if (model.contentEquals("XYLO 3RD GEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2  / 2.2L / Diesel / 120h.p");
                    list.add("2.5  / 2.5L / Diesel / 95h.p");
                    ArrayAdapter<String> dataAdapter329 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter329.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter329.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter329);
                }
                if (model.contentEquals("XYLO 3RD GEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2  / 2.2L / Diesel / 120h.p");
                    list.add("2.5  / 2.5L / Diesel / 95h.p");
                    ArrayAdapter<String> dataAdapter329 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter329.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter329.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter329);
                }
                if (model.contentEquals("DISCOVERY(2004-2009)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 / 3.0L / Diesel / 191h.p");
                    ArrayAdapter<String> dataAdapter330 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter330.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter330.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter330);
                }
                if (model.contentEquals("DISCOVERY(2009-2013)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 / 3.0L / Diesel / 248h.p");
                    ArrayAdapter<String> dataAdapter331 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter331.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter331.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter331);
                }
                if (model.contentEquals("DISCOVERY SPORT")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2 / 2.2L / Diesel / 147h.p");
                    ArrayAdapter<String> dataAdapter332 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter332.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter332.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter332);
                }
                if (model.contentEquals("FREELANDER 2")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2 / 2.2L / Diesel / 148h.p");
                    ArrayAdapter<String> dataAdapter333 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter333.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter333.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter333);
                }
                if (model.contentEquals("RANGE ROVER Mk III (LM)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 4x4 / 3.0L / Diesel / 177h.p");
                    list.add("3.6 4x4 / 3.6L / Diesel / 272h.p");
                    list.add("4.2 4x4 / 4.2L / petrol / 396h.p");
                    list.add("4.2 4x4 / 4.2L / petrol / 405h.p");
                    list.add("4.4 4x4 / 4.4L / petrol / 286h.p");
                    list.add("4.4 4x4 / 4.4L / petrol / 305h.p");
                    list.add("4.4 4x4 / 4.4L / petrol / 299h.p");
                    list.add("4.4 4x4 / 4.4L / petrol / 288h.p");
                    list.add("4.4 4x4 / 4.4L / petrol / 306h.p");
                    list.add("4.4 4x4 / 4.4L / Diesel / 313h.p");
                    list.add("t5.0 4x4 / 5.0L / Petrol / 296h.p");
                    list.add("5.0 4x4 / 5.0L / Petrol / 375h.p");
                    ArrayAdapter<String> dataAdapter334 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter334.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter334.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter334);
                }
                if (model.contentEquals("RANGE ROVER IV (LG)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 4x4 / 3.0L / Petrol / 340h.p");
                    list.add("3.0 4x4 / 3.0L / Diesel / 249h.p");
                    list.add("3.0 4x4 / 3.0L / Diesel / 258h.p");
                    list.add("3.0 4x4 / 3.0L / Diesel / 211h.p");
                    list.add("4.4 4x4 / 4.4L / Diesel / 340h.p");
                    list.add("4.4 4x4 / 4.4L / Diesel / 313h.p");
                    list.add("5.0 4x4 / 5.0L / Petrol / 510h.p");
                    list.add("5.0 4x4 / 5.0L / Petrol / 375h.p");
                    ArrayAdapter<String> dataAdapter335 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter335.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter335.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter335);
                }
                if (model.contentEquals("RANGE ROVER EVOQUE (LV)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 4x4 / 2.0L / Petrol / 241h.p");
                    list.add("2.2 / 2.2L / Petrol / 150h.p");
                    list.add("2.2 4x4/ 2.2L / Diesel / 150h.p");
                    ArrayAdapter<String> dataAdapter336 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter336.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter336.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter336);
                }
                if (model.contentEquals("RANGE ROVER EVOQUE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 4x4/ 2.0L / Diesel / 187h.p");
                    ArrayAdapter<String> dataAdapter337 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter337.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter337.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter337);
                }
                if (model.contentEquals("RANGE ROVER EVOQUE CONVERTIABLE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 4x4/ 2.0L / Diesel / 187.7h.p");
                    ArrayAdapter<String> dataAdapter338 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter338.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter338.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter338);
                }
                if (model.contentEquals("RANGE ROVER SPORT (LS)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.7 4x4/ 2.7L / Diesel / 190h.p");
                    list.add("3.0 4x4/ 3.0L / Diesel / 245h.p");
                    list.add("3.0 4x4/ 3.0L / Diesel / 211h.p");
                    list.add("3.0 4x4/ 3.0L / Diesel / 256h.p");
                    list.add("3.0 4x4/ 3.0L / Diesel / 249h.p");
                    list.add("3.6 4x4/ 3.6L / Diesel / 272h.p");
                    list.add("4.2 4x4/ 4.2L / Petrol / 390h.p");
                    list.add("4.4 4x4/ 4.4L / Petrol / 299h.p");
                    list.add("5.0 4x4/ 5.0L / Petrol / 297h.p");
                    list.add("5.0 4x4/ 5.0L / Petrol / 506h.p");
                    list.add("5.0 4x4/ 5.0L / Petrol / 375h.p");
                    list.add("5.0 4x4/ 5.0L / Petrol / 510h.p");
                    ArrayAdapter<String> dataAdapter339 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter339.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter339.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter339);
                }
                if (model.contentEquals("RANGE ROVER SPORT (LW)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 4x4/ 3.0L / Petrol / 340h.p");
                    list.add("3.0 4x4/ 3.0L / Diesel / 292h.p");
                    list.add("3.0 4x4/ 3.0L / Diesel / 258h.p");
                    list.add("3.0 4x4/ 3.0L / Diesel / 249h.p");
                    ArrayAdapter<String> dataAdapter340 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter340.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter340.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter340);
                }
                if (model.contentEquals("800(1997)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.8 / 0.8L / Petrol /39h.p");
                    ArrayAdapter<String> dataAdapter341 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter341.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter341.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter341);
                }
                if (model.contentEquals("800(2000)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.8 / 0.8L / Petrol /37h.p");
                    ArrayAdapter<String> dataAdapter342 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter342.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter342.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter342);
                }
                if (model.contentEquals("ALTO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.8 / 0.8L / Petrol /48h.p");
                    list.add("0.8 / 0.8L / Petrol /48h.p");
                    list.add("0.8 / 0.8L / Petrol /48h.p");
                    list.add("0.8 / 0.8L / Petrol /48h.p");
                    list.add("1.1 / 1.1L / Petrol /62h.p");
                    ArrayAdapter<String> dataAdapter343 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter343.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter343.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter343);
                }
                if (model.contentEquals("ALTO K10")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.0 / 1.0L / Petrol /68h.p");
                    ArrayAdapter<String> dataAdapter344 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter344.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter344.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter344);
                }
                if (model.contentEquals("ALTO 800")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.8 / 0.8L / Petrol /48h.p");
                    list.add("0.8 CNG/ 0.8L / Petrol /48h.p");
                    ArrayAdapter<String> dataAdapter345 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter345.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter345.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter345);
                }
                if (model.contentEquals("A-STAR")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.0 / 1.0L / Petrol / 67h.p");
                    ArrayAdapter<String> dataAdapter346 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter346.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter346.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter346);
                }
                if (model.contentEquals("BALENO ALTURA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.6 / 1.6L / Petrol / 96h.p");
                    ArrayAdapter<String> dataAdapter347 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter347.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter347.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter347);
                }
                if (model.contentEquals("BALENO 1ST GEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.6 / 1.6L / Petrol / 96h.p");
                    ArrayAdapter<String> dataAdapter348 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter348.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter348.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter348);
                }
                if (model.contentEquals("BALENO 2ND GEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.6 / 1.6L / Petrol / 96h.p");
                    ArrayAdapter<String> dataAdapter349 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter349.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter349.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter349);
                }
                if (model.contentEquals("CELERIO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.8 / 0.8L / Diesel / 47h.p");
                    list.add("1.0 / 1.0L / Petrol / 68h.p");
                    ArrayAdapter<String> dataAdapter350 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter350.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter350.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter350);
                }
                if (model.contentEquals("CIAZ")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 / 1.3L / Diesel / 88h.p");
                    list.add("1.4 / 1.4L / Petrol / 92h.p");
                    ArrayAdapter<String> dataAdapter351 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter351.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter351.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter351);
                }
                if (model.contentEquals("EECO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 73h.p");
                    list.add("1.2 / 1.2L / Petrol / 63h.p");
                    ArrayAdapter<String> dataAdapter352 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter352.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter352.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter352);
                }
                if (model.contentEquals("ERTIGA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 / 1.3L / Diesel / 90h.p");
                    list.add("1.4 / 1.4L / Petrol / 93h.p");
                    ArrayAdapter<String> dataAdapter353 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter353.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter353.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter353);
                }
                if (model.contentEquals("ESTEEM")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 / 1.3L / Petrol / 65h.p");
                    list.add("1.3 / 1.3L / Petrol / 85h.p");
                    list.add("1.5 / 1.5L / Diesel / 57h.p");
                    ArrayAdapter<String> dataAdapter354 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter354.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter354.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter354);
                }
                if (model.contentEquals("GRAND VITARA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Petrol / 122h.p");
                    list.add("2.4 / 2.4L / Petrol / 166h.p");
                    list.add("2.7 AWD / 2.7L / Petrol / 169h.p");
                    ArrayAdapter<String> dataAdapter355 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter355.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter355.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter355);
                }
                if (model.contentEquals("GYPSY")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 4WD / 1.3L / Petrol / 82h.p");
                    list.add("2.4 / 2.4L / Petrol / 166h.p");
                    list.add("2.7 AWD / 2.7L / Petrol / 169h.p");
                    ArrayAdapter<String> dataAdapter356 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter356.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter356.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter356);
                }
                if (model.contentEquals("Ignis")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 82h.p");
                    list.add("1.3 / 1.3L / Diesel / 74h.p");
                    ArrayAdapter<String> dataAdapter357 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter357.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter357.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter357);
                }
                if (model.contentEquals("KIZASHI")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.4 / 2.4L / Petrol / 185h.p");
                    list.add("2.4 / 2.4L / Petrol / 178h.p");
                    list.add("2.4 / 2.4L / Petrol / 185h.p");
                    ArrayAdapter<String> dataAdapter358 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter358.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter358.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter358);
                }
                if (model.contentEquals("OMNI 1ST GEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.8 / 0.8L / Petrol / 35h.p");
                    ArrayAdapter<String> dataAdapter359 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter359.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter359.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter359);
                }
                if (model.contentEquals("OMNI 2ND GEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.8 / 0.8L / Petrol / 35h.p");
                    ArrayAdapter<String> dataAdapter360 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter360.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter360.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter360);
                }
                if (model.contentEquals("OMNI 3RD GEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.8 / 0.8L / Petrol / 35h.p");
                    ArrayAdapter<String> dataAdapter361 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter361.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter361.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter361);
                }
                if (model.contentEquals("RITZ")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 86h.p");
                    list.add("1.3 / 1.3L / Diesel / 75h.p");
                    ArrayAdapter<String> dataAdapter362 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter362.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter362.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter362);
                }
                if (model.contentEquals("RITZ 2ND GEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 86h.p");
                    list.add("1.3 / 1.3L / Diesel / 75h.p");
                    ArrayAdapter<String> dataAdapter363 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter363.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter363.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter363);
                }
                if (model.contentEquals("S-CROSS")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 / 1.3L / Diesel / 88.5h.p");
                    list.add("1.6 / 1.6L / Diesel / 118h.p");
                    ArrayAdapter<String> dataAdapter364 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter364.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter364.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter364);
                }
                if (model.contentEquals("STINGRAY")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.0 / 1.0L / Petrol / 68h.p");
                    ArrayAdapter<String> dataAdapter365 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter365.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter365.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter365);
                }
                if (model.contentEquals("SWIFT 1ST GEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 / 1.3L / Petrol / 87h.p");
                    list.add("1.2 / 1.2L / Petrol / 85h.p");
                    list.add("1.3 / 1.3L / Diesel / 75h.p");

                    ArrayAdapter<String> dataAdapter366 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter366.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter366.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter366);
                }
                if (model.contentEquals("SWIFT 2ND GEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 85h.p");
                    list.add("1.3 / 1.3L / Diesel / 75h.p");
                    ArrayAdapter<String> dataAdapter367 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter367.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter367.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter367);
                }
                if (model.contentEquals("SWIFT DZIRE 1ST GEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 85h.p");
                    list.add("1.3 / 1.3L / Petrol / 87h.p");
                    list.add("1.3 / 1.3L / Diesel / 75h.p");
                    ArrayAdapter<String> dataAdapter368 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter368.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter368.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter368);
                }
                if (model.contentEquals("SWIFT DZIRE 2ND GEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 85h.p");
                    list.add("1.3 / 1.3L / Diesel / 75h.p");
                    ArrayAdapter<String> dataAdapter369 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter369.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter369.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter369);
                }
                if (model.contentEquals("SWIFT DZIRE 3RD GEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 82h.p");
                    list.add("1.3 / 1.3L / Diesel / 74h.p");
                    ArrayAdapter<String> dataAdapter370 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter370.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter370.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter370);
                }
                if (model.contentEquals("SX4")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.6 / 1.6L / Petrol / 102h.p");
                    ArrayAdapter<String> dataAdapter371 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter371.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter371.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter371);
                }
                if (model.contentEquals("SX4 1st F/L")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 / 1.3L / Diesel / 89h.p");
                    list.add("1.6 / 1.6L / Petrol / 102h.p");
                    list.add("1.6 CNG / 1.6L / Petrol / 102h.p");
                    ArrayAdapter<String> dataAdapter372 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter372.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter372.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter372);
                }
                if (model.contentEquals("SX4 2nd F/L")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.6 / 1.6L / Petrol / 102h.p");
                    ArrayAdapter<String> dataAdapter373 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter373.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter373.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter373);
                }
                if (model.contentEquals("VERSA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 / 1.3L / Petrol / 82h.p");
                    ArrayAdapter<String> dataAdapter374 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter374.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter374.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter374);
                }
                if (model.contentEquals("BREZZA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 / 1.3L / Diesel / 89h.p");
                    ArrayAdapter<String> dataAdapter375 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter375.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter375.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter375);
                }
                if (model.contentEquals("WAGON R (2000-2003)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.1 / 1.1L / Petrol / 67h.p");
                    ArrayAdapter<String> dataAdapter376 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter376.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter376.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter376);
                }
                if (model.contentEquals("WAGON R (2003-2006)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.1 / 1.1L / Petrol / 67h.p");
                    ArrayAdapter<String> dataAdapter376 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter376.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter376.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter376);
                }
                if (model.contentEquals("WAGON R (2010-2012)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.0 / 1.0L / Petrol / 68h.p");
                    list.add("1.0  CNG / 1.0L / Petrol / 68h.p");
                    list.add("1.0 LPG / 1.0L / Petrol / 68h.p");
                    ArrayAdapter<String> dataAdapter377 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter377.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter377.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter377);
                }
                if (model.contentEquals("Wagon R (2012-NOW)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.0  / 1.0L / Petrol / 68h.p");
                    ArrayAdapter<String> dataAdapter378 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter378.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter378.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter378);
                }
                if (model.contentEquals("ZEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.0  / 1.0L / Petrol / 58h.p");
                    list.add("1.6  / 1.6L / Petrol / 58h.p");
                    ArrayAdapter<String> dataAdapter379 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter379.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter379.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter379);
                }
                if (model.contentEquals("ZEN CLASSIC")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.0 / 1.0L / Petrol / 58h.p");
                    ArrayAdapter<String> dataAdapter380 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter380.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter380.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter380);
                }
                if (model.contentEquals("ZEN 2ND GEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.0 / 1.0L / Petrol / 60h.p");
                    ArrayAdapter<String> dataAdapter381 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter381.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter381.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter381);
                }
                if (model.contentEquals("ZEN ESTILO 2ND GEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.0 / 1.0L / Petrol / 68h.p");
                    ArrayAdapter<String> dataAdapter382 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter382.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter382.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter382);
                }
                if (model.contentEquals("ZEN ESTILO 1ST GEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.1 / 1.1L / Petrol / 64h.p");
                    ArrayAdapter<String> dataAdapter383 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter383.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter383.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter383);
                }
                if (model.contentEquals("A-CLASS (W176)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("160 CDi / 1.5L / Diesel / 90h.p");
                    list.add("200 CDi / 2.1L / Diesel / 136h.p");
                    list.add("220 4MATIC / 2.0L / Petrol / 184h.p");
                    list.add("220 CDi / 2.1L / Diesel / 170h.p");
                    list.add("220 CDi / 2.1L / Diesel / 163h.p");
                    list.add("220 CDi / 2.1L / Diesel / 163h.p");
                    list.add("250 / 2.0L / Petrol / 211h.p");
                    list.add("45 AMG / 2.0L / Petrol / 360h.p");
                    ArrayAdapter<String> dataAdapter384 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter384.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter384.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter384);
                }
                if (model.contentEquals("B-CLASS (W245)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("200 / 2.0L / Petrol / 211h.p");
                    ArrayAdapter<String> dataAdapter385 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter385.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter385.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter385);
                }
                if (model.contentEquals("C-CLASS (W203)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("180 / 2.0L / Petrol / 129h.p");
                    list.add("180 Kompressor / 1.8L / Petrol / 143h.p");
                    list.add("200 CDi / 2.2L / Diesel / 116h.p");
                    list.add("200 CDi / 2.2L / Diesel / 122h.p");
                    list.add("200 CDi / 1.8L / Petrol / 170h.p");
                    list.add("200 Kompressor / 2.0L / Petrol / 163h.p");
                    list.add("220 CDI / 2.2L / Diesel / 150h.p");
                    list.add("C 160 Kompressor / 1.8L / Petrol / 122h.p");
                    list.add("230 Kompressor / 1.8L / Petrol / 192h.p");
                    ArrayAdapter<String> dataAdapter386 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter386.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter386.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter386);
                }
                if (model.contentEquals("C-CLASS (CL203)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("C 160 Kompressor / 1.8L / Petrol / 122h.p");
                    list.add("C 180 / 2.0L / Petrol / 129h.p");
                    list.add("C 180 Kompressor / 1.8L / Petrol / 143h.p");
                    list.add("C 200 CDI / 2.2L / Diesel / 122h.p");
                    list.add("C 200 CDI Kompressor / 1.8L / Petrol / 170h.p");
                    list.add("C 200 CDI Kompressor / 1.8L / Petrol / 163h.p");
                    list.add("C 200 CDI / 2.2L / Diesel / 143h.p");
                    list.add("C 200 CDI / 2.2L / Diesel / 150h.p");
                    list.add("C 230 / 2.5L / Petrol / 204h.p");
                    list.add("C 230 Kompressor / 2.3L / Petrol / 197h.p");
                    list.add("C 30 CDI AMG / 3.0L / Diesel / 231h.p");
                    list.add("C 320 / 3.2L / Petrol / 218h.p");
                    list.add("C 350 / 3.5L / Petrol / 272h.p");

                    ArrayAdapter<String> dataAdapter387 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter387.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter387.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter387);
                }
                if (model.contentEquals("C-CLASS (W204)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("180 CDI / 2.1L / Diesel / 120h.p");
                    list.add("180 Kompressor / 1.6L / Petrol / 156h.p");
                    list.add("200 CDI / 2.1L / Diesel / 136h.p");
                    list.add("200 Kompressor / 1.8L / Petrol / 184h.p");
                    list.add("220 CDI / 2.1L / Diesel / 163h.p");
                    list.add("220 CDI / 2.1L / Diesel / 170h.p");
                    list.add("230 / 2.5L / Petrol / 204h.p");
                    list.add("250  CDI/ 2.5L / Diesel / 204h.p");
                    list.add("280 / 3.0L / Petrol / 231h.p");
                    list.add("320 CDI / 3.0L / Diesel / 224h.p");
                    list.add("350 CDI / 3.0L / Diesel / 231h.p");

                    ArrayAdapter<String> dataAdapter389 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter389.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter389.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter389);
                }
                if (model.contentEquals("C-CLASS (W205)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("180 / 1.6L / Petrol / 156h.p");
                    list.add("180 BlueTEC/ 1.6L / Diesel / 116h.p");
                    list.add("200/ 2.0L / Petrol / 184h.p");
                    list.add("200 BlueTEC / 1.6L / Diesel / 136h.p");
                    list.add("220 BlueTEC / 2.1L / Diesel / 170h.p");
                    list.add("220 BlueTEC / 2.1L / Diesel / 163h.p");
                    list.add("250 BlueTEC / 2.1L / Diesel / 204h.p");
                    ArrayAdapter<String> dataAdapter390 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter390.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter390.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter390);
                }
                if (model.contentEquals("CLA (C117)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("180 / 1.6L / Petrol / 156h.p");
                    list.add("180 CDI/ 1.5L / Diesel / 109h.p");
                    list.add("200 / 1.6L / Petrol / 156h.p");
                    list.add("200 CDI / 1.8L / Diesel / 136h.p");
                    list.add("220 CDI / 2.1L / Diesel / 170h.p");
                    list.add("250 / 2.0L / Petrol / 211h.p");
                    list.add("45 AMG / 2.0L / Petrol / 360h.p");
                    ArrayAdapter<String> dataAdapter391 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter391.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter391.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter391);
                }
                if (model.contentEquals("CLS (C219)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("280 / 3.0L / Petrol / 231h.p");
                    list.add("320 / 3.0L / Diesel / 224h.p");
                    list.add("MERCE CLS (C219)CLS 350 (219.357) / 3.5L / Petrol ");
                    list.add("MERCE CLS (C219)CLS 350 CGI(219.357) / 3.5L / Petr");
                    ArrayAdapter<String> dataAdapter392 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter392.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter392.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter392);
                }
                if (model.contentEquals("E-CLASS (W211)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("200 CDI / 2.2L / Diesel / 102h.p");
                    list.add("200 CDI / 2.2L / Diesel / 122h.p");
                    list.add("200 Kompressor / 1.8L / Petrol / 163h.p");
                    list.add("200 Kompressor / 1.8L / Petrol / 184h.p");
                    list.add("220 CDI / 2.1L / Diesel / 136h.p");
                    list.add("220 CDI / 2.1L / Diesel / 163h.p");
                    list.add("220 CDI / 2.1L / Diesel / 170h.p");
                    list.add("230 / 2.5L / Petrol / 204h.p");
                    list.add("240 / 2.6L / Petrol / 117h.p");
                    list.add("270 CDI / 2.7L / Diesel / 163h.p");
                    list.add("280 / 3.0L / Petrol / 231h.p");
                    list.add("280 CDI / 3.2L / Diesel / 177h.p");
                    list.add("300 BlueTEC / 3.0L / Diesel / 211h.p");
                    list.add("320 / 3.2L / Petrol / 224h.p");
                    list.add("320 CDI / 3.2L / Diesel / 204h.p");
                    list.add("320 CDI / 3.0L / Diesel / 224h.p");
                    list.add("320 CDI / 3.0L / Diesel / 214h.p");
                    list.add("350 / 3.5L / Petrol / 279h.p");
                    list.add("350 CGI / 3.5L / Petrol / 292h.p");
                    list.add("420 CDI / 4.0L / Diesel / 314h.p");
                    ArrayAdapter<String> dataAdapter393 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter393.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter393.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter393);
                }
                if (model.contentEquals("E-CLASS (W212)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("200 / 2.0L / Petrol / 184h.p");
                    list.add("200 CDI / 2.1L / Diesel / 136h.p");
                    list.add("200 NGT / 1.8L / Petrol / 163h.p");
                    list.add("220 BlueTEC / 2.1L / Diesel / 177h.p");
                    list.add("220 CDI / 2.1L / Diesel / 163h.p");
                    list.add("250 / 2.0L / Petrol / 211h.p");
                    list.add("250 CDI / 2.1L / Diesel / 204h.p");
                    list.add("250 CGI / 1.8L / Petrol / 204h.p");
                    list.add("300 / 3.0L / Petrol / 231h.p");
                    list.add("300 / 3.5L / Petrol / 252h.p");
                    list.add("350 / 3.5L / Petrol / 272h.p");
                    list.add("350 / 3.5L / Petrol / 306h.p");
                    list.add("350 BlueTEC/ 3.0L / Diesel / 211h.p");
                    list.add("350 BlueTEC/ 3.0L / Diesel / 252h.p");
                    list.add("350 CDI / 3.0L / Diesel / 231h.p");
                    list.add("350 CDI / 3.0L / Diesel / 214h.p");
                    list.add("350 CDI / 3.0L / Diesel / 265h.p");
                    ArrayAdapter<String> dataAdapter394 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter394.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter394.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter394);
                }
                if (model.contentEquals("E-CLASS Coupe (C207)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("200 / 2.0L / Petrol / 184h.p");
                    list.add("200 CGI / 1.8L / Petrol / 184h.p");
                    list.add("220 CGI / 2.2L / Diesel / 170h.p");
                    list.add("250 / 2.0L / Petrol / 211h.p");
                    list.add("250 CDI/ 2.2L / Diesel / 204h.p");
                    list.add("250 CGI/ 1.8L / Petrol / 204h.p");
                    list.add("350 / 3.5L / Petrol / 306h.p");
                    ArrayAdapter<String> dataAdapter395 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter395.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter395.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter395);
                }
                if (model.contentEquals("E 63")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("5.5 AMG / 5.5L / Petrol / 557h.p");
                    ArrayAdapter<String> dataAdapter396 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter396.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter396.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter396);
                }
                if (model.contentEquals("E-CLASS")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 E 200 / 2.0L / Petrol / 184h.p");
                    list.add("2.0 E 200D / 2.0L / Diesel / 192h.p");
                    list.add("2.0 E 350 D / 3.0L / Diesel / 258h.p");
                    ArrayAdapter<String> dataAdapter397 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter397.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter397.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter397);
                }
                if (model.contentEquals("G-CLASS (W463)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("250 GD / 2.5L / Diesel / 94h.p");
                    list.add("300 GD / 3.0L / Diesel / 113h.p");
                    list.add("300 GE / 3.0L / Diesel / 170h.p");
                    list.add("350 TURBO GD / 3.4L / Diesel / 136h.p");
                    list.add("G 270 CDI / 2.7L / Diesel / 156h.p");
                    list.add("G 300 TD / 3.0L / Diesel / 177h.p");
                    list.add("G 320 / 3.2L / Petrol / 215h.p");
                    list.add("G 320 CDI / 3.0L / Diesel / 224h.p");
                    list.add("G 350 CDI / 3.0L / Diesel / 211h.p");
                    list.add("G 36 AMG / 3.6L / Petrol / 272h.p");
                    list.add("G 400 CDI / 4.0L / Diesel / 250h.p");
                    list.add("G 500 / 5.0L / Petrol / 296h.p");
                    list.add("G 500 / 5.0L / Petrol / 296h.p");
                    list.add("G 500 E/ 4.9L / Petrol / 241h.p");
                    list.add("G 550 / 5.5L / Petrol / 388h.p");
                    list.add("G 55 AMG / 5.5L / Petrol / 354h.p");
                    list.add("G 65 AMG / 5.5L / Petrol / 551h.p");

                    ArrayAdapter<String> dataAdapter398 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter398.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter398.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter398);
                }
                if (model.contentEquals("G-CLASS (W461)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("230 GE / 2.3L / Petrol / 125h.p");
                    list.add("250 GD / 2.5L / Diesel / 92h.p");
                    list.add("290 GD / 2.9L / Diesel / 95h.p");
                    list.add("G 280 CDI / 3.0L / Diesel / 184h.p");
                    list.add("G 300 CDI / 3.0L / Diesel / 184h.p");
                    ArrayAdapter<String> dataAdapter398 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter398.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter398.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter398);
                }
                if (model.contentEquals("GLA-CLASS (X156)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("GLA 200 / 1.6L / Petrol / 156h.p");
                    list.add("GLA 200 CDI / 2.1L / Diesel / 136h.p");
                    list.add("GLA 220 CDI / 2.1L / Diesel / 170h.p");
                    list.add("GLA 250 / 2.0L / Petrol / 211h.p");
                    list.add("GLA 45 AMG / 2.0L / Petrol / 360h.p");
                    ArrayAdapter<String> dataAdapter399 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter399.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter399.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter399);
                }
                if (model.contentEquals("GLA-CLASS")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Petrol / 181h.p");
                    list.add("2.2 / 2.2L / Diesel / 168h.p");
                    list.add("2.2 / 2.2L / Diesel / 134h.p");
                    ArrayAdapter<String> dataAdapter400 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter400.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter400.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter400);
                }
                if (model.contentEquals("GLC")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("220D / 2.1L / Diesel / 168h.p");
                    list.add("300 / 3.0L / Petrol / 241h.p");
                    list.add("300 / 3.0L / Petrol / 241h.p");
                    ArrayAdapter<String> dataAdapter401 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter401.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter401.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter401);
                }
                if (model.contentEquals("GL-CLASS (X164)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("GL 320 CDI / 3.0L / Diesel / 218h.p");
                    list.add("GL 350 CDI / 3.0L / Diesel / 231h.p");
                    list.add("GL 350 CDI / 3.0L / Diesel / 211h.p");
                    list.add("GL 350 CDI / 3.0L / Diesel / 265h.p");
                    list.add("GL 420 CDI / 4.0L / Diesel / 306h.p");
                    list.add("GL 450 / 4.7L / PetroL / 340h.p");
                    list.add("GL 550 / 5.5L / PetroL / 388h.p");
                    ArrayAdapter<String> dataAdapter402 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter402.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter402.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter402);
                }
                if (model.contentEquals("GL-CLASS (X166)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 / 3.0L / DieseL / 258h.p");
                    list.add("GL 350 BlueTec 4-matic / 3.0L / DieseL / 258h.p");
                    list.add("GL 400 4-matic / 3.0L / PetroL / 333h.p");
                    list.add("GL 450 / 4.7L / PetroL / 367h.p");
                    list.add("GL 500 / 4.7L / PetroL / 435h.p");
                    list.add("GL 63 AMG / 5.5L / PetroL / 552h.p");
                    ArrayAdapter<String> dataAdapter403 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter403.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter403.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter403);
                }
                if (model.contentEquals("GLE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("250 CDI / 2.1L / DieseL / 204h.p");
                    list.add("250D CDI / 3.0L / DieseL / 258h.p");
                    ArrayAdapter<String> dataAdapter404 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter404.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter404.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter404);
                }
                if (model.contentEquals("GLS")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("350 d / 3.0L / DieseL / 258h.p");
                    list.add("400 4MATIC / 3.0L / PetroL / 333h.p");
                    ArrayAdapter<String> dataAdapter405 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter405.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter405.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter405);
                }
                if (model.contentEquals("M-CLASS (W163) (1998 - 2005)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("MERCE M-CLASS (W163) ML 230 (163,136) / 2.3L / Pet");
                    list.add("MERCE M-CLASS (W163) ML 270 CDI(163,113) / 2.7L");
                    list.add("MERCE M-CLASS (W163) ML 270 CDI(163,113) / 2.7L /");
                    list.add("MERCE M-CLASS (W163) ML 320 (163,154) / 3.2L / Pet");
                    list.add("MERCE M-CLASS (W163) ML 350 / 3.7L / Petrol / 235h");
                    list.add("MERCE M-CLASS (W163) ML 350 / 3.7L / Petrol / 245h");
                    list.add("MERCE M-CLASS (W163) ML 350 4-matic / 3.7L / Petro \t");
                    list.add("MERCE M-CLASS (W163) ML 400 CDI (163,128) / 4.0L /");
                    list.add("MERCE M-CLASS (W163) ML 430 (163,172) / 4.3L / Pet \t");
                    list.add("MERCE M-CLASS (W163) ML 500 (163,175) / 5.0L / Pet");
                    list.add("MERCE M-CLASS (W163) ML 500 4-matic / 5.0L / Petro");
                    list.add("MERCE M-CLASS (W163) ML 55 AMG (163,174) / 5.4L / ");
                    list.add("MERCE M-CLASS (W164) ML 280 CDI 4-matic (164,120)");
                    list.add("MERCE M-CLASS (W164) ML 300 CDI 4-matic (164,120)");
                    list.add("MERCE M-CLASS (W164) ML 300 CDI 4-matic (164,121)");
                    list.add("MERCE M-CLASS (W164) ML 320 CDI 4-matic / 3.0L / D");
                    list.add("MERCE M-CLASS (W164) ML 320 CDI 4-matic (164,122)");
                    list.add("MERCE M-CLASS (W164) ML 350 CDI 4-matic  / 3.0L / ");
                    list.add("MERCE M-CLASS (W164) ML 350 CDI 4-matic(164,122) ");
                    list.add("MERCE M-CLASS (W164) ML 350 CDI 4-matic(164,125) ");
                    list.add("MERCE M-CLASS (W164) ML 420 CDI 4-matic(164,128)");
                    list.add("MERCE M-CLASS (W164) ML 450 CDI 4-matic(164,128)");
                    list.add("MERCE M-CLASS (W164) ML 450 CDI Hybrid 4-matic");
                    list.add("MERCE M-CLASS (W164) ML 500 4-matic  / 5.0L / Petr");
                    list.add("MERCE M-CLASS (W164) ML 500 4-matic  / 5.0L / Pet");
                    list.add("MERCE M-CLASS (W164) ML 500 4-matic (164,175)  / 5");
                    list.add("MERCE M-CLASS (W164) ML 550 (164,172)  / 5.5L / Pe");
                    list.add("MERCE M-CLASS (W164) ML 550 4-matic (164,177)  / 6");
                    ArrayAdapter<String> dataAdapter406 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter406.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter406.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter406);
                }
                if (model.contentEquals("M-CLASS (W164) (2005)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("ML 250 CDI BlueTEC 4-matic  / 2.1L / Diesel / 204h");
                    ArrayAdapter<String> dataAdapter407 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter407.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter407.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter407);
                }
                if (model.contentEquals("M-CLASS (W166)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.5 / 3.5L / Petrol / 272h.p");
                    ArrayAdapter<String> dataAdapter408 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter408.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter408.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter408);
                }
                if (model.contentEquals("R350")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.5 / 3.5L / Petrol / 272h.p");
                    ArrayAdapter<String> dataAdapter408 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter408.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter408.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter408);
                }
                if (model.contentEquals("S-CLASS (W220)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("280 / 2.8L / Petrol / 204h.p");
                    list.add("320 / 3.2L / Petrol / 224h.p");
                    list.add("320 CDI / 3.2L / Diesel / 197h.p");
                    list.add("320 CDI / 3.2L / Diesel / 204h.p");
                    list.add("350 / 3.7L / Petrol / 245h.p");
                    list.add("400 CDI / 4.0L / Diesel / 250h.p");
                    list.add("430 / 4.3L / Petrol / 279h.p");
                    ArrayAdapter<String> dataAdapter410 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter410.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter410.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter410);
                }
                if (model.contentEquals("S-CLASS (W222)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("320 / 3.0L / Petrol / 272h.p");
                    list.add("350BlueTEC / 3.0L / Diesel / 258h.p");
                    list.add("400 / 3.5L / Petrol / 333h.p");
                    list.add("500 / 4.7L / Petrol / 456h.p");

                    ArrayAdapter<String> dataAdapter411 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter411.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter411.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter411);
                }
                if (model.contentEquals("S-CLASS Coupe (C217)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("500 / 4.7L / Petrol / 456h.p");
                    list.add("63 AMG / 5.5L / Petrol / 585h.p");
                    ArrayAdapter<String> dataAdapter412 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter412.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter412.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter412);
                }
                if (model.contentEquals("SLC-43 AMG (R172)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("SLC-43 AMG / 3.0L / Petrol / 362h.p");
                    ArrayAdapter<String> dataAdapter413 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter413.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter413.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter413);
                }
                if (model.contentEquals("SLK (R171)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("200 / 1.8L / Petrol / 124h.p");
                    list.add("200 Kompressor/ 1.8L / Petrol / 163h.p");
                    list.add("200 Kompressor/ 1.8L / Petrol / 184h.p");
                    list.add("350 / 3.5L / Petrol / 305h.p");
                    list.add("55 AMG / 5.5L / Petrol / 360h.p");
                    list.add("55 AMG / 5.5L / Petrol / 400h.p");
                    ArrayAdapter<String> dataAdapter414 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter414.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter414.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter414);
                }
                if (model.contentEquals("SLK (R172)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("200 / 1.8L / Petrol / 184h.p");
                    list.add("250 / 1.8L / Petrol / 204h.p");
                    list.add("250 CDI / 2.1L / Diesel / 204h.p");
                    list.add("350 / 3.5L / Petrol / 306h.p");
                    list.add("55 AMG / 5.5L / Petrol / 422h.p");
                    ArrayAdapter<String> dataAdapter415 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter415.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter415.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter415);
                }
                if (model.contentEquals("F55")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("Cooper / 1.5L / Petrol / 136h.p");
                    list.add("Cooper D / 1.5L / Diesel / 116h.p");
                    list.add("Cooper S / 2.0L / Petrol / 192h.p");
                    list.add("Cooper SD / 2.0L / Diesel / 170h.p");
                    ArrayAdapter<String> dataAdapter416 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter416.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter416.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter416);
                }
                if (model.contentEquals("F56")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("Cooper / 1.5L / Petrol / 136h.p");
                    list.add("Cooper D/ 1.5L / Diesel / 116h.p");
                    list.add("Cooper S/ 2.0L / Petrol / 192h.p");
                    list.add("Cooper SD / 2.0L / Diesel / 170h.p");
                    list.add("One / 1.2L / Petrol / 102h.p");
                    list.add("One / 1.2L / Petrol / 75h.p");
                    list.add("One D / 1.5L / Diesel / 95h.p");
                    ArrayAdapter<String> dataAdapter416 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter416.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter416.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter416);
                }
                if (model.contentEquals("R56")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("Cooper S / 1.6L / Petrol / 200h.p");
                    ArrayAdapter<String> dataAdapter417 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter417.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter417.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter417);
                }
                if (model.contentEquals("Roadster (R59)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("Cooper / 1.6L / Petrol / 122h.p");
                    list.add("Cooper S / 1.6L / Petrol / 163h.p");
                    list.add("Cooper S / 1.6L / Petrol / 184h.p");
                    list.add("Cooper S / 1.6L / Petrol / 200h.p");
                    list.add("Cooper SD / 2.0L / Diesel / 143h.p");
                    list.add("John Cooper Works / 1.6L / Petrol / 211h.p");
                    ArrayAdapter<String> dataAdapter418 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter418.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter418.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter418);
                }
                if (model.contentEquals("COUNTRYMAN (R60)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("Cooper / 1.6L / Petrol / 120h.p");
                    list.add("Cooper D / 1.6L / Diesel / 112h.p");
                    list.add("Cooper D / 2.0L / Diesel / 112h.p");
                    list.add("Cooper S / 1.6L / Petrol / 184h.p");
                    list.add("Cooper S / 1.6L / Petrol / 163h.p");
                    list.add("Cooper S / 1.6L / Petrol / 200h.p");
                    list.add("Cooper S / 1.6L / Petrol / 190h.p");
                    list.add("Cooper SD / 2.0L / Diesel / 136h.p");
                    list.add("Cooper S JCW / 1.6L / Petrol / 218h.p");
                    list.add("One / 1.6L / Petrol / 98h.p");
                    list.add("One D / 1.6L / Diesel / 90h.p");
                    ArrayAdapter<String> dataAdapter419 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter419.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter419.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter419);
                }
                if (model.contentEquals("PACEMAN (R61)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.6 / 1.6L / Petrol / 120h.p");
                    list.add("Cooper S / 1.6L / Petrol / 190h.p");
                    ArrayAdapter<String> dataAdapter420 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter420.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter420.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter420);
                }
                if (model.contentEquals("CEDIA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0  4WD / 2.0L / Petrol / 290h.p.p");
                    list.add("2.0 / 2.0L / Diesel / 68h.p");
                    list.add("2.0 / 2.0L / Petrol / 115h.p");
                    list.add("2.0 / 2.0L / Petrol / 154h.p");
                    list.add("2.0 / 2.0L / Petrol / 280h.p");
                    list.add("2.0 / 2.0L / Petrol / 125h.p");
                    ArrayAdapter<String> dataAdapter421 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter421.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter421.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter421);
                }
                if (model.contentEquals("LANCER Mk VI")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 / 1.3L / Petrol / 75h.p");
                    list.add("1.8 / 1.8L / Petrol / 131h.p");
                    list.add("1.8 / 1.6L / Petrol / 205h.p");
                    ArrayAdapter<String> dataAdapter422 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter422.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter422.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter422);
                }
                if (model.contentEquals("LANCER EVOLUTION X")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Petrol / 294h.p");
                    ArrayAdapter<String> dataAdapter423 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter423.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter423.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter423);
                }
                if (model.contentEquals("MONTERO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.2 MT / 3.2L / Diesel / 167h.p");
                    ArrayAdapter<String> dataAdapter424 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter424.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter424.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter424);
                }
                if (model.contentEquals("Outlander XL")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.4 / 2.4L / Petrol / 178h.p");
                    ArrayAdapter<String> dataAdapter425 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter425.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter425.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter425);
                }
                if (model.contentEquals("OUTLANDER")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.4 / 2.4L / Diesel / 166h.p");
                    ArrayAdapter<String> dataAdapter426 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter426.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter426.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter426);
                }
                if (model.contentEquals("PAJERO SFX")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.8 / 2.8L / Diesel / 118h.p");
                    ArrayAdapter<String> dataAdapter427 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter427.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter427.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter427);
                }
                if (model.contentEquals("PAJERO SPORT")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5 / 2.5L / Diesel / 178h.p");
                    ArrayAdapter<String> dataAdapter428 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter428.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter428.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter428);
                }
                if (model.contentEquals("EVALIA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5 / 1.5L / Diesel / 86h.p");

                    ArrayAdapter<String> dataAdapter429 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter429.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter429.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter429);
                }
                if (model.contentEquals("GT-R (R35) (2008)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("NISSA GT-R(R35) 3.8 V6 / 3.8L / Petrol / 480h.p");

                    ArrayAdapter<String> dataAdapter430 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter430.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter430.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter430);
                }
                if (model.contentEquals("MICRA (K13K)(2010-2013)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 76h.p");
                    list.add("1.5 / 1.5L / Diesel / 64h.p");
                    ArrayAdapter<String> dataAdapter431 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter431.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter431.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter431);
                }
                if (model.contentEquals("MICRA (K13K)(2013-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 76h.p");
                    list.add("1.5 / 1.5L / Diesel / 64h.p");
                    ArrayAdapter<String> dataAdapter432 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter432.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter432.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter432);
                }
                if (model.contentEquals("MICRA ACTIVE (MK13K/MK13KK)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / petrol / 76h.p");
                    ArrayAdapter<String> dataAdapter433 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter433.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter433.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter433);
                }
                if (model.contentEquals("MICRA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / petrol / 75h.p");
                    list.add("1.5 / 1.5L / Diesel / 62h.p");
                    ArrayAdapter<String> dataAdapter434 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter434.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter434.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter434);
                }
                if (model.contentEquals("SUNNY (N17K)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5 / 1.5L / Diesel / 86h.p");
                    list.add("1.5 / 1.5L / Petrol / 99h.p");
                    list.add("1.5 / 1.5L / Diesel / 86h.p");
                    list.add("1.5 / 1.5L / Petrol / 99h.p");
                    list.add("1.5 / 1.5L / Diesel / 86h.p");
                    ArrayAdapter<String> dataAdapter435 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter435.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter435.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter435);
                }
                if (model.contentEquals("SUNNY (N17KK)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5 / 1.5L / Diesel / 86h.p");
                    list.add("1.5 / 1.5L / Petrol / 99h.p");
                    ArrayAdapter<String> dataAdapter436 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter436.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter436.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter436);
                }
                if (model.contentEquals("TEANA (J31)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.3(230JM) / 2.3L / Petrol / 173h.p");
                    ArrayAdapter<String> dataAdapter437 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter437.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter437.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter437);
                }
                if (model.contentEquals("TEANA (J32/J32K)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5(250XV-J32) / 2.5L / Petrol / 180h.p");
                    list.add("2.5(250XV-J32K) / 2.5L / Petrol / 180h.p");
                    ArrayAdapter<String> dataAdapter438 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter438.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter438.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter438);
                }
                if (model.contentEquals("TERRANO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5 XE /XL Plus / 1.5L / Diesel / 85h.p");
                    list.add("1.6 XL / 1.6L / Petrol / 104h.p");
                    list.add("1.5 XV Premium / 1.5L / Diesel / 110h.p");
                    ArrayAdapter<String> dataAdapter439 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter439.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter439.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter439);
                }
                if (model.contentEquals("X-TRAIL (T31)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 dCi / 2.0L / Diesel / 177h.p");
                    ArrayAdapter<String> dataAdapter440 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter440.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter440.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter440);
                }
                if (model.contentEquals("X-TRAIL (T30) (2001 - 2005)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2 / 2.2L / Diesel / 114h.p");
                    ArrayAdapter<String> dataAdapter441 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter441.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter441.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter441);
                }
                if (model.contentEquals("DUSTER(2012-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5 dci(HSAF)/ 1.5L / Diesel / 109h.p");
                    list.add("1.5 dci(HSM3)/ 1.5L / Diesel / 110h.p");
                    list.add("1.5 dci(HSMW)/ 1.5L / Diesel / 86h.p");
                    list.add("1.6(HSA8)/ 1.6L / Petrol / 110h.p");
                    ArrayAdapter<String> dataAdapter443 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter443.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter443.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter443);
                }
                if (model.contentEquals("DUSTER(2017-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5/ 1.5L / Petrol / 104.5h.p");
                    list.add("1.5/ 1.5L / Diesel / 83.8h.p");
                    list.add("1.5/ 1.5L / Diesel / 108.4h.p");
                    ArrayAdapter<String> dataAdapter442 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter442.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter442.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter442);
                }
                if (model.contentEquals("FLUENCE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5 dCi (L30B) / 1.5L / Diesel / 106h.p");
                    list.add("1.5 dCi (L333) / 1.5L / Diesel / 95h.p");
                    list.add("2.0 16V (L30T) / 2.0L / Petrol / 140h.p");
                    ArrayAdapter<String> dataAdapter444 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter444.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter444.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter444);
                }
                if (model.contentEquals("KOLEOS")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 (HYOK) / 2.0L / Diesel / 150h.p");
                    list.add("2.0 (HYOL) / 2.0L / Diesel / 173h.p");
                    ArrayAdapter<String> dataAdapter445 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter445.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter445.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter445);
                }
                if (model.contentEquals("KWID")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.8 sCe  / 0.8L / Petrol / 54h.p");
                    list.add("1.0 sCe  / 1.0L / Petrol / 63h.p");
                    ArrayAdapter<String> dataAdapter446 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter446.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter446.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter446);
                }
                if (model.contentEquals("LODGY")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5(JSAF)  / 1.5L / Diesel / 110h.p");
                    list.add("1.5(JSMW)  / 1.5L / Diesel / 85h.p");
                    ArrayAdapter<String> dataAdapter447 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter447.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter447.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter447);
                }
                if (model.contentEquals("LOGAN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4(LS12/LSOC)  / 1.4L / Petrol / 76h.p");
                    list.add("1.5 dCi (LSOO)  / 1.5L / Diesel / 65h.p");
                    list.add("1.5 dCi (LSOK)  / 1.5L / Diesel / 66h.p");
                    list.add("1.5 CNG (LSOD/LS11)  / 1.6L / Petrol / 86h.p");
                    ArrayAdapter<String> dataAdapter448 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter448.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter448.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter448);
                }
                if (model.contentEquals("LOGAN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4(LS12/LSOC)  / 1.4L / Petrol / 76h.p");
                    list.add("1.5 dCi (LSOO)  / 1.5L / Diesel / 65h.p");
                    list.add("1.5 dCi (LSOK)  / 1.5L / Diesel / 66h.p");
                    list.add("1.5 CNG (LSOD/LS11)  / 1.6L / Petrol / 86h.p");
                    ArrayAdapter<String> dataAdapter449 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter449.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter449.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter449);
                }
                if (model.contentEquals("PULSE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 (BDMC)  / 1.2L / Petrol / 76h.p");
                    list.add("1.5 (BDMD)  / 1.5L / Diesel / 64h.p");
                    ArrayAdapter<String> dataAdapter450 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter450.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter450.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter450);
                }
                if (model.contentEquals("SCALA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5 dCi (LJMD)  / 1.5L / Diesel / 86h.p");
                    list.add("1.5 (LJMA)  / 1.5L / Petrol / 99h.p");
                    ArrayAdapter<String> dataAdapter451 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter451.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter451.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter451);
                }

                mymethod();

            }

            private void mymethod() {

                String model = String.valueOf(s3.getSelectedItem());

                if (model.contentEquals("FABIA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 60h.p");
                    list.add("1.2 / 1.2L / Petrol / 70h.p");
                    list.add("1.2 / 1.2L / Petrol / 105h.p");
                    list.add("1.2 / 1.2L / Petrol / 86h.p");
                    list.add("1.2 / 1.2L / Diesel / 75h.p");
                    list.add("1.2 / 1.2L / Petrol / 75h.p");
                    list.add("1.2 / 1.2L / Petrol / 60h.p");
                    list.add("1.4 / 1.4L / Petrol / 86h.p");
                    list.add("1.4 / 1.4L / Diesel / 80h.p");
                    list.add("1.4 / 1.4L / Diesel / 70h.p");
                    list.add("1.4 / 1.4L / Petrol / 180h.p");
                    list.add("1.6 / 1.6L / Petrol / 105h.p");
                    list.add("1.6 / 1.6L / Diesel / 90h.p");
                    list.add("1.6 / 1.6L / Diesel / 105h.p");
                    list.add("1.6 / 1.6L / Diesel / 75h.p");
                    list.add("1.9 / 1.9L / Diesel / 105h.p");
                    ArrayAdapter<String> dataAdapter452 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter452.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter452.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter452);
                }
                if (model.contentEquals("LAURA (1Z3)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.8 / 1.8L / Petrol / 160h.p");
                    list.add("1.8 / 1.8L / Petrol / 152h.p");
                    list.add("1.9 / 1.9L / Diesel / 105h.p");
                    list.add("2.0 / 2.0L / Diesel / 140h.p");
                    list.add("2.0 / 2.0L / Petrol / 150h.p");
                    list.add("2.0 / 2.0L / Petrol / 150h.p");
                    list.add("2.0 / 2.0L / Diesel / 140h.p");
                    ArrayAdapter<String> dataAdapter453 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter453.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter453.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter453);
                }
                if (model.contentEquals("OCTAVIA (1U2)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.8 / 1.8L / Petrol / 180h.p");
                    list.add("1.8 4X4 / 1.8L / Petrol / 150h.p");
                    list.add("1.9 / 1.9L / Diesel / 130h.p");
                    list.add("1.9 / 1.9L / Diesel / 100h.p");
                    list.add("2.0 / 2.0L / Petrol / 116h.p");
                    ArrayAdapter<String> dataAdapter454 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter454.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter454.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter454);
                }
                if (model.contentEquals("OCTAVIA (5E3)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.8 / 1.8L / Petrol / 180h.p");
                    list.add("2.0 / 2.0L / Diesel / 143h.p");
                    list.add("2.0 / 2.0L / Petrol / 220h.p");
                    list.add("2.0 / 2.0L / Diesel / 184h.p");
                    ArrayAdapter<String> dataAdapter455 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter455.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter455.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter455);
                }
                if (model.contentEquals("OCTAVIA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Petrol / 148h.p");
                    list.add("1.8 / 1.8L / Petrol / 177h.p");
                    list.add("2.0 / 2.0L / Diesel / 141h.p");
                    ArrayAdapter<String> dataAdapter456 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter456.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter456.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter456);
                }
                if (model.contentEquals("RAPID (NA2)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.6 / 1.6L / Diesel / 105h.p");
                    list.add("1.6 / 1.6L / Petrol / 105h.p");
                    ArrayAdapter<String> dataAdapter457 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter457.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter457.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter457);
                }
                if (model.contentEquals("RAPID")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.5 / 1.5L / Diesel / 109h.p");
                    list.add("1.6 / 1.6L / Petrol / 104h.p");
                    ArrayAdapter<String> dataAdapter458 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter458.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter458.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter458);
                }
                if (model.contentEquals("SUPERB Saloon (3U4)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.9 / 1.9L / Diesel / 105h.p");
                    list.add("1.9 / 1.9L / Diesel / 115h.p");
                    list.add("2.0 / 2.0L / Diesel / 140h.p");
                    list.add("2.0 / 2.0L / Petrol / 124h.p");
                    list.add("2.5 / 2.5L / Diesel / 163h.p");
                    list.add("2.8 V6 / 2.8L / Petrol / 194h.p");
                    ArrayAdapter<String> dataAdapter459 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter459.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter459.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter459);
                }
                if (model.contentEquals("SUPERB (3T4)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.8 / 1.8L / Petrol / 160h.p");
                    list.add("1.8 / 1.8L / Petrol / 160h.p");
                    list.add("1.9 / 1.9L / Diesel / 105h.p");
                    list.add("2.0 / 2.0L / Diesel / 170h.p");
                    list.add("2.0 / 2.0L / Diesel / 140h.p");
                    list.add("2.0 / 2.0L / Petrol / 200h.p");
                    list.add("3.6 4X4 / 3.6L / Petrol / 260h.p");
                    ArrayAdapter<String> dataAdapter460 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter460.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter460.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter460);
                }
                if (model.contentEquals("SUPERB")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.8 TSI AT / 1.8L / Petrol / 178h.p");
                    list.add("1.8 TSI MT / 1.8L / Petrol / 178h.p");
                    list.add("2.0 TDI AT / 2.0L / Diesel / 174.5h.p");
                    list.add("1.2 / 1.2L / Petrol / 105h.p");
                    list.add("1.4 / 1.4L / Petrol / 122h.p");
                    list.add("1.6 / 1.6L / Diesel / 105h.p");
                    list.add("1.8 / 1.8L / Petrol / 160h.p");
                    list.add("1.8 / 1.8L / Petrol / 160h.p");
                    list.add("1.8 4X4 / 1.8L / Petrol / 152h.p");
                    list.add("2.0 / 2.0L / Diesel / 110h.p");
                    list.add("2.0 / 2.0L / Diesel / 140h.p");
                    list.add("2.0 4X4 / 2.0L / Diesel / 170h.p");
                    list.add("2.0 4X4 / 2.0L / Diesel / 140h.p");
                    ArrayAdapter<String> dataAdapter461 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter461.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter461.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter461);
                }
                if (model.contentEquals("YETI (5L)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.8 TSI AT / 1.8L / Petrol / 178h.p");
                    list.add("1.8 TSI MT / 1.8L / Petrol / 178h.p");
                    list.add("2.0 TDI AT / 2.0L / Diesel / 174.5h.p");
                    list.add("1.2 / 1.2L / Petrol / 105h.p");
                    list.add("1.4 / 1.4L / Petrol / 122h.p");
                    list.add("1.6 / 1.6L / Diesel / 105h.p");
                    list.add("1.8 / 1.8L / Petrol / 160h.p");
                    list.add("1.8 / 1.8L / Petrol / 160h.p");
                    list.add("1.8 4X4 / 1.8L / Petrol / 152h.p");
                    list.add("2.0 / 2.0L / Diesel / 110h.p");
                    list.add("2.0 / 2.0L / Diesel / 140h.p");
                    list.add("2.0 4X4 / 2.0L / Diesel / 170h.p");
                    list.add("2.0 4X4 / 2.0L / Diesel / 140h.p");
                    ArrayAdapter<String> dataAdapter461 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter461.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter461.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter461);
                }
                if (model.contentEquals("207")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 / 3.0L / Diesel / 65h.p");
                    list.add("3.0 / 3.0L / Diesel / 61h.p");
                    ArrayAdapter<String> dataAdapter462 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter462.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter462.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter462);
                }
                if (model.contentEquals("ACE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.7 / 0.7L / Diesel / 16h.p");
                    ArrayAdapter<String> dataAdapter463 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter463.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter463.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter463);
                }
                if (model.contentEquals("SUPER ACE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Diesel / 70h.p");
                    ArrayAdapter<String> dataAdapter464 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter464.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter464.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter464);
                }
                if (model.contentEquals("ACE ZIP")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.6 / 0.6L / Diesel / 11h.p");
                    ArrayAdapter<String> dataAdapter465 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter465.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter465.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter465);
                }
                if (model.contentEquals("ACE REFRESH")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("CNG / 0.7L / Diesel / 21h.p");
                    list.add("DICOR / 0.8L / Diesel / 21h.p");
                    list.add("DICOR TURBO / 0.8L / Diesel / 40h.p");
                    list.add("REFRESH / 0.7L / Diesel / 16h.p");
                    ArrayAdapter<String> dataAdapter466 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter466.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter466.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter466);
                }
                if (model.contentEquals("ARIA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2 4WD BSIII / 2.2L / Diesel / 138h.p");
                    list.add("2.2 4WD BSIV / 2.2L / Diesel / 138h.p");
                    list.add("2.2  BSIII / 2.2L / Diesel / 138h.p");
                    list.add("2.2  BSIV / 2.2L / Diesel / 138h.p");
                    ArrayAdapter<String> dataAdapter467 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter467.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter467.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter467);
                }
                if (model.contentEquals("ARIA LET")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2 / 2.2L / Diesel / 147h.p");
                    list.add("2.2 4WD / 2.2L / Diesel / 147h.p");
                    ArrayAdapter<String> dataAdapter468 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter468.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter468.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter468);
                }
                if (model.contentEquals("BOLT")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 90h.p");
                    list.add("1.3 / 1.3L / Diesel / 75h.p");
                    ArrayAdapter<String> dataAdapter468 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter468.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter468.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter468);
                }
                if (model.contentEquals("HEXA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2 / 2.2L / Diesel / 153.8h.p");
                    list.add("2.2 / 2.2L / Diesel / 147.9h.p");
                    ArrayAdapter<String> dataAdapter469 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter469.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter469.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter469);
                }
                if (model.contentEquals("INDICA V2 XETA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 BSIII / 1.2L / Petrol / 65h.p");
                    list.add("1.4 BSIII / 1.4L / Petrol / 70h.p");
                    list.add("E-MAX / 1.2L / Petrol / 63h.p");
                    list.add("E-MAX / 1.2L / Petrol / 56h.p");
                    list.add("E-MAX IV / 1.2L / Petrol / 62h.p");
                    ArrayAdapter<String> dataAdapter470 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter470.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter470.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter470);
                }
                if (model.contentEquals("INDICA EV2")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 BSIII / 1.4L / Diesel / 48h.pp");
                    list.add("1.4 BSIV / 1.4L / Diesel / 69h.p");
                    ArrayAdapter<String> dataAdapter471 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter471.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter471.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter471);
                }
                if (model.contentEquals("INDICA V2")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 BSII / 1.4L / Diesel / 53h.p");
                    list.add("1.4 DiCOR / 1.4L / Diesel / 70h.p");
                    list.add("1.4 DiCOR REFRESHED / 1.4L / Diesel / 70h.p");
                    list.add("1.4 REFRESHED / 1.4L / Diesel / 70h.p");
                    list.add("1.4 TURBO / 1.4L / Diesel / 67h.p");
                    list.add("1.4 TURBOMAX / 1.4L / Diesel / 70h.p");
                    ArrayAdapter<String> dataAdapter472 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter472.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter472.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter472);
                }
                if (model.contentEquals("INDICA VISTA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 65h.p");
                    list.add("1.2 BSIII / 1.2L / Petrol / 65h.p");
                    list.add("1.2 BSIV / 1.2L / Petrol / 65h.p");
                    list.add("1.3 / 1.3L / Diesel / 75h.p");
                    list.add("1.3 BSIII / 1.3L / Diesel / 75h.p");
                    list.add("1.3 BSIV / 1.3L / Diesel / 75h.p");
                    list.add("1.4 / 1.4L / Diesel / 71h.p");
                    list.add("1.4 / 1.4L / Petrol / 86h.p");
                    list.add("1.4 BSIII / 1.4L / Diesel / 70h.p");
                    list.add("1.4 BSIV / 1.4L / Petrol / 90h.p");
                    ArrayAdapter<String> dataAdapter473 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter473.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter473.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter473);
                }
                if (model.contentEquals("INDICA VISTA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 BSIV / 1.2L / Petrol / 65h.p");
                    list.add("1.3 BSIV / 1.3L / Diesel / 75h.p");
                    list.add("1.3 BSIV / 1.3L / Diesel / 90h.p");
                    list.add("1.4 BSIII / 1.4L / Diesel / 70h.p");
                    list.add("1.3 BSIII / 1.3L / Diesel / 75h.p");
                    list.add("1.4 BSIV / 1.4L / Petrol / 90h.p");
                    ArrayAdapter<String> dataAdapter474 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter474.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter474.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter474);
                }
                if (model.contentEquals("INDICA VISTA TECH")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 / 1.3L / Diesel / 75h.p");
                    list.add("1.4 / 1.4L / Diesel / 70h.p");
                    ArrayAdapter<String> dataAdapter475 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter475.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter475.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter475);
                }
                if (model.contentEquals("INDIGO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 BS3 / 1.3L / Diesel / 90h.p");
                    list.add("1.4 / 1.4L / Petrol / 85h.p");
                    list.add("1.4 / 1.4L / Diesel / 70h.p");
                    list.add("1.4 BS3/ 1.4L / Petrol / 90h.p");
                    list.add("1.4 BS4 / 1.4L / Petrol / 90h.p");
                    ArrayAdapter<String> dataAdapter476 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter476.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter476.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter476);
                }
                if (model.contentEquals("INDIGO XL")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Diesel / 70h.p");
                    list.add("1.4 / 1.4L / Petrol / 101h.p");
                    list.add("1.4 / 1.4L / Diesel / 70h.p");
                    list.add("1.4 CNG / 1.4L / Petrol / 84h.p");
                    ArrayAdapter<String> dataAdapter477 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter477.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter477.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter477);
                }
                if (model.contentEquals("INDIGO CS")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 65h.p");
                    list.add("1.4 / 1.4L / Diesel / 70h.p");
                    ArrayAdapter<String> dataAdapter478 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter478.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter478.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter478);
                }
                if (model.contentEquals("INDIGO eCS")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 55h.p");
                    list.add("1.2 / 1.2L / Petrol / 65h.p");
                    list.add("1.4 / 1.4L / Diesel / 70h.p");
                    ArrayAdapter<String> dataAdapter479 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter479.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter479.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter479);
                }
                if (model.contentEquals("INDIGO MARINA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Petrol / 84h.p");
                    list.add("1.4 DiCOR/ 1.4L / Diesel / 70h.p");
                    list.add("1.4 MPFI / 1.4L / Petrol / 85h.p");
                    list.add("1.4 TCIC / 1.4L / Diesel / 70h.p");
                    ArrayAdapter<String> dataAdapter480 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter480.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter480.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter480);
                }
                if (model.contentEquals("MAGIC")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.6 / 0.6L / Diesel / 11h.p");
                    list.add("0.7 / 0.7L / Diesel / 21h.p");
                    list.add("0.7 CNG / 0.7L / Petrol / 28h.p");
                    ArrayAdapter<String> dataAdapter481 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter481.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter481.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter481);
                }
                if (model.contentEquals("MAGIC IRIS (2007")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.6 / 0.6L / Diesel / 11h.p");
                    list.add("0.7 / 0.7L / Diesel / 21h.p");
                    list.add("0.7 CNG / 0.7L / Petrol / 28h.p");
                    ArrayAdapter<String> dataAdapter482 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter482.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter482.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter482);
                }
                if (model.contentEquals("MANZA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 / 1.3L / Diesel / 90h.p");
                    list.add("1.3 / 1.3L / Diesel / 89h.p");
                    list.add("1.3 CELEBRATION / 1.3L / Diesel / 89h.p");
                    list.add("1.4 / 1.4L / Petrol / 89h.p");
                    list.add("1.4 / 1.4L / Petrol / 89h.p");
                    list.add("1.4 CELEBRATION / 1.4L / Petrol / 89h.p");
                    ArrayAdapter<String> dataAdapter483 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter483.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter483.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter483);
                }
                if (model.contentEquals("MANZA CLUB CLASS")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.3 / 1.3L / Diesel / 89h.p");
                    list.add("1.4 / 1.4L / Petrol / 89h.p");
                    ArrayAdapter<String> dataAdapter484 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter484.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter484.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter484);
                }
                if (model.contentEquals("MOVUS")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2 / 2.2L / Diesel / 120h.p");
                    ArrayAdapter<String> dataAdapter485 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter485.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter485.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter485);
                }
                if (model.contentEquals("NANO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.6 / 0.6L / Petrol / 38h.p");
                    list.add("0.6 CNG / 0.6L / Petrol / 38h.p");
                    ArrayAdapter<String> dataAdapter486 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter486.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter486.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter486);
                }
                if (model.contentEquals("NANO TWIST")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.6  / 0.6L / Petrol / 38h.p");
                    ArrayAdapter<String> dataAdapter487 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter487.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter487.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter487);
                }
                if (model.contentEquals("NANO Gen X")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("0.6 FTG / 0.6L / Petrol / 38h.p");
                    list.add("0.6 OTG / 0.6L / Petrol / 38h.p");
                    ArrayAdapter<String> dataAdapter488 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter488.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter488.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter488);
                }
                if (model.contentEquals("SAFARI DiCOR")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2 / 2.2L / Diesel / 140h.p");
                    list.add("2.2 4WD / 2.2L / Diesel / 140h.p");
                    ArrayAdapter<String> dataAdapter490 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter490.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter490.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter490);
                }
                if (model.contentEquals("SAFARI DiCOR F/L")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2 / 2.2L / Diesel / 140h.p");
                    list.add("4.7 V8 / 4.7L / Petrol / 275h.p");
                    ArrayAdapter<String> dataAdapter491 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter491.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter491.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter491);
                }
                if (model.contentEquals("SAFARI STORME LET")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 / 3.0L / Diesel / 133h.p");
                    list.add("4.0 / 4.0L / Petrol / 276h.p");
                    ArrayAdapter<String> dataAdapter491 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter491.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter491.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter491);
                }
                if (model.contentEquals("SUMO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Diesel / 68h.p");
                    list.add("3.0 / 3.0L / Diesel / 65h.p");
                    ArrayAdapter<String> dataAdapter492 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter492.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter492.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter492);
                }
                if (model.contentEquals("SPACIO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 / 3.0L / Diesel / 65h.p");
                    list.add("3.0 / 3.0L / Diesel / 71h.p");
                    ArrayAdapter<String> dataAdapter493 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter493.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter493.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter493);
                }
                if (model.contentEquals("SUMO VICTA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 / 3.0L / Diesel / 69h.p");
                    ArrayAdapter<String> dataAdapter494 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter494.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter494.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter494);
                }
                if (model.contentEquals("SUMO GOLD")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 / 3.0L / Diesel / 84h.p");
                    list.add("3.0 / 3.0L / Diesel / 70h.p");
                    list.add("3.0 / 3.0L / Diesel / 84h.p");
                    ArrayAdapter<String> dataAdapter495 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter495.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter495.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter495);
                }
                if (model.contentEquals("SUMO GRANDE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Diesel / 90h.p");
                    list.add("2.2 / 2.2L / Diesel / 120h.p");
                    list.add("2.2 / 2.2L / Diesel / 120h.p");
                    ArrayAdapter<String> dataAdapter496 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter496.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter496.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter496);
                }
                if (model.contentEquals("TELCOLINE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 4WD / 2.0L / Diesel / 87h.p");
                    ArrayAdapter<String> dataAdapter497 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter497.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter497.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter497);
                }
                if (model.contentEquals("TIAGO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.1 / 1.1L / Diesel / 69h.p");
                    list.add("1.2 / 1.2L / Petrol / 84h.p");
                    ArrayAdapter<String> dataAdapter498 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter498.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter498.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter498);
                }
                if (model.contentEquals("TIGOR")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 84h.p");
                    list.add("1.5 / 1.5L / Diesel / 69h.p");
                    ArrayAdapter<String> dataAdapter498 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter498.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter498.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter498);
                }
                if (model.contentEquals("VENTURE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Diesel / 71h.p");
                    list.add("1.4 NA / 1.4L / Diesel / 71h.p");
                    ArrayAdapter<String> dataAdapter499 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter499.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter499.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter499);
                }
                if (model.contentEquals("WINGER")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Diesel / 65h.p");
                    list.add("2.0 TCIC / 2.0L / Diesel / 90h.p");
                    ArrayAdapter<String> dataAdapter500 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter500.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter500.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter500);
                }
                if (model.contentEquals("XENON XT")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2 / 2.2L / Diesel / 140h.p");
                    list.add("2.2 4X4 / 2.2L / Diesel / 140h.p");
                    ArrayAdapter<String> dataAdapter501 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter501.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter501.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter501);
                }
                if (model.contentEquals("XENON")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 / 3.0L / Diesel / 140h.p");
                    list.add("3.0 4SP TC BSIII / 3.0L / Diesel / 72h.p");
                    list.add("3.0 4SP TC BSIII / 3.0L / Diesel / 72h.p");
                    ArrayAdapter<String> dataAdapter502 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter502.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter502.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter502);
                }
                if (model.contentEquals("ZEST")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 89h.p");
                    list.add("1.3 / 1.3L / Diesel / 74h.p");
                    list.add("1.3 / 1.3L / Diesel / 89h.p");
                    ArrayAdapter<String> dataAdapter503 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter503.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter503.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter503);
                }
                if (model.contentEquals("CAMRY XV30")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Petrol / 150h.p");
                    list.add("2.4 / 2.4L / Petrol / 152h.p");
                    list.add("3.0 / 3.0L / Petrol / 186h.p");
                    ArrayAdapter<String> dataAdapter504 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter504.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter504.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter504);
                }
                if (model.contentEquals("CAMRY XV40")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.4 / 2.4L / Petrol / 167h.p");
                    list.add("3.5 / 3.5L / Petrol / 272h.p");
                    ArrayAdapter<String> dataAdapter505 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter505.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter505.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter505);
                }
                if (model.contentEquals("CAMRY XV50")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5 / 2.5L / Petrol / 184h.p");
                    list.add("2.5 / 2.5L / Hybrid / 160h.p");
                    ArrayAdapter<String> dataAdapter506 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter506.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter506.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter506);
                }
                if (model.contentEquals("COROLLA E120 (IX gen)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.8 / 1.8L / Petrol / 125h.p");
                    ArrayAdapter<String> dataAdapter507 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter507.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter507.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter507);
                }
                if (model.contentEquals("COROLLA ALTIS E140 (X gen)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Diesel / 90h.p");
                    list.add("1.8 / 1.8L / Petrol / 132h.p");
                    list.add("1.8 / 1.8L / Petrol / 140h.p");
                    ArrayAdapter<String> dataAdapter508 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter508.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter508.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter508);
                }
                if (model.contentEquals("ETIOS")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Diesel / 90h.p");
                    list.add("1.8 / 1.8L / Petrol / 140h.p");
                    ArrayAdapter<String> dataAdapter509 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter509.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter509.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter509);
                }
                if (model.contentEquals("ETIOS LIVA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 80h.p");
                    list.add("1.4 / 1.4L / Diesel / 68h.p");
                    list.add("1.5 / 1.5L / Petrol / 92h.p");
                    ArrayAdapter<String> dataAdapter510 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter510.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter510.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter510);
                }
                if (model.contentEquals("ETIOS CROSS")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 80h.p");
                    list.add("1.4 / 1.4L / Diesel / 68h.p");
                    list.add("1.5 / 1.5L / Petrol / 90h.p");
                    ArrayAdapter<String> dataAdapter511 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter511.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter511.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter511);
                }
                if (model.contentEquals("PLATINUM ETIOS")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Diesel / 67.05h.p");
                    list.add("1.5 / 1.5L / Petrol / 88.7h.p");
                    ArrayAdapter<String> dataAdapter512 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter512.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter512.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter512);
                }
                if (model.contentEquals("ETIOS LIVA F/L")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 79h.p");
                    list.add("1.4 / 1.4L / Diesel / 67h.p");
                    ArrayAdapter<String> dataAdapter513 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter513.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter513.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter513);

                }
                if (model.contentEquals("FORTUNER 1st GEN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 4WD / 3.0L / Diesel / 171h.p");
                    ArrayAdapter<String> dataAdapter514 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter514.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter514.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter514);
                }
                if (model.contentEquals("FORTUNER 1st GEN F/L")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.5 / 2.5L / Diesel / 144h.p");
                    list.add("3.0 2WD / 3.0L / Diesel / 171h.p");
                    list.add("3.0 AT / 3.0L / Diesel / 171h.p");
                    ArrayAdapter<String> dataAdapter515 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter515.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter515.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter515);
                }
                if (model.contentEquals("INNOVA(2005-2012)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Petrol / 136h.p");
                    list.add("2.5 / 2.5L / Diesel / 102h.p");
                    ArrayAdapter<String> dataAdapter516 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter516.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter516.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter516);
                }
                if (model.contentEquals("INNOVA(2012-2015)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Petrol / 136h.p");
                    list.add("2.5 / 2.5L / Diesel / 102h.p");
                    ArrayAdapter<String> dataAdapter517 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter517.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter517.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter517);
                }
                if (model.contentEquals("INNOVA CRYSTA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.4 / 2.4L / Diesel / 148h.p");
                    list.add("2.7 / 2.7L / Petrol / 164h.p");
                    list.add("2.8 / 2.8L / Diesel / 172h.p");
                    ArrayAdapter<String> dataAdapter518 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter518.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter518.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter518);
                }
                if (model.contentEquals("LAND CRUISER J100")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("4.2 / 4.2L / Diesel / 204h.p");
                    list.add("4.7 / 4.7L / Petrol / 235h.p");
                    list.add("4.7 / 4.7L / Petrol / 238h.p");
                    ArrayAdapter<String> dataAdapter519 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter519.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter519.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter519);
                }
                if (model.contentEquals("LAND CRUISER J200(2007-2015)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("4.5 / 4.5L / Diesel / 265h.p");
                    list.add("4.7 V8 / 4.7L / Petrol / 275h.p");
                    ArrayAdapter<String> dataAdapter520 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter520.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter520.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter520);
                }
                if (model.contentEquals("LAND CRUISER J200(2012-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 / 3.0L / Diesel / 133h.p");
                    list.add("4.0 / 4.0L / Petrol / 276h.p");
                    ArrayAdapter<String> dataAdapter521 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter521.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter521.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter521);
                }
                if (model.contentEquals("LAND CRUISER PRADO J120")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 / 3.0L / Diesel / 133h.p");
                    list.add("4.0 / 4.0L / Petrol / 276h.p");
                    ArrayAdapter<String> dataAdapter522 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter522.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter522.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter522);
                }
                if (model.contentEquals("LAND CRUISER PRADO J150(2009-2015)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 / 3.0L / Diesel / 173h.p");
                    ArrayAdapter<String> dataAdapter523 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter523.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter523.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter523);
                }
                if (model.contentEquals("LAND CRUISER PRADO J150(2013-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 / 3.0L / Diesel / 173h.p");
                    ArrayAdapter<String> dataAdapter524 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter524.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter524.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter524);
                }
                if (model.contentEquals("PRIUS(2012-2015)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.8 / 1.8L / Hybrid / 178h.p");
                    ArrayAdapter<String> dataAdapter525 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter525.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter525.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter525);
                }
                if (model.contentEquals("PRIUS(2017-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.8 / 1.8L / Petrol / 97.8h.p");
                    ArrayAdapter<String> dataAdapter526 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter526.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter526.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter526);
                }
                if (model.contentEquals("S60(2011-2015)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.4 / 2.4L / Diesel / 205h.p");
                    list.add("D3/D4/D5 2.0  / 2.0L / Diesel / 163h.p");
                    list.add("D4 2.0  / 2.0L / Diesel / 181h.p");
                    list.add("D5 2.4  / 2.4L / Diesel / 251h.p");
                    ArrayAdapter<String> dataAdapter527 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter527.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter527.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter527);
                }
                if (model.contentEquals("S60 Cross Country")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("D4 AWD 2.4  / 2.4L / Diesel / 187h.p");
                    ArrayAdapter<String> dataAdapter528 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter528.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter528.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter528);
                }
                if (model.contentEquals("S60(2016-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("D4 2.0  / 2.0L / Diesel / 187h.p");
                    list.add("T6 2.0  / 2.0L / Petrol / 306h.p");
                    ArrayAdapter<String> dataAdapter529 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter529.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter529.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter529);
                }
                if (model.contentEquals("S80(1999-2006)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.4  / 2.4L / Petrol / 140h.p");
                    list.add("3.0  / 3.0L / Petrol / 196h.p");
                    ArrayAdapter<String> dataAdapter530 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter530.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter530.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter530);
                }
                if (model.contentEquals("S80(2007-2015)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0  / 2.0L / Diesel / 163h.p");
                    list.add("D5 2.4  / 2.4L / Diesel / 205h.p");
                    list.add("D5 2.4  / 2.4L / Diesel / 215h.p");
                    list.add("V8 AWD 4.4  / 4.4L / Petrol / 316h.p");
                    ArrayAdapter<String> dataAdapter531 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter531.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter531.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter531);
                }
                if (model.contentEquals("S90")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("D4 2.0  / 2.0L / Diesel / 190h.p");
                    ArrayAdapter<String> dataAdapter532 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter532.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter532.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter532);
                }
                if (model.contentEquals("V40 Cross Country")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("D3 2.0  / 2.0L / Diesel / 150h.p");
                    list.add("D3 2.0  / 2.0L / Diesel / 150h.p");
                    list.add("T4 1.6  / 1.6L / Petrol / 180h.p");
                    ArrayAdapter<String> dataAdapter533 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter533.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter533.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter533);
                }
                if (model.contentEquals("V40")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("D3 2.0  / 2.0L / Diesel / 150h.p");
                    list.add("D3 2.0  / 2.0L / Diesel / 150h.p");
                    list.add("T4 1.6  / 1.6L / Petrol / 180h.p");
                    ArrayAdapter<String> dataAdapter534 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter534.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter534.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter534);
                }
                if (model.contentEquals("XC60(2008-2015)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("D4 2.0  / 2.0L / Diesel / 161h.p");
                    list.add("D5 AWD 2.4  / 2.4L / Diesel / 185h.p");
                    list.add("D5 AWD 2.4  / 2.4L / Diesel / 202h.p");
                    list.add("D5 AWD 2.4  / 2.4L / Diesel / 212h.p");
                    ArrayAdapter<String> dataAdapter535 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter535.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter535.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter535);
                }
                if (model.contentEquals("XC60(2016-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("D5 2.0  / 2.0L / Diesel / 190h.p");
                    list.add("D5 AWD 2.4  / 2.4L / Diesel / 220h.p");
                    ArrayAdapter<String> dataAdapter536 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter536.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter536.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter536);
                }
                if (model.contentEquals("XC90(2005-2014)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("D5 AWD 2.4  / 2.4L / Diesel / 200h.p");
                    list.add("V8 4.4  / 4.4L / Petrol / 315h.p");
                    ArrayAdapter<String> dataAdapter537 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter537.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter537.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter537);
                }
                if (model.contentEquals("XC90(2016-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("D5 AWD 2.0  / 2.0L / Diesel / 235h.p");
                    list.add("D5 AWD 2.0  / 2.0L / Diesel / 225h.p");
                    ArrayAdapter<String> dataAdapter538 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter538.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter538.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter538);
                }

                if (model.contentEquals("AMEO")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 MPI  / 1.2L / Petrol / 75h.p");
                    list.add("1.5 TDI  / 1.5L / Diesel / 110h.p");
                    ArrayAdapter<String> dataAdapter539 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter539.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter539.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter539);
                }
                if (model.contentEquals("BEETLE (9C1, 1C1)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 TDI / 2.0L / Diesel / 141h.p");
                    list.add("VW BEETLE (9C1,1C1)1.4 / 1.4L / Petrol / 75h.p");
                    list.add("VW BEETLE (9C1,1C1)1.6 / 1.6L / Petrol / 100h.p");
                    list.add("VW BEETLE (9C1,1C1)1.6 / 1.6L / Petrol / 102h.p");
                    list.add("VW BEETLE (9C1,1C1)1.8 / 1.8L / Petrol / 173h.p");
                    list.add("VW BEETLE (9C1,1C1)1.8 T / 1.8L / Petrol / 150h.p");
                    list.add("VW BEETLE (9C1,1C1)1.8 T / 1.8L / Petrol / 180h.p");
                    list.add("VW BEETLE (9C1,1C1)1.9 T / 1.9L / Diesel / 90h.p");
                    list.add("VW BEETLE (9C1,1C1)1.9 TDI / 1.9L / Diesel / 101h.");
                    list.add("VW BEETLE (9C1,1C1)1.9 TDI / 1.9L / Diesel / 105h");
                    list.add("VW BEETLE (9C1,1C1)1.8 T / 1.8L / Petrol / 150h.p");
                    list.add("VW BEETLE (9C1,1C1)1.8 T / 1.8L / Petrol / 150h.p");
                    list.add("VW BEETLE (9C1,1C1)1.8 T / 1.8L / Petrol / 180h.p");
                    list.add("VW BEETLE (9C1,1C1)1.9 T / 1.9L / Diesel / 90h.p");
                    list.add("VW BEETLE (9C1,1C1)1.9 TDI / 1.9L / Diesel / 101h.");
                    ArrayAdapter<String> dataAdapter540 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter540.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter540.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter540);
                }
                if (model.contentEquals("JETTA 6")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Petrol / 122h.p");
                    list.add("2.0 / 2.0L / Diesel / 140h.p");
                    list.add("2.0 / 2.0L / Diesel / 140h.p");
                    list.add("Jetta 2.0 / 2.0L / Petrol / 116h.p");
                    list.add("Jetta 2.0 Flex / 2.0L / Petrol / 120h.p");
                    list.add("VW BEETLE (9C1,1C1)1.9 TDI / 1.9L / Diesel / 101h.");
                    ArrayAdapter<String> dataAdapter541 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter541.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter541.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter541);
                }
                if (model.contentEquals("PASSAT (362)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.8 / 1.8L / Petrol / 160h.p");
                    list.add("2.0 TDI / 2.0L / Diesel / 170h.p");
                    list.add("2.0 TDI / 2.0L / Diesel / 136h.p");
                    list.add("2.0 TDI / 2.0L / Diesel / 177h.p");
                    ArrayAdapter<String> dataAdapter542 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter542.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter542.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter542);
                }
                if (model.contentEquals("PASSAT")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 TSI / 1.4L / Petrol / 150h.p");
                    list.add("1.8 TSI / 1.8L / Petrol / 160h.p");
                    list.add("2.0 DSG / 2.0L / Diesel / 168h.p");
                    list.add("2.0 PD DSG / 2.0L / Diesel / 141h.p");
                    list.add("2.0 TDI / 2.0L / Diesel / 150h.p");
                    list.add("2.0 TDI 4motion/ 2.0L / Diesel / 240h.p");
                    ArrayAdapter<String> dataAdapter543 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter543.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter543.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter543);
                }
                if (model.contentEquals("PASSAT (A32)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.6 FSI / 3.6L / Petrol / 280h.p");
                    ArrayAdapter<String> dataAdapter544 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter544.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter544.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter544);
                }
                if (model.contentEquals("POLO (6R, 6C)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 / 1.2L / Petrol / 70h.p");
                    list.add("1.2 / 1.2L / Petrol / 70h.p");
                    list.add("1.2 / 1.2L / Petrol / 60h.p");
                    list.add("1.2 / 1.2L / Diesel / 75h.p");
                    list.add("1.2 TSI / 1.2L / Petrol / 86h.p");
                    list.add("1.2 TSI / 1.2L / Petrol / 105h.p");
                    list.add("1.2 TSI / 1.2L / Petrol / 90h.p");
                    list.add("1.2 TSI / 1.2L / Petrol / 110h.p");
                    list.add("1.4 TDI / 1.4L / Diesel / 90h.p");
                    list.add("1.4 TDI / 1.4L / Diesel / 75h.p");
                    list.add("1.6 TDI / 1.6L / Diesel / 90h.p");
                    list.add("1.6 TDI / 1.6L / Diesel / 75h.p");
                    list.add("1.6 TDI / 1.6L / Diesel / 105h.p");
                    list.add("1.6 TSI / 1.6L / Petrol / 103h.p");
                    ArrayAdapter<String> dataAdapter545 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter545.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter545.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter545);
                }
                if (model.contentEquals("GTI")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.8 / 1.8L / Petrol / 189.3h.p");
                    ArrayAdapter<String> dataAdapter546 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter546.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter546.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter546);
                }
                if (model.contentEquals("TIGUAN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.0 / 2.0L / Diesel / 141h.p");
                    ArrayAdapter<String> dataAdapter547 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter547.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter547.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter547);
                }
                if (model.contentEquals("TOUAREG (7P5)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("VW TOUAREG (7P5) 3.0 v6 TDI-copy / 3.0L / Diesel ");
                    ArrayAdapter<String> dataAdapter548 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter548.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter548.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter548);
                }
                if (model.contentEquals("VENTO (60)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4 / 1.4L / Petrol / 85h.p");
                    list.add("1.6 / 1.6L / Petrol / 105h.p");
                    list.add("1.6 TDI / 1.6L / Diesel / 105h.p");
                    ArrayAdapter<String> dataAdapter549 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter549.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter549.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter549);
                }
                if (model.contentEquals("VENTO IV (162)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.2 TSI / 1.2L / Petrol / 105h.p");
                    ArrayAdapter<String> dataAdapter550 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter550.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter550.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter550);
                }
                if (model.contentEquals("ASTRA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("1.4/ 1.4L / Petrol / 75h.p");
                    ArrayAdapter<String> dataAdapter551 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter551.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter551.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter551);
                }
                if (model.contentEquals("CORSA")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("OPEL CORSA CLASSIC Saloon 1.4 / 1.4L / Petrol / 90");
                    list.add("OPEL CORSA CLASSIC Saloon 1.6 / 1.6L / Petrol / 10");
                    ArrayAdapter<String> dataAdapter552 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter552.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter552.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter552);
                }
                if (model.contentEquals("VECTRA C (2002)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.2 / 2.2L / Petrol / 147h.p");
                    ArrayAdapter<String> dataAdapter553 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter553.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter553.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter553);
                }
                if (model.contentEquals("911 (997)(2004-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.6 / 3.6L / Petrol / 325h.p");
                    list.add("4.0 / 4.0L / Petrol / 500h.p");
                    ArrayAdapter<String> dataAdapter554 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter554.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter554.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter554);
                }
                if (model.contentEquals("911 (997)(2005-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.6 / 3.6L / Petrol / 480h.p");
                    list.add("3.6 Carrera 4 / 3.6L / Petrol / 350h.p");
                    list.add("3.6 Carrera S / 3.8L / Petrol / 500h.p");
                    ArrayAdapter<String> dataAdapter555 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter555.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter555.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter555);
                }
                if (model.contentEquals("911 (997)(2006-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.6 / 3.6L / Petrol / 325h.p");
                    list.add("3.8 / 3.8L / Petrol / 385h.p");
                    list.add("3.8 / 3.8L / Petrol / 355h.p");
                    ArrayAdapter<String> dataAdapter556 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter556.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter556.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter556);
                }
                if (model.contentEquals("911 (997)(2006-now)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.4 Carrera / 3.4L / Petrol / 350h.p");
                    list.add("3.6 Carrera 4 / 3.6L / Petrol / 537h.p");
                    list.add("3.8 Carrera GTS / 3.8L / Petrol / 413h.p");
                    ArrayAdapter<String> dataAdapter557 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter557.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter557.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter557);
                }
                if (model.contentEquals("911 (991)Body type: Convertible")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.4 Carrera / 3.4L / Petrol / 350h.p");
                    list.add("3.6 Carrera 4 / 3.6L / Petrol / 537h.p");
                    list.add("3.8 Turbo / 3.8L / Petrol / 520h.p");
                    ArrayAdapter<String> dataAdapter558 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter558.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter558.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter558);
                }
                if (model.contentEquals("911 (991)Body type: Coupe")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.4 / 3.4L / Petrol / 355h.p");
                    list.add("3.8 / 3.8L / Petrol / 507h.p");
                    list.add("3.8 / 3.8L / Petrol / 560h.p");
                    ArrayAdapter<String> dataAdapter559 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter559.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter559.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter559);
                }
                if (model.contentEquals("BOXSTER (987)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("2.7 / 2.7L / Petrol / 240h.p");
                    list.add("2.7 / 2.7L / Petrol / 243h.p");
                    list.add("3.2 / 3.2L / Petrol / 253h.p");
                    ArrayAdapter<String> dataAdapter560 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter560.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter560.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter560);
                }
                if (model.contentEquals("CAYENNE")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 / 3.0L / Hybrid /333h.p");
                    list.add("3.0 / 3.0L / Diesel / 239h.p");
                    list.add("3.0 / 3.0L / Petrol / 333h.p");
                    ArrayAdapter<String> dataAdapter561 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter561.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter561.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter561);
                }
                if (model.contentEquals("CAYMAN (987)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.4 / 3.4L / Petrol / 295h.p");
                    list.add("3.4 / 3.4L / Petrol / 330h.");
                    list.add("3.4 / 3.4L / Petrol / 329h.p");
                    ArrayAdapter<String> dataAdapter562 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter562.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter562.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter562);
                }
                if (model.contentEquals("CAYMAN (981)")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.4 / 3.4L / Petrol / 325h.p");
                    list.add("3.4 / 3.4L / Petrol / 340h.p");
                    ArrayAdapter<String> dataAdapter563 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter563.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter563.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter563);
                }
                if (model.contentEquals("MACAN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("3.0 S / 3.0L / Petrol / 340h.p");
                    list.add("3.6 TURBO / 3.6L / Petrol / 400h.p");
                    ArrayAdapter<String> dataAdapter564 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter564.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter564.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter564);
                }
                if (model.contentEquals("MACAN")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Variant");
                    list.add("4.8 / 4.8L / Petrol / 570h.p");
                    list.add("4.8 / 4.8L / Petrol / 435h.p");
                    ArrayAdapter<String> dataAdapter565 = new ArrayAdapter<String>(Dashboard.this,
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter565.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter565.notifyDataSetChanged();
                    s4.setAdapter(dataAdapter565);
                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (customername.getText().toString().trim().equals("") && vehiclereg.getText().toString().trim().equals("")) {

                    customername.setError("Please Enter Customer Name");
                    vehiclereg.setError("Please Enter Vehicle Registration Number");

                } else {


                    String sbrand = s1.getSelectedItem().toString();
                    String syear = s2.getText().toString();
                    String smodel = s3.getSelectedItem().toString();
                    String svariant = s4.getSelectedItem().toString();

                    String scname = customername.getText().toString();
                    String svreg = vehiclereg.getText().toString();

                    Intent intent = new Intent(Dashboard.this, Step2.class);
                    intent.putExtra("BRAND", sbrand);
                    intent.putExtra("YEAR", syear);
                    intent.putExtra("MODEL", smodel);
                    intent.putExtra("VARIANT", svariant);
                    intent.putExtra("CUSTOMERNAME",scname);
                    intent.putExtra("VEHICLEREG",svreg);
                    Dashboard.this.startActivity(intent);
                }
            }
        });
    }
}
