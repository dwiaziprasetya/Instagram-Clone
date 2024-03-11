package com.example.instagram_clone.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.instagram_clone.R

data class Person(
    @DrawableRes val imagePerson: Int,
    @StringRes val namePerson: Int
)

val dummyPersonStory = listOf(
    R.drawable.frank to R.string.frank,
    R.drawable.bill to R.string.bill,
    R.drawable.molly to R.string.molly,
    R.drawable.james to R.string.james,
    R.drawable.jhon to R.string.jhon,
    R.drawable.shelia to R.string.shelia,
    R.drawable.bella to R.string.bella,
    R.drawable.mark to R.string.mark,
    R.drawable.jamal to R.string.jamal,
).map { Person(it.first, it.second) }