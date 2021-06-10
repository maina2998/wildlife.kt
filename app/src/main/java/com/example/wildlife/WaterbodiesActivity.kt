package com.example.wildlife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WaterbodiesActivity : AppCompatActivity() {
    lateinit var btnprev1:Button
    lateinit var btnnext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_waterbodies)
        castView2()
        clickNext2()
    }
    fun castView2(){
        btnnext2=findViewById(R.id.btnnext2)
        btnprev1 =findViewById(R.id.btnprev1)
     }
    fun clickNext2(){
        btnnext2.setOnClickListener {
            val next2 = Intent(baseContext, AnimalsActivity::class.java)
            startActivity(next2)
    }
        btnprev1.setOnClickListener {
            val prev1 = Intent(baseContext, MainActivity::class.java)
            startActivity(prev1)
}}}