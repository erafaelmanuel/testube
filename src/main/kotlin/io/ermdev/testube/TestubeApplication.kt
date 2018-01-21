package io.ermdev.testube

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class TestubeApplication

fun main(args: Array<String>) {
    SpringApplication.run(TestubeApplication::class.java, *args)
}
