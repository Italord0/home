package components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import styles.FontStyle

@Composable
fun Footer() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        color = Color.DarkGray
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Made by me using Compose Multiplatform Web",
                style = FontStyle.Small.copy(color = Color.White),
                textAlign = TextAlign.Center
            )
        }
    }
}