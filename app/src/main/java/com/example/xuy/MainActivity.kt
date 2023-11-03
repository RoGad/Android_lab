package com.example.xuy

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(colorResource(R.color.backColor))
                    .fillMaxSize()
            ){
                dotaPrew()
            }
            Column(
                modifier = Modifier.fillMaxHeight(0.45f),
                verticalArrangement = Arrangement.Bottom
            ){
                dotaLogo()
                descriptions()
                video()
                ratings()
            }
        }
    }
}

@Composable
fun dotaPrew(){
    Box(
        modifier = Modifier
            .fillMaxHeight(0.35f)
            .fillMaxWidth()

    ) {
        Image(
            painter = painterResource(id = R.drawable.back_image), // Путь к картинке
            contentDescription = "image",
            contentScale = ContentScale.Crop, // Обрезание картинки
            modifier = Modifier.fillMaxSize() // Максимальный размер
        )
    }
}

@Composable
private fun dotaLogo() {
    Card(
        modifier = Modifier
            .size(width = 132.dp, height = 139.dp)
            .padding(22.dp)
    ){
        Box(
            modifier = Modifier
                .background(colorResource(R.color.backColor))
                .size(width = 88.dp, height = 95.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_dota),
                contentDescription = "image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(54.dp)
            )
        }
    }
}

@Composable
private fun descriptions(){
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ){
        Box(
            modifier = Modifier.size(height = 190.dp, width = 327.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(
                text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 19.sp,
                    fontWeight = FontWeight(400),
                    color = Color(R.color.text_desc),

                    )
            )
        }
    }
}

@Composable
private fun video() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp),
    ) {
        Box(
            modifier = Modifier.size(width = 240.dp, height = 135.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.video1_1),
                contentDescription = "screen1",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(width = 240.dp, height = 135.dp)
                    .padding(end = 15.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.back_photo_arrow),
                contentDescription = "ellipse",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.size(45.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.arrow_play),
                contentDescription = "arrow",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.size(24.dp)
            )
        }

        Column(){
            Image(
                painter = painterResource(id = R.drawable.video2_1),
                contentDescription = "screen2",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(width=240.dp, height=135.dp)
            )
        }

    }
}

@Composable
private fun ratings() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 24.dp)
    ) {
        Text(
            text = "Review & Ratings",
            style = TextStyle(
                fontSize = 16.sp,
//            fontFamily = FontFamily(Font(R.font.sk-modernist)),
                fontWeight = FontWeight(700),
                color = Color(R.color.text_desc),

                letterSpacing = 0.6.sp,
            )
        )

        Row(modifier = Modifier.size(width=171.dp, height=58.dp)) {
            Text(
                text = "4.9",
                style = TextStyle(
                    fontSize = 48.sp,
//                    fontFamily = FontFamily(Font(R.font.sk-modernist)),
                    fontWeight = FontWeight(700),
                    color = Color(R.color.white),
                )
            )
            Column(modifier = Modifier
                .fillMaxHeight()
                .padding(start = 16.dp, top = 10.dp),
                verticalArrangement = Arrangement.Center) {

                Image(
                    painter = painterResource(id = R.drawable.stata),
                    contentDescription = "stars",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.size(width = 76.dp, height = 14.dp)
                )

                Text(
                    text = "70M Reviews",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        color = Color(R.color.million),
                        letterSpacing = 0.5.sp,
                    )
                )
            }
        }

        Box(
            modifier = Modifier
                .padding(end = 24.dp)
        ) {
            Box(
                modifier = Modifier.padding(bottom=16.dp)
            ) {
                Row() {
                    Image(
                        painter = painterResource(id = R.drawable.gesicht),
                        contentDescription = "gesicht",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.size(36.dp)
                    )
                    Column (
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(start = 16.dp),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Auguste Conte",
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight(400),
                                color = Color(R.color.white),
                                letterSpacing = 0.5.sp,
                            )
                        )

                        Text(
                            text = "February 14, 2019",
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight(400),
                                color = Color(R.color.white),
                                letterSpacing = 0.5.sp,
                            )
                        )
                    }
                }
            }
            Text(
                text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 20.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFFA8ADB7),

                    letterSpacing = 0.5.sp,
                )
            )
        }
    }
}

@Composable
fun MyButton(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        val context = LocalContext.current.applicationContext
        Button(
            onClick = {
                Toast.makeText(context, "Clicked!", Toast.LENGTH_SHORT).show()
            }
        ){
            Text(text = "Click Me!")
        }
    }
}
