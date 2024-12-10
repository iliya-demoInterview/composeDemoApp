package net.dentabros.interviewdemo

import javax.inject.Inject

class PlaylistMapper @Inject constructor(): Function1<List<PlaylistDTO>, List<net.dentabros.interviewdemo.Playlist>> {

    override fun invoke(playlistsRaw: List<PlaylistDTO>): List<net.dentabros.interviewdemo.Playlist> {
        return playlistsRaw.map {
            val image = when(it.category) {
                "rock" -> R.drawable.rock
                else -> R.drawable.playlist
            }

            net.dentabros.interviewdemo.Playlist(it.id, it.name, it.category, image)
        }
    }
}
