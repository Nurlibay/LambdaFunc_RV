package com.example.lambdafunc_rv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val myAdapter : ListAdapter = ListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.adapter = myAdapter
        myAdapter.setOnItemClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        setModel()
    }

    private fun setModel() {
        val models : MutableList<Model> = mutableListOf()
        for (i in 1..100){
            val model : Model= Model("Title $i", "Description $i")
            models.add(model)
        }
        myAdapter.list = models
    }
}