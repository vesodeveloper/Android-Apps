package com.vesodeveloper.sliven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mainact=findViewById(R.id.mainact) as Button
        var historyact=findViewById(R.id.historyact) as Button
        var viewact=findViewById(R.id.viewact) as Button
        var contactact=findViewById(R.id.contactbtn) as Button
        var mapact=findViewById(R.id.mapact) as Button
        var favplaces=findViewById(R.id.favplaces) as Button
        mainact.setOnClickListener {
            var msg="msg";
            var mainintent=Intent(this,SActivity::class.java).apply {
                putExtra(msg,msg)
            }
            startActivity(mainintent)
        }
        favplaces.setOnClickListener {
            var msg="msg";
            var favplintent=Intent(this,DBActivity::class.java).apply {
                putExtra(msg,msg);
            }
            startActivity(favplintent)
        }
        historyact.setOnClickListener {
            var msg="msg";
            var historyintent=Intent(this,HistoryActivity::class.java).apply {
                putExtra(msg,msg)
            }
            startActivity(historyintent)
        }
        viewact.setOnClickListener {
            var msg="msg";
            var viewintent=Intent(this,ViewActivity::class.java).apply {
                putExtra(msg,msg)
            }
            startActivity(viewintent)
        }
        contactact.setOnClickListener {
            var msg="msg"
            var contactintent=Intent(this,ContactActivity::class.java).apply {
                putExtra(msg,msg)
            }
            startActivity(contactintent)
        }
        mapact.setOnClickListener {
            var msg="msg"
            var mapintent=Intent(this,MapActivity::class.java).apply {
                putExtra(msg,msg)
            }
            startActivity(mapintent)
        }

    }
}