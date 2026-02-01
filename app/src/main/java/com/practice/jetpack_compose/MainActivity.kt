package com.practice.jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.graphics.Color
import com.practice.jetpack_compose.ui.theme.Jetpack_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // enableEdgeToEdge()
        setContent {
            Jetpack_ComposeTheme {
                Column {
                    // ProfileCard(name = "Compose!!", age = 30, color = Color.Blue)
                    // ProfileCard(name = "Rahim", age = 20, color = Color.Black)
                    // ProfileCard(name = "Rahim", age = 20, color = Color.Black)
                    // Greet(name = "compose!!")
                    // Greet(name = "compose!!")
                    // Greet(name = "compose!!") 

                    // CounterScreen()
                    ColumnExample()
                }
            }
        }
    }
}
