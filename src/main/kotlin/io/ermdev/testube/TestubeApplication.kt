package io.ermdev.testube

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestubeApplication

fun main(args: Array<String>) {
    runApplication<TestubeApplication>(*args)
}
