package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText firstNum;
    EditText secondNum;

    public void handleAdd (View view) {

        double firstValue = Double.parseDouble(firstNum.getText().toString());
        double secondValue = Double.parseDouble(secondNum.getText().toString());

        double answer = firstValue + secondValue;

        goToAct2(String.valueOf(answer));

    }

    public void handleSubtract (View view) {
        double firstValue = Double.parseDouble(firstNum.getText().toString());
        double secondValue = Double.parseDouble(secondNum.getText().toString());

        double answer = firstValue - secondValue;
        goToAct2(String.valueOf(answer));

    }

    public void handleMultiply (View view) {
        double firstValue = Double.parseDouble(firstNum.getText().toString());
        double secondValue = Double.parseDouble(secondNum.getText().toString());

        double answer = firstValue * secondValue;
        goToAct2(String.valueOf(answer));
    }

    public void handleDivision (View view) {
        double firstValue = Double.parseDouble(firstNum.getText().toString());
        double secondValue = Double.parseDouble(secondNum.getText().toString());

        double answer = firstValue / secondValue;


        goToAct2(String.valueOf(answer));
    }

    public void goToAct2(String str) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", str);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNum = (EditText) findViewById(R.id.firstNumberView);
        secondNum = (EditText) findViewById(R.id.secondNumberView);
    }
}