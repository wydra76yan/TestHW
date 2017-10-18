package com.example.yanvydra.testhw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CalcActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mNumFirstEdit;
    private EditText mNumSecondEdit;
    private TextView mResultTextView;
    private ICalc mCalc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        mCalc = new Calc();
        mNumFirstEdit = (EditText) findViewById(R.id.etNumFirst);
        mNumSecondEdit = (EditText) findViewById(R.id.etNumSecond);
        Button mBtnAdd = (Button) findViewById(R.id.btnAdd);
        Button mBtnSub = (Button) findViewById(R.id.btnSub);
        mResultTextView = (TextView) findViewById(R.id.tvResult);
        mBtnAdd.setOnClickListener(this);
        mBtnSub.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        double firstNum;
        double secondNum;

        firstNum = Double.parseDouble(mNumFirstEdit.getText().toString());
        secondNum = Double.parseDouble(mNumSecondEdit.getText().toString());

        switch (v.getId()) {
            case R.id.btnAdd:
                mResultTextView.setText(mCalc.add(firstNum, secondNum).toString());
                break;
            case R.id.btnSub:
                mResultTextView.setText(mCalc.sub(firstNum, secondNum).toString());
                break;

            default:
                break;
        }
    }



}