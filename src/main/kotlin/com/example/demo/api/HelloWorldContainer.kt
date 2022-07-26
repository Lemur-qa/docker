package com.example.demo.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
@RequestMapping("api/v1/hello")
class HelloWorldController {
    @RequestMapping("/world")
    fun getHelloWorld():String {
        return "Hello, World"
    }
}