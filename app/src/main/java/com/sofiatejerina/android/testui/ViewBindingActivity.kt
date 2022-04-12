package com.sofiatejerina.android.testui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.sofiatejerina.android.testui.MainActivity.Companion.characters
import com.sofiatejerina.android.testui.adapters.ViewBindingCharacterAdapter
import com.sofiatejerina.android.testui.databinding.ActivityViewBindingBinding

class ViewBindingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewBindingBinding
    private lateinit var adapter: ViewBindingCharacterAdapter
    private lateinit var layoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBindingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.viewBindingButton.setOnClickListener {
            binding.viewBindingText.text = binding.viewBindingInputText.text
        }

        initCharactersList()
    }

    private fun initCharactersList() {
        adapter = ViewBindingCharacterAdapter(characters)
        layoutManager = LinearLayoutManager(baseContext)
        binding.viewBindingSyntheticList.adapter = adapter
        binding.viewBindingSyntheticList.layoutManager = layoutManager
    }
}