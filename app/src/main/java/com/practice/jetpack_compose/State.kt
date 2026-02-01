package com.practice.jetpack_compose
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
@Preview(showSystemUi = true)
fun StateScreen() {

    var count by rememberSaveable { mutableStateOf(0) }

    Row(){
        Text(text = "$count", modifier = Modifier.padding(4.dp), color = Color.Blue)
        Spacer(modifier = Modifier.width(8.dp))
        Button(onClick = {
            count++
        }) {
            Text(text = "Increment")}
    }
}