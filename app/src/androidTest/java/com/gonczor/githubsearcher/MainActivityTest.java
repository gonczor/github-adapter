package com.gonczor.githubsearcher;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.gonczor.githubsearcher.activities.MainActivity;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.Rule;

import static org.junit.Assert.*;

public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void testOnCreate() throws Exception {
        Espresso.onView(ViewMatchers.withId(R.id.text_view)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }

}
