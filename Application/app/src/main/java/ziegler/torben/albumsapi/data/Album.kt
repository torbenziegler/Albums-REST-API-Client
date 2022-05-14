package ziegler.torben.albumsapi.data

data class Album(
    val name: String,
    val artist: String,
    val releaseYear: Int,
    val imageUrl: String,
    val dominantColors: List<String>,
    val songs: List<Song>
)
