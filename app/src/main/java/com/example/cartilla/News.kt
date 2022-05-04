package com.example.cartilla

import androidx.annotation.DrawableRes

data class News(
    val id:Long,
    @DrawableRes
    val image:Int?,
    val title:String,
    val resume:String
)