package com.vesodeveloper.sliven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        var licensebtn=findViewById(R.id.licensebtn) as Button
        var appbtn=findViewById(R.id.appbtn) as Button
        appbtn.setOnClickListener {
            Toast.makeText(this,"Приложението е посветено на град Сливен. За контакт с програмиста: vrstanchev@gmail.com",Toast.LENGTH_LONG).show()
        }
        licensebtn.setOnClickListener {
            Toast.makeText(this,"Приложението е лицензирано под Свободния GNU GPL лиценз",Toast.LENGTH_LONG).show()
        }
    }
}