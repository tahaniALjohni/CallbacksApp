package com.example.callbacksapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    val TAGSecondActivity = "Activity2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showToast(this,"onCreate Second Activity")
        Log.d(TAGSecondActivity, "onCreate: ")

        val btnStartSecondActivity = findViewById<Button>(R.id.btnactivity3)
        btnStartSecondActivity.setOnClickListener(object :  View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@SecondActivity,ThirdActivity::class.java)
                startActivity(intent)
            }
        })
    }
    override fun onStart() {
        super.onStart()
        showToast(this,"onStart Second Activity")
        Log.d(TAGSecondActivity, "onStart: ")

    }

    override fun onResume() {
        super.onResume()
        showToast(this,"onResume Second Activity")
        Log.d(TAGSecondActivity, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        showToast(this,"onPause Second Activity")
        Log.d(TAGSecondActivity, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        showToast(this,"onStop Second Activity")
        Log.d(TAGSecondActivity, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToast(this,"onDestroy Second Activity")
        Log.d(TAGSecondActivity, "onDestroy: ")
    }

    fun showToast(context: Context, state:String) {
        Toast.makeText(context,state, Toast.LENGTH_SHORT).show()
    }
}