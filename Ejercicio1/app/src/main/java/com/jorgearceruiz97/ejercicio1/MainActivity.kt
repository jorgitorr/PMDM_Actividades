package com.jorgearceruiz97.ejercicio1

import android.os.Bundle
import android.widget.HorizontalScrollView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.hsl
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jorgearceruiz97.ejercicio1.ui.theme.Ejercicio1Theme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ejercicio1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                    row()
                }
            }
        }
    }
}





@Preview
@Composable
fun row(){
    Box(modifier = Modifier.fillMaxSize()
        .background(Color.hsl(0.35f, 0.6f, 0.7f, 0.65f)),
        contentAlignment = Alignment.Center){
        Row(modifier = Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState()),
            verticalAlignment = Alignment.CenterVertically){

            Text("texto 1",modifier = Modifier
                .height(150.dp)
                .width(150.dp)
                .background(Color.Cyan),
                textAlign = TextAlign.Center,
                color = Color.White,
                fontSize = 16.sp
            )

            Text("texto 2",modifier = Modifier
                .height(150.dp)
                .width(150.dp)
                .background(Color.Red),
                textAlign = TextAlign.Center,
                color = Color.White,
                fontSize = 16.sp
            )

            Text("texto 3",modifier = Modifier
                .height(150.dp)
                .width(150.dp)
                .background(Color.Black),
                textAlign = TextAlign.Center,
                color = Color.White,
                fontSize = 16.sp
            )

            Text("texto 4",modifier = Modifier
                .height(150.dp)
                .width(150.dp)
                .background(Color.Gray),
                textAlign = TextAlign.Center,
                color = Color.White,
                fontSize = 16.sp
            )

            Text("texto 5",modifier = Modifier
                .height(150.dp)
                .width(150.dp)
                .background(Color.Magenta),
                textAlign = TextAlign.Center,
                color = Color.White,
                fontSize = 16.sp
            )


        }
    }

}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
        color = Color.Blue
    )


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ejercicio1Theme {
        Greeting("Android")
    }
}