package com.example.yanvydra.testhw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CalcActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etNum1;
    private EditText etNum2;
    private TextView tvResult;
    private ICalc calcM;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        calcM = new Calc();
        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);
        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        Button btnSub = (Button) findViewById(R.id.btnSub);
        tvResult = (TextView) findViewById(R.id.tvResult);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        double num1;
        double num2;

        num1 = Double.parseDouble(etNum1.getText().toString());
        num2 = Double.parseDouble(etNum2.getText().toString());

        switch (v.getId()) {
            case R.id.btnAdd:
                tvResult.setText(calcM.add(num1, num2).toString());
                break;
            case R.id.btnSub:
                tvResult.setText(calcM.sub(num1, num2).toString());
                break;

            default:
                break;
        }
    }



}