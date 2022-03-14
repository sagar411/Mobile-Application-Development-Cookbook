package com.example.mobileadvisorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void findButton(View v){
    TextView textView=(TextView) findViewById(R.id.text);
    textView.setText("Hello WOrld there");

        Spinner spinner =(Spinner) findViewById(R.id.Spinner);
        String companyName=(String) spinner.getSelectedItem();

        ProcessingClass processingClass = new ProcessingClass();
        List<String> mobilePhones = processingClass.getMobilePhones(companyName);

        StringBuilder stringBuilder =new StringBuilder();
        for (String mobile:mobilePhones){
            stringBuilder.append( mobile +"\n");
        }
        textView.setText(stringBuilder);
    }

}