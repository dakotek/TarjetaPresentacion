package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage("Me presento", "Guille", "David")
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = message,
            fontSize = 45.sp,
            lineHeight = 50.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}
@Composable
fun GreetingImage(message: String, from1: String, from2: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.fondopresentacion)
    val image2 = painterResource(R.drawable.personas)
    val image3 = painterResource(R.drawable.telefono)
    val image4 = painterResource(R.drawable.correo)

    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopCenter)
        ) {
            Image(
                painter = image2,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp)
                    .align(Alignment.CenterHorizontally)
            )
            GreetingText(
                message = message,
                from = from1,
                modifier = Modifier
                    .padding(8.dp)
                    .align(Alignment.CenterHorizontally)
            )
            // Columna de Guille
            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                Row(
                    modifier = Modifier
                        .padding(8.dp)
                        .align(Alignment.CenterHorizontally)
                ) {
                    Image(
                        painter = image3,
                        contentDescription = null,
                        modifier = Modifier
                            .size(25.dp)
                            .padding(end = 8.dp)
                    )
                    Text(
                        text = "+34 123 456 789",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(8.dp)
                        .align(Alignment.CenterHorizontally)
                ) {
                    Image(
                        painter = image4,
                        contentDescription = null,
                        modifier = Modifier
                            .size(35.dp)
                            .padding(end = 8.dp)
                    )
                    Text(
                        text = "guille@gmail.com",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Text(
                    text = "GUILLERMO FERNANDEZ",
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            GreetingText(
                message = message,
                from = from2,
                modifier = Modifier
                    .padding(8.dp)
                    .align(Alignment.CenterHorizontally)
            )
            // Columna de David
            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                Row(
                    modifier = Modifier
                        .padding(8.dp)
                        .align(Alignment.CenterHorizontally)
                ) {
                    Image(
                        painter = image3,
                        contentDescription = null,
                        modifier = Modifier
                            .size(25.dp)
                            .padding(end = 8.dp)
                    )
                    Text(
                        text = "+34 987 654 321",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(8.dp)
                        .align(Alignment.CenterHorizontally)
                ) {
                    Image(
                        painter = image4,
                        contentDescription = null,
                        modifier = Modifier
                            .size(35.dp)
                            .padding(end = 8.dp)
                    )
                    Text(
                        text = "david@gmail.com",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Text(
                    text = "DAVID SANCHEZ",
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaPresentacionTheme {
        GreetingImage("Me presento", "Guille", "David")
    }
}