package com.totemsoft.kutils_lib.general.fragments

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity

inline fun FragmentManager.transaction(call: FragmentTransaction.() -> FragmentTransaction) {
    beginTransaction().call().commit()
}

fun AppCompatActivity.addFragment(fragment: Fragment, resId: Int) {
    supportFragmentManager.transaction { add(resId, fragment) }
}

fun AppCompatActivity.removeFragment(fragment: Fragment) {
    supportFragmentManager.transaction { remove(fragment) }
}

fun AppCompatActivity.replaceFragment(fragment: Fragment, resId: Int) {
    supportFragmentManager.transaction { replace(resId, fragment) }
}

fun AppCompatActivity.isFragmentInBackStack(tag: String): Boolean {
    val fragment = supportFragmentManager.findFragmentByTag(tag)
    return fragment != null
}

fun AppCompatActivity.isFragmentVisible(tag: String): Boolean {
    val fragment = supportFragmentManager.findFragmentByTag(tag)
    return fragment != null && fragment.isVisible
}

fun AppCompatActivity.getFragmentByTag(tag: String): Fragment? {
    return supportFragmentManager.findFragmentByTag(tag)
}
