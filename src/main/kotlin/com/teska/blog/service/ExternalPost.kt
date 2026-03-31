package com.teska.blog.service

data class ExternalPost(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
)