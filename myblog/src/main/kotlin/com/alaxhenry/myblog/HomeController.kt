package com.alaxhenry.myblog

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello")
class HomeController {

    @GetMapping
    fun helloWorld(): String {
        return "Hello, this is a REST endpoint!"
    }
}