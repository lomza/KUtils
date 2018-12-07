package com.totemsoft.kutils_lib.general

import com.totemsoft.kutils_lib.BuildConfig

fun Any.TAG(): String {
    return this.let {
        this::class.java.simpleName
    } ?: BuildConfig.APPLICATION_ID
}