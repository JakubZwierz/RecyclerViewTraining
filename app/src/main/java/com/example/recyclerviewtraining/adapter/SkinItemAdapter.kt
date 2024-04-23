package com.example.recyclerviewtraining.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtraining.data.model.Skin
import com.example.recyclerviewtraining.databinding.ListCharacterBinding
import com.example.recyclerviewtraining.databinding.ListSkinBinding

class SkinItemAdapter(
    private val context: Context,
    private val dataset: List<Skin>
) : RecyclerView.Adapter<SkinItemAdapter.SkinItemViewHolder>() {

    inner class SkinItemViewHolder(val binding: ListSkinBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkinItemViewHolder {
        val binding = ListSkinBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SkinItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: SkinItemViewHolder, position: Int) {
        val skin = dataset[position]
        val characterName = holder.itemView.context.getString(skin.skinName)

        holder.binding.skinTitle.text = characterName
//        holder.binding.skinTitle.setText(skin.skinName)
    }

}