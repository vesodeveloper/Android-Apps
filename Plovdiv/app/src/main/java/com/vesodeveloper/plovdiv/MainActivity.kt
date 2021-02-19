package com.vesodeveloper.plovdiv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var placebtn= findViewById<Button>(R.id.placeBtn)
        var historybtn=findViewById<Button>(R.id.historyBtm)
        var homebtn=findViewById<Button>(R.id.homeBtn)
        var contbtn=findViewById<Button>(R.id.ab)
        contbtn.setOnClickListener {
            var m="m";
            var  contintent=Intent(this,ContactActivity::class.java).apply {
                putExtra(m,m)
            }
            startActivity(contintent)
        }
        placebtn.setOnClickListener {
            var m="m";
            var  placeintent=Intent(this,DBActivity::class.java).apply {
                putExtra(m,m)
            }
            startActivity(placeintent)
        }
        historybtn.setOnClickListener {
            var m="m";
            var hisintent=Intent(this,HistoryActivity::class.java).apply {
                putExtra(m,m)
            }
            startActivity(hisintent)
        }
        homebtn.setOnClickListener {
            var m="m";
            var homeintent=Intent(this,HomeActivity::class.java).apply {
                putExtra(m,m)
            }
            startActivity(homeintent)
        }
    }
}