package com.vesodeveloper.plovdiv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class HistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        var wview=findViewById<WebView>(R.id.wview2)
        wview.loadUrl("https://www.youtube.com/watch?v=lDaXHX4l1bs&t=42s")
        // !!!!!!
    }
}