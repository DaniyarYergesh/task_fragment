package com.example.homework_136

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<TextView>(R.id.onStart).setOnClickListener {
        val transaction = supportFragmentManager
            .beginTransaction()
            .add(R.id.fragmentContainer2, MainFragment(), "MainFragment")
        transaction.addToBackStack(null)
        transaction.commit()}

        findViewById<TextView>(R.id.go).setOnClickListener {
            val transaction = supportFragmentManager
                .popBackStack()
        }

        findViewById<TextView>(R.id.back).setOnClickListener {
            val transaction = supportFragmentManager
                .popBackStack()
        }
    }
}