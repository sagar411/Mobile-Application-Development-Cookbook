package com.example.airlineadvisorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class ShreeFinal extends AppCompatActivity {

    public static final String EXTRA_FLIGHTID = "flightId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shree_final);
        int flightId = (Integer)getIntent().getExtras().get(EXTRA_FLIGHTID);
        Shree shree = Shree.shrees[flightId];



        TextView textView = (TextView) findViewById(R.id.textview1);
        textView.setText("Date:"+(CharSequence) MainActivity.currentDateString);

        TextView textView1 = (TextView) findViewById(R.id.textview2);
        textView1.setText("From :"+(CharSequence) MainActivity.From +"\n"+"To:" +(CharSequence) MainActivity.To);

        TextView textView2 = (TextView) findViewById(R.id.textview3);
        textView2.setText("Flight Time is  "+shree.getTime());

        ImageView imageView =(ImageView) findViewById(R.id.image);
        imageView.setImageResource(shree.getImage());

        TextView textView3 = (TextView) findViewById(R.id.textview4);
        textView3.setText("Flight Name is :"+shree.getName());

        TextView textView4 = (TextView)  findViewById(R.id.textview5);
        textView4.setText("Flight Price is :Rs. "+shree.getPrice());

    }
}