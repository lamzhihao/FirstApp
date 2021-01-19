package edu.singaporetech.firstapp
import android.util.Log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Lab 01: My First App
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO: add your logging message here.
        Log.i("Main Activity", "Attack of the killer androids")
    }
}
