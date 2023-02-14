package com.slinex.chefengine.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.*
import androidx.compose.ui.unit.sp
import com.slinex.chefengine.R

// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        color = Night,
        fontSize = 24.sp,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Normal,
        fontFamily = FontFamily(Font(R.font.solway_medium)),
    ),
    h2 = TextStyle(
        color = Night,
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
        fontStyle = FontStyle.Normal,
        fontFamily = FontFamily(Font(R.font.solway_medium))
    ),
//    h3 = TextStyle(
//        color = Night,
//        fontSize =
//    ),
    body1 = TextStyle(
        color = Night,
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        fontFamily = FontFamily(Font(R.font.titilliumweb_regular))
    ),
    caption = TextStyle(
        color = Night.copy(0.4f),
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        fontFamily = FontFamily(Font(R.font.titilliumweb_regular))
    ),
    button = TextStyle(
        color = Night,
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold,
        fontStyle = FontStyle.Normal,
        fontFamily = FontFamily(Font(R.font.titilliumweb_semibold))
    )
)