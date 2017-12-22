package com.ellipsoidecm.carfix.others;

/**
 * Created by ellipsoid on 21-10-2017.
 */

public class User {

    private int id;
    private String username;
    private String email;
    private String address;
    private String bname;



    private String name;

    public User(int id, String username, String email, String address, String bname, String name) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.name= name;
        this.bname = bname;
        this.address = address;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getname() {
        return name;
    }




    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

}
