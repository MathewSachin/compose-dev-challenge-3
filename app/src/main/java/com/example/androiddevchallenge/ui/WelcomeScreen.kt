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

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R

@Composable
fun WelcomeScreen(goToLogin: () -> Unit) {
    Surface(
        color = MaterialTheme.colors.background
    ) {
        Box {
            Image(
                painterResource(R.drawable.welcome),
                contentScale = ContentScale.Crop,
                contentDescription = "background",
                modifier = Modifier
                    .fillMaxSize()
            )

            Column(
                modifier = Modifier
                    .align(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(R.drawable.logo),
                    contentDescription = "logo",
                    modifier = Modifier.padding(bottom = 32.dp)
                )

                Button(
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                        .padding(horizontal = 16.dp)
                        .fillMaxWidth()
                        .height(72.dp),
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = MaterialTheme.colors.primary,
                        contentColor = MaterialTheme.colors.onPrimary
                    ),
                    shape = MaterialTheme.shapes.medium
                ) {
                    Text("SIGN UP")
                }

                Button(
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .fillMaxWidth()
                        .height(72.dp),
                    onClick = goToLogin,
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = MaterialTheme.colors.secondary,
                        contentColor = MaterialTheme.colors.onSecondary
                    ),
                    shape = MaterialTheme.shapes.medium
                ) {
                    Text("LOGIN")
                }
            }
        }
    }
}
