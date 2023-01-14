package com.codercamp.tabviewsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.codercamp.startabview.StarTabItem
import com.codercamp.startabview.StarTabLayout
import com.codercamp.tabviewsample.ui.theme.TabViewSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TabViewSampleTheme {

                val tabs = listOf(
                    StarTabItem(title = "Tab 1") {
                        Greeting("Tab 1")
                    },
                    StarTabItem(title = "Tab 2") {
                        Greeting("Tab 2")
                    },
                )
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    StarTabLayout(
                        tabIndicatorColor = Color.Blue,
                        tabColor = Color.White,
                        tabList = tabs,
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TabViewSampleTheme {
        Greeting("Android")
    }
}