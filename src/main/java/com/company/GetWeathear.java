package com.company;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class GetWeathear {

    static Weather getWeather(String data) throws JSONException {
        Weather weather = new Weather();
        Location location = new Location();

        JSONObject jObj = null;

        jObj = new JSONObject(data);


        Location loc = new Location();
        JSONObject locObj = jObj.getJSONObject("city");
        loc.setCity(getString("name", locObj));
        loc.setCountry(getString("country", locObj));


        JSONArray jArr = jObj.getJSONArray("list");
        for (int i = 0; i <= 5; i++) {
            JSONObject mWeather = jArr.getJSONObject(i);

            JSONArray jArrWeath = mWeather.getJSONArray("weather");
            JSONObject idWeather = jArrWeath.getJSONObject(0);
            weather.setIcon(getString("icon", idWeather));

            JSONObject mainObj = getObject("main", mWeather);
            weather.setTemp(getFloat("temp", mainObj));

            weather.setTime(getString("dt_txt", mWeather));
        }


        return weather;
    }

    private static JSONObject getObject(String tagName, JSONObject jObj)  throws JSONException {
        JSONObject subObj = jObj.getJSONObject(tagName);
        return subObj;
    }

    private static String getString(String tagName, JSONObject jObj) throws JSONException {
        return jObj.getString(tagName);
    }

    private static float  getFloat(String tagName, JSONObject jObj) throws JSONException {
        return (float) jObj.getDouble(tagName);
    }
}
