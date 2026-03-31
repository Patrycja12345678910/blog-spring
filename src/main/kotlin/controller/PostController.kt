package com.teska.blog.controller

import com.teska.blog.model.Post
import com.teska.blog.repository.PostRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

@Controller
class PostController(private val postRepository: PostRepository) {

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