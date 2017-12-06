package com.ellipsoidecm.carfix.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ellipsoidecm.carfix.R;


public class AboutUs extends Fragment {

    ImageView facebook, twitter, instagram;
    TextView link;

    public AboutUs() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_about_us, container, false);

        link = (TextView) view.findViewById(R.id.link);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("http://carfixzone.com/"));
                startActivity(i);
            }
        });

        facebook = (ImageView) view.findViewById(R.id.facebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/carfixhyd/"));
                startActivity(browserIntent);
            }
        });

        twitter = (ImageView) view.findViewById(R.id.twitter);
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/ellipsoidecm"));
                startActivity(browserIntent);
            }
        });

        instagram = (ImageView) view.findViewById(R.id.instagram);
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent brower = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/ecmellipsoid/"));
                startActivity(brower);
            }
        });
        return view;
    }


}
