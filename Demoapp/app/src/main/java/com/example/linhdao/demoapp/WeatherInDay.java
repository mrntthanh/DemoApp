package com.example.linhdao.demoapp;

/**
 * Created by Tung.Pham on 2/9/15.
 */
public class WeatherInDay {
    public String dayInWeek;
    public String temperatureMax;
    public String temperatureMin;
    public String weatherDesc;
    public String weatherImg;

    public WeatherInDay (String dayInWeek, String temperatureMax, String temperatureMin, String weatherDesc, String weatherImg){
        this.dayInWeek      = dayInWeek;
        this.temperatureMax = temperatureMax;
        this.temperatureMin = temperatureMin;
        this.weatherDesc    = weatherDesc;
        this.weatherImg     = weatherImg;
    }

}
