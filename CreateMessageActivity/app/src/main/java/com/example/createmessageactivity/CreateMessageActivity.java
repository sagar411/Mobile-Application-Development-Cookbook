package com.example.createmessageactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CreateMessageActivity extends AppCompatActivity {
    static final String EXTRAMESSAGE="textMessage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
        Intent intent= getIntent();
        String value = intent.getStringExtra(EXTRAMESSAGE);

        TextView textView=(TextView)  findViewById(R.id.textB);
        textView.setText(value);

    }
}