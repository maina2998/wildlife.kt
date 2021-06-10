package com.example.wildlife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LandsActivity : AppCompatActivity() {
    lateinit var btnprev3: Button
    lateinit var btnnext4: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lands)
        castView4()
        clickNext4()
    }
    fun castView4(){
        btnnext4=findViewById(R.id.btnnext4)
        btnprev3 =findViewById(R.id.btnprev3)
}
    fun clickNext4(){
        btnnext4.setOnClickListener {
            val next4= Intent(baseContext, BeachesActivity::class.java)
            startActivity(next4)
        }
        btnprev3.setOnClickListener {
            val prev3= Intent(baseContext, AnimalsActivity::class.java)
            startActivity(prev3)
}}}