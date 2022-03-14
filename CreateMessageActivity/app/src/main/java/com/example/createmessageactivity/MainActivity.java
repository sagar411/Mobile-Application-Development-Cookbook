package com.example.createmessageactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CreateMessageActivity c = new CreateMessageActivity();
    }
    public void newActivity(View view){
        EditText editText = (EditText) findViewById(R.id.editText);
        String text = editText.getText().toString();

        Intent intent = new Intent(this,CreateMessageActivity.class);
        intent.putExtra(CreateMessageActivity.EXTRAMESSAGE,text);
        startActivity(intent);
    }
}