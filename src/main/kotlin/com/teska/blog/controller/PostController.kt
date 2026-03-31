package com.teska.blog.controller

import com.teska.blog.model.Post
import com.teska.blog.repository.PostRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
class PostController(private val postRepository: PostRepository) {

    @GetMapping("/")
    fun listPosts(model: Model): String {
        model.addAttribute("posts", postRepository.findAll())
        return "index"
    }

    @GetMapping("/post/{id}")
    fun postDetails(@PathVariable id: Long, model: Model): String {
        val post = postRepository.findById(id).orElseThrow()
        model.addAttribute("post", post)
        return "detail"
    }

    @GetMapping("/create")
    fun showCreateForm(model: Model): String {
        model.addAttribute("post", Post(title = "", content = "", author = ""))
        return "create"
    }

    @PostMapping("/create")
    fun createPost(@ModelAttribute post: Post): String {
        postRepository.save(post)
        return "redirect:/"
    }
}