package com.totemsoft.kutils_lib.general.fragments

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.annotation.Nullable
import android.view.View

interface BaseView {

    @LayoutRes
    fun getContentResource(): Int

    fun init(view: View, @Nullable state: Bundle?)
}
