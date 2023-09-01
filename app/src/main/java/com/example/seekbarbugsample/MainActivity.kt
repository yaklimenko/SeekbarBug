package com.example.seekbarbugsample

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatSeekBar
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.swicthButton)

        button.setOnClickListener {
            val seekBar = findViewById<AppCompatSeekBar>(R.id.seekBar)
            seekBar.isVisible = !seekBar.isVisible
            seekBar.isEnabled = !seekBar.isEnabled
        }
    }


}