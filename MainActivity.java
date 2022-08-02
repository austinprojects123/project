package com.example.hciproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

//Home Title
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void opensecondpart(View opensecond)
    {
        startActivity(new Intent(this,MainActivity2.class));
    }
    public void openmetric(View openmetric)
    {
        startActivity(new Intent(this,MainActivity4.class));
    }



}