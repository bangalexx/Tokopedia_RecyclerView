package com.bangalexx.tokopediarecyclerview.ui.adapter

import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.bangalexx.tokopediarecyclerview.R
import com.bangalexx.tokopediarecyclerview.ui.fragment.adapter
import com.bangalexx.tokopediarecyclerview.ui.home.RecyclerViewMenuActivity
import com.bangalexx.tokopediarecyclerview.ui.home.RecyclerViewProdukActivity
import com.bangalexx.tokopediarecyclerview.ui.home.RecyclerViewSaldoActivity
import com.bangalexx.tokopediarecyclerview.ui.home.listdataproduk
import com.bangalexx.tokopediarecyclerview.ui.home.listdatasaldo
import com.bangalexx.tokopediarecyclerview.ui.home.listmenu

class AdapterRecyclerView () :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object {
        private const val TIPE_TAMPILAN_BANKING = 0
        private const val TIPE_TAMPILAN_IKLAN = 1
        private const val TIPE_TAMPILAN_MENU = 2
        private const val TIPE_TAMPILAN_BAGIAN = 3
        private const val TIPE_TAMPILAN_BARANG = 4
    }

    inner class MainViewHolder1(view: View) : RecyclerView.ViewHolder(view) {
        val recycle: RecyclerView = view.findViewById(R.id.vp_adapter1)

        fun bindView() {
            // Set layout manager untuk RecyclerView horizontal
            val layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
            recycle.layoutManager = layoutManager

            // Contoh data
            val data = listOf(
                listdatasaldo(R.drawable.gopay, "Rp.100.000", "0 Coins"),
                listdatasaldo(R.drawable.voucher, "Voucher", "Descripton"),
                listdatasaldo(R.drawable.voucher, "Voucher2", "Descrpition")
            )

            // Buat adapter dan atur ke RecyclerView
            val adapter = RecyclerViewSaldoActivity(data)
            recycle.adapter = adapter
        }
    }

    inner class MainViewHolder2(view: View) : RecyclerView.ViewHolder(view) {
        val fragment: ViewPager2 = view.findViewById(R.id.vp_adapter2)
        val adapter: adapter = adapter(view.context as FragmentActivity)
        fun bindView() {
            // Mengikat data ke tampilan
        }
    }

    inner class MainViewHolder3(view: View) : RecyclerView.ViewHolder(view) {
        val recycle: RecyclerView = view.findViewById(R.id.vp_adapter1)
        fun bindView() {
            // Set margin top pada RecyclerView
            val layoutParams = recycle.layoutParams as ViewGroup.MarginLayoutParams
            layoutParams.topMargin = 30 // Margin top yang diinginkan dalam dp
            recycle.layoutParams = layoutParams

            // Set layout manager untuk RecyclerView horizontal
            val layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
            recycle.layoutManager = layoutManager

            // Contoh data
            val data = listOf(
                listmenu(R.drawable.menu, "Menu"),
                listmenu(R.drawable.gopayopup, "TopUp"),
                listmenu(R.drawable.topupgame1, "Top Game"),
                listmenu(R.drawable.topupgame2, "TopUp Lainnya"),

            )

            // Buat adapter dan atur ke RecyclerView
            val adapter = RecyclerViewMenuActivity(data)
            recycle.adapter = adapter
        }
    }

    inner class MainViewHolder4(view: View) : RecyclerView.ViewHolder(view) {
        val text: TextView = view.findViewById(R.id.textview1)
        fun bindView() {
            text.text = "Lanjut cek ini, yuk"
            text.setTypeface(null, Typeface.BOLD)
        }
    }

    inner class MainViewHolder5(view: View) : RecyclerView.ViewHolder(view) {
        val recycle: RecyclerView = view.findViewById(R.id.vp_adapter1)
        fun bindView() {
            // Set margin top pada RecyclerView
            val layoutParams = recycle.layoutParams as ViewGroup.MarginLayoutParams
            layoutParams.topMargin = 30 // Margin top yang diinginkan dalam dp
            recycle.layoutParams = layoutParams

            // Set layout manager untuk RecyclerView horizontal
            val layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
            recycle.layoutManager = layoutManager

            // Contoh data
            val data = listOf(
                listdataproduk(R.drawable.produk1, "INFINIX HOT 10", "Rp 2.100.000"),
                listdataproduk(R.drawable.produk2, "SAMSUNG A13", "Rp 2.300.000"),
                listdataproduk(R.drawable.produk3, "OPPO A96", "Rp 2.230.000"),
                listdataproduk(R.drawable.topi, "TOPI KEREN","Rp 80.000"),
            )

            // Buat adapter dan atur ke RecyclerView
            val adapter = RecyclerViewProdukActivity(data)
            recycle.adapter = adapter
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            TIPE_TAMPILAN_BANKING -> {
                val view = inflater.inflate(R.layout.activity_main_adapter, parent, false)
                MainViewHolder1(view)
            }

            TIPE_TAMPILAN_IKLAN -> {
                val view = inflater.inflate(R.layout.activity_main_adapter2, parent, false)
                MainViewHolder2(view)
            }

            TIPE_TAMPILAN_MENU -> {
                val view = inflater.inflate(R.layout.activity_main_adapter, parent, false)
                MainViewHolder3(view)
            }

            TIPE_TAMPILAN_BAGIAN -> {
                val view = inflater.inflate(R.layout.activity_main_adapter3, parent, false)
                MainViewHolder4(view)
            }

            TIPE_TAMPILAN_BARANG -> {
                val view = inflater.inflate(R.layout.activity_main_adapter, parent, false)
                MainViewHolder5(view)
            }

            else -> throw IllegalArgumentException("Tipe tampilan tidak valid")
        }
    }

    override fun getItemCount(): Int = 5

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        // Implementasikan logika pengikatan di sini berdasarkan tipe tampilan
        when (holder) {
            is MainViewHolder1 -> {
                holder.bindView()
            }
            is MainViewHolder2 -> {
                holder.bindView()
                holder.fragment.adapter = holder.adapter
            }
            is MainViewHolder3 -> holder.bindView()
            is MainViewHolder4 -> holder.bindView()
            is MainViewHolder5 -> holder.bindView()
        }
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }
}
