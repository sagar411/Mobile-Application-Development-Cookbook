package com.example.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {
    public static final String EXTRA_FOODID = "foodID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        int foodId = (Integer)getIntent().getExtras().get(EXTRA_FOODID);
        Food foods = Food.foods[foodId];

        TextView nameTextView = (TextView) findViewById(R.id.nameTextView);
        nameTextView.setText(foods.getName());

        TextView descriptionTextView =(TextView) findViewById(R.id.descriptionTextView);
        descriptionTextView.setText(foods.getDiscription());

        ImageView photoImageView =(ImageView) findViewById(R.id.photoImageView);
        photoImageView.setImageResource(foods.getImageResourcesId());
        photoImageView.setContentDescription(foods.getName());
    }
}