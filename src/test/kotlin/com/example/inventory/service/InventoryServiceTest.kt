package com.example.inventory.service

import com.example.inventory.dto.Item
import com.example.inventory.repository.TodoRepository
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.junit.jupiter.api.Test
import reactor.core.publisher.Mono

class InventoryServiceTest {

    val todoRepository:TodoRepository = mock()

    val todoService = InventoryService(todoRepository)

//    @Test
//    fun `should call todo repository`() {
//        val item = Item("", "wewe", 123.45, "coke", "drink")
//        whenever(todoRepository.add(item)).thenReturn(Mono.just(item))
//        todoService.add(item)
//        verify(todoRepository, times(1)).add(item)
//    }
}
