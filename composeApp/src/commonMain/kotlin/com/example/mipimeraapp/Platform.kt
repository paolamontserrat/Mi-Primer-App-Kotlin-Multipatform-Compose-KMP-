package com.example.mipimeraapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform