package com.teska.blog.api

import com.teska.blog.model.Post
import com.teska.blog.repository.PostRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/posts")
class PostApiController(private val postRepository: PostRepository) {

    @GetMapping
    fun getAllPosts(): List<Post> {
        return postRepository.findAll()
    }
}