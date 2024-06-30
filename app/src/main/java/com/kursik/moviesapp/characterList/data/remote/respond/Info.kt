package com.kursik.moviesapp.characterList.data.remote.respond

data class Info(
    val count: Int,
    val next: String,
    val pages: Int,
    val prev: Any
)