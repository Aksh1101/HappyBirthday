package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
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
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Birthday()
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Birthday(){
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(painter = image,
        contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5f)
        Wish()
    }


}

@Preview
@Composable
fun Wish(){
    Column(verticalArrangement = Arrangement.Center,
    modifier = Modifier.padding(8.dp)){
    Text("Happy Birthday Alex",
        fontWeight = FontWeight.Bold,
        fontSize = 90.sp,
        textAlign = TextAlign.Center)
    Text("From Sam",
        fontSize = 30.sp,
        modifier = Modifier.align(alignment = Alignment.End))
}

}



