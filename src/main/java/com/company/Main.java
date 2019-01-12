package com.company;

public class Main {

    public static void main(String[] args) {
        Weather weather = null;

        String data = ((new HTTPGet()).httpget("Dnipro"));
        weather = GetWeathear.getWeather(data);
        System.out.println("At " + weather.getTime(0).substring(10, 16) + " temperature will be "+ Math.round((weather.getTemp(0) - 273.15))+"°");
        System.out.println("At " + weather.getTime(1).substring(10, 16) + " temperature will be "+ Math.round((weather.getTemp(1) - 273.15))+"°");
        System.out.println("At " + weather.getTime(2).substring(10, 16) + " temperature will be "+ Math.round((weather.getTemp(2) - 273.15))+"°");
        System.out.println("At " + weather.getTime(3).substring(10, 16) + " temperature will be "+ Math.round((weather.getTemp(3) - 273.15))+"°");
        System.out.println("At " + weather.getTime(4).substring(10, 16) + " temperature will be "+ Math.round((weather.getTemp(4) - 273.15))+"°");
        System.out.println("At " + weather.getTime(5).substring(10, 16) + " temperature will be "+ Math.round((weather.getTemp(5) - 273.15))+"°");



    }
}
