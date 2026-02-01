package com.practice.jetpack_compose

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun GoodTextField(text: String, onTextChange: (String) -> Unit) {
    // Implementation goes here
    TextField(
        value = text,
        onValueChange = onTextChange,
        label = { Text(text = "Enter Text") }
    )
}

@Composable
@Preview(showSystemUi = true)
fun ParentComposable(modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf(value = "") }

    GoodTextField(text) {
        text = it
    }
}