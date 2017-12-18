package com.ellipsoidecm.carfix.others;

/**
 * Created by Adil on 16-12-2017.
 */

public class NotificationModel {

    String ticket_id;
    String OE_price;
    String Brand_price;
    String local_price;
    String used_price;

    public String getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(String ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getOE_price() {
        return OE_price;
    }

    public void setOE_price(String OE_price) {
        this.OE_price = OE_price;
    }

    public String getBrand_price() {
        return Brand_price;
    }

    public void setBrand_price(String brand_price) {
        Brand_price = brand_price;
    }

    public String getLocal_price() {
        return local_price;
    }

    public void setLocal_price(String local_price) {
        this.local_price = local_price;
    }

    public String getUsed_price() {
        return used_price;
    }

    public void setUsed_price(String used_price) {
        this.used_price = used_price;
    }

    public NotificationModel(String ticket_id, String OE_price, String brand_price, String local_price, String used_price) {
        this.ticket_id = ticket_id;
        this.OE_price = OE_price;
        Brand_price = brand_price;
        this.local_price = local_price;
        this.used_price = used_price;
    }



}
