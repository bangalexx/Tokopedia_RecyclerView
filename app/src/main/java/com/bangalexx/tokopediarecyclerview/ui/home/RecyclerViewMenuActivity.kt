package com.bangalexx.tokopediarecyclerview.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bangalexx.tokopediarecyclerview.R

class listmenu(
    val img :Int,
    val title : String
)

class RecyclerViewMenuActivity(
    private val data : List<listmenu>
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    inner class adpmain1(view: View) : RecyclerView.ViewHolder(view){
        val img:ImageView = view.findViewById(R.id.iv_menu)
        val title:TextView = view.findViewById(R.id.tv_menu)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.activity_recycler_view_menu, parent, false)
        return adpmain1(adapterLayout)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val dataset = data[position]
        val adpmain1ViewHolder = holder as adpmain1

        adpmain1ViewHolder.img.setImageResource(dataset.img)
        adpmain1ViewHolder.title.text = dataset.title
    }
}