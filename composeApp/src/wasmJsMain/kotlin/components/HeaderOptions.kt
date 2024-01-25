package components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import styles.FontStyle

@Composable
fun HeaderOptions() {
    Row(Modifier.fillMaxWidth().padding(horizontal = 16.dp), horizontalArrangement = Arrangement.End) {
        Text(
            modifier = Modifier.padding(16.dp),
            text = "About Me",
            style = FontStyle.Medium
        )

        Text(
            modifier = Modifier.padding(16.dp),
            text = "Skills",
            style = FontStyle.Medium
        )

        Text(
            modifier = Modifier.padding(16.dp),
            text = "Projects",
            style = FontStyle.Medium
        )

        Text(
            modifier = Modifier.padding(16.dp),
            text = "Contact",
            style = FontStyle.Medium
        )
    }
}