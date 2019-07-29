package com.example.student.myapplication12345;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private EditText num1,num2;
    private TextView display;
    String input1,input2,displayAns;
    private int n1,n2,ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num1 = findViewById(R.id.txtNum3);
        num2 = findViewById(R.id.txtNum4);

        display = findViewById(R.id.txtnum5);

        Intent intent = getIntent();

        input1 = intent.getStringExtra(MainActivity12345.NUMBER_1);
        input2 = intent.getStringExtra(MainActivity12345.NUMBER_2);

        num1.setText(input1);
        num2.setText(input2);

        n1 =Integer.parseInt(input1);
        n2= Integer.parseInt(input2);
    }

public  void displayAnswer(String displayAns){
        display.setText(displayAns);
}
    public void addNumbers(View view) {
        ans = n1 + n2;
        displayAns = input1 + "+" + input2 + "=" + ans;
        displayAnswer(displayAns);
    }

    public void subtract(View view){
        ans = n1- n2;
        displayAns = input1 + "-" +input2+"="+ans;
        displayAnswer(displayAns);
        }

        public void multiply(View view){
        ans = n1 * n2;
        displayAns =input1+"*"+input2+"="+ans;
        displayAnswer(displayAns);
    }

    public void divide(View view){
        ans = n1 /n2;
        displayAns =input1+"/"+input2+"="+ans;
        displayAnswer(displayAns);
    }
}
