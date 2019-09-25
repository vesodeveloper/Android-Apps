package com.example.gnutask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var chb1=findViewById(R.id.chb1) as CheckBox
        var taskname=findViewById(R.id.task1) as EditText
        var addtask=findViewById(R.id.addtask) as Button
        var taskval=taskname.text
       var list1=listOf(taskval)


        addtask.setOnClickListener {
            Toast.makeText(this,list1.toString(),Toast.LENGTH_LONG).show()
            chb1.setOnClickListener {
                Toast.makeText(this,"Task is completed",Toast.LENGTH_LONG).show()
            }
        }
    }
}
