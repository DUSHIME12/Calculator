package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText firstnum,lastnum,result ;
    Button add,sub,multi,div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstnum = (EditText)findViewById(R.id.first);
        lastnum = (EditText)findViewById(R.id.last);
        result = (EditText)findViewById(R.id.result);
        add = (Button)findViewById(R.id.badd);
        sub = (Button)findViewById(R.id.bsub);
        div = (Button)findViewById(R.id.bdiv);
        multi = (Button)findViewById(R.id.bmulti);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(firstnum.getText().toString());
                int num2 = Integer.parseInt(lastnum.getText().toString());
                int sum = num1+num2;
                result.setText(Integer.toString(sum));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(firstnum.getText().toString());
                int num2 = Integer.parseInt(lastnum.getText().toString());
                int sub = num1-num2;
                result.setText(Integer.toString(sub));

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(firstnum.getText().toString());
                int num2 = Integer.parseInt(lastnum.getText().toString());
                double divide = num1/num2;
                result.setText(Double.toString(divide));
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(firstnum.getText().toString());
                int num2 = Integer.parseInt(lastnum.getText().toString());
                int multip = num1*num2;
                result.setText(Integer.toString(multip));
            }
        });

    }
}
