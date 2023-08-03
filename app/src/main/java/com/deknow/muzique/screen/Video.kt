package com.deknow.muzique.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.deknow.muzique.R

@Composable
fun VideoScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color.Transparent)
            ) {
                IconButton(onClick = { navController.navigate("audio") }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrowBack",
                        tint = Color.Blue
                    )
                }
                Spacer(modifier = Modifier.padding(start = 20.dp))
                Text(
                    text = "Videos",
                    modifier = Modifier.padding(top = 14.dp),
                    color = Color.Black,
                    fontWeight = FontWeight(400),
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.padding(start = 240.dp))
                IconButton(
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "search icon"
                    )
                }
            }
            Box(modifier = Modifier.padding(start = 20.dp)) {
                Column {
                    LazyColumn() {
                        items(800) {
                            Row {
                                //Box(modifier = Modifier.padding(2.dp)) {
                                    Image(
                                        painter = painterResource(id = R.drawable.music), 
                                        contentDescription = null
                                    )
                                   Row {
                                       IconButton(
                                           onClick = { /*TODO*/ }
                                       ) {
                                           Icon(
                                               painter = painterResource(id = R.drawable.baseline_play_arrow_24),
                                               contentDescription = null,
                                               modifier = Modifier.size(400.dp)
                                           )
                                       }
                                       Text(text = "230 MB", modifier = Modifier.padding(top = 10.dp))
                                   }
                                //}
                                Spacer(modifier = Modifier.padding(start = 20.dp))
                                //Box(modifier = Modifier.padding(2.dp)) {
                                Image(
                                    painter = painterResource(id = R.drawable.music),
                                    contentDescription = null
                                )
                                Row {
                                    IconButton(
                                        onClick = { /*TODO*/ }
                                    ) {
                                        Icon(
                                            painter = painterResource(id = R.drawable.baseline_play_arrow_24),
                                            contentDescription = null,
                                            modifier = Modifier.size(400.dp)
                                        )
                                    }
                                    Text(text = "230 MB", modifier = Modifier.padding(top = 10.dp))
                                }
                                //}
                            }
                        }
                    }
                }
            }
        }
    }
}