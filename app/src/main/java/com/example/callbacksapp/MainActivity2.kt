package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Toast.makeText(this, "onCreate Activity2", Toast.LENGTH_SHORT).show()
        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            var intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onCreate Activity2", Toast.LENGTH_SHORT).show()
        Log.d("Activity2", "onStart: ")

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onCreate Activity2", Toast.LENGTH_SHORT).show()
        Log.d("Activity2", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onCreate Activity2", Toast.LENGTH_SHORT).show()
        Log.d("Activity2", "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onCreate Activity2", Toast.LENGTH_SHORT).show()
        Log.d("Activity2", "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onCreate Activity2", Toast.LENGTH_SHORT).show()
        Log.d("Activity2", "onDestroy: ")
    }
}