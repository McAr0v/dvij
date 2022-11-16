package kz.dvij.dvij


import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Send

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kz.dvij.dvij.dvijTheme.*
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
                        .background(GradientPrimary)
                        .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                        ) {
                    NewText(inputText = getString(R.string.app_name))
                    NewText(inputText = "Привет")
                    NewButton(buttonText = getString(R.string.app_name), Icons.Filled.Favorite)
                }
            }
        }
    }
}


@Composable
fun NewText (inputText: String) {
    Text(text = inputText)
}


@Composable
fun NewButton (buttonText: String, icon: ImageVector) {
    Button(
        onClick = { /*TODO*/ },
        contentPadding = PaddingValues(
            start = 20.dp,
            top = 12.dp,
            end = 20.dp,
            bottom = 12.dp
        ),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = PrimaryColor,
            contentColor = Grey00
        )

    ) {
        Icon(
            icon,
            contentDescription = "Отправить",
            modifier = Modifier.size(ButtonDefaults.IconSize)
        )
        Spacer(Modifier.size(5.dp))
        Text(buttonText)
    }
}
