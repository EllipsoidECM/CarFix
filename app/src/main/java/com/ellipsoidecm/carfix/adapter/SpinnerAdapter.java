package com.ellipsoidecm.carfix.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ellipsoidecm.carfix.R;
import com.ellipsoidecm.carfix.others.LoadImageTask;
import com.ellipsoidecm.carfix.others.SpinnerModel;

import java.net.URL;
import java.util.ArrayList;

public class SpinnerAdapter extends ArrayAdapter<SpinnerModel> implements LoadImageTask.Listener

{
    int groupid;
    Activity context;
    ArrayList<SpinnerModel> list;
    LayoutInflater inflater;
    public SpinnerAdapter(Activity context, int groupid, int id, ArrayList<SpinnerModel>
            list){
        super(context,id,list);
        this.list=list;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.groupid=groupid;
    }

    ImageView imageView;



    public View getView(int position, View convertView, ViewGroup parent ){
        View itemView=inflater.inflate(groupid,parent,false);
         imageView=(ImageView)itemView.findViewById(R.id.img);


        new LoadImageTask(this).execute(list.get(position).getImageId());


        imageView.setImageBitmap(bitmap);

        // imageView.setImageResource(list.get(position).getImageId());
        TextView textView=(TextView)itemView.findViewById(R.id.txt);
        textView.setText(list.get(position).getText());
        return itemView;
    }

    public View getDropDownView(int position, View convertView, ViewGroup
            parent){
        return getView(position,convertView,parent);

    }


    Bitmap bitmap;


    @Override
    public void onImageLoaded(Bitmap bitmap) {

        this.bitmap = bitmap;


    }

    @Override
    public void onError() {
        Toast.makeText(context,"error in image load",Toast.LENGTH_SHORT).show();
    }

}