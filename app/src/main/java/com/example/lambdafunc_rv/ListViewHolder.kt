package com.example.lambdafunc_rv

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class ListViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
    fun populateModel(model: Model, onClick : (model: Model) -> Unit){
        itemView.tvTitle.text = model.title
        itemView.tvDescription.text = model.description
        itemView.setOnClickListener {
            onClick.invoke(model)
            //val intent = Intent(activity, SecondActivity::class.java)
            //activity.startActivity(intent)
            //Toast.makeText(itemView.context, "${model.title} is Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}