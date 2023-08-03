package com.deknow.muzique.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.deknow.muzique.R

@Composable
fun HomScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column() {
            Row(
                horizontalArrangement = Arrangement.spacedBy(30.dp),
                modifier = Modifier
                    .background(Color.Transparent)
                    .fillMaxWidth()
                    .height(30.dp)
                    .padding(5.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "logo",
                    tint = Color.Black,
                )
                // Spacer(modifier = Modifier.padding(3.dp))
                Text(
                    text = "Homie",
                    fontSize = 14.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.padding(38.dp))
                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = "share",
                    tint = Color.Black
                )
                //Spacer(modifier = Modifier.padding(1.dp))
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "setttings",
                    tint = Color.Black
                )
            }
            Spacer(modifier = Modifier.padding(top = 15.dp))
             Box(modifier = Modifier.fillMaxSize()) {
                 Column {
                     Row {
                         Column {
                             Text(
                                 text = "Recent Artists",
                                 fontFamily = FontFamily.Monospace,
                                 fontSize = 15.sp,
                                 color = Color.Black,
                                 modifier = Modifier.padding(start = 5.dp)
                             )
                             LazyRow() {
                                 items(12) {
                                     Card(modifier = Modifier
                                         .padding(4.dp)
                                         .background(Color.White)) {
                                         Image(
                                             painter = painterResource(id = R.drawable.music),
                                             contentDescription = "music icon",
                                             modifier = Modifier
                                                 .size(100.dp)
                                                 .clip(RoundedCornerShape(10.dp))
                                         )
                                         Text(
                                             text = "My music title",
                                             fontFamily = FontFamily.Monospace,
                                             fontSize = 10.sp,
                                             color = Color.Black,
                                             modifier = Modifier.padding(1.dp)
                                         )
                                     }

                                 }
                             }
                         }

                     }
                     Spacer(modifier = Modifier.padding(top = 20.dp))
                     Text(text = "Categories", modifier = Modifier.padding(5.dp))
                     Spacer(modifier = Modifier.padding(top = 10.dp))
                     Row(modifier = Modifier.padding(start = 30.dp)) {
                         Button(
                             onClick = { /*TODO*/ },
                             modifier = Modifier
                                 .height(50.dp)
                                 .width(160.dp)
                                 .background(Color.White)
                         ) {
                             Row {
                                 Icon(
                                     painter = painterResource(id = R.drawable.baseline_download_24),
                                     contentDescription = "download"
                                 )
                                 Spacer(modifier = Modifier.padding(end = 15.dp))
                                 Column {
                                     Text(text = "Downloads")
                                     Text(text = "100 MB")
                                 }
                             }
                         }
                         Spacer(modifier = Modifier.padding(start = 20.dp))
                         Button(
                             onClick = { /*TODO*/ },
                             modifier = Modifier
                                 .height(50.dp)
                                 .width(160.dp)
                                 .background(Color.White)
                         ) {
                             Row {
                                 Icon(
                                     painter = painterResource(id = R.drawable.baseline_image_24),
                                     contentDescription = "Images"
                                 )
                                 Spacer(modifier = Modifier.padding(end = 20.dp))
                                 Column {
                                     Text(text = "Images")
                                     Text(text = "800 MB")
                                 }
                             }
                         }

                     }
                     Spacer(modifier = Modifier.padding(10.dp))
                     Row(modifier = Modifier.padding(start = 30.dp)) {
                         Button(
                             onClick = { navController.navigate("video") },
                             modifier = Modifier
                                 .height(50.dp)
                                 .width(160.dp)
                                 .background(Color.White)
                         ) {
                             Row {
                                 Icon(
                                     painter = painterResource(id = R.drawable.baseline_video_file_24),
                                     contentDescription = "videos"
                                 )
                                 Spacer(modifier = Modifier.padding(end = 20.dp))
                                 Column {
                                     Text(text = "Videos")
                                     Text(text = "100 MB")
                                 }
                             }
                         }
                         Spacer(modifier = Modifier.padding(start = 20.dp))
                         Button(
                             onClick = { navController.navigate("audio") },
                             modifier = Modifier
                                 .height(50.dp)
                                 .width(160.dp)
                                 .background(Color.White)
                         ) {
                             Row {
                                 Icon(
                                     painter = painterResource(id = R.drawable.baseline_music_note_24),
                                     contentDescription = "audio"
                                 )
                                 Spacer(modifier = Modifier.padding(end = 10.dp))
                                 Column {
                                     Text(text = "Audio")
                                     Text(text = "200 GB")
                                 }
                             }
                         }

                     }
                     Spacer(modifier = Modifier.padding(10.dp))
                     Row(modifier = Modifier.padding(start = 30.dp)) {
                         Button(
                             onClick = { /*TODO*/ },
                             modifier = Modifier
                                 .height(50.dp)
                                 .width(160.dp)
                                 .background(Color.White)
                         ) {
                             Row {
                                 Icon(
                                     painter = painterResource(id = R.drawable.baseline_video_file_24),
                                     contentDescription = "download"
                                 )
                                 Spacer(modifier = Modifier.padding(end = 15.dp))
                                 Column {
                                     Text(text = "Documents")
                                     Text(text = "900 MB")
                                 }
                             }
                         }
                         Spacer(modifier = Modifier.padding(start = 20.dp))
                         Button(
                             onClick = { /*TODO*/ },
                             modifier = Modifier
                                 .height(50.dp)
                                 .width(160.dp)
                                 .background(Color.White)
                         ) {
                             Row {
                                 Icon(
                                     painter = painterResource(id = R.drawable.baseline_android_24),
                                     contentDescription = "apps",
                                 )
                                 Spacer(modifier = Modifier.padding(end = 20.dp))
                                 Column {
                                     Text(text = "Apps")
                                     Text(text = "230 GB")
                                 }
                             }
                         }

                     }
                 }
             }
        }

    }
}