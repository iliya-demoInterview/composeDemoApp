package net.dentabros.interviewdemo

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import java.lang.RuntimeException
import javax.inject.Inject

class PlaylistServiceImp @Inject constructor(
    private val api: PlaylistAPI
) : PlaylistService {

    override suspend fun fetchPlaylists() : Flow<Result<List<PlaylistDTO>>> {
        return flow {
            emit(Result.success(api.fetchAllPlaylists()))
        }.catch {
            emit(Result.failure(RuntimeException("Something went wrong")))
        }
    }
}
