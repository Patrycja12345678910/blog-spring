package com.teska.blog

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@Disabled("Disabled because it requires a running PostgreSQL instance")
class BlogApplicationTests {

	@Test
	fun contextLoads() {
	}
}