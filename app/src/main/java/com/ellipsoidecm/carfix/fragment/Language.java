package com.ellipsoidecm.carfix.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.ellipsoidecm.carfix.R;


public class Language extends Fragment {

    Button tel,urd;


    public Language() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_language, container, false);

        tel = (Button) view.findViewById(R.id.tel);
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(getActivity().getApplicationContext(),"Not Available",Toast.LENGTH_SHORT);

                toast.show();
            }
        });
        urd = (Button) view.findViewById(R.id.urd);
        urd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(getActivity().getApplicationContext(),"Not Available",Toast.LENGTH_SHORT);

                toast.show();
            }
        });
        return view;
    }


}
