package com.bangalexx.tokopediarecyclerview.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bangalexx.tokopediarecyclerview.R


class listdataproduk(
    val image: Int,
    val text: String,
    val desc: String
)
class RecyclerViewProdukActivity(
    private val data : List<listdataproduk>
    ): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
        inner class adrmain1(view: View) : RecyclerView.ViewHolder(view){
            val img: ImageView = view.findViewById(R.id.iv_phone)
            val title: TextView = view.findViewById(R.id.tv_name_phone)
            val desc:TextView = view.findViewById(R.id.tv_desc)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.activity_recycler_view_produk, parent, false)
            return adrmain1(adapterLayout)
        }

        override fun getItemCount(): Int {
            return data.size
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            val dataset = data[position]
            val adrmain1ViewHolder = holder as adrmain1

            adrmain1ViewHolder.img.setImageResource(dataset.image)
            adrmain1ViewHolder.title.text = dataset.text
            adrmain1ViewHolder.desc.text = dataset.desc

        }
    }