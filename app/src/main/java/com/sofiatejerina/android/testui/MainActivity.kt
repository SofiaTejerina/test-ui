package com.sofiatejerina.android.testui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.sofiatejerina.android.testui.adapters.Character

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // guardar en companion obj. en el mainappp
        // ./gradlew app:dependencies > dependency.log
        val gson = Gson()
        val charactersString = resources.openRawResource(R.raw.data)
            .bufferedReader().use { it.readText() }
        characters.addAll(gson.fromJson<MutableList<Character>>(
            charactersString,
            object : TypeToken<MutableList<Character>>() {}.type
        ))

        findViewById<MaterialButton>(R.id.view_binding_option).setOnClickListener {
            startActivity(Intent(this, ViewBindingActivity::class.java))
        }
        findViewById<MaterialButton>(R.id.find_view_by_id_option).setOnClickListener {
            startActivity(Intent(this, FindViewByIdActivity::class.java))
        }
        findViewById<MaterialButton>(R.id.synthetic_option).setOnClickListener {
            startActivity(Intent(this, SyntheticActivity::class.java))
        }
    }

    companion object{
        var characters = mutableListOf<Character>()
    }
}