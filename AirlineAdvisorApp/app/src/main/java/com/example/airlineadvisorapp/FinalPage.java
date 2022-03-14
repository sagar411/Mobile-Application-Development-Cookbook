package com.example.airlineadvisorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DirectAction;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FinalPage extends AppCompatActivity {

    public static final String EXTRA_FLIGHTID ="flightID" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_page);

        int flightId = (Integer)getIntent().getExtras().get(EXTRA_FLIGHTID);
        Flight flight = Flight.flights[flightId];

        TextView textView = (TextView) findViewById(R.id.textview1);
        textView.setText("Date:"+(CharSequence) MainActivity.currentDateString);

        TextView textView1 = (TextView) findViewById(R.id.textview2);
        textView1.setText("From :"+(CharSequence) MainActivity.From +"\n"+"To:" +(CharSequence) MainActivity.To);

        TextView textView2 = (TextView) findViewById(R.id.textview3);
        textView2.setText("Flight Time is  "+flight.getTime());

        ImageView imageView =(ImageView) findViewById(R.id.image);
        imageView.setImageResource(flight.getImage());

        TextView textView3 = (TextView) findViewById(R.id.textview4);
        textView3.setText("Flight Name is :"+flight.getName());

        TextView textView4 = (TextView)  findViewById(R.id.textview5);
        textView4.setText("Flight Price is :Rs. "+flight.getPrice());

    }
}