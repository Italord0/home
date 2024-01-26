package components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import styles.FontStyle

@Composable
fun PostIt(
    text: String,
    modifier: Modifier = Modifier
) {
    Surface {
        Box(
            modifier = modifier
                .padding(start = 16.dp, top = 16.dp).background(color = Color(32, 49, 65))
        )
        Box(
            modifier = modifier
                .padding(end = 16.dp, bottom = 16.dp)
                .background(Color(255, 148, 66))
        ) {
            Text(
                modifier = Modifier.padding(16.dp),
                text = text,
                style = FontStyle.Large.copy(color = Color(32, 49, 65)),
                textAlign = TextAlign.Start
            )
        }
    }
}