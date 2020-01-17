package com.example.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstNum = findViewById(R.id.firstNumID);
        final EditText secondNum = findViewById(R.id.secondNumID);
        final TextView result = findViewById(R.id.resultID);

        Button addButton = findViewById(R.id.addButtonID);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num1 = Integer.parseInt(firstNum.getText().toString());
                int num2 = Integer.parseInt(secondNum.getText().toString());

                int results = num1 + num2;

                result.setText(results + "");
            }
        });

        Button clearButton = findViewById(R.id.clearButtonID);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firstNum.setText("");
                secondNum.setText("");
                result.setText("");
            }
        });
    }
}
