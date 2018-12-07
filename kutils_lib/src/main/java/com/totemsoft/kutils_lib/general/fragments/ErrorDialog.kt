package com.totemsoft.kutils_lib.general.fragments

import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v7.app.AlertDialog


class ErrorDialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val title = arguments?.getString(TITLE_PARAM) ?: ""
        val message = arguments?.getString(MESSAGE_PARAM) ?: ""

        return AlertDialog.Builder(requireContext())
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton(android.R.string.ok) { _, _ -> }
            .create()
    }

    companion object {
        const val TITLE_PARAM = "title"
        const val MESSAGE_PARAM = "message"

        fun newInstance(title: String, message: String): ErrorDialog {
            val fragment = ErrorDialog()
            val bundle = Bundle()
            bundle.putString(TITLE_PARAM, title)
            bundle.putString(MESSAGE_PARAM, message)
            fragment.arguments = bundle

            return fragment
        }
    }
}