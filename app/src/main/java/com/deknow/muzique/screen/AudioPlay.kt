package com.deknow.muzique.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.deknow.muzique.R

@Composable
fun AudioScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(900.dp)
            .background(Color.LightGray)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
            //modifier = Modifier.padding(10.dp)
        ) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)) {
                IconButton(
                    onClick = { navController.navigate("homie") }
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrowBack",

                        tint = Color.Black
                    )
                }
                Text(
                    text = "Audio Player",
                    modifier = Modifier.padding(top = 10.dp),
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color.Blue,
                )
                Spacer(modifier = Modifier.padding(90.dp))
                IconButton(
                    onClick = { /*TODO*/ }
                ) {
                   Icon(
                       imageVector = Icons.Default.Share,
                       contentDescription = "share",
                       tint = Color.Black
                   )
                }
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.file),
                    contentDescription = "music logo",
                    modifier = Modifier
                        .size(300.dp)
                        .clip(RoundedCornerShape(5.dp))
                    )
            }
            Spacer(modifier = Modifier.padding(top = 80.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                IconButton(
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "favorites",
                        modifier = Modifier.size(40.dp),
                        tint = Color.Red
                    )
                }
                IconButton(
                    onClick = { /*TODO*/ }
                ) {
                   Icon(
                       painter = painterResource(id = R.drawable.baseline_star_rate_24),
                       contentDescription = "rate",
                       modifier = Modifier.size(40.dp),
                       tint = Color.Black
                   )
                }
                //Spacer(modifier = Modifier.padding(5.dp))
                IconButton(
                    onClick = { navController.navigate("files") }
                ) {
                    Icon(
                        imageVector = Icons.Default.List,
                        contentDescription = "list",
                        modifier = Modifier.size(60.dp),
                        tint = Color.Black
                    )
                }
            }
            Spacer(modifier = Modifier.padding(top = 20.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                IconButton(
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_fast_rewind_24),
                        contentDescription = "rewind",
                        modifier = Modifier.size(60.dp)
                    )
                }
                Spacer(modifier = Modifier.padding(5.dp))
                IconButton(
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_play_arrow_24),
                        contentDescription = null,
                        modifier = Modifier.size(60.dp)
                    )
                }
                Spacer(modifier = Modifier.padding(5.dp))
                IconButton(
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_fast_forward_24),
                        contentDescription = "forward",
                        modifier = Modifier.size(60.dp)
                    )
                }
            }
        }
    }
}