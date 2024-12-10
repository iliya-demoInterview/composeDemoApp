package net.dentabros.interviewdemo

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MockPlaylistService @Inject constructor() : PlaylistService {

    val data: List<PlaylistDTO> = listOf(
        PlaylistDTO("1", "Rock", "rock"),
        PlaylistDTO("2", "General", ""),
    )

    override suspend fun fetchPlaylists(): Flow<Result<List<PlaylistDTO>>> =
        flow {
            emit(Result.success(data))
        }

}