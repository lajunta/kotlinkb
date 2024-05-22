import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

sealed class Screen(val route: String) {
    object Screen1 : Screen("screen1")
    object Screen2 : Screen("screen2")
    object Screen3 : Screen("screen3")
}

@Composable
fun Screen1Content(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "这是页面1", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate(Screen.Screen2.route) }) {
            Text("跳转到页面2")
        }
    }
}

@Composable
fun Screen2Content(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "这是页面2", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate(Screen.Screen3.route) }) {
            Text("跳转到页面3")
        }
    }
}

@Composable
fun Screen3Content(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "这是页面3", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate(Screen.Screen1.route) }) {
            Text("返回到页面1")
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = Screen.Screen1.route) {
        composable(Screen.Screen1.route) {
            Screen1Content(navController)
        }
        composable(Screen.Screen2.route) {
            Screen2Content(navController)
        }
        composable(Screen.Screen3.route) {
            Screen3Content(navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
}
