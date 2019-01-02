package com.example.inventory.respository

import com.example.inventory.dto.Item
import com.example.inventory.error.RepositoryException
import com.example.inventory.repository.Repository
import com.example.inventory.repository.TodoRepository
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.junit.jupiter.api.Test
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

class InventoryRepositoryTest {
    val repository : Repository = mock();
    val todoRepository = TodoRepository(repository)

//    @Test
//    fun `should call add method of todo repository`() {
//        val item = Item("", "wewe", 123.45, "coke", "drink")
//        whenever(repository.save(item)).thenReturn(Mono.just(item))
//        todoRepository.add(item)
//        verify(repository, times(1)).save(item)
//    }

//    @Test(RepositoryException::class)
//    fun `should call findAll method of todo repository`() {
//        val item = Item("", "wewe", 123.45, "coke", "drink")
//        whenever(repository.findAll()).thenThrow(RuntimeException("fwf"))
//        todoRepository.getItems()
//        verify(repository, times(1)).save(item)
//    }

}
