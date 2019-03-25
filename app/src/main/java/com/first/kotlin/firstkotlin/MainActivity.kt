package com.first.kotlin.firstkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun jump(view: View?) {
//        Toast.makeText(this, "hello world", Toast.LENGTH_SHORT).show()
//        var tvText:TextView = findViewById<TextView>(R.id.tv_text);
//        tvText.setText("我被点击了")
        var intent: Intent = Intent()
        intent.setClass(this, SecondActivity::class.java)
        intent.putExtra("type", "kotlin")
        startActivity(intent)
    }
}
