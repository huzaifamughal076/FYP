package com.example.fyp_code.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.fyp_code.R;

public class HomeActivity extends AppCompatActivity {

    LinearLayout Lesson1;
    LinearLayout Lesson2;
    LinearLayout Lesson3;
    LinearLayout Lesson4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Lesson1 = findViewById(R.id.lesson1);
        Lesson2 = findViewById(R.id.lesson2);
        Lesson3 = findViewById(R.id.lesson3);
        Lesson4 = findViewById(R.id.lesson4);

        Lesson1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, Addition.class);
                startActivity(i);
            }
        });
        Lesson2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, Subtraction.class);
                startActivity(i);
            }
        });
        Lesson3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, Multiplication.class);
                startActivity(i);
            }
        });
        Lesson4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, Divide.class);
                startActivity(i);
            }
        });
    }
}