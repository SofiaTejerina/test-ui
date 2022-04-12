package com.sofiatejerina.android.testui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sofiatejerina.android.testui.R
import kotlinx.android.synthetic.main.item_character.view.*

import com.squareup.picasso.Picasso


class SyntheticCharacterAdapter(
    private val characters: List<Character>
) : RecyclerView.Adapter<SyntheticCharacterAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val characterImage: ImageView = character_image
//        val characterName: TextView = character_name
//        val characterStatus: TextView = character_status
//        val characterType: TextView = character_status
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_character, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.characterName.text = characters[position].name
//        holder.characterStatus.text = characters[position].status
//        holder.characterType.text = characters[position].type

//        Picasso.get()
//            .load(characters[position].image).into(holder.characterImage)
    }

    override fun getItemCount(): Int = characters.size
}