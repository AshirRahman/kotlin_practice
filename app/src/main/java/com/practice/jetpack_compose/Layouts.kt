package com.practice.jetpack_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

@Composable
fun ColumnExample(modifier: Modifier = Modifier) {
    Column(modifier = modifier.background(color = Color.LightGray).fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(text = "Hello from ColumnExample")
        Text(text = "Hello from ColumnExample")
        Box() {
            Image(painter = painterResource(R.drawable.ic_launcher_foreground ), contentDescription = "Launcher Icon")
        }
    }
}

