package com.teska.blog.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
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