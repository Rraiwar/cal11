package com.example.cal

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.cal11.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus.setOnClickListener {
            cal.text = "+"
            var cnum1 = num1.text.toString()
            var cnum2 = num2.text.toString()
            if(cnum1 == "" || cnum2 == ""){
                toast {
                    "Please Input Num1 and Num2!!!"
                }
                cal.text = ""
                num1.setText("")
                num2.setText("")
            }
            else {
                var cresult = cnum1.toDouble() + cnum2.toDouble()
                result.setText(cresult.toString())
            }
        }
        minus.setOnClickListener {
            cal.text = "-"
            var cnum1 = num1.text.toString()
            var cnum2 = num2.text.toString()
            if(cnum1 == "" || cnum2 == ""){
                toast {
                    "Please Input Num1 and Num2!!!"
                }
                cal.text = ""
                num1.setText("")
                num2.setText("")
            }
            else {
                var cresult = cnum1.toDouble() - cnum2.toDouble()
                result.setText(cresult.toString())
            }
        }
        multiply.setOnClickListener {
            cal.text = "*"
            var cnum1 = num1.text.toString()
            var cnum2 = num2.text.toString()
            if(cnum1 == "" || cnum2 == ""){
                toast {
                    "Please Input Num1 and Num2!!!"
                }
                cal.text = ""
                num1.setText("")
                num2.setText("")
            }
            else {
                var cresult = cnum1.toDouble() * cnum2.toDouble()
                result.setText(cresult.toString())
            }
        }
        divider.setOnClickListener {
            cal.text = "/"
            var cnum1 = num1.text.toString()
            var cnum2 = num2.text.toString()
            if(cnum1 == "" || cnum2 == ""){
                toast {
                    "Please Input Num1 and Num2!!!"
                }
                cal.text = ""
                num1.setText("")
                num2.setText("") }
            else if(cnum2 == "0"){
                toast {
                    "Do Not Num2 is Zero or Null!!!"
                }
                cal.text = ""
                num1.setText("")
                num2.setText("")
            }
            else {
                var cresult = cnum1.toDouble() / cnum2.toDouble()
                result.setText(cresult.toString())
            }
        }
        modulo.setOnClickListener {
            cal.text = "%"
            var cnum1 = num1.text.toString()
            var cnum2 = num2.text.toString()
            if(cnum1 == "" || cnum2 == ""){
                toast {
                    "Please Input Num1 and Num2!!!"
                }
                cal.text = ""
                num1.setText("")
                num2.setText("")
            }
            else {
                var cresult = cnum1.toDouble() % cnum2.toDouble()
                result.setText(cresult.toString())
            }
        }
        clear.setOnClickListener {
            num1.setText("")
            num2.setText("")
            result.setText("")
            cal.text = ""
        }
    }
}
inline fun Context.toast(message:()->String){
    Toast.makeText(this, message(), Toast.LENGTH_LONG).show()
}

