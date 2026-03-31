package com.teska.blog

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
data class Post(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val title: String,
    val content: String,
    val author: String,

    val createdAt: LocalDateTime = LocalDateTime.now(),
    val publishedAt: LocalDateTime = LocalDateTime.now()
)