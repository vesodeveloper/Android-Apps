package com.example.simpleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var image=findViewById(R.id.image1) as ImageView
        var vimage=findViewById(R.id.vimage) as Button
        var himage=findViewById(R.id.himage) as Button
        image.isVisible=false;
        vimage.setOnClickListener { image.isVisible=true; Toast.makeText(this,"Flower is visible now",Toast.LENGTH_LONG).show() }
        himage.setOnClickListener { image.isVisible=false; Toast.makeText(this,"Flower is hidden now",Toast.LENGTH_LONG).show() }
    }
}
