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

    private EditText etNum1;
    private EditText etNum2;
    private CalcActivity Activity;
    private ICalc MCalc;
    private ActivityController<CalcActivity> activityController;

    @Before
    public void init() {
        Activity = Robolectric.setupActivity(CalcActivity.class);
    }

    @Test
    public void test() {
        activityController.create();
        activityController.start();
        activityController.resume(); //TODO move this methods in init-method

        CalcActivity calcActivity = activityController.get();

         etNum1 = (EditText) calcActivity.findViewById(R.id.etNum1);
         etNum2 = (EditText) calcActivity.findViewById(R.id.etNum2);
        TextView tvResult = (TextView) calcActivity.findViewById(R.id.tvResult);

        etNum1.setText("45");
        etNum2.setText("54");
        calcActivity.findViewById(R.id.btnAdd).performClick();

        Assert.assertEquals(tvResult.getText().toString(), "99.0");


    }



    @After
    public void onDestroy() {
        activityController.pause();
        activityController.stop();
        activityController.destroy();
    }
}
