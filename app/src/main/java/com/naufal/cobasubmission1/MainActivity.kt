package com.naufal.cobasubmission1

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //panggil data
    private var list: ArrayList<Vga> = arrayListOf()

    //inisialisasi recyclerview
    private lateinit var rvVga: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (Build.VERSION.SDK_INT < 16) {
            window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        }
        setContentView(R.layout.activity_main)


        rvVga = findViewById(R.id.rv_graphics)
        rvVga.setHasFixedSize(true)

        //panggil data dari kelas vgaData
        list.addAll(VgaData.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvVga.layoutManager = LinearLayoutManager(this)
        val listVgaAdapter = ListVgaAdapter(list)
        rvVga.adapter = listVgaAdapter
    }
}