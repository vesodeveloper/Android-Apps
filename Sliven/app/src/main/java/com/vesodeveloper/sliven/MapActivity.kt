package com.vesodeveloper.sliven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.google.android.gms.maps.MapView

class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
        var mapweb=findViewById(R.id.mapweb) as WebView
        mapweb.loadUrl("https://www.google.com/maps/d/edit?mid=1gSLtaOCQjDLi7hxVsVprl7EOrmwWI6Fm&usp=sharing")
    }
}