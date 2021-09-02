package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView=findViewById<ListView>(R.id.list_view)
        val name= arrayOf("joshua","peter","nyaberi","rocky","joseph","alvin","musa","becky","cheru")
        val majina:ArrayAdapter<String> =ArrayAdapter(this,android.R.layout.simple_list_item_1,name)
        listView.adapter=majina
        listView.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(this,"You have clicked" + name[position], Toast.LENGTH_SHORT).show()
        }

    }
}