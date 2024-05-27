package com.example.supermemoapp.ui.theme.UI

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.NavigateNext
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun HomeScreen(){
    val list: List<String> = listOf("String1", "String2", "String3")
    LazyColumn {
        items(list) { item ->
            Deck(modifier = Modifier.padding(10.dp))
        }
    }
}


@Composable
fun Deck(modifier: Modifier){
    Card(modifier = modifier
        .fillMaxWidth()
        .height(56.dp)
        .padding(horizontal = 16.dp),
        shape = MaterialTheme.shapes.medium,
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFA0A5B0), // Custom background color (Amber)
            contentColor = Color.Black, // Custom content color
        )

    ) {

        Row(modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,){
            Spacer(modifier = Modifier.width(16.dp))

            Surface(modifier = Modifier
                .size(42.dp),
                shape = MaterialTheme.shapes.medium,
                color = Color.Yellow){}

            Spacer(modifier = Modifier.width(16.dp))

            Text(text = "1-100 words", fontSize = 24.sp, color = Color.Black)

            Spacer(modifier = Modifier.weight(1f))

            Text(text = "80%", fontSize = 24.sp, color = Color.Gray)
            Spacer(modifier = Modifier.width(16.dp))

            Surface(modifier = Modifier
                .size(42.dp),
                shape = MaterialTheme.shapes.medium,
                color = Color(0xFF263238),
                onClick = {}
            ) {
                Icon(imageVector = Icons.Filled.NavigateNext,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.padding(7.dp)
                )

            }
            Spacer(modifier = Modifier.width(16.dp))


        }
    }

}