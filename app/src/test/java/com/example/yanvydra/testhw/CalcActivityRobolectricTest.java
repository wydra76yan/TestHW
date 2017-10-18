package com.example.yanvydra.testhw;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.android.controller.ActivityController;
import org.robolectric.annotation.Config;


@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 26)
public class CalcActivityRobolectricTest {

    private EditText mNumFirstEdit;
    private EditText mNumSecondEdit;
    private CalcActivity Activity;
    private ICalc mCalc;
    private ActivityController<CalcActivity> activityController;

    @Before
    public void init() {
        Activity = Robolectric.setupActivity(CalcActivity.class);
        activityController.create();
        activityController.start();
        activityController.resume();
    }

    @Test
    public void test() {
        CalcActivity calcActivity = activityController.get();

         mNumFirstEdit = (EditText) calcActivity.findViewById(R.id.etNumFirst);
         mNumSecondEdit = (EditText) calcActivity.findViewById(R.id.etNumFirst);
        TextView mResultTextView = (TextView) calcActivity.findViewById(R.id.tvResult);

        mNumFirstEdit.setText("45");
        mNumSecondEdit.setText("54");
        calcActivity.findViewById(R.id.btnAdd).performClick();

        Assert.assertEquals(mResultTextView.getText().toString(), "99.0");


    }



    @After
    public void onDestroy() {
        activityController.pause();
        activityController.stop();
        activityController.destroy();
    }
}