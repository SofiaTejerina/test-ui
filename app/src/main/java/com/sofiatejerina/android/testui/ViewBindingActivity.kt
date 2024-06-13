package com.sofiatejerina.android.testui

import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.sofiatejerina.android.testui.MainActivity.Companion.characters
import com.sofiatejerina.android.testui.adapters.ViewBindingCharacterAdapter
import com.sofiatejerina.android.testui.databinding.ActivityViewBindingBinding
import java.util.regex.Matcher

class ViewBindingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBindingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Toast.makeText(baseContext, Playground.probando(), Toast.LENGTH_LONG).show()
        binding.viewBindingButton.setOnClickListener {
            binding.viewBindingText.text = binding.viewBindingInputText.text
        }

        initCharactersList()
    }

    private fun initCharactersList() {
        binding.viewBindingSyntheticList.adapter = ViewBindingCharacterAdapter(characters)
        binding.viewBindingSyntheticList.layoutManager = LinearLayoutManager(baseContext)
    }
}