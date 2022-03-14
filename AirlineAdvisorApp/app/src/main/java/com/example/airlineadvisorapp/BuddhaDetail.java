package com.example.airlineadvisorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BuddhaDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buddha_detail);

        ArrayAdapter<Buddha> listAdapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Buddha.buddhas);
//        ArrayAdapter<Flight> listAdapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Buddha.buddhas);

        ListView listFlight = (ListView) findViewById(R.id.listFlight);
        listFlight.setAdapter(listAdapter);


        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent   = new Intent(BuddhaDetail.this, BuddhaFinal.class);
                intent.putExtra(BuddhaFinal.EXTRA_FLIGHTID,(int) id);
                startActivity(intent);
            }
        };
        listFlight.setOnItemClickListener(itemClickListener);
    }
}