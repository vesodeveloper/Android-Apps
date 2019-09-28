package com.vesodeveloper.gnumusicplayer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SearchView
import android.widget.Switch
import androidx.core.graphics.drawable.toDrawable
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
  var MP:MediaPlayer?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var skybtn=findViewById(R.id.skybtn) as Button
        var skyswitch=findViewById(R.id.skyswitch) as Switch
        var repsky=findViewById(R.id.repsky) as Button
        skyswitch.isVisible=false
        repsky.isVisible=false
        skybtn.setOnClickListener {
            skyswitch.isVisible=true
            repsky.isVisible=true
            MP= MediaPlayer.create(this,R.raw.music1)
            skyswitch.setOnCheckedChangeListener({_,isChecked -> if (isChecked){MP?.start()}
            else { MP?.pause()}
            })

           repsky.setOnClickListener {
               while (true){ MP?.start()}
           }
        }
        var pembtn=findViewById(R.id.pembtn) as Button
        var pemswitch=findViewById(R.id.pemswitch) as Switch
        var reprem=findViewById(R.id.reprem) as Button
        pemswitch.isVisible=false
        reprem.isVisible=false
        pembtn.setOnClickListener {
            pemswitch.isVisible=true
            reprem.isVisible=true
            repsky.isClickable=false
            MP= MediaPlayer.create(this,R.raw.music2)
            pemswitch.setOnCheckedChangeListener({_,isChecked -> if (isChecked){MP?.start()}
            else { MP?.pause()}
            })
            reprem.setOnClickListener {
                while (true) {  MP?.start()}
            }
        }
        var dreambtn=findViewById(R.id.dreambtn) as Button
        var dreamswitch=findViewById(R.id.dreamswitch) as Switch
        var dreamrep=findViewById(R.id.dreamrep) as Button
        dreamswitch.isVisible=false
        dreamrep.isVisible=false
        dreambtn.setOnClickListener {
            dreamswitch.isVisible=true
            dreamrep.isVisible=true
            reprem.isClickable=false
            MP= MediaPlayer.create(this,R.raw.music3)
            dreamswitch.setOnCheckedChangeListener({_,isChecked -> if (isChecked){MP?.start()}
            else { MP?.pause()}
            })
            dreamrep.setOnClickListener {
                while (true) {  MP?.start()}
            }
        }
        var exitbtn=findViewById(R.id.exitbtn) as Button
        exitbtn.setOnClickListener {
            finish()
            System.exit(0)
        }
        lin1.background=(R.drawable.wallp).toDrawable()

    }
}
