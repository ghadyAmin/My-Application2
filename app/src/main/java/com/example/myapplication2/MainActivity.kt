package com.example.myapplication2

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication2.ui.theme.MyApplication2Theme
import com.example.myapplication2.ui.theme.RecipeList
import com.example.myapplication2.ui.theme.defaultRecipes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {        super.onCreate(savedInstanceState)
        setContent {            MaterialTheme {                Column(modifier = Modifier                    .fillMaxSize()
            .fillMaxHeight()
            .clickable {                    })
        {
            RecipeList(defaultRecipes)
        }            }        }    }
    @Preview(name = "Light Mode")


    @Preview(
        uiMode = Configuration.UI_MODE_NIGHT_YES,
        showBackground = true,
        name = "Dark Mode"
    )

@Composable
fun GreetPreview(){
    MyApplication2Theme {
        Greet2(Message("Android", "App dev"))
    }}

data class Message(val author: String, val body:String)
@Composable
fun Greet2(msg: Message) {
    Row(modifier = Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "android",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape)
            //   .size(40.dp)
            //    .clip(CircleShape)
            //   .border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape)

        )
        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(
                text = msg.author,
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.titleSmall
            )
            Spacer(modifier = Modifier.height(8.dp))
            Surface(shape = MaterialTheme.shapes.medium, shadowElevation = 4.dp) {
                Text(
                    text = msg.body,
                    style = MaterialTheme.typography.bodyMedium
                )
            }

        }

    }



    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(text = "Hello $name!", modifier = modifier)

    }}}






//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
 //   MyApplication2Theme {
//        Greeting("Android")
 //   }
//}