package com.deknow.muzique.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.ui.graphics.vector.ImageVector
import com.deknow.muzique.R

data class VideoFile(
    val image: Int,
    val name: String,
    val icon: ImageVector,
    val size: String
)

val videos = listOf(
    VideoFile(
        image = R.drawable.images,
        name = "Timeless noel mp4.",
        icon = Icons.Default.PlayArrow,
        size = "45 MB"
    ),
    VideoFile(
        image = R.drawable.musi,
        name = "Lady maureen mp4.",
        icon = Icons.Default.PlayArrow,
        size = "4 MB"
    ),
    VideoFile(
        image = R.drawable.music,
        name = "dj young gospel mp4.",
        icon = Icons.Default.PlayArrow,
        size = "85 MB"
    ),
    VideoFile(
        image = R.drawable.music,
        name = "Timeless noel makofi mp4.",
        icon = Icons.Default.PlayArrow,
        size = "15 MB"
    ),
)
