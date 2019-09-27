package com.example.gnuvideos

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.VideoView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
var vid1=findViewById(R.id.vid1) as VideoView
var video1=findViewById(R.id.Video1) as Button
var ch1=findViewById(R.id.ch1) as CheckBox
var ch2=findViewById(R.id.ch2) as CheckBox
var fres="android.resource://"+ packageName +"/"+ R.raw.film1
vid1.setVideoURI(Uri.parse(fres))
        ch1.isVisible=false
        ch2.isVisible=false
        vid1.isVisible=false
video1.setOnClickListener {
    ch1.isVisible=true
    ch2.isVisible=true
   vid1.isVisible=true
    ch1.setOnClickListener { vid1.start()  }
    ch2.setOnClickListener { vid1.pause() }

}
var vid2=findViewById(R.id.vid2) as VideoView
var video2=findViewById(R.id.Video2) as Button
var ch3=findViewById(R.id.ch3) as CheckBox
var ch4=findViewById(R.id.ch4) as CheckBox
var fres2="android.resource://"+ packageName+"/"+R.raw.film2
vid2.setVideoURI(Uri.parse(fres2))
 ch3.isVisible=false
 ch4.isVisible=false
 vid2.isVisible=false
 video2.setOnClickListener {
     ch3.isVisible=true
     ch4.isVisible=true
     vid2.isVisible=true
     ch3.setOnClickListener { vid2.start()  }
     ch4.setOnClickListener { vid2.pause() }
 }


    }
}
