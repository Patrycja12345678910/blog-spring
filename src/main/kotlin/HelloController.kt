package com.teska.blog

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/")
    fun home(): String {
        return "Witaj w moim blogu!"
    }

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello, world!"
    }
}