package de.torben.ziegler.data.model

@kotlinx.serialization.Serializable
data class Song(
    val title: String,
    val duration: String
)
