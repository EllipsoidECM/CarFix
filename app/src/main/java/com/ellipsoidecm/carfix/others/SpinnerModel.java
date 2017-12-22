package com.ellipsoidecm.carfix.others;

import android.graphics.Bitmap;

/**
 * Created by Adil on 21-12-2017.
 */

public class SpinnerModel {

    String text;
    String imageurl;


    public SpinnerModel(String text, String imageId){
        this.text=text;
        this.imageurl=imageId;
    }

    public String getText(){
        return text;
    }

    public String getImageId(){
        return imageurl;
    }
}