package edu.uksw.fti.pam.acitivityintent

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAMAcitivityIntentTheme {
                // A surface container using the 'background' color from the theme
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(151515)),
                ) {
                    val username = getIntent().getStringExtra("username") ?: ""
                    HomePreview()
                }
            }
        }
    }
}




@Composable
fun Greeting(name: String) {
    Text(text = "cukk $name!")
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    PAMAcitivityIntentTheme {
        Homeprev()
    }
}

@Composable
fun Homeprev() {
    Image(painterResource(id = R.drawable.x),"title",
        modifier = Modifier
            .fillMaxWidth()
    )
    Image(painterResource(id =R.drawable.vector),"title",
        modifier = Modifier
            .padding(start = 20.dp, top = 20.dp)
            .size(width = 40.dp, height = 40.dp)
    )


    Image(painterResource(id =R.drawable.shuffle),"title",
        modifier = Modifier
            .padding(top = 320.dp, start = 350.dp)
            .size(width = 35.dp, height = 35.dp)
    )

    Text(
        text = "boy pablo",
        fontWeight = FontWeight.Bold,
        fontSize = 60.sp,
        color = Color.White,
        modifier = Modifier
            .padding(top = 220.dp, start = 20.dp)
    )
    Text(
        text = "3.977.792 pendengar bulanan",
        fontSize = 10.sp,
        color = Color.White,
        modifier = Modifier
            .padding(top = 310.dp, start = 20.dp)
    )

    Button(
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(31,214,100)),
        modifier = Modifier
            .padding(top = 320.dp, start = 20.dp),

        onClick = {
        }
    ) {
        Text(text = "Mengikuti",
            color = Color.White

        )

    }
    Image(painterResource(id =R.drawable.oip_1),"title",
        modifier = Modifier
            .padding(start = 20.dp, top = 380.dp)
            .size(width = 50.dp, height = 50.dp)
    )
    Image(painterResource(id =R.drawable._9b653b430d381c925df17f5fa66a9e5_3),"title",
        modifier = Modifier
            .padding(start = 20.dp, top = 450.dp)
            .size(width = 50.dp, height = 50.dp)
    )
    Image(painterResource(id =R.drawable._28f983f5fe5b77c4a58b1a7f841adcb_1),"title",
        modifier = Modifier
            .padding(start = 20.dp, top = 520.dp)
            .size(width = 50.dp, height = 50.dp)
    )


//    button navigation
//    -----------------

        Image(
            painterResource(id = R.drawable.home_button), "title",
            modifier = Modifier
                .padding(start = 50.dp, top = 620.dp)
                .size(width = 30.dp, height = 30.dp)
        )

        Image(
            painterResource(id =R.drawable.koleksi), "title",
            modifier = Modifier
                .padding(start = 130.dp, top = 620.dp)
                .size(width = 30.dp, height = 30.dp)
        )
        Image(
            painterResource(id =R.drawable.spotify_original), "title",
            modifier = Modifier
                .padding(start = 220.dp, top = 620.dp)
                .size(width = 30.dp, height = 30.dp)
        )
        Image(
            painterResource(id = R.drawable.user), "title",
            modifier = Modifier
                .padding(start = 320.dp, top = 620.dp)
                .size(width = 30.dp, height = 30.dp)
        )

//    text untuk list lagu
    Text(
        text = "I Hope She Love Me Back",
        fontWeight = FontWeight.Bold,
        fontSize = 10.sp,
        color = Color.White,
        modifier = Modifier
            .padding(top = 390.dp, start = 90.dp)
    )

    Text(
        text = "boy pablo",
        fontWeight = FontWeight.Bold,
        fontSize = 10.sp,
        color = Color.White,
        modifier = Modifier
            .padding(top = 410.dp, start = 90.dp)
    )


    Text(
        text = "Sick Feeling",
        fontWeight = FontWeight.Bold,
        fontSize = 10.sp,
        color = Color.White,
        modifier = Modifier
            .padding(top = 460.dp, start = 90.dp)
    )

    Text(
        text = "boy pablo",
        fontSize = 10.sp,
        color = Color.White,
        modifier = Modifier
            .padding(top = 480.dp, start = 90.dp)
    )

    Text(
        text = "Dance,Baby!",
        fontWeight = FontWeight.Bold,
        fontSize = 10.sp,
        color = Color.White,
        modifier = Modifier
            .padding(top = 525.dp, start = 90.dp)
    )

    Text(
        text = "boy pablo",
        fontSize = 10.sp,
        color = Color.White,
        modifier = Modifier
            .padding(top = 545.dp, start = 90.dp)
    )

//  logo
    Image(painterResource(id =R.drawable.love),"title",
        modifier = Modifier
            .padding(start = 330.dp, top = 390.dp)
            .size(width = 30.dp, height = 30.dp)
    )
    Image(painterResource(id =R.drawable.group),"title",
        modifier = Modifier
            .padding(start = 365.dp, top = 390.dp)
            .size(width = 30.dp, height = 30.dp)
    )

    Image(painterResource(id =R.drawable.vole),"title",
        modifier = Modifier
            .padding(start = 330.dp, top = 450.dp)
            .size(width = 30.dp, height = 30.dp)
    )
    Image(painterResource(id =R.drawable.group),"title",
        modifier = Modifier
            .padding(start = 365.dp, top = 450.dp)
            .size(width = 30.dp, height = 30.dp)
    )

    Image(painterResource(id =R.drawable.vole),"title",
        modifier = Modifier
            .padding(start = 330.dp, top = 520.dp)
            .size(width = 30.dp, height = 30.dp)
    )
    Image(painterResource(id =R.drawable.group),"title",
        modifier = Modifier
            .padding(start = 365.dp, top = 520.dp)
            .size(width = 30.dp, height = 30.dp)
    )

    Image(painterResource(id =R.drawable.slayer),"title",
        modifier = Modifier
            .padding(top = 490.dp)
            .fillMaxSize()
    )

    Card(
        shape = RoundedCornerShape(15.dp),
        modifier = Modifier
            .padding(top = 20.dp, start = 80.dp)
    ) {
        Text(text = "",
        modifier = Modifier.size(width =300.dp , height =40.dp )
            .background(Color(81,78,78))
        )}
    Image(painterResource(id = R.drawable.search),"title",
        modifier = Modifier
            .padding(start = 340.dp, top = 30.dp)
            .size(width = 30.dp, height = 30.dp)
    )

}


@Composable
fun ButtonNav(){

}