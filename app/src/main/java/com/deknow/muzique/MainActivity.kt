package com.deknow.muzique

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.deknow.muzique.navGraph.NavGraphScreen
import com.deknow.muzique.ui.theme.MuziQueTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MuziQueTheme {
                // HomeScreen()
                //ChatScreen()
                NavGraphScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                actions = {
                          IconButton(
                              onClick = { /*TODO*/ }
                          ) {
                              Icon(
                                  imageVector = Icons.Default.Home,
                                  tint = Color.Black,
                                  contentDescription = "add icon",
                                  //modifier = Modifier.background(Color.Blue).clip(RoundedCornerShape(5.dp))
                                  )
                          }
                },
                title = {
                    Text(
                        text = "Photos",
                        //modifier =
                        color = Color.Red,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
            )
        }
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            content = {
                items(100) {
                    Box(
                        modifier = Modifier
                            .padding(8.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .background(Color.Green),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(painter = painterResource(
                            id = R.drawable.logo),
                            contentDescription = null
                        )

                    }
                }
            }
        )
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun ChatScreen() {
    val item = (1..500).map { 
        ListItem(
            height = Random.nextInt(100,300).dp,
            color = Color(Random.nextLong(0xFFFFFFF)).copy(alpha = 1f)
        )
    }
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = "logo"
                        )
                },
                actions = {
                    Text(text = "Chats",
                        color = Color.Blue,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                }
            )
        },
        bottomBar = {
            BottomAppBar {
                //Icon(imageVector = Icons.Default.Add, contentDescription = "add icon")
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "ADD")
                }
            }
        }
    ) {
        Box(
            modifier = Modifier.padding(1.dp),
            contentAlignment = Alignment.Center
        ) {
            LazyVerticalStaggeredGrid(
                columns = StaggeredGridCells.Fixed(2), 
                modifier = Modifier
                    .fillMaxSize()
                    .padding(5.dp),
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalItemSpacing = 16.dp
            )  {
                items(item) {
                    item ->
                    RandomBox(item = item)
                }
            }          
        }
    }
}

data class ListItem(
    val height: Dp,
    val color: Color
)

@Composable
fun RandomBox(item: ListItem) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(item.height)
            .clip(RoundedCornerShape(5.dp))
            .background(item.color)
    )    
}