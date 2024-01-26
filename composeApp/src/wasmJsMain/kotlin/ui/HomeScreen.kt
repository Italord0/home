import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import components.Footer
import components.HeaderOptions
import components.PostIt
import kotlinx.coroutines.delay
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import styles.FontStyle

@OptIn(ExperimentalResourceApi::class)
@Composable
fun HomeScreen() {
    val viewModel = AppViewModel
    val myRepos by viewModel.repos.collectAsState()


    Box {
        var imageVisible by remember {
            mutableStateOf(false)
        }
        var textVisible by remember {
            mutableStateOf(false)
        }

        LaunchedEffect(true) {
            imageVisible = true
            delay(1000)
            textVisible = true
        }

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
                .fillMaxWidth()
                .padding(start = 32.dp, end = 32.dp)
                .background(Color.White)
                .verticalScroll(rememberScrollState())
        ) {
            HeaderOptions()
            AnimatedVisibility(
                visible = imageVisible,
                enter = fadeIn(animationSpec = tween(2000, easing = LinearEasing)),
                exit = fadeOut(animationSpec = tween(2000, easing = LinearEasing))
            ) {
                Text(
                    modifier = Modifier.padding(start = 32.dp, top = 64.dp),
                    text = "Hi! I'm Italo",
                    style = FontStyle.Huge
                )
            }
            Row {
                AnimatedVisibility(
                    visible = imageVisible,
                    enter = fadeIn(animationSpec = tween(2000, easing = LinearEasing)),
                    exit = fadeOut(animationSpec = tween(2000, easing = LinearEasing))
                ) {
                    Image(
                        painter = painterResource(res = "picture.png"),
                        contentDescription = "A picture of me on the Museum of Tomorrow, Rio de Janeiro",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .width(400.dp)
                            .height(400.dp)
                            .padding(start = 32.dp, top = 32.dp)
                            .clip(RectangleShape).border(
                                10.dp, Color(32, 49, 65),
                                RectangleShape
                            )
                            .shadow(elevation = 100.dp)
                    )
                }
                AnimatedVisibility(
                    visible = textVisible,
                    enter = fadeIn(animationSpec = tween(2000, easing = LinearEasing)),
                    exit = fadeOut(animationSpec = tween(2000, easing = LinearEasing))
                ) {
                    PostIt(
                        modifier = Modifier
                            .height(350.dp)
                            .fillMaxWidth()
                            .padding(start = 64.dp, top = 32.dp, end = 32.dp),
                        text = "Welcome to my digital realm! I'm a software engineer based in Recife, Brazil.\n" +
                                "Focusing in mobile development for Android and iOS platforms, i help craft innovative solutions with passion." +
                                "\nBeyond coding, i have a enthusiasm for video games.\n\n" +
                                "Check out my GitHub, there is about ${if (myRepos.isEmpty()) "..." else myRepos.size} public repositories available right now!"
                    )
                }
            }

            Spacer(Modifier.height(600.dp))
            Footer()
        }
    }
}