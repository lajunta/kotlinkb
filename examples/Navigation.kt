package dev.lamy.scaffold

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import dev.lamy.scaffold.ui.theme.ScaffoldTheme
import kotlinx.serialization.Serializable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScaffoldScreen()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScaffoldScreen() {
    ScaffoldTheme {
        val navController = rememberNavController()
        NavHost(navController, startDestination = ScreenA) {
            composable<ScreenA> { ScreenA(navController) }
            composable<ScreenB> { ScreenB(navController, it) }
        }
    }
}

@Serializable
object ScreenA

@Serializable
data class ScreenB(
    val name: String?,
    val age: Int
)

@Composable
fun ScreenA(navController:NavController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text("Go to screen b", fontSize = 36.sp, modifier = Modifier.clickable {
            navController.navigate(ScreenB( name = null, age=12 ))
        })
    }
}

@Composable
fun ScreenB(navController: NavController, it: NavBackStackEntry){
    val args = it.toRoute<ScreenB>()
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text("Go to screen A", fontSize = 36.sp, modifier = Modifier.clickable {
            navController.navigate(ScreenA)
        })
        Text("${args.name}, ${args.age}")
    }
}
