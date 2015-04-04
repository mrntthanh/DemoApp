package com.example.linhdao.demoapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.example.linhdao.demoapp.WeatherSelectedDay.WeatherSelectedDayListener;

public class DetailActivity extends ActionBarActivity implements WeatherSelectedDay.WeatherSelectedDayListener{

    WeatherSelectedDay mWeatherControl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mWeatherControl = (WeatherSelectedDay) findViewById(R.id.weatherControl);
        mWeatherControl.mDelegate = this;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void weatherSelectedDayClicked() {
        //Intent intent = new Intent(DetailActivity.this, MainActivity.class);
        //DetailActivity.this.startActivity(intent);
        DetailActivity.this.finish();
    }
}
