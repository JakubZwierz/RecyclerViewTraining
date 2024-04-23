package com.example.recyclerviewtraining.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtraining.data.DatasourceCharacters
import com.example.recyclerviewtraining.data.DatasourceSkins
import com.example.recyclerviewtraining.data.model.Character
import com.example.recyclerviewtraining.databinding.ActivityMainBinding
import com.example.recyclerviewtraining.databinding.ListCharacterBinding

class CharacterItemAdapter(
    private val context: Context,
    private val dataset: List<Character>
) : RecyclerView.Adapter<CharacterItemAdapter.CharacterItemViewHolder>() {

    inner class CharacterItemViewHolder(val binding: ListCharacterBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterItemViewHolder {
        val binding = ListCharacterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CharacterItemViewHolder(binding)
    }

    override fun getItemCount(): Int {

        return dataset.size
    }

    override fun onBindViewHolder(holder: CharacterItemViewHolder, position: Int) {
        val character = dataset[position]
        val characterName = holder.itemView.context.getString(character.name)

        val skinList = DatasourceSkins().loadSkins()
        val adapter = SkinItemAdapter(context,skinList)

        val skinRecyclerView = holder.binding.skinRecyclerview
//        holder.binding.skinRecyclerview.adapter = adapter
        skinRecyclerView.adapter = adapter
    }

}