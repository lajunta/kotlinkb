
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    BoxLayout()
}

@Preview(showBackground = true)
@Composable
fun MyAppPreview() {
    MyApp()
}

@Composable
fun BoxLayout() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentAlignment = Alignment.TopStart
    ) {
        Text(
            text = "TopStart",
            modifier = Modifier
                .align(Alignment.TopStart)
                .background(Color.Red)
                .padding(8.dp)
        )
        Text(
            text = "Center",
            modifier = Modifier
                .align(Alignment.Center)
                .background(Color.Green)
                .padding(8.dp)
        )
        Text(
            text = "BottomEnd",
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .background(Color.Blue)
                .padding(8.dp)
        )
    }
}