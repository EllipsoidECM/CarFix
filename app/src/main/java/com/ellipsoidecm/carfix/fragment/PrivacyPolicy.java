package com.ellipsoidecm.carfix.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ellipsoidecm.carfix.R;


public class PrivacyPolicy extends Fragment {

    TextView readmore;

    public PrivacyPolicy() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_privacy_policy, container, false);

        readmore = (TextView) view.findViewById(R.id.readmore);
        readmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.carfixzone.com/"));
                startActivity(browserIntent);
            }
        });

        return view;
    }

}
