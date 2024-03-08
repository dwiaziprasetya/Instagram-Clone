package com.example.instagram_clone

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.instagram_clone.ui.theme.InstagramCloneTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramCloneTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
                        topBar = {
                            TopAppBar(
                                title = {},
                                navigationIcon = {
                                    Image(
                                        painter = painterResource(R.drawable.instagram_text_icon),
                                        contentDescription = null,
                                        modifier = Modifier.padding(start = 8.dp)
                                    )
                                },
                                actions = {
                                    Row(
                                        modifier = Modifier
                                            .padding(16.dp)
                                            .width(80.dp),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Icon(
                                            painter = painterResource(R.drawable.favourite_icon),
                                            contentDescription = "Favourite Icon",
                                            modifier = Modifier.size(30.dp)
                                        )
                                        Icon(
                                            painter = painterResource(R.drawable.messenger_icon),
                                            contentDescription = "Send Icon",
                                        )
                                    }
                                }
                            )
                        }
                    ) {
                        // Element
                    }
                }
            }
        }
    }
}
