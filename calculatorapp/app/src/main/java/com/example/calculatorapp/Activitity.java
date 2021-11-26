package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activitity<val> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitity1);
    }

    public void calculator(View view) {
    Intent action = new Intent(Activitity.this, MainActivity.class);
    startActivity(action);
    }


}