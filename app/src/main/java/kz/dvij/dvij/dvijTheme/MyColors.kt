package kz.dvij.dvij.dvijTheme

import android.graphics.drawable.GradientDrawable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

// Primary Colors - цвета из дизайн-файла Figma

val PrimaryColor = Color(0xFFFF7D92)

val Primary100 = Color(0xFF32191D)
val Primary90 = Color(0xFF542930)
val Primary80 = Color(0xFF7E3E48)
val Primary70 = Color(0xFFA85361)
val Primary60 = Color(0xFFD26779)
val Primary40 = Color(0xFFFC92A3)
val Primary30 = Color(0xFFFDA8B6)
val Primary20 = Color(0xFFFDBDC8)
val Primary10 = Color(0xFFFED3DA)
val Primary00 = Color(0xFFFEE5E9)

// Grey Colors - цвета из дизайн-файла Figma

val Grey100 = Color(0xFF171717)
val Grey95 = Color(0xFF232323)
val Grey90 = Color(0xFF2F2F2F)
val Grey80 = Color(0xFF535353)
val Grey70 = Color(0xFF6F6F6F)
val Grey60 = Color(0xFF818181)
val Grey50 = Color(0xFFA7A7A7)
val Grey40 = Color(0xFFC7C7C7)
val Grey30 = Color(0xFFE3E3E3)
val Grey20 = Color(0xFFEFEFEF)
val Grey10 = Color(0xFFF6F6F6)
val Grey00 = Color(0xFFFFFFFF)

// Gradient

val GradientPrimary = Brush.verticalGradient(
    colors = listOf(
        PrimaryColor,
        Primary100
    )
)

// Secondary Colors - цвета из дизайн-файла Figma

val attentionColor = Color(0xFFFF6577)
val successColor = Color(0xFF24BA96)
val warningColor = Color(0xFFF0A900)