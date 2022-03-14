package com.example.airlineadvisorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.icu.text.SymbolTable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    static String currentDateString;
    String airline1;
    static String From;
    static String To;
    int Index1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.Spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.airline_Data,R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                airline1 = spinner.getSelectedItem().toString();
                Index1 =spinner.getSelectedItemPosition();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        Spinner spinner2 = findViewById(R.id.Spinner2);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.place,R.layout.support_simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                From= spinner2.getSelectedItem().toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        Spinner spinner3 = findViewById(R.id.Spinner3);
        ArrayAdapter <CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.place, R.layout.support_simple_spinner_dropdown_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 To = spinner3.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 DialogFragment datePicker = new DatePickerFragment();
                 datePicker.show(getSupportFragmentManager(),"date picker");

            }
        });

        EditText text = (EditText)findViewById(R.id.passanger);
        String valueText = text.getText().toString();




        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            public String getFrom() {
                return From;
            }
            public String getTo(){return To;}


            @Override
            public void onClick(View v) {
                System.out.println( airline1);

                System.out.println(From);
                System.out.println(To);
                System.out.println(valueText);

                if(Index1 == 0) {
                    Intent intent = new Intent(MainActivity.this, FlightDetail.class);

                    startActivity(intent);
                }else if(Index1==1){
                    Intent intent = new Intent(MainActivity.this, BuddhaDetail.class);
                    startActivity(intent);
                }else {
                    Intent intent = new Intent(MainActivity.this, ShreeDetail.class);
                    startActivity(intent);
                }

            }
        });
    }



    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

        Calendar calander = Calendar.getInstance();
        calander.set(Calendar.YEAR, year);
        calander.set(Calendar.MONTH,month);
        calander.set(Calendar.DAY_OF_MONTH,dayOfMonth);
        currentDateString = DateFormat.getDateInstance().format(calander.getTime());

        EditText editText =(EditText) findViewById(R.id.date);
        editText.setText(currentDateString);

    }



}