package net.dentabros.expenser.expenser.interviewdemoapp

import net.dentabros.interviewdemo.Playlist

sealed class UiState {
    data class Success (val data : List<Playlist>) : UiState()
    data class Error(val error: Throwable) : UiState()
    data object Loading : UiState()
}