package com.totemsoft.kutils_lib.view

import android.app.Activity
import android.view.View

fun Activity.showStatusBar() {
    window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
}

fun Activity.hideStatusBar() {
    window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
}