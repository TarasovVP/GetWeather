package com.company;

import java.io.Serializable;

public class Location implements Serializable {
    private static String city;
    public static String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

}
