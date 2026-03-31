package com.teska.blog.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
data class Post(
    @Id
    @Lob
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    var title: String = "",
    var content: String = ""
    var author: String = "",

    var createdAt: LocalDateTime = LocalDateTime.now(),
    var publishedAt: LocalDateTime = LocalDateTime.now()
)