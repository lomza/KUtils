package com.totemsoft.kutils_lib.view

import android.view.View

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

fun View.clickable() {
    isClickable = true
}

fun View.notClickable() {
    isClickable = false
}
