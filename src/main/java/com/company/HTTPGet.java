package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

class HTTPGet {
    private String BASE_URL = "http://api.openweathermap.org/data/2.5/forecast?q=";

    String httpget(String location) {
        HttpURLConnection con = null;
        StringBuffer buffer = null;
        try {
            con = (HttpURLConnection) (new URL(BASE_URL + location + "&APPID=824dca49c6fce4716e4f85bf1e4e60e6")).openConnection();
            con.connect();

            try (InputStream is = con.getInputStream()) {
                buffer = new StringBuffer();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String line = null;
                while ((line = br.readLine()) != null)
                    buffer.append(line).append("\r\n");


            } catch (Throwable t) {
                t.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.disconnect();
            }
        }

            return buffer != null ? buffer.toString() : null;

    }
}

