package com.totemsoft.kutils_lib.general

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager


fun Activity.showKeyboard() {
    val view = currentFocus ?: View(this)
    val inputService = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    inputService.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT)
}

fun Activity.hideKeyboard() {
    val view = currentFocus ?: View(this)
    val inputService = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    inputService.hideSoftInputFromWindow(view.windowToken, 0)
}

