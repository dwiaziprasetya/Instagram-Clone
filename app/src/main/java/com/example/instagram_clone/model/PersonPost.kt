package com.example.instagram_clone.model

import androidx.annotation.DrawableRes
import com.example.instagram_clone.R

data class PersonPost(
    @DrawableRes val imageProfile: Int,
    @DrawableRes val imagePost: Int,
    val username: String,
    val like: String,
    val caption: String,
    val commentCount: Int,
    val timePost: Int
)

val dummyPost = listOf(
    PersonPost(
        imageProfile = R.drawable.mark,
        imagePost = R.drawable.mark_post,
        username = "mark",
        like = "2,000",
        caption = "Night Game ⚽",
        commentCount = 99,
        timePost = 40
    ),
    PersonPost(
        imageProfile = R.drawable.molly,
        imagePost = R.drawable.molly_post,
        username = "molly",
        like = "12,456",
        caption = "Beautifull Lake 🍀",
        commentCount = 300,
        timePost = 50
    ),
    PersonPost(
        imageProfile = R.drawable.james,
        imagePost = R.drawable.james_post,
        username = "james",
        like = "5,000",
        caption = "Sunday is the best",
        commentCount = 30,
        timePost = 5
    ),
)