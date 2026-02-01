package com.practice.jetpack_compose

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumnExample(modifier: Modifier = Modifier) {

    LazyColumn() {
        items(count = 50) { index ->
            Text(text = "Item #$index", modifier = modifier.padding(8.dp))
        }
    }
}


@Composable
@Preview(showSystemUi = true)
fun Prev(modifier: Modifier = Modifier) {
    LazyColumnExample(modifier = modifier)
}