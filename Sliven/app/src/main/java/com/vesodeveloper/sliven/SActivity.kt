package com.vesodeveloper.sliven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s)
        var tohistory=findViewById(R.id.tohistory) as Button
        tohistory.setOnClickListener {
            var msg="msg"
            var tohistintent=Intent(this,HistoryActivity::class.java).apply {
                putExtra(msg,msg)
            }
            startActivity(tohistintent)
        }
    }
}