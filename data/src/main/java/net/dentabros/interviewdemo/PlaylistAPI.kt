package net.dentabros.interviewdemo

import retrofit2.http.GET

interface PlaylistAPI {

    @GET("playlists")
    suspend fun fetchAllPlaylists() : List<PlaylistDTO>
}
