package com.company;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Weather weather = new Weather();
        String city;

        do {
            Scanner sc = new Scanner(System.in);
            city = sc.nextLine();
            String data = ((new HTTPGet()).httpget(city));
            weather = GetWeathear.getWeather(data);
            for (int i = 0; i <=5 ; i++) {
                System.out.println("At " + weather.getTime(i) + " temperature will be " + Math.round((weather.getTemp(i) - 273.15)) + "°");
            }
        }while (!"stop".equals(city));





    }
}
