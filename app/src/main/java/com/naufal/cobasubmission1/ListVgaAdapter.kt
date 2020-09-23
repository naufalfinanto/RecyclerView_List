package com.naufal.cobasubmission1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListVgaAdapter (private val listVga: ArrayList<Vga>): RecyclerView.Adapter<ListVgaAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_namaitem)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_itemdetail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_itemphoto)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_baris_vga, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val vga = listVga[position]

        Glide.with(holder.itemView.context)
            .load(vga.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = vga.nama
        holder.tvDetail.text = vga.detail
    }

    override fun getItemCount(): Int {
        return listVga.size
    }
}