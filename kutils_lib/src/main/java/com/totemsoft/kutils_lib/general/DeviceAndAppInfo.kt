package com.totemsoft.kutils_lib.general

import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources
import android.graphics.Point
import android.os.Build
import android.view.WindowManager
import com.totemsoft.kutils_lib.BuildConfig
import com.totemsoft.kutils_lib.R
import java.util.*

fun getVersion() = Build.VERSION.SDK_INT

fun getReadableVersion() = Build.VERSION.RELEASE

fun getPackageName() = BuildConfig.APPLICATION_ID

fun getManufacturer() = Build.MANUFACTURER

fun getModel() = Build.MODEL

fun getLanguage() = Locale.getDefault().language

fun getLocale(): Locale {
    return if (Build.VERSION.SDK_INT > Build.VERSION_CODES.M) {
        Resources.getSystem().configuration.locales[0]
    } else {
        Resources.getSystem().configuration.locale
    }
}

fun getCountry() = Locale.getDefault().country

fun Context.getScreenSize(): IntArray {
    val size = IntArray(2)
    val windowManager = getSystemService(Context.WINDOW_SERVICE) as WindowManager
    val display = windowManager.defaultDisplay
    val point = Point()
    display.getSize(point)
    size[0] = point.x
    size[1] = point.y

    return size
}

fun Context.isLandscape() = resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE

fun Context.isPortrait() = resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT

fun Context.isTablet() = resources.getBoolean(R.bool.isTablet)