package com.example.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class StoresActivity extends AppCompatActivity {

    public static final String EXTRA_STOREID = "storeID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stores);


        int storeID = (Integer)getIntent().getExtras().get(EXTRA_STOREID);
        Stores stores = Stores.stores[storeID];

        TextView nameTextView = (TextView) findViewById(R.id.nameTextView);
        nameTextView.setText(stores.getName());

        TextView descriptionTextView =(TextView) findViewById(R.id.descriptionTextView);
        descriptionTextView.setText(stores.getDiscription());

        ImageView photoImageView =(ImageView) findViewById(R.id.photoImageView);
        photoImageView.setImageResource(stores.getImageResourcesId());
        photoImageView.setContentDescription(stores.getName());
    }
}