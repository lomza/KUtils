package com.totemsoft.kutils

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.doesNotExist
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.view.View
import org.hamcrest.Matchers.not

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ViewTest {

    @get: Rule
    val activityRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun viewShouldBeVisible() {
        onView(withId(R.id.buttonMakeVisible))
            .perform(click())

        onView(withId(R.id.textView1))
            .check(matches(isDisplayed()))
    }

    @Test
    fun viewShouldBeInvisible() {
        onView(withId(R.id.buttonMakeInvisible))
            .perform(click())

        onView(withId(R.id.textView1))
            .check(matches(not(isDisplayed())))
    }

    @Test
    fun viewShouldBeGone() {
        onView(withId(R.id.buttonMakeGone))
            .perform(click())

        onView(withId(R.id.textView1))
            .check(matches(ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.GONE)))
    }

    @Test
    fun viewShouldBeClickable() {
        onView(withId(R.id.buttonMakeClickable))
            .perform(click())

        onView(withId(R.id.buttonTest))
            .check(matches(isClickable()))
    }

    @Test
    fun viewShouldBeNotClickable() {
        onView(withId(R.id.buttonMakeNotClickable))
            .perform(click())

        onView(withId(R.id.buttonTest))
            .check(matches(not(isClickable())))
    }
}
