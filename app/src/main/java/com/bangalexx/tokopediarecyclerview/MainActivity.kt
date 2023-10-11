package com.bangalexx.tokopediarecyclerview

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bangalexx.tokopediarecyclerview.ui.adapter.AdapterRecyclerView

class MainActivity: AppCompatActivity(){
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: AdapterRecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi RecyclerView
        recyclerView = findViewById(R.id.rc_activitymain)

        // Inisialisasi adapter dengan daftar kosong (kosong pada awalnya)
        adapter = AdapterRecyclerView()

        // Set layout manager untuk RecyclerView
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        // Set adapter ke dalam RecyclerView
        recyclerView.adapter = adapter

    }
}