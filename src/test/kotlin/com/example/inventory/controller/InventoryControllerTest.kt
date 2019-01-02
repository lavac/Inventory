package com.example.inventory.controller

import com.example.inventory.dto.Item
import com.example.inventory.service.InventoryService
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import jdk.nashorn.internal.ir.annotations.Ignore
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import reactor.core.publisher.Mono

@Ignore
class InventoryControllerTest {


    @Autowired
    val inventoryService: InventoryService = mock()


    @Autowired
    val inventoryController: InventoryController = InventoryController(inventoryService)

//    @Test
//    fun `should Call Todo Service`() {
//        val item = Item("24", "1", 123.45, "coke", "drink")
//
//        whenever(inventoryService.add(item)).thenReturn(Mono.just(item))
//        inventoryController.addItem(item)
//        verify(inventoryService, times(1)).add(item)
//    }
}
