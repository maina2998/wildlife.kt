package com.example.wildlife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnnext:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        castViews()
        clickNext()
    }
    fun  castViews(){
        btnnext=findViewById(R.id.btnnext)

        }
        fun clickNext(){
            btnnext.setOnClickListener {
                val next=Intent(baseContext,WaterbodiesActivity::class.java)
                startActivity(next)
            }

    }
}