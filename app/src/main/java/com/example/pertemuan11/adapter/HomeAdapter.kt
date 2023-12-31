package com.example.pertemuan11.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pertemuan11.databinding.UserListBinding
import com.example.pertemuan11.model.Mahasiswa

class HomeAdapter (private val dataMhs : ArrayList<Mahasiswa>) :
RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    class ViewHolder (val binding: UserListBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = UserListBinding
            .inflate(LayoutInflater
                .from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.txtNama.text = dataMhs[position].nama
        holder.binding.txtNim.text = dataMhs[position].nim
        holder.binding.txtTelepon.text = dataMhs[position].telepon
    }

    override fun getItemCount(): Int {
        return dataMhs.size
    }

    fun setData(newData: ArrayList<Mahasiswa>){
        dataMhs.clear()
        dataMhs.addAll(newData)
        notifyDataSetChanged()
    }
}