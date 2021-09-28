package com.praveene.movieapp.ui.Hilt

import com.praveene.movieapp.data.network.MovieApi
import com.praveene.movieapp.utils.Constant.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module
object HiltModuls {
    @Provides
    fun providerRetrofitInterface():MovieApi{
        return Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(
            GsonConverterFactory.create()
        ).build().create(MovieApi::class.java)
    }


}