package com.example.composestatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var count by remember {mutableStateOf(0)}
        Text(
            text = "ai baut $count pahare de apa",
        )
        Button(
            onClick = { count++ },
            Modifier.padding(top = 8.dp)
        ) {
            Text("bea un pahar")
        }
    }
}