package com.example.wildlife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AnimalsActivity : AppCompatActivity() {
    lateinit var btnprev2: Button
    lateinit var btnnext3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animals)
        castView3()
        clickNext3()
    }
    fun castView3(){
        btnnext3=findViewById(R.id.btnnext3)
        btnprev2 =findViewById(R.id.btnprev2)
}


    fun clickNext3(){
        btnnext3.setOnClickListener {
            val next3 = Intent(baseContext, LandsActivity::class.java)
            startActivity(next3)
        }
        btnprev2.setOnClickListener {
            val prev2= Intent(baseContext, WaterbodiesActivity::class.java)
            startActivity(prev2)
}}}