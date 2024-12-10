package net.dentabros.interviewdemo

import kotlinx.coroutines.flow.Flow

interface PlaylistService {
    suspend fun fetchPlaylists() : Flow<Result<List<PlaylistDTO>>>
}