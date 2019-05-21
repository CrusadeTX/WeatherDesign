package com.example.weatherdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button about;
    private Button threeDayForecast;
   // private Button fiveDayForecast;
    private Button currentWeather;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        about = findViewById(R.id.About);
        threeDayForecast = (Button) findViewById(R.id.ThreeDayForecast);
        //fiveDayForecast = (Button) findViewById(R.id.FiveDayForecast);
        currentWeather = (Button) findViewById(R.id.CurrentWeather);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutActivity();
            }

        });
        threeDayForecast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThreeDayForecastActivity();
            }

        });

       /* fiveDayForecast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFiveDayForecastActivity();
            }

        });*/
        currentWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCurrentWeatherActivity();
            }

        });



    }
    public void openAboutActivity(){
        Intent intent = new Intent(this,About.class);
        startActivity(intent);
    }
    public void openCurrentWeatherActivity(){
        Intent intent = new Intent(this,CurrentWeather.class);
        startActivity(intent);
    }
    public void openThreeDayForecastActivity(){
        Intent intent = new Intent(this,ThreeDayForecast.class);
        startActivity(intent);
    }
   /* public void openFiveDayForecastActivity(){
        Intent intent = new Intent(this,FiveDayForecast.class);
        startActivity(intent);
    }*/
}
