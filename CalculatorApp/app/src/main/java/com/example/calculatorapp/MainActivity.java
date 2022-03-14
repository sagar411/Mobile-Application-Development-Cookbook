package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import org.mariuszgromada.math.mxparser.*;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText display;
private EditText resultDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.inputnumber);
        display.setShowSoftInputOnFocus(false);

        resultDisplay = findViewById(R.id.result);
        

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getString(R.string.diplay).equals(display.getText().toString())){
                    display.setText("");
                }
            }
        });

    }
    private  void  updateText(String strTooAdd){
        String oldStr= display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0,cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        if(getString(R.string.diplay).equals(display.getText().toString())){
            display.setText(strTooAdd);
            display.setSelection(cursorPos+1);
        }else {
            display.setText(String.format("%s%s%s",leftStr,strTooAdd,rightStr));
            display.setSelection(cursorPos+1);
        }
    }
    public void zeroBTN(View view){
        updateText("0");

    }
    public void oneBTN(View view){

        updateText("1");
    }
    public void twoBTN(View view){
        updateText("2");

    }
    public void threeBTN(View view){
        updateText("3");
    }
    public void fourBTN(View view){
        updateText("4");

    }
    public void fiveBTN(View view){
        updateText("5");

    }
    public void sixBTN(View view){
        updateText("6");

    }
    public void sevenBTN(View view){
        updateText("7");

    }
    public void eightBTN(View view){
        updateText("8");

    }

    public void nineBTN(View view){
        updateText("9");

    }
    public void addBTN(View view){
        updateText("+");

    }

    public void subractBTN(View view){
        updateText("-");

    }

    public void multiplyBTN(View view){
        updateText("*");

    }
    public void divideBTN(View view){
        updateText("/");

    }
    public void equalBTN(View view){
         String userExp = display.getText().toString();
         userExp = userExp.replace("÷","/");

         Expression exp = new Expression(userExp);

         String result = String.valueOf(exp.calculate());

         resultDisplay.setText(result);

    }
    public void clearBTN(View view){
        display.setText("0.0");
        resultDisplay.setText("0.0");

    }
    public void crossBTN(View view){
        int cursorPos =display.getSelectionStart();
        int textLen = display.getText().length();

        if(cursorPos !=0 && textLen !=0){
            SpannableStringBuilder selection =(SpannableStringBuilder) display.getText();
            selection.replace(cursorPos-1,cursorPos,"");
            display.setText(selection);
            display.setSelection(cursorPos-1);

        }


    }
    public void squarBTN(View view){
        updateText("^");
    }
    public void parBTN(View view){
        int cursorPos =display.getSelectionStart();
        int openPar =0;
        int closedPar =0;
        int textLen =display.getText().length();

        for(int i =0; i<cursorPos; i++){
            if(display.getText().toString().substring(i,i+1).equals("(")){
                openPar +=1;
            }
            if(display.getText().toString().substring(i,i+1).equals(")")){
                closedPar +=1;
            }


        }
        if(openPar==closedPar|| display.getText().toString().substring(textLen-1, textLen).equals("(")){
            updateText("(");
            display.setSelection(cursorPos+1);
        }
        else if(closedPar<openPar && !display.getText().toString().substring(textLen-1, textLen).equals("(")){
            updateText(")");
            display.setSelection(cursorPos+1);
        }


    }
    public void dotBTN(View view){
        updateText(".");

    }

}