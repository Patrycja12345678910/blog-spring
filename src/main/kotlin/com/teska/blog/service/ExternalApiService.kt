package com.teska.blog.service


import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class ExternalApiService {

    private val restTemplate = RestTemplate()

    fun fetchExternalPosts(): List<ExternalPost> {
        return try {
            val response = restTemplate.getForEntity(
                "https://jsonplaceholder.typicode.com/posts",
                Array<ExternalPost>::class.java
            )

            if (response.statusCode == HttpStatus.OK) {
                response.body?.toList() ?: emptyList()
            } else {
                emptyList()
            }
        } catch (e: Exception) {
            println("Błąd API: ${e.message}")
            emptyList()
        }
    }
}