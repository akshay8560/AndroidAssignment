package com.example.myhotels.Util

import com.example.myhotels.Address

data class hotelListItem(
    val Address: Address,
    val Description: String,
    val HotelId: String,
    val HotelName: String,
    val Price: String,
    val Tags: List<String>,
    val hotelImage: String
)