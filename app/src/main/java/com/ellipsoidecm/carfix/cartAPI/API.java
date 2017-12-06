package com.ellipsoidecm.carfix.cartAPI;

/**
 * Created by Harshab on 11/9/2017.
 */

public class API {

    private static final String ROOT_URL = "http://ellipsoid.esy.es/repairstation_API/CartDelete/v1/Api.php?apicall=";

    public static final String URL_READ_HEROES = ROOT_URL + "getheroes";
    public static final String URL_DELETE_HERO = ROOT_URL + "deletehero&id=";
    public static final String URL_MOVE_HERO = ROOT_URL + "movehero&id=";
}
