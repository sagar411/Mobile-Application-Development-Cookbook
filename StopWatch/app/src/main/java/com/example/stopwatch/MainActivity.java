package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity  {

    private int second=0;
    private boolean running;
    private  boolean wasRunning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null){
            second = savedInstanceState.getInt("second");
            running = savedInstanceState.getBoolean("running");
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }

        runTime();

    }

    public  void  runTime(){
        TextView textView = (TextView) findViewById(R.id.textView1);
        Handler handler = new Handler();
        handler.post(new Runnable() {


            @Override
            public void run() {
                int hours = second/3600;
                int minutes =(second%3600)/60;
                int sec =second%60;

                String time = String.format(Locale.getDefault()," %d:%02d:%02d", hours, minutes, sec);
                textView.setText(time);

                if(running){
                    second++;
                }
                handler.postDelayed(this,1000);
            }
        });
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putInt("second",second);
        savedInstanceState.putBoolean("running",running);
        savedInstanceState.putBoolean("wasRunning", wasRunning);
    }


    public void onClickStop(View view){
        running = false;

    }
    public void  onClickStart(View view){
        running =true;

    }
    public  void onClickReset(View view){
        running = false;
        second =0;
    }

    @Override
    protected void onStop() {
        super.onStop();
        wasRunning = running;
        running = false;
    }

    protected void onStart(){
        super.onStart();
        if(wasRunning){
            running = true;
        }
    }
}