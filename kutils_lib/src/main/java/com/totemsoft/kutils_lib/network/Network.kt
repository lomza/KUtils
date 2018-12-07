package com.totemsoft.kutils_lib.network

import android.content.Context
import android.content.Context.CONNECTIVITY_SERVICE
import android.net.ConnectivityManager
import android.net.NetworkCapabilities.*
import android.os.Build


fun Context.isInternet(): Boolean {
    val connectivityManager = getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
    return connectivityManager.activeNetworkInfo?.isConnected.let { it } ?: false
}

fun Context.isWiFi(): Boolean {
    val connectivityManager = getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
        val networks = connectivityManager.allNetworks
        for (network in networks) {
            val capabilities = connectivityManager.getNetworkCapabilities(network)
            if (capabilities.hasTransport(TRANSPORT_WIFI)) {
                return true
            }
        }
    } else {
        return connectivityManager.activeNetworkInfo?.type == ConnectivityManager.TYPE_WIFI
    }

    return false
}

fun Context.isMobileNetwork(): Boolean {
    val connectivityManager = getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
        val networks = connectivityManager.allNetworks
        for (network in networks) {
            val capabilities = connectivityManager.getNetworkCapabilities(network)
            if (capabilities.hasTransport(TRANSPORT_CELLULAR)) {
                return true
            }
        }
    } else {
        return connectivityManager.activeNetworkInfo?.type == ConnectivityManager.TYPE_MOBILE
    }

    return false
}

fun Context.isVPN(): Boolean {
    val connectivityManager = getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
        val networks = connectivityManager.allNetworks
        for (network in networks) {
            val capabilities = connectivityManager.getNetworkCapabilities(network)
            if (capabilities.hasTransport(TRANSPORT_VPN)) {
                return true
            }
        }
    } else {
        return connectivityManager.activeNetworkInfo?.type == ConnectivityManager.TYPE_VPN
    }

    return false
}
