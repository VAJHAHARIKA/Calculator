package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView result;
    EditText num1,num2;
    Button add,subtract,multiply,divide;
    float res;
    float number1,number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        result= (TextView)findViewById(R.id.result);
        num1= (EditText)findViewById(R.id.num1);
        num2= (EditText)findViewById(R.id.num2);
        add= (Button)findViewById(R.id.add);
        subtract= (Button)findViewById(R.id.subtract);
        multiply= (Button)findViewById(R.id.multiply);
        divide= (Button)findViewById(R.id.divide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());
                res= number1+number2;
                result.setText(String.valueOf(res));


            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());
                res= number1-number2;
                result.setText(String.valueOf(res));


            }
        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());
                res= number1*number2;
                result.setText(String.valueOf(res));


            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Float.parseFloat(num1.getText().toString());
                number2 = Float.parseFloat(num2.getText().toString());
                res= number1/ number2;
                result.setText(String.valueOf(res));


            }
        });



    }
}
