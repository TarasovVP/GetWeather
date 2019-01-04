package com.company;

import org.json.JSONException;

public class Main {

    public static void main(String[] args) {
        Weather weather = new Weather();

        String data = ((new HTTPGet()).httpget("Dnipro"));
        weather = GetWeathear.getWeather(data);
        System.out.println("" + Math.round((weather.getTemp(0) - 273.15)));
        System.out.println("" + Math.round((weather.getTemp(1) - 273.15)));
        System.out.println("" + Math.round((weather.getTemp(2) - 273.15)));
        System.out.println("" + Math.round((weather.getTemp(3) - 273.15)));
        System.out.println("" + Math.round((weather.getTemp(4) - 273.15)));
        System.out.println("" + Math.round((weather.getTemp(5) - 273.15)));
    }
}
