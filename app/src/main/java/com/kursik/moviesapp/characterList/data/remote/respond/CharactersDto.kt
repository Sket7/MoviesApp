package com.kursik.moviesapp.characterList.data.remote.respond

data class CharactersDto(
    val info: Info,
    val results: List<Result>
)