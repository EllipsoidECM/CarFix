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

    public String getOe_name() {
        return oe_name;
    }

    public void setOe_name(String oe_name) {
        this.oe_name = oe_name;
    }

    public String getBranded_name() {
        return branded_name;
    }

    public void setBranded_name(String branded_name) {
        this.branded_name = branded_name;
    }

    public String getLocal_name() {
        return local_name;
    }

    public void setLocal_name(String local_name) {
        this.local_name = local_name;
    }

    public String getUsed_name() {
        return used_name;
    }

    public void setUsed_name(String used_name) {
        this.used_name = used_name;
    }

    String oe_name,branded_name,local_name,used_name;

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

    public NotificationModel(String ticket_id, String OE_price, String brand_price, String local_price, String used_price,String oe_name,String branded_name,String local_name,String used_name) {
        this.ticket_id = ticket_id;
        this.OE_price = OE_price;
        this.Brand_price = brand_price;
        this.local_price = local_price;
        this.used_price = used_price;
        this.oe_name=oe_name;
        this.local_name=local_name;
        this.branded_name=branded_name;
        this.used_name=used_name;
    }



}
