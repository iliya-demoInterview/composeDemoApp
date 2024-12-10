package net.dentabros.demointerview.playlist

import androidx.lifecycle.*
import kotlinx.coroutines.flow.onEach


class PlaylistViewModel(
    private val repository: net.dentabros.interviewdemo.PlaylistRepository
) : ViewModel() {

    val loader = MutableLiveData<Boolean>()

    val playlists = liveData<Result<List<net.dentabros.interviewdemo.Playlist>>> {
        loader.postValue(true)

        emitSource(repository.getPlaylists()
            .onEach {
                loader.postValue(false)
            }
            .asLiveData())
    }

}
