package com.example.doubleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void onSendMessage(View view){

        EditText editText = (EditText) findViewById(R.id.edit_txt);
        String msg = editText.getText().toString();
        Intent intent = new Intent(this,RecieveMessage.class);
        intent.putExtra("key", msg);
        startActivity(intent);

//        Intent intent =new Intent(Intent.ACTION_SEND);
//        intent.setType("text/plain");
//        intent.putExtra(Intent.EXTRA_TEXT,msg);
//        startActivity(intent);
//        Log.i("message",msg);
//
//        Intent choose = intent.createChooser(intent,"Sen");
//        startActivity(choose);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}