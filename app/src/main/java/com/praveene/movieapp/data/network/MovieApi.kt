package com.praveene.movieapp.data.network

import com.praveene.movieapp.data.model.ResponseItemItem
import com.praveene.movieapp.utils.Constant.END_URL
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {

    @GET(END_URL)
    suspend fun getAllMovies(
        @Query("page")page:Int

    ):Response<MutableList<ResponseItemItem>>
}