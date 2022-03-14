package com.example.callapp_individualproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CallComponent extends AppCompatActivity {


    private static final int REQUEST_CALL =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_component);

        Intent intent = getIntent();
        String nameReceive =intent.getStringExtra("key");
        TextView textView = (TextView)findViewById(R.id.textview_new);
        textView.setText(new StringBuilder().append("Hello  ").append(nameReceive).toString());
//        Toast.makeText(MainActivity.this , "sorry", Toast.LENGTH_SHORT).show();
    }
    public void newPage(View view){
        EditText editText = (EditText) findViewById(R.id.edit_text);
        String number = editText.getText().toString();


        if(number.trim().length()>0 && number.length()>=10){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:"+number));
            startActivity(intent);


        }else{
            Toast.makeText(CallComponent.this, "enter phone number", Toast.LENGTH_SHORT).show();
        }
    }
}