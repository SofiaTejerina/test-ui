package com.sofiatejerina.android.testui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sofiatejerina.android.testui.adapters.Character

class JetpackComposeActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
//                CharacterCard()
//                CharacterCard()
            }
        }
    }

    @Composable
    private fun CharacterCard(character: Character){
        Row(modifier = Modifier.padding(all = 8.dp)) {
            Text(character.name)
        }
        Spacer(modifier = Modifier.size(20.dp))
    }

//    @Preview
//    @Composable
//    private fun ShowPreviewMessageCard(){
//        CharacterCard(Message("Author", "Text"))
//    }

//    LazyColumn {
//        // Add a single item
//        item {
//            Text(text = "First item")
//        }
//
//        // Add 5 items
//        items(5) { index ->
//            Text(text = "Item: $index")
//        }
//
//        // Add another single item
//        item {
//            Text(text = "Last item")
//        }
//    }
}