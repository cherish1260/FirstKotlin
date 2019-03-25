package com.first.kotlin.firstkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class SecondActivity : AppCompatActivity() {

    private lateinit var listView: ListView;
    private lateinit var adapter: ArrayAdapter<String>;
    private lateinit var str: Array<String>;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var type = intent.getStringExtra("type")
        System.out.println("hello" + type);
        initView()
    }

    fun initView() {
        str = Array(10, { i -> (i * i).toString() })
        listView = findViewById<ListView>(R.id.lv_list)
        adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, str)
        listView.adapter = adapter
        listView.setOnItemClickListener{adapterView, view, position, id ->
            Toast.makeText(this, adapter.getItem(position), Toast.LENGTH_SHORT).show()
        }
    }
}
