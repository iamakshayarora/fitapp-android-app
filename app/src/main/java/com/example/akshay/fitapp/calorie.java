package com.example.akshay.fitapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class calorie extends AppCompatActivity {

    int weight,height,age;
    double cal;
    EditText weightInput;
    EditText heightInput;
    EditText ageInput;
    Button see;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie);
        weightInput = (EditText) findViewById(R.id.weightInput);
        heightInput = (EditText) findViewById(R.id.heightInput);
        ageInput = (EditText) findViewById(R.id.ageInput);
        see= (Button) findViewById(R.id.seeButton);
        see.setOnClickListener( new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                weight = Integer.valueOf(weightInput.getText().toString());
                height = Integer.valueOf(heightInput.getText().toString());
                age = Integer.valueOf(ageInput.getText().toString());
                cal=66.4730+(13.7516*weight)+(5.0033*height)-(6.77550*age);
                showToast(String.valueOf(cal));
            }
        });
    }
    private void showToast(String text)
    {
        Toast.makeText(calorie.this,text, Toast.LENGTH_SHORT).show();
    }
    public void display(View v)
    {
        Intent i=new Intent(this,display.class);
        startActivity(i);
    }
    public void plan(View v)
    {
        Intent i=new Intent(this,plan.class);
        startActivity(i);
    }
}
