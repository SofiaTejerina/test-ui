package com.sofiatejerina.android.testui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.sofiatejerina.android.testui.adapters.SyntheticCharacterAdapter
import kotlinx.android.synthetic.main.activity_synthetic.synthetic_button
import kotlinx.android.synthetic.main.activity_synthetic.synthetic_input_text
import kotlinx.android.synthetic.main.activity_synthetic.synthetic_list
import kotlinx.android.synthetic.main.activity_synthetic.synthetic_text

class SyntheticActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_synthetic)

        synthetic_button.setOnClickListener {
            synthetic_text.text = synthetic_input_text.text
        }

        synthetic_list.layoutManager = LinearLayoutManager(this)
        synthetic_list.adapter = SyntheticCharacterAdapter(MainActivity.characters)
    }
}