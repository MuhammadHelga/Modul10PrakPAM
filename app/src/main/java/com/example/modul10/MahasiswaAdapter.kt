package com.example.modul10

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.recyclerview.widget.RecyclerView
import com.example.modul10.model.Mahasiswa

class MahasiswaAdapter(
    private val context: Context,
    private var mahasiswaList: List<Mahasiswa>
) : RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder>() {

    inner class MahasiswaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val vNama: TextView = itemView.findViewById(R.id.itm_nama)
        val vNRP: TextView = itemView.findViewById(R.id.itm_nrp)
        val btnDel: ImageButton = itemView.findViewById(R.id.itm_delete)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MahasiswaViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)
        return MahasiswaViewHolder(view)
    }

    override fun onBindViewHolder(holder: MahasiswaViewHolder, position: Int) {
        val currentMHS =mahasiswaList[position]
        holder.itemView.setOnClickListener {
            val intent = Intent(context, ViewMahasiswa::class.java)
        }
    }

    override fun getItemCount(): Int {
        return mahasiswaList.size
    }

    fun setMahasiswaList(mahasiswaList: List<Mahasiswa>) {
        this.mahasiswaList = mahasiswaList
        notifyDataSetChanged()
    }
}
