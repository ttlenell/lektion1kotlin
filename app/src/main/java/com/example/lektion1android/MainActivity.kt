package com.example.lektion1android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AbsListView
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    val TAG = MainActivity::class.java.simpleName
    lateinit var editText : EditText
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"Hejsan   ")

        editText = findViewById<EditText>(R.id.inputText)
        val button = findViewById<Button>(R.id.button)

        button.text = "Tryck"

        button.setOnClickListener{ v ->
           val message = editText.text.toString()
           Log.d(TAG, message)

        }

    }
        /*
    fun buttonPressed(view : View) {
        val message = editText.text.toString()

                     Log.d(TAG, message)

        editText.text
    }
    
         */

}
