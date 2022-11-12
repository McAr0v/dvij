package kz.dvij.dvij


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import kz.dvij.dvij.ui.theme.DvijTheme

// MainActivity - то активити, которое открывается первым при запуске приложения. Наследуется от ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // разметка создается в функции setContent
        setContent {
            DvijTheme {
                Column (
                    modifier = Modifier
                        .background(Color.Gray).fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                        ) {
                    NewText(inputText = getString(R.string.app_name))
                    NewText(inputText = "Привет")
                }
            }
        }
    }
}


@Composable
fun NewText (inputText: String) {
    Text(text = inputText)
}
