package com.ilhanbintez.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var editText1 : EditText
    lateinit var editText2 : EditText
    lateinit var arti : Button
    lateinit var eksi : Button
    lateinit var carpi : Button
    lateinit var bolu : Button
    lateinit var resultText : TextView
    var result : Double? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        arti = findViewById(R.id.arti)
        eksi = findViewById(R.id.eksi)
        carpi = findViewById(R.id.carpi)
        bolu = findViewById(R.id.bolu)
        resultText = findViewById(R.id.resultText)




    }

    fun arti (view : View){
        val num1 = editText1.text.toString().toDoubleOrNull()
        val num2 = editText2.text.toString().toDoubleOrNull()

        if (num1 == null || num2 == null ) {

            resultText.text = "Error!"

        } else {
            result = num1!! + num2!!
            resultText.text = "Result is: ${result}"
        }


    }

    fun eksi (view : View){
        val num1 = editText1.text.toString().toDoubleOrNull()
        val num2 = editText2.text.toString().toDoubleOrNull()

        if (num1 == null || num2 == null ) {

            resultText.text = "Error!"

        } else {
            result = num1!! - num2!!
            resultText.text = "Result is: ${result}"
        }


    }

    fun carpi (view : View){
        val num1 = editText1.text.toString().toDoubleOrNull()
        val num2 = editText2.text.toString().toDoubleOrNull()

        if (num1 == null || num2 == null ) {

            resultText.text = "Error!"

        } else {
            result = num1!! * num2!!
            resultText.text = "Result is: ${result}"
        }


    }

    fun bolu (view : View){
        val num1 = editText1.text.toString().toDoubleOrNull()
        val num2 = editText2.text.toString().toDoubleOrNull()

        if (num1 == null || num2 == null ) {

            resultText.text = "Error!"

        } else {
            result = num1!! / num2!!
            resultText.text = "Result is: ${result}"
        }


    }

}