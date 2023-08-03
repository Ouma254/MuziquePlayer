package com.deknow.muzique.data

import com.deknow.muzique.R

data class FileAudio(
    val image: Int,
    val name: String
)
// create the object for the class
val audios = listOf(
    FileAudio(
        image = R.drawable.baseline_music_note_24,
        name = "Emma Jalamo Opija mp3."
    ),
    FileAudio(
        image = R.drawable.baseline_music_note_24,
        name = "Ave ave maria mp3."
    ),
    FileAudio(
        image = R.drawable.baseline_music_note_24,
        name = "Gaurdian Angel mp3."
    ),
    FileAudio(
        image = R.drawable.baseline_music_note_24,
        name = "willy paul sitolia mp3."
    )
)
