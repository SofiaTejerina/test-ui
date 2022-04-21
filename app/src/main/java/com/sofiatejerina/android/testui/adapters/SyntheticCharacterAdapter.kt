package com.sofiatejerina.android.testui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sofiatejerina.android.testui.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_character.view.character_image
import kotlinx.android.synthetic.main.item_character.view.character_name
import kotlinx.android.synthetic.main.item_character.view.character_status
import kotlinx.android.synthetic.main.item_character.view.character_type


class SyntheticCharacterAdapter(
    private val characters: List<Character>
) : RecyclerView.Adapter<SyntheticCharacterAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_character, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bind(characters[position])
    }

    override fun getItemCount(): Int = characters.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(character: Character){
            with(character){
                itemView.character_name.text = name
                itemView.character_status.text = status
                itemView.character_type.text = type
                Picasso.get().load(image).into(itemView.character_image)
            }
        }
    }
}