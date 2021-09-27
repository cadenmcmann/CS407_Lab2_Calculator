package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView solution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        solution = (TextView) findViewById(R.id.solutionView);
        Intent intent = getIntent();
        String soln = intent.getStringExtra("message");
        solution.setText(soln);

    }
}