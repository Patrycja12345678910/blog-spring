package com.teska.blog  // musi być w tym samym pakiecie co BlogApplication.kt

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

// Adnotacja @RestController mówi Spring Boot, że ta klasa będzie obsługiwać żądania HTTP
@RestController
class HelloController {

    // Endpoint GET na stronę główną http://localhost:8080/
    @GetMapping("/")
    fun home(): String {
        return "Witaj w moim blogu!"
    }

    // Dodatkowy endpoint GET http://localhost:8080/hello
    @GetMapping("/hello")
    fun hello(): String {
        return "Hello, world!"
    }
}