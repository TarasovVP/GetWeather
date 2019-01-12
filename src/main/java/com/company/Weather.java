package com.company;

import java.time.LocalTime;
import java.util.ArrayList;

public class Weather {
    private ArrayList<String> listTime = new ArrayList<>();
    private ArrayList <Float> listTemp = new ArrayList <>();
    private ArrayList <Integer> listId = new ArrayList <>();
    private ArrayList <String> listIcon = new ArrayList <>();



    public int getIdWeather(int index) {

        return listId.get(index);
    }

    public void setIdWeather(int idWeather) {
        listId.add(idWeather);
    }

    float getTemp(int index) {
        return listTemp.get(index);
    }

    void setTemp(float temp) {
        listTemp.add(temp);
    }

    public String getIcon(int index) {
        return listIcon.get(index);
    }

    void setIcon(String icon) {
        listIcon.add(icon);
    }
    LocalTime getTime(int index) {

        return LocalTime.parse(listTime.get(index).substring(11, 16));
    }

    public void setTime(String date) {
        listTime.add(date);
    }


}



