package com.tahacinar.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.tahacinar.kotlincalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var number1 : Double? = null
    var number2 : Double? = null
    var result : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun mySum(view: View){
        number1 = binding.number1Text.text.toString().toDoubleOrNull()
        number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (number1 != null && number2 !=null ){
            result = number1!! + number2!!
            binding.resultText.text = " Result: ${result}"
        } else {
            binding.resultText.text = " Enter Number"
        }

    }
    fun mySub(view: View){
        number1 = binding.number1Text.text.toString().toDoubleOrNull()
        number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (number1 != null && number2 !=null ){
            result = number1!! - number2!!
            binding.resultText.text = " Result: ${result}"
        } else {
            binding.resultText.text = " Enter Number"
        }

    }
    fun myMultiply(view: View){
        number1 = binding.number1Text.text.toString().toDoubleOrNull()
        number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (number1 != null && number2 !=null ){
            result = number1!! * number2!!
            binding.resultText.text = " Result: ${result}"
        } else {
            binding.resultText.text = " Enter Number"
        }

    }
    fun myDiv(view: View){
        number1 = binding.number1Text.text.toString().toDoubleOrNull()
        number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (number1 != null && number2 !=null ){
            result = number1!! / number2!!
            binding.resultText.text = " Result: ${result}"
        } else {
            binding.resultText.text = " Enter Number"
        }

    }

}