package com.example.instagram_clone.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagram_clone.R
import com.example.instagram_clone.ui.theme.InstagramCloneTheme

@Composable
fun StoryItem(
    image: Int,
    name: String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(image),
            contentDescription = null,
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
                .border(
                    width = 2.dp,
                    brush = Brush.linearGradient(
                        colors = listOf(Color.Yellow, Color.Red),
                        start = Offset(0f, 0f),
                        end = Offset(70f, 70f)
                    ),
                    shape = CircleShape
                ),
            contentScale = ContentScale.Crop
        )
        Text(
            modifier = Modifier.padding(top = 5.dp),
            text = name,
            fontSize = 10.sp,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun StoryItemPreview() {
    InstagramCloneTheme {
        StoryItem(
            R.drawable.amelia_andani,
            "Amelia Andani"
        )
    }
}