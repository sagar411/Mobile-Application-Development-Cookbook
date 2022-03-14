package com.example.doubleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecieveMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_message);

        Intent intent = getIntent();
        String messageRecieved =intent.getStringExtra("key");
        TextView textView =(TextView) findViewById(R.id.enterTxt);
        textView.setText(messageRecieved);
    }

}