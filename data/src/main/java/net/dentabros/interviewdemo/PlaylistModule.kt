package net.dentabros.interviewdemo


import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

val client = OkHttpClient()
val idlingResource = null// OkHttp3IdlingResource.create("okhttp", client)

@Module
@InstallIn(SingletonComponent::class)
object PlaylistModule {

    @Provides
    fun playlistAPI(retrofit: Retrofit) = retrofit.create(PlaylistAPI::class.java)

    @Provides
    fun retrofit() = Retrofit.Builder()
        .baseUrl("http://192.168.1.5:2999/") //please check that it matches your current local ip
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()


}


@Module
@InstallIn(SingletonComponent::class)
internal interface EventServiceModule {

    @Singleton
    @Binds
    fun bindsEventService(
        playlistService: MockPlaylistService,
    ): PlaylistService

}