 package com.example.callbacksapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

 class MainActivity : AppCompatActivity() {


    val TAGMainActivity = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast(this,"onCreate MainActivity")
        Log.d(TAGMainActivity, "onCreate:")

        val btnStartSecondActivity = findViewById<Button>(R.id.btnactivity3)
        btnStartSecondActivity.setOnClickListener(object :  View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity,SecondActivity::class.java)
                startActivity(intent)
            }
        })
    }

    override fun onStart() {
        super.onStart()
        showToast(this,"onStart Main Activity ")
        Log.d(TAGMainActivity, "onStart: ")

    }

    override fun onResume() {
        super.onResume()
        showToast(this,"onResume Main Activity ")
        Log.d(TAGMainActivity, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        showToast(this,"onPause Main Activity ")
        Log.d(TAGMainActivity, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        showToast(this,"onStop Main Activity ")
        Log.d(TAGMainActivity, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToast(this,"onDestroy Main Activity ")
        Log.d(TAGMainActivity, "onDestroy: ")
    }

    fun showToast(context: Context, state:String) {
        Toast.makeText(context,state, Toast.LENGTH_SHORT).show()
    }
}