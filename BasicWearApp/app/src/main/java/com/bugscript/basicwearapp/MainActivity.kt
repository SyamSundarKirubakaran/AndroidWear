package com.bugscript.basicwearapp

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setAmbientEnabled()
    }

    fun onSwitchClicked(view: View) {
        if (switch1.isChecked) {
            text1.text = "Green Hills"
            imageView.visibility = View.VISIBLE
        } else {
            text1.text = "Blank Screen"
            imageView.visibility = View.GONE
        }
    }
}
