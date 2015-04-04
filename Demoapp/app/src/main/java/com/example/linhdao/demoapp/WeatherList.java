package com.example.linhdao.demoapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ListView;



/**
 * Created by Tung.Pham on 2/9/15.
 */
public class WeatherList extends LinearLayout {
    Context mContext;
    LayoutInflater mWeatherInflater;
    ListView listView;

    public WeatherList(Context context){
        super(context);

        mContext         = context;
        mWeatherInflater = LayoutInflater.from(context);
        init();
    }

    public  WeatherList(Context context, AttributeSet attrs){
        super(context, attrs);

        mContext         = context;
        mWeatherInflater = LayoutInflater.from(context);
        init();
    }

    public WeatherList(Context context, AttributeSet attrs, int defStyle){
        super(context, attrs, defStyle);

        mContext         = context;
        mWeatherInflater = LayoutInflater.from(context);
        init();
    }

    public void init(){
        mWeatherInflater.inflate(R.layout.weather_listview, this, true);

        listView = (ListView)findViewById(R.id.weatherListView);
        displayDataOnListView();
    }

    private void displayDataOnListView(){
        WeatherInDay[] weartherInDayList = new WeatherInDay[7];

        weartherInDayList[0] = new WeatherInDay("Tomorrow", "21", "8", "Clear" ,"drawable/sun");
        weartherInDayList[1] = new WeatherInDay("Wednesday", "22", "17", "Cloud" ,"drawable/cloud");
        weartherInDayList[2] = new WeatherInDay("Thursday", "21", "8", "Rainy" ,"drawable/rain");
        weartherInDayList[3] = new WeatherInDay("Friday", "30", "15", "Hot" ,"drawable/sun");
        weartherInDayList[4] = new WeatherInDay("Saturday", "18", "8", "Cool" ,"drawable/cloud");
        weartherInDayList[5] = new WeatherInDay("Sunday", "10", "8", "Cold" ,"drawable/rain");
        weartherInDayList[6] = new WeatherInDay("Monday", "10", "8", "Cold" ,"drawable/cloud");

        WeatherListViewAdapter weatherListAdapter = new WeatherListViewAdapter(mContext, weartherInDayList);
        listView.setAdapter(weatherListAdapter);
    }

}
