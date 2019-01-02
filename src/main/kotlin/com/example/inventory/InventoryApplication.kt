package com.example.inventory

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan


@SpringBootApplication
@ComponentScan("com.example.inventory")
class TodoBackEndApplication

    fun main(args: Array<String>) {
        runApplication<TodoBackEndApplication>(*args)
}
