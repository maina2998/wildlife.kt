package com.example.wildlife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BeachesActivity : AppCompatActivity() {
    lateinit var btnprev4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beaches)
        clickNext5()
        castViews5()
    }
    fun  castViews5(){
        btnprev4=findViewById(R.id.btnnext)

    }
    fun clickNext5(){
        btnprev4.setOnClickListener {
            val prev4 = Intent(baseContext, BeachesActivity::class.java)
            startActivity(prev4)
}}}