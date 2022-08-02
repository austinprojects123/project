package com.example.hciproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;



//Second page standard calculator
public class MainActivity2 extends AppCompatActivity {
    public static String string1 = "s1";
    public static String string2 = "s2";

    private EditText userinput1;
    private EditText userinput2;

    private String inputtostring1;
    private String inputtostring2;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        userinput1 = findViewById(R.id.editTextTextPersonName);
        userinput2 = findViewById(R.id.editTextTextPersonName2);
    }


    public void gotoresults(View openthird)
    {
        inputtostring1 = userinput1.getText().toString();
        inputtostring2 =  userinput2.getText().toString();

        Intent changesecond = new Intent(this,MainActivity3.class);

        changesecond.putExtra(string1,inputtostring1);
        changesecond.putExtra(string2,inputtostring2);

        startActivity(changesecond);
    }


}