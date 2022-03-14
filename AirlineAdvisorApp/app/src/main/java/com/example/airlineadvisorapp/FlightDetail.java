package com.example.airlineadvisorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FlightDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight_detail);

        ArrayAdapter<Flight> listAdapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Flight.flights);

        ListView listFlight = (ListView) findViewById(R.id.listFlight);
        listFlight.setAdapter(listAdapter);


        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent   = new Intent(FlightDetail.this, FinalPage.class);
                intent.putExtra(FinalPage.EXTRA_FLIGHTID,(int) id);
                startActivity(intent);
            }
        };
        listFlight.setOnItemClickListener(itemClickListener);

    }
}