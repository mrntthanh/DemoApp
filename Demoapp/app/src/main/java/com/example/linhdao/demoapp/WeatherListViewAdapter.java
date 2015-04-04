package com.example.linhdao.demoapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Tung.Pham on 2/9/15.
 */
public class WeatherListViewAdapter extends BaseAdapter{
    private Context mContext;
    private WeatherInDay[] mWeatherInDayList;

    public WeatherListViewAdapter(Context context, WeatherInDay[] data){
        mContext          = context;
        mWeatherInDayList = data;
    }

    @Override
    public int getCount(){
        return mWeatherInDayList.length;
    }

    @Override
    public Object getItem(int index){
        return mWeatherInDayList[index];
    }

    @Override
    public long getItemId(int arg0){
        return 0;
    }

    @Override
    public View getView(int index, View convertView, ViewGroup parentView){
        if (convertView == null){
            LayoutInflater inflater = ((Activity)mContext).getLayoutInflater();
            convertView             = inflater.inflate(R.layout.listview_row_item, parentView, false);
        }

        WeatherInDay weather = mWeatherInDayList[index];

        TextView dayInWeekTextView      = (TextView)convertView.findViewById(R.id.dayInWeek);
        dayInWeekTextView.setText(weather.dayInWeek);
        //
        TextView weatherDescTextView    = (TextView)convertView.findViewById(R.id.weatherDesc);
        weatherDescTextView.setText(weather.weatherDesc);
        //
        TextView temperatureMaxTextView = (TextView)convertView.findViewById(R.id.temperatureMax);
        temperatureMaxTextView.setText(weather.temperatureMax);
        //
        TextView temperatureMinTextView = (TextView)convertView.findViewById(R.id.temperatureMin);
        temperatureMinTextView.setText(weather.temperatureMin);
        //
        ImageView weatherIamageView     = (ImageView)convertView.findViewById(R.id.weatherImageView);
        int imageResource               = mContext.getResources().getIdentifier(weather.weatherImg, null, mContext.getPackageName());
        weatherIamageView.setImageResource(imageResource);

        return convertView;
    }

}
