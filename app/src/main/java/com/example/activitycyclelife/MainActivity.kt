package com.example.activitycyclelife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.activitycyclelife.mymodels.MyData

class MainActivity : AppCompatActivity() {

    private lateinit var myValue : MyData
    //var myValue :String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("MainActivity", "onCreate")

        myValue = ViewModelProvider(this).get(MyData::class.java)

        val btn : Button = findViewById(R.id.btnOk)
        val tv :TextView = findViewById(R.id.tvResult)

//        if (savedInstanceState != null) {
//            myValue = savedInstanceState.getString("value").toString()
//            tv.text = myValue
//        }

        if (myValue != null) {
            tv.text = myValue.name
        }
        btn.setOnClickListener(){
            myValue.name = "John"
            myValue.age = 21
            tv.text = myValue.name
        }
    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//
//        outState.putString("value", myValue)
//    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "onDestroy")
    }
}