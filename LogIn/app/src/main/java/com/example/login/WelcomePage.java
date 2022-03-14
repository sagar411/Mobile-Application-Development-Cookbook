package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomePage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        Intent intent = getIntent();
        String nameReceive =intent.getStringExtra("key");
        TextView textView = (TextView)findViewById(R.id.textview_new);
        textView.setText(new StringBuilder().append("Hello  ").append(nameReceive).toString());
//        Toast.makeText(MainActivity.this , "sorry", Toast.LENGTH_SHORT).show();
    }
}