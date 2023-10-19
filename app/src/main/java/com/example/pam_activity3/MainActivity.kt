package com.example.pam_activity3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pam_activity3.ui.theme.PAM_Activity3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAM_Activity3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}


@Composable
fun HomeScreen(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text = "Khaidar app",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.padding(13.dp))
        Box()
        Spacer( modifier = Modifier.padding(13.dp))
        Lokasi()
    }
}


@Composable
fun Box(){
    Box(modifier = Modifier
        .clip(RoundedCornerShape(20.dp))
        .fillMaxSize()
        .background(color = Color.Blue)
        )
    {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally, modifier = Modif
        ){
            Image(painter = painterResource(id = R.drawable.background),
                contentDescription = "",
                modifier = Modifier.size(150.dp)
                )
            Text(
                text = "Rain",
                fontSize = 40.sp,
                modifier = Modifier.padding(20.dp))
        }
    }

}

@Composable
fun Lokasi(){
    Text(text = "19 C", fontSize = 64.sp, fontWeight = FontWeight.Bold)
    Row {
        Image(painter = painterResource(id = R.drawable.loc), contentDescription = "", modifier = Modifier.size(40.dp))
        Spacer(modifier = Modifier.padding(5.dp))
        Text(text = "Yogyakarta", fontSize = 40.sp)
    }
    Text(text = "Kasihan, Kabupaten Bantul, Daerah Istimewa Yogyakarta", textAlign = TextAlign.Center, color = Color.Gray)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PAM_Activity3Theme {
    }
}