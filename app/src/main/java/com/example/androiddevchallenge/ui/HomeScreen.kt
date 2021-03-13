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
package com.example.androiddevchallenge.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Spa
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R

data class CollectionItem(
    @DrawableRes val icon1: Int,
    @DrawableRes val icon2: Int,
    val string1: String,
    val string2: String,
)

val collectionItems = listOf(
    CollectionItem(
        R.drawable.jakub,
        R.drawable.nothing_ahead,
        "Short Mantras",
        "Nature meditations"
    ),
    CollectionItem(
        R.drawable.jim,
        R.drawable.scott_webb,
        "Stress and anxiety",
        "Self-massage"
    ),
    CollectionItem(
        R.drawable.ruvim,
        R.drawable.jakub,
        "Overwhelmed",
        "Nightly wind down"
    )
)

data class AlignYourItem(
    @DrawableRes val icon: Int,
    val text: String
)

val alignYourBody = listOf(
    AlignYourItem(R.drawable.chevanon, "Inversions"),
    AlignYourItem(R.drawable.agung, "Quick Yoga"),
    AlignYourItem(R.drawable.cliff, "Stretching"),
    AlignYourItem(R.drawable.tale, "Tabata"),
    AlignYourItem(R.drawable.lazy, "HIIT"),
    AlignYourItem(R.drawable.ft, "Pre-natal yoga"),
)

val alignYourMind = listOf(
    AlignYourItem(R.drawable.chevanon, "Meditate"),
    AlignYourItem(R.drawable.kids, "With kids"),
    AlignYourItem(R.drawable.karolina, "Aromatherapy"),
    AlignYourItem(R.drawable.otg, "On the go"),
    AlignYourItem(R.drawable.animals, "With pets"),
    AlignYourItem(R.drawable.nathan, "High stress"),
)

@Composable
fun FavouriteItem(@DrawableRes icon: Int, text: String) {
    Surface(
        modifier = Modifier
            .size(192.dp, 56.dp)
            .padding(end = 8.dp),
        shape = MaterialTheme.shapes.small
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painterResource(icon),
                contentDescription = text,
                modifier = Modifier
                    .padding(end = 16.dp)
                    .size(56.dp),
                contentScale = ContentScale.Crop
            )

            Text(
                text,
                style = MaterialTheme.typography.h3
            )
        }
    }
}

@Composable
fun AlignYour(item: AlignYourItem) {
    Column(
        modifier = Modifier.padding(end = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painterResource(item.icon),
            contentDescription = item.text,
            modifier = Modifier
                .size(88.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier.height(24.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(item.text)
        }
    }
}

@Composable
fun HomeScreen() {
    Surface(
        color = MaterialTheme.colors.background
    ) {
        Box {
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                TextField(
                    "",
                    onValueChange = { },
                    placeholder = { Text("Search") },
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .padding(top = 56.dp)
                        .fillMaxWidth(),
                    leadingIcon = {
                        Icon(
                            Icons.Default.Search,
                            contentDescription = "Search",
                            modifier = Modifier.size(18.dp)
                        )
                    },
                    textStyle = MaterialTheme.typography.body1,
                    colors = TextFieldDefaults.textFieldColors(textColor = MaterialTheme.colors.onSurface)
                )

                LazyColumn(
                    modifier = Modifier
                        .weight(1f)
                        .padding(horizontal = 16.dp)
                ) {
                    item {
                        Column {
                            Box(
                                modifier = Modifier
                                    .height(48.dp)
                                    .padding(bottom = 8.dp),
                                contentAlignment = Alignment.BottomStart
                            ) {
                                Text(
                                    "FAVORITE COLLECTIONS",
                                    style = MaterialTheme.typography.h2,
                                    color = MaterialTheme.colors.onBackground,
                                    modifier = Modifier
                                )
                            }

                            LazyRow {
                                items(collectionItems) {
                                    Column {
                                        FavouriteItem(it.icon1, it.string1)
                                        Spacer(Modifier.padding(bottom = 8.dp))
                                        FavouriteItem(it.icon2, it.string2)
                                    }
                                }
                            }
                        }
                    }

                    item {
                        Column {
                            Box(
                                modifier = Modifier
                                    .height(48.dp)
                                    .padding(bottom = 8.dp),
                                contentAlignment = Alignment.BottomStart
                            ) {
                                Text(
                                    "ALIGN YOUR BODY",
                                    style = MaterialTheme.typography.h2,
                                    color = MaterialTheme.colors.onBackground
                                )
                            }

                            LazyRow {
                                items(alignYourBody) {
                                    AlignYour(it)
                                }
                            }
                        }
                    }

                    item {
                        Column {
                            Box(
                                modifier = Modifier
                                    .height(48.dp)
                                    .padding(bottom = 8.dp),
                                contentAlignment = Alignment.BottomStart
                            ) {
                                Text(
                                    "ALIGN YOUR MIND",
                                    style = MaterialTheme.typography.h2,
                                    color = MaterialTheme.colors.onBackground
                                )
                            }

                            LazyRow {
                                items(alignYourMind) {
                                    AlignYour(it)
                                }
                            }
                        }
                    }
                }

                Card(
                    backgroundColor = MaterialTheme.colors.background,
                    elevation = 8.dp,
                    modifier = Modifier
                        .height(56.dp)
                        .fillMaxWidth()
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        val weightModifier = Modifier.weight(1f)

                        BottomIcon(
                            icon = Icons.Default.Spa,
                            text = "HOME",
                            isSelected = true,
                            modifier = weightModifier
                        )

                        BottomIcon(
                            icon = Icons.Default.AccountCircle,
                            text = "PROFILE",
                            modifier = weightModifier
                        )
                    }
                }
            }

            FloatingActionButton(
                onClick = { },
                backgroundColor = MaterialTheme.colors.primary,
                contentColor = MaterialTheme.colors.onPrimary,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 28.dp)
            ) {
                Icon(
                    Icons.Default.PlayArrow,
                    contentDescription = "Play",
                    modifier = Modifier.size(24.dp)
                )
            }
        }
    }
}
