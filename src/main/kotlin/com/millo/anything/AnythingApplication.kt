package com.millo.anything

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AnythingApplication

fun main(args: Array<String>) {
    runApplication<AnythingApplication>(*args)
}
