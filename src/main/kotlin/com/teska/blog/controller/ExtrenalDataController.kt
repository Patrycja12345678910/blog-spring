package com.teska.blog.controller


import com.teska.blog.service.ExternalApiService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ExternalDataController(
    private val externalApiService: ExternalApiService
) {

    @GetMapping("/external-posts")
    fun showExternalPosts(model: Model): String {
        val posts = externalApiService.fetchExternalPosts()
        model.addAttribute("externalPosts", posts)
        return "external-posts"
    }
}