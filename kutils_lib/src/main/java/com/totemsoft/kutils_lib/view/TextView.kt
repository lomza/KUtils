package com.totemsoft.kutils_lib.view

import android.os.Build
import android.text.Html
import android.widget.TextView

fun TextView.setHtml(html: String) {
    text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        Html.fromHtml(html, Html.FROM_HTML_MODE_COMPACT)
    } else {
        Html.fromHtml(html)
    }
}

fun TextView.selectable() {
    setTextIsSelectable(true)
}

fun TextView.notSelectable() {
    setTextIsSelectable(false)
}
