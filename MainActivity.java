package com.example.rubycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstVal, SecondVal;
    TextView ans;
    Button plus, minus, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        firstVal = findViewById(R.id.Number1);
        SecondVal = findViewById(R.id.Number2);
        ans = findViewById(R.id.Answer);
        plus = findViewById(R.id.btnAdd);
        minus = findViewById(R.id.btnSub);
        mul = findViewById(R.id.btnMul);
        div = findViewById(R.id.btnDivi);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstNum,SecondNum;
                int result;
                firstNum = Integer.parseInt(firstVal.getText().toString());
                SecondNum = Integer.parseInt(SecondVal.getText().toString());
                result = firstNum + SecondNum;
                ans.setText("Result is = " +result);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstNum,SecondNum;
                int result;
                firstNum = Integer.parseInt(firstVal.getText().toString());
                SecondNum = Integer.parseInt(SecondVal.getText().toString());
                result = firstNum - SecondNum;
                ans.setText("Result is = " +result);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstNum,SecondNum;
                int result;
                firstNum = Integer.parseInt(firstVal.getText().toString());
                SecondNum = Integer.parseInt(SecondVal.getText().toString());
                result = firstNum * SecondNum;
                ans.setText("Result is = " +result);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float firstNum,SecondNum;
                float result;
                firstNum = Integer.parseInt(firstVal.getText().toString());
                SecondNum = Integer.parseInt(SecondVal.getText().toString());
                result = (float) firstNum / (float) SecondNum;
                ans.setText("Result is = " +result);
            }
        });
    }
}


