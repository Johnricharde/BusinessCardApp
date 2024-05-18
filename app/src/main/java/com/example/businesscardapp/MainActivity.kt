package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { contentPadding ->
                    // Pass the contentPadding to the BusinessCard composable
                    BusinessCard(modifier = Modifier.padding(contentPadding))
                }
            }
        }
    }
}


@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
    ) {
        NameAndTitle()
        ContactInformation()
    }
}


@Composable
fun NameAndTitle(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = 100.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Android logo",
            modifier = Modifier
                .padding(0.dp)
                .size(120.dp)
        )
        Text(
            text = "John R. Espedal",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier
        )
        Text(
            text = "Developer",
            fontWeight = FontWeight.Bold,
            modifier = modifier
        )
    }
}


@Composable
fun ContactInformation(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxWidth()
    ) {
        Column(
            modifier = modifier.padding(16.dp)
        ) {
            // Email Contact info
            Row(modifier = modifier.padding(5.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.email_logo),
                    contentDescription = "Email logo",
                    modifier = Modifier
                        .padding(end = 10.dp)
                        .size(24.dp)
                )
                Text(
                    text = "johnrichard.espedal@gmail.com",
                    modifier = modifier
                )
            }
            // Github Contact info
            Row(modifier = modifier.padding(5.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.github_logo),
                    contentDescription = "Github logo",
                    modifier = Modifier
                        .padding(end = 10.dp)
                        .size(24.dp)
                )
                Text(
                    text = "github.com/Johnricharde",
                    modifier = modifier
                )
            }
            // X Contact info
            Row(modifier = modifier.padding(5.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.x_logo),
                    contentDescription = "X logo",
                    modifier = Modifier
                        .padding(end = 10.dp)
                        .size(24.dp)
                )
                Text(
                    text = "x.com/john_richarde",
                    modifier = modifier
                )
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardAppTheme {
        BusinessCard()
    }
}
