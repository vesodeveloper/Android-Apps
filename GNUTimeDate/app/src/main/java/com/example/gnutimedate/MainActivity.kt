package com.example.gnutimedate

import android.animation.TimeAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.text.DateFormat
import java.text.Format
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var datebtn=findViewById(R.id.datebtn) as Button
        var timebtn=findViewById(R.id.timebtn) as Button
       var cdate=LocalDateTime.now()
        var curdate=DateTimeFormatter.ofPattern("dd-MM-yyyy")
        var form1=cdate.format(curdate)
        var curtime=DateTimeFormatter.ofPattern("HH-mm-ss")
        var form2=cdate.format(curtime)
        datebtn.setOnClickListener {
            Toast.makeText(this,"Date is:",Toast.LENGTH_LONG).show()
            Toast.makeText(this,form1,Toast.LENGTH_LONG).show() }
        timebtn.setOnClickListener {
            Toast.makeText(this,"Time is:",Toast.LENGTH_LONG).show()
            Toast.makeText(this,form2,Toast.LENGTH_LONG).show() }
    }
}
