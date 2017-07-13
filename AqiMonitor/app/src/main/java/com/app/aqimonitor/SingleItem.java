package com.app.aqimonitor;

/**
 * Created by Fzj on 2017/7/10.
 */
public class SingleItem {
    private String city_name;
    private int aqi;
    private int level;

    public void setCity(String name)
    {
        city_name = name;
    }

    public String getCity()
    {
        return city_name;
    }

    public void setAqi(int num)
    {
        aqi = num;
    }

    public int getAqi() {
        return aqi;
    }
}
