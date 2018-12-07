package com.totemsoft.kutils

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import android.support.test.espresso.matcher.RootMatchers.isDialog
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*

@RunWith(AndroidJUnit4::class)
class DialogTest {

    @get: Rule
    val activityRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun viewShouldBeVisible() {
        onView(withId(R.id.buttonShowErrorDialog))
            .perform(click())

        onView(withResourceName("alertTitle"))
            .inRoot(isDialog())
            .check(matches(withText("Error")))
            .check(matches(isDisplayed()))

        onView(withResourceName("message"))
            .inRoot(isDialog())
            .check(matches(withText("Some error message...")))
            .check(matches(isDisplayed()))

        onView(withResourceName("button1"))
            .inRoot(isDialog())
            .check(matches(withText(android.R.string.ok)))
            .check(matches(isDisplayed()))
    }
}
