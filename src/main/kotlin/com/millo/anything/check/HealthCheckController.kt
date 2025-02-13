package com.millo.anything.check

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("health")
class HealthCheckController {

    @GetMapping("/check")
    fun healthCheck(): String {
        return "OK"
    }

}