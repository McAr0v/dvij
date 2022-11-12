package kz.dvij.dvij.dvijTheme

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp

@Composable
fun TextH1 (text: String){
    Text(text = text,
        fontSize = 20.sp,
        fontFamily = FontFamily.Serif)
}
