package com.example.callapp_individualproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void checkLogin(View view){
        EditText editText =(EditText) findViewById(R.id.edit_text1);
        String userName = editText.getText().toString();

        EditText editText1 = (EditText) findViewById(R.id.edit_text2);
        String password = editText1.getText().toString();

        if(userName.equals("SagarSunar") && password.equals("SUNway123")){
            Intent intent = new Intent(this,CallComponent.class);
            intent.putExtra("key",userName);
            startActivity(intent);
        }
        else {
            Toast.makeText(MainActivity.this, "Please check your password", Toast.LENGTH_LONG).show();}
    }
}