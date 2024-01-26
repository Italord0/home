package styles

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp

object FontStyle {
    val Small = TextStyle(fontFamily = FontFamily.Monospace, fontSize = 16.sp)
    val Medium = TextStyle(fontFamily = FontFamily.Monospace, fontSize = 24.sp)
    val Large = TextStyle(fontFamily = FontFamily.Monospace, fontSize = 32.sp)
    val Huge = TextStyle(fontFamily = FontFamily.Monospace, fontSize = 64.sp)
}