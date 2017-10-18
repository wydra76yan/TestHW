package com.example.yanvydra.testhw;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class CalcActivityEspressoTest {

    @Rule
    public final ActivityTestRule<CalcActivity> activityTestRule = new ActivityTestRule<>(CalcActivity.class);

    @Test
    public void AddButtonTest(){
        onView(withId(R.id.etNumFirst))
                .perform(typeText("5"));
        onView(withId(R.id.etNumSecond))
                .perform(typeText("6"));

        onView(withId(R.id.btnAdd))
                .perform(click());

        onView(withId(R.id.tvResult))
                .check(matches(withText("11.0")));
    }

    @Test
    public void SubButtonTest(){
        onView(withId(R.id.etNumFirst))
                .perform(typeText("5"));
        onView(withId(R.id.etNumSecond))
                .perform(typeText("6"));

        onView(withId(R.id.btnSub))
                .perform(click());

        onView(withId(R.id.tvResult))
                .check(matches(withText("-1.0")));
    }

}