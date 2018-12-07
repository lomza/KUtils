package com.totemsoft.kutils_lib.view

import android.widget.EditText

fun EditText.setCursorAtTheEnd() {
    setSelection(text.length)
}
