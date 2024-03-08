package com.example.instagram_clone

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBar
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
                                modifier = Modifier.padding(8.dp),
                                title = {},
                                navigationIcon = {
                                    Image(
                                        painter = painterResource(R.drawable.instagram_text_icon),
                                        contentDescription = null
                                    )
                                },
                                actions = {
                                    IconButton(onClick = {}) {
                                        Icon(
                                            imageVector = Icons.Default.FavoriteBorder,
                                            contentDescription = "Favourite Icon",
                                        )
                                    }
                                    IconButton(onClick = {}) {
                                        Icon(
                                            imageVector = Icons.Rounded.Add,
                                            contentDescription = "Send Icon"
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
