package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.input);
        display.setShowSoftInputOnFocus(false);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getString(R.string.display).equals(display.getText().toString()))
                    display.setText("");

            }
        })
    }

    private void updateText(String strToAdd){
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        if(getString(R.string.display).equals(display.getText().toString())){
            display.setText(strToAdd);
            display.setSelection(cursorPos + 1);

        }
        else {
            display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
            display.setSelection(cursorPos + 1);
        }
    }


    public void zeroBTN(View view) {

        String strToAdd;
        updateText(strToAdd:"0");

    }
    public void oneBTN(View view) {
        String strToAdd;
        updateText(strToAdd:"1");

    }
    public void twoBTN(View view) {
        String strToAdd;
        updateText(strToAdd:"2");

    }
    public void threeBTN(View view) {
        String strToAdd;
        updateText(strToAdd:"3");

    }
    public void fourBTN(View view) {
        String strToAdd;
        updateText(strToAdd:"4");

    }
    public void fiveBTN(View view) {
        String strToAdd;
        updateText(strToAdd:"5");

    }
    public void sixBTN(View view) {
        String strToAdd;
        updateText(strToAdd:"6");

    }
    public void sevenBTN(View view) {
        String strToAdd;
        updateText(strToAdd:"7");

    }
    public void eightBTN(View view) {
        String strToAdd;
        updateText(strToAdd:"8");

    }
    public void nineBTN(View view) {
        String strToAdd;
        updateText(strToAdd:"9");

    }
    public void clearBTN(View view) {
       display.setText("");

    }
    public void exponentBTN(View view) {
        String strToAdd;
        updateText(strToAdd:"^");

    }
    public void parenthesesBTN(View view) {
        int cursorPos = display.getAccessibilityLiveRegion();
        int openPar = 0;
        int closedPar = 0;
        int textLen = display.getText().length();

        for(int i = 0; i< cursorPos; i++){
            if(display.getText().toString().substring(i, i+1).equals("(")){
                openPar += 1;
            }
            if(display.getText().toString().substring(i, i+1).equals(")")){
                closedPar += 1;
            }
        }

        if(openPar == closedPar || display.getText().toString().substring(textLen - 1, textLen).equals("(")){
            String strToAdd;
            updateText(strToAdd:"(");
            display.setSelection(cursorPos + 1);
        }
        else if(closedPar == openPar && !display.getText().toString().substring(textLen - 1, textLen).equals("(")){
            String strToAdd;
            updateText(strToAdd:")");

        }
        display.setSelection(cursorPos + 1);


    }
    public void divideBTN(View view) {
        String strToAdd;
        updateText(strToAdd:"/");

    }
    public void multiplyBTN(View view) {
        String strToAdd;
        updateText(strToAdd:"*");

    }
    public void addBTN(View view) {
        String strToAdd;
        updateText(strToAdd:"+");

    }
    public void subtractBTN(View view) {
        String strToAdd;
        updateText(strToAdd:"-");

    }
    public void plusMinusBTN(View view) {
        String strToAdd;
        updateText(strToAdd:"*/-");

    }
    public void pointBTN(View view) {
        String strToAdd;
        updateText(strToAdd:".");

    }
    public void equalsBTN(View view) {


    }
    public void backspaceBTN(View view) {
        int cursorPos = display.getSelectionStart();
        int textLen = display.getText().length();

        if(cursorPos != 0 && textLen != 0){
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            CharSequence tb;
            selection.replace(cursorPos - 1, cursorPos, tb:"");
            display.setText(selection);
            display.setSelection(cursorPos -1 );
        }


    }




}