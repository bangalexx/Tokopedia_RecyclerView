package com.bangalexx.tokopediarecyclerview.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bangalexx.tokopediarecyclerview.R


class listdatasaldo(
    val imageView:Int,
    val title:String,
    val coin:String
)

class RecyclerViewSaldoActivity(
    private val data : List<listdatasaldo>
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    inner class adbmain1(view: View) : RecyclerView.ViewHolder(view){
        val img: ImageView = view.findViewById(R.id.iv_logodana)
        val title: TextView = view.findViewById(R.id.tv_sisasaldo)
        val detail:TextView = view.findViewById(R.id.tv_coin)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.activity_recycler_view_saldo, parent, false)
        return adbmain1(adapterLayout)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val dataset = data[position]
        val adbmain1ViewHolder = holder as adbmain1

        // Memasukkan dataset ke tampilan
        adbmain1ViewHolder.img.setImageResource(dataset.imageView)
        adbmain1ViewHolder.title.text = dataset.title

        adbmain1ViewHolder.detail.text = dataset.coin }
}