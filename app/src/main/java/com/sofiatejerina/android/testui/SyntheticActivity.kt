package com.sofiatejerina.android.testui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_synthetic.synthetic_text
import kotlinx.android.synthetic.main.activity_synthetic.synthetic_input_text
import kotlinx.android.synthetic.main.activity_synthetic.synthetic_button

class SyntheticActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_synthetic)

        synthetic_button.setOnClickListener {
            synthetic_text.text = synthetic_input_text.text
        }
    }
}