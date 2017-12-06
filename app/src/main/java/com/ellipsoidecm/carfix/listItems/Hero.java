package com.ellipsoidecm.carfix.listItems;

/**
 * Created by Harshab on 11/2/2017.
 */

public class Hero {

    private String sparePart;
    private String brand;
    private String model;
    private String date;
    private  int id;

    public Hero(int id, String sparePart, String brand, String model, String date) {
        this.id = id;
        this.sparePart = sparePart;
        this.brand = brand;
        this.model = model;
        this.date = date;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSparePart() {
        return sparePart;
    }

    public void setSparePart(String sparePart) {
        this.sparePart = sparePart;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
