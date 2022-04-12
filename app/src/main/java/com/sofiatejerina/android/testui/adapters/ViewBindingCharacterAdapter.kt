package com.sofiatejerina.android.testui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sofiatejerina.android.testui.databinding.ItemCharacterBinding
import com.squareup.picasso.Picasso

class ViewBindingCharacterAdapter(private val characters: List<Character>) :
    RecyclerView.Adapter<ViewBindingCharacterAdapter.CharacterItemViewHolder>() {

    class CharacterItemViewHolder(private val item: ItemCharacterBinding) : RecyclerView.ViewHolder(item.root) {

        fun bind(character: Character) {
            item.characterName.text = character.name
            item.characterStatus.text = character.status
            item.characterType.text = character.type
            Picasso.get().load(character.image).into(item.characterImage)
        }

        companion object {
            fun from(parent: ViewGroup): CharacterItemViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemCharacterBinding.inflate(layoutInflater, parent, false)
                return CharacterItemViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterItemViewHolder {
        return CharacterItemViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: CharacterItemViewHolder, position: Int) {
        holder.bind(characters[position])
    }

    override fun getItemCount(): Int = characters.size
}