package com.totemsoft.kutils

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.totemsoft.kutils_lib.general.fragments.ErrorDialog
import com.totemsoft.kutils_lib.view.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun makeTextVisible(view: View) {
        textView1.visible()
    }

    fun makeTextInvisible(view: View) {
        textView1.invisible()
    }

    fun makeTextGone(view: View) {
        textView1.gone()
    }

    fun makeTextClickable(view: View) {
        buttonTest.clickable()
    }

    fun makeTextNotClickable(view: View) {
        buttonTest.notClickable()
    }

    fun showErrorDialog(view: View) {
       ErrorDialog.newInstance("Error", "Some error message...").show(supportFragmentManager, "error_dialog")
    }
}
