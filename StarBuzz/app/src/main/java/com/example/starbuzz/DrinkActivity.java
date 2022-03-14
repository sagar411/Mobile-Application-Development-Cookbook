package com.example.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKID ="drinkID" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int drinkId = (Integer)getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drink = Drink.drinks[drinkId];

        TextView nameTextView = (TextView) findViewById(R.id.nameTextView);
        nameTextView.setText(drink.getName());

        TextView descriptionTextView =(TextView) findViewById(R.id.descriptionTextView);
        descriptionTextView.setText(drink.getDiscription());

        ImageView photoImageView =(ImageView) findViewById(R.id.photoImageView);
        photoImageView.setImageResource(drink.getImageResourcesId());
        photoImageView.setContentDescription(drink.getName());

    }
}