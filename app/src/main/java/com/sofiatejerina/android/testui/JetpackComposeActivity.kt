package com.sofiatejerina.android.testui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.glide.rememberGlidePainter
import com.sofiatejerina.android.testui.MainActivity.Companion.characters
import com.sofiatejerina.android.testui.adapters.Character
import java.util.*

class JetpackComposeActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeList()
        }
    }

    @Composable
    private fun CharacterCard(character: Character){
        val errorCodeId = Calendar.getInstance().timeInMillis

        Row(modifier = Modifier.padding(all = 8.dp)) {
            Image(
                painter = rememberGlidePainter(character.image),
                contentDescription = "My content description",
            )
            Column() {
                Text(character.name)
                Text(character.status)
                Text(character.type)
                Text(errorCodeId.toString())
            }
        }
        Spacer(modifier = Modifier.size(20.dp))
    }

    @Composable
    fun MyComposeList(
    ) {
        // Use LazyRow when making horizontal lists
        LazyColumn() {
            items(characters.size) { data ->
                CharacterCard(characters[data])
            }
        }
    }

}