package kz.dvij.dvij.dvijTheme

import android.graphics.Color
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color.Companion.White
import kz.dvij.dvij.ui.theme.*

// !!! Цвет статус бара меняется в файле Themes в папке Value

// Светлая тема

private val LightDvijThemeColors = lightColors(
    primary = PrimaryColor,
    primaryVariant = Primary80,
    secondary = Primary100,


    background = Grey100,
    surface = Grey95,
    onPrimary = Grey00,
    onSecondary = Grey00,
    onBackground = Grey10,
    onSurface = Grey10,

)

// Темная тема

private val NightDvijThemeColors = darkColors(
    primary = PrimaryColor,
    primaryVariant = Primary80,
    secondary = Primary100,


    background = Grey100,
    surface = Grey95,
    onPrimary = Grey00,
    onSecondary = Grey00,
    onBackground = Grey10,
    onSurface = Grey10,

    )

// Сама кастомная тема

@Composable
fun CustomDvijTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    // условие - если темная тема, то используй цвета из темного набора, если светлая - из светлого
    val colors = if (darkTheme) {
        // как дойду до темы смены цветов, прописать ниже NightDvijThemeColors. Пока одна тема и там и там
        LightDvijThemeColors
    } else {
        LightDvijThemeColors
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}