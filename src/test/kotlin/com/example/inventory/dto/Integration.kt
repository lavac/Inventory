package com.example.inventory.dto

import com.example.inventory.TodoBackEndApplication
import com.example.inventory.controller.InventoryController
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.context.web.WebAppConfiguration

@ExtendWith(SpringExtension::class)
@SpringBootTest(classes = [TodoBackEndApplication::class])
@WebAppConfiguration
class Integration {
    @Autowired
    private lateinit var inventoryController:InventoryController

@Test
fun `add test`() {

    val item = Item("123342", "hf", Price("212", listOf("87")),
            "wq", "wed")
    inventoryController.addItem(item)

    println(" item name is ${item.id}" )
}
}
