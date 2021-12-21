package com.example.callbacksapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class ThirdActivity : AppCompatActivity() {

    val TAGThirdActivity = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        showToast(this,"onCreate Third Activity")
        Log.d(TAGThirdActivity, "onCreate:")
    }

    override fun onStart() {
        super.onStart()
        showToast(this,"onStart ThirdActivity ")
        Log.d(TAGThirdActivity, "onStart: ")

    }

    override fun onResume() {
        super.onResume()
        showToast(this,"onResume ThirdActivity ")
        Log.d(TAGThirdActivity, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        showToast(this,"onPause Third Activity")
        Log.d(TAGThirdActivity, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        showToast(this,"onStop Third Activity ")
        Log.d(TAGThirdActivity, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToast(this,"onDestroy Third Activity ")
        Log.d(TAGThirdActivity, "onDestroy: ")
    }

    fun showToast(context: Context, state:String) {
        Toast.makeText(context,state, Toast.LENGTH_SHORT).show()
    }
}