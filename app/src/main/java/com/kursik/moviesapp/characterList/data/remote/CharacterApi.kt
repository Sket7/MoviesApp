package com.kursik.moviesapp.characterList.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface CharacterApi {

    @GET
    suspend fun getCharacter(
        @Query("page") page: Int
    )

//    @GET("avatar/1.jpeg")
//    suspend fun getAvatar()


}