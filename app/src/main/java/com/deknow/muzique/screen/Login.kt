package com.deknow.muzique.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.deknow.muzique.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {
    val email by remember {
        mutableStateOf("")
    }
    val password by remember {
        mutableStateOf("")
    }
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(600.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.music),
                    contentDescription = "music",
                    modifier = Modifier
                        .size(200.dp)
                        .clip(CircleShape)
                )
//                Text(text = "Welcome to MuziQue Player",
//                    fontSize = 25.sp,
//                    color = Color.Green,
//                    fontWeight = FontWeight.Bold,
//                    fontFamily = FontFamily.Serif
//                )
                Spacer(modifier = Modifier.padding(16.dp))
                Text(
                    text = "Login",
                    fontSize = 24.sp,
                    color = Color.Blue,
                    textAlign = TextAlign.Center
                    //modifier = Modifier.padding(start = 90.dp)

                )
            }
            Spacer(modifier = Modifier.padding(20.dp))
            OutlinedTextField(
                value = email,
                onValueChange = {

                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "email",
                        modifier = Modifier.padding(end = 10.dp),
                        tint = Color.Blue
                    )
                },
                placeholder = {
                    Text(
                        text = "Enter email",
                        fontSize = 15.sp,
                        color = Color.Blue
                    )
                }
            )
            Spacer(modifier = Modifier.padding(20.dp))
            OutlinedTextField(
                value = password,
                onValueChange = {

                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "password",
                        modifier = Modifier.padding(end = 10.dp),
                        tint = Color.Blue
                    )
                },
                placeholder = {
                    Text(
                        text = "enter password",
                        fontSize = 15.sp,
                        color = Color.Blue
                    )
                }
            )
            Spacer(modifier = Modifier.padding(20.dp))
            Button(
                onClick = {
                    navController.navigate("homie")
                },
                modifier = Modifier.width(300.dp)
            ) {
                Text(text = "Login")
            }
        }
    }
}