package com.vesodeveloper.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var username=findViewById(R.id.user) as EditText
        var pass=findViewById(R.id.pass) as EditText
        var act=findViewById(R.id.btndata) as Button
        act.setOnClickListener {
            Toast.makeText(this,"Username is:"+" "+username.text+"Password is:"+" "+pass.text,Toast.LENGTH_LONG).show()
        }
    }
}
