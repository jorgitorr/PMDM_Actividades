package com.jorgearceruiz97.ejercicio2compose

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jorgearceruiz97.ejercicio2compose.ui.theme.Ejercicio2ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ejercicio2ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                    mixLayouts()
                }
            }
        }
    }
}

@Composable
@Preview
fun mixLayouts(){
    Column (){
        //1 fila
        Row (Modifier.height(250.dp)){
            Box(modifier = Modifier
                .fillMaxSize()
                .background(Color.Cyan),
                contentAlignment = Alignment.TopCenter
                ){
                Text(
                    text = "Ejercicio 2",
                    modifier = Modifier
                        .background(Color.Yellow)
                        .border(2.dp, Color.Blue)
                        .padding(10.dp),
                    fontSize = 30.sp,
                    color = Color.Blue
                )
            }
        }
        //2 fila
        Row (
            Modifier
                .height(250.dp)){

            Column(Modifier.width(200.dp)){
                Box(modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(1f)
                    .background(Color.Blue)
                ){
                    Text(
                        text = "PMDM",
                        fontSize = 30.sp,
                        color = Color.White,
                        modifier = Modifier.align(Alignment.BottomCenter)
                    )
                }
            }

            Column(Modifier.width(200.dp)){
                Box(modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(1f)
                    .background(Color.Green)
                ){
                    Text(
                        text = "DAM 2",
                        fontSize = 30.sp,
                        color = Color.Black,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
            }

        }

        Row (
            Modifier
                .height(250.dp)
                .background(Color.Blue)){
            Box(modifier = Modifier
                .fillMaxHeight(10f)
                .fillMaxWidth(10f)
                .background(Color.Magenta),
                contentAlignment = Alignment.BottomCenter
            ){
                Text(
                    text = "..Combinando Column y Box",
                    fontSize = 22.sp,
                    color = Color.Yellow
                )
            }

        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ejercicio2ComposeTheme {
        Greeting("Android")
    }
}