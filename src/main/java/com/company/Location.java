package com.company;

import java.io.Serializable;

public class Location implements Serializable {


    private static String city;
    private static String country;

    public static String getCity() {
        return city;
    }

    void setCity(String city) {
        this.city = city;
    }

    public static String getCountry() {
        return country;
    }

    void setCountry(String country) {
        this.country = country;
    }



}
