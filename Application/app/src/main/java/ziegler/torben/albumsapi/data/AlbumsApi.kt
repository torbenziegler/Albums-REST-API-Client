package ziegler.torben.albumsapi.data

import retrofit2.http.GET

interface AlbumsApi {

    @GET("/randomalbum")
    suspend fun getRandomAlbum(): Album
}