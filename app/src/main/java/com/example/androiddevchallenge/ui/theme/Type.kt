/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.R

val KulimPark = FontFamily(
    Font(R.font.kulim_park_light, FontWeight.Light),
    Font(R.font.kulim_park_regular, FontWeight.Normal)
)

val Lato = FontFamily(
    Font(R.font.lato_regular, FontWeight.Normal),
    Font(R.font.lato_light, FontWeight.Light),
    Font(R.font.lato_bold, FontWeight.Bold),
)

// Set of Material typography styles to start with
val typography = Typography(
    h1 = TextStyle(
        fontFamily = KulimPark,
        fontWeight = FontWeight.Light,
        letterSpacing = 1.15.sp,
        fontSize = 28.sp
    ),
    // TODO: CAPS
    h2 = TextStyle(
        fontFamily = KulimPark,
        fontWeight = FontWeight.Normal,
        letterSpacing = 1.15.sp,
        fontSize = 15.sp
    ),
    h3 = TextStyle(
        fontFamily = Lato,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.sp,
        fontSize = 14.sp
    ),
    body1 = TextStyle(
        fontFamily = Lato,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp,
        fontSize = 14.sp
    ),
    // CAPS
    button = TextStyle(
        fontFamily = Lato,
        fontWeight = FontWeight.Bold,
        letterSpacing = 1.15.sp,
        fontSize = 14.sp
    ),
    // CAPS
    caption = TextStyle(
        fontFamily = KulimPark,
        fontWeight = FontWeight.Normal,
        letterSpacing = 1.15.sp,
        fontSize = 12.sp
    )
)
