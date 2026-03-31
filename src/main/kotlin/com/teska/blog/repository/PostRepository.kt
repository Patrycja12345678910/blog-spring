package com.teska.blog.repository

import com.teska.blog.model.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long>