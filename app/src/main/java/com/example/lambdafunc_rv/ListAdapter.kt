package com.example.lambdafunc_rv

import android.view.Display
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListAdapter : RecyclerView.Adapter<ListViewHolder>() {

    var list : List<Model> = listOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    private var onItemClick : (model: Model) -> Unit = {}
    fun setOnItemClickListener (onItemClick : (model : Model) -> Unit){
        this.onItemClick = onItemClick
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ListViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.populateModel(list[position], onItemClick)
    }
}