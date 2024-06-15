package com.capstone.beyond.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.capstone.beyond.R
import com.google.android.material.button.MaterialButton
import com.capstone.beyond.predict.PredictActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar
        actionBar?.title = "BEYOND"

        val checkTranslateButton: MaterialButton = findViewById(R.id.checkTranslateButton)
        checkTranslateButton.setOnClickListener {
            val intent = Intent(this, PredictActivity::class.java)
            startActivity(intent)
        }

        //checkDictionaryButton
        val checkDictionaryButton: MaterialButton = findViewById(R.id.checkDictionaryButton)
        checkDictionaryButton.setOnClickListener {
            val intent = Intent(this, KamusActivity2::class.java)
            startActivity(intent)
        }
    }

}