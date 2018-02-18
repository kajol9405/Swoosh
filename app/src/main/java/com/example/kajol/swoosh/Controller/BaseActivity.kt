package com.example.kajol.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kajol.swoosh.R

open class BaseActivity : AppCompatActivity() {

    val TAG = javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"${javaClass.simpleName}OnCreate")
        setContentView(R.layout.activity_base)
    }

    override fun onStart() {
        Log.d(TAG,"${javaClass.simpleName}OnStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"${javaClass.simpleName}onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"${javaClass.simpleName}onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"${javaClass.simpleName}onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG,"${javaClass.simpleName}onDestroy")
        super.onDestroy()
    }

}
