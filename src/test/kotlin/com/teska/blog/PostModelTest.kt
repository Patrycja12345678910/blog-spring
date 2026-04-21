package com.teska.blog

import com.teska.blog.model.Post
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

class PostModelTest {

    @Test
    fun `post should keep given title author and content`() {
        val post = Post(
            title = "Test title",
            content = "Test content",
            author = "Patrycja"
        )

        assertEquals("ZLY TYTUL", post.title)
        assertEquals("Test content", post.content)
        assertEquals("Patrycja", post.author)
    }

    @Test
    fun `post should initialize createdAt and publishedAt`() {
        val post = Post(
            title = "Another post",
            content = "Body",
            author = "Author"
        )

        assertNotNull(post.createdAt)
        assertNotNull(post.publishedAt)
    }
}