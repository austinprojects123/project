package com.example.hciproject;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

//Calculation results for metric
public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        Intent obtaindata = getIntent();
        String weightfromuser = obtaindata.getStringExtra(MainActivity2.string1);
        String heightfromuser = obtaindata.getStringExtra(MainActivity2.string2);

        double weight = Double.parseDouble(weightfromuser);
        double height = Double.parseDouble(heightfromuser);

        double heightsquared = height*height;
        double calculation = (weight / heightsquared);//bmi

        String res1 = Double.toString(weight);
        String res2 = Double.toString(height);
        String round = String.format("%.2f",calculation);

        String bmicategory = "";

        if(Double.parseDouble(round) < 18.50)
        {
            bmicategory = "Underweight";
        }
        if(Double.parseDouble(round) > 18.50 && Double.parseDouble(round) <= 24.99)
        {
            bmicategory = "Normal weight";
        }
        if(Double.parseDouble(round) > 25 && Double.parseDouble(round) <= 29.99)
        {
            bmicategory = "Overweight";
        }
        if(Double.parseDouble(round) > 30)
        {
            bmicategory = "Obese";
        }

        TextView tv1 = findViewById(R.id.textView23);
        TextView tv2 = findViewById(R.id.textView25);
        TextView tv3 = findViewById(R.id.textView26);
        TextView tv4 = findViewById(R.id.textView27);

        tv1.setText(res1);
        tv2.setText(res2);
        tv3.setText(round);
        tv4.setText(bmicategory);

    }
}