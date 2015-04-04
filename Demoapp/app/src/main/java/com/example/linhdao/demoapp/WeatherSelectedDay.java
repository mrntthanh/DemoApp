package com.example.linhdao.demoapp;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;




public class WeatherSelectedDay extends LinearLayout {

    interface WeatherSelectedDayListener{
        public void weatherSelectedDayClicked();
    }

    LayoutInflater mInFalter;
    Context mContext;
    public WeatherSelectedDayListener mDelegate;

    public WeatherSelectedDay (Context context){

        super(context);
        mContext  = context;
        mInFalter = LayoutInflater.from(context);

        init();
    }

    public WeatherSelectedDay (Context context, AttributeSet attrs){

        super(context, attrs);
        mContext  = context;
        mInFalter = LayoutInflater.from(context);

        init();
    }

    public WeatherSelectedDay (Context context, AttributeSet attrs, int defStyle){

        super (context,attrs, defStyle);
        mContext  = context;
        mInFalter = LayoutInflater.from(context);

        init();
    }

    public void init(){
        mInFalter.inflate(R.layout.weather_today, this, true);
        //register click event for weatherImageToday View
        ImageView weatherImageToday = (ImageView)findViewById(R.id.weatherimg);
        weatherImageToday.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i(SystemSettings.APP_TAG + " : " + HomeActivity.class.getName(), "Entered onClick method");
                //Log.i("Testing", "Entered onClick method");
                Log.v(mContext.getClass().getSimpleName(), "Image - onClick");

                if (mDelegate != null) {
                    mDelegate.weatherSelectedDayClicked();
                }

            }
        });
    }
}