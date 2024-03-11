package com.example.instagram_clone.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagram_clone.R

@Composable
fun PostItem(username : String,
             image: Int,
             profileImage: Int,
             like: String,
             caption: String,
             commentCount: Int,
             timePost: Int
) {
    Surface {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(profileImage),
                    contentDescription = "Amelia Andani",
                    modifier = Modifier
                        .size(35.dp)
                        .clip(CircleShape)
                )
                Text(
                    text = username,
                    modifier = Modifier
                        .padding(12.dp)
                        .weight(1f),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = null,
                    )
                }
            }
            Image(
                painter = painterResource(image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
                    .size(400.dp)
            )
            Column(modifier = Modifier.padding(bottom = 16.dp)) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            start = 16.dp, top = 8.dp,
                        ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.favourite_icon),
                        contentDescription = null,
                        modifier = Modifier.size(30.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Icon(
                        painter = painterResource(R.drawable.comment_icon),
                        contentDescription = null,
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Icon(
                        painter = painterResource(R.drawable.send_icon),
                        contentDescription = null,
                    )
                    Spacer(modifier = Modifier.weight(2f))
                    Icon(
                        painter = painterResource(R.drawable.collection_icon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(40.dp)
                    )
                }
                Text(
                    text = "$like likes",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 16.dp, bottom = 3.dp)
                )
                Row {
                    Text(
                        text = username,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 16.dp, bottom = 3.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = caption)
                }
                Text(
                    text = "View all $commentCount comments",
                    modifier = Modifier.padding(start = 16.dp, bottom = 3.dp),
                    color = Color.Gray
                )
                Text(
                    text = "$timePost minutes ago",
                    modifier = Modifier.padding(start = 16.dp),
                    color = Color.Gray
                )
            }
        }
    }
}