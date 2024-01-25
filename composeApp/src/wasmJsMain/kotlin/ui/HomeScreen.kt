import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import components.HeaderOptions
import styles.FontStyle

@Composable
fun HomeScreen() {
    val viewModel = AppViewModel
    val myRepos by viewModel.repos.collectAsState()


    Surface {
        Row(Modifier.fillMaxSize()) {
            Box(
                Modifier
                    .background(Color(32, 49, 65))
                    .fillMaxHeight()
                    .fillMaxWidth(0.5f)
            ) { }
            Box(
                Modifier
                    .background(Color(255, 148, 66))
                    .fillMaxSize()
            ) { }
        }
        Column(
            Modifier
                .fillMaxSize()
                .padding(top = 32.dp, start = 32.dp, end = 32.dp)
                .background(Color.White)
        ) {
            HeaderOptions()
            Text(
                modifier = Modifier.padding(start = 32.dp, top = 64.dp),
                text = "Hi! I'm Italo",
                style = FontStyle.Large
            )
        }
    }
}