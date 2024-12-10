package net.dentabros.demointerview.playlist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class PlaylistViewModelFactory @Inject constructor(
    private val repository: net.dentabros.interviewdemo.PlaylistRepository
) : ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return PlaylistViewModel(repository) as T
    }

}
