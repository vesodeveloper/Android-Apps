package com.vesodeveloper.sliven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class HistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        var vw=findViewById(R.id.vw) as WebView
        var toview=findViewById(R.id.toview) as Button
        vw.loadUrl("https://www.youtube.com/watch?v=MEBEABmzG4M")
        toview.setOnClickListener {
            var msg="msg"
            var viewintent= Intent(this,ViewActivity::class.java).apply {
                putExtra(msg,msg)
            }
            startActivity(viewintent)
        }

    }
}