package com.example.gnualarm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var settime=findViewById(R.id.settime) as EditText
        var setact=findViewById(R.id.setact) as Button
        var timevalue=settime.text.toString()
        var ctime=LocalDateTime.now()
        var form=DateTimeFormatter.ofPattern("HH-mm-ss")
        var formated=ctime.format(form)
        setact.setOnClickListener {
            if (timevalue==formated){
                Toast.makeText(this,"Alarm!!!",Toast.LENGTH_LONG).show()
            }
        }
    }
}
