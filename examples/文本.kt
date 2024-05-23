// 必须要修改　hello 为你的项目名
package net.lwqzx.hello

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import net.lwqzx.hello.ui.theme.HelloTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloTheme {
                Scaffold(modifier=Modifier.fillMaxSize(),content = { innerPadding ->
                    BlueText(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
                )
            }
        }
    }
}


@Composable
fun BlueText(modifier: Modifier) {
    val txt : String = """
        Hello World
        How are you?
        I am fine,and you?
    """.trimIndent()
    val gradientColors = listOf(Color.Cyan, Color.Red,Color.Blue,Color.Magenta)
    Text(txt,
        color = Color.Blue,
        fontSize = 30.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth(),
        style = TextStyle(
            lineHeight=80.sp,
            shadow = Shadow(Color.Red,offset= Offset(3.0F,3.0F)),
            brush = Brush.linearGradient(
                colors = gradientColors
            )
        )
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloTheme {
        Scaffold(modifier=Modifier.fillMaxSize()) { innerPadding ->
            BlueText(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}