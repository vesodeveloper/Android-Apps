package com.example.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
var img1=findViewById(R.id.img1) as ImageView
var img2=findViewById(R.id.img2) as ImageView
var img3=findViewById(R.id.img3) as ImageView
 var img4=findViewById(R.id.img4) as ImageView
var rebtn=findViewById(R.id.reload) as Button
 img1.setOnClickListener {
     img2.isVisible=false;
     img3.isVisible=false;
     img4.isVisible=false;


 }
        img2.setOnClickListener {
            img1.isVisible=false;
            img3.isVisible=false;
            img4.isVisible=false;

        }
        img3.setOnClickListener {
            img1.isVisible=false;
            img2.isVisible=false;
            img4.isVisible=false;

        }
        img4.setOnClickListener {
            img1.isVisible=false;
            img2.isVisible=false;
            img3.isVisible=false;

        }
        rebtn.setOnClickListener {
            img1.isVisible=true;
            img2.isVisible=true;
            img3.isVisible=true;
            img4.isVisible=true;

        }

    }
}
