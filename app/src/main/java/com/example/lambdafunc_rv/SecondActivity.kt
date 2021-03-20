package com.example.lambdafunc_rv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    private val myAdapter : ListAdapter = ListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        recycler_view.adapter = myAdapter
        myAdapter.setOnItemClickListener {
            Toast.makeText(this, "${it.title} is clicked", Toast.LENGTH_SHORT).show()
        }
        recycler_view.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
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