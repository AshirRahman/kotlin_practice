package com.practice.jetpack_compose

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

//@Composable
//fun ProfileCard(name: String, age: Int, color: Color) {
//    Text(text = "Hello $name! $age years old. ${color.toString()}")
//}

@Composable
fun  Greet (name: String){
    Text(text = "Hello $name!")
}