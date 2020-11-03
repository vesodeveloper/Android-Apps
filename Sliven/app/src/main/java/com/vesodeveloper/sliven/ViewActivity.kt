package com.vesodeveloper.sliven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)
        var naturebtn=findViewById(R.id.naturebtn) as ImageView
        var culturebtn=findViewById(R.id.culturebtn) as ImageView
        naturebtn.setOnClickListener {
            var msg="msg"
            var natureintent= Intent(this,NatureActivity::class.java).apply {
                putExtra(msg,msg)
            }
            startActivity(natureintent)
        }
        culturebtn.setOnClickListener {
            var msg="msg"
            var cultureintent=Intent(this,CultureActivity::class.java).apply {
                putExtra(msg,msg)
            }
            startActivity(cultureintent)
        }
    }
}