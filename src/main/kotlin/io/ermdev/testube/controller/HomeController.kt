package io.ermdev.testube.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController {

    @GetMapping
    fun showHome(): String {
        return "home"
    }
}