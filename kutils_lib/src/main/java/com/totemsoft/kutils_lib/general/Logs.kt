package com.totemsoft.kutils_lib.general

import android.util.Log

fun Any.logV(message: String) { Log.v(this.javaClass.simpleName, message) }

fun Any.logD(message: String) { Log.d(this.javaClass.simpleName, message) }

fun Any.logI(message: String) { Log.i(this.javaClass.simpleName, message) }

fun Any.logW(message: String) { Log.w(this.javaClass.simpleName, message) }

fun Any.logE(message: String) { Log.e(this.javaClass.simpleName, message) }
