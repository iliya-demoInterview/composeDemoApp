package net.dentabros.demointerview.details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class PlaylistDetailsViewModelFactory @Inject constructor(
) : ViewModelProvider.Factory{

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PlaylistDetailsViewModel() as T
    }
}
