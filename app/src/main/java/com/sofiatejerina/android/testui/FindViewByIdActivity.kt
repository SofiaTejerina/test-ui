package com.sofiatejerina.android.testui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.sofiatejerina.android.testui.MainActivity.Companion.characters
import com.sofiatejerina.android.testui.adapters.FindByIdCharacterAdapter

class FindViewByIdActivity : AppCompatActivity() {

    private var inputText: TextInputEditText? = null
    private var text: TextView? = null
    private var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_view_by_id)

        inputText = findViewById(R.id.find_view_by_id_input_text)
        text = findViewById(R.id.find_view_by_id_text)
        recyclerView = findViewById(R.id.find_view_by_id_list)

        findViewById<MaterialButton>(R.id.find_view_by_id_button).setOnClickListener {
            text?.text = inputText?.text
        }

        recyclerView?.layoutManager = LinearLayoutManager(this)
        recyclerView?.adapter = FindByIdCharacterAdapter(characters)
    }
}