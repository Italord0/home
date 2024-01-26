package components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import styles.FontStyle

@Composable
fun HeaderOptions() {
    Row(
        Modifier.fillMaxWidth().background(
            brush = Brush.horizontalGradient(
                listOf(Color(32, 49, 65), Color(255, 148, 66)),
                startX = 0f,
                endX = Float.POSITIVE_INFINITY,
            )
        ), horizontalArrangement = Arrangement.End
    ) {

        Text(
            modifier = Modifier.padding(16.dp).background(color = Color.White, shape = RoundedCornerShape(10.dp)).padding(8.dp),
            text = "About Me",
            style = FontStyle.Medium.copy(color = Color.Black)
        )

        Text(
            modifier = Modifier.padding(16.dp).background(color = Color.White, shape = RoundedCornerShape(10.dp)).padding(8.dp),
            text = "Skills",
            style = FontStyle.Medium.copy(color = Color.Black)
        )

        Text(
            modifier = Modifier.padding(16.dp).background(color = Color.White, shape = RoundedCornerShape(10.dp)).padding(8.dp),
            text = "Projects",
            style = FontStyle.Medium.copy(color = Color.Black)
        )

        Text(
            modifier = Modifier.padding(16.dp).background(color = Color.White, shape = RoundedCornerShape(10.dp)).padding(8.dp),
            text = "Contact",
            style = FontStyle.Medium.copy(color = Color.Black)
        )
    }
}