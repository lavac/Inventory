package com.example.toBackEnd.service

import com.example.toBackEnd.dto.Item
import com.example.toBackEnd.repository.TodoRepository
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Test
import reactor.core.publisher.Mono

class TodoServiceTest {

    val todoRepository:TodoRepository = mock()

    val todoService = TodoService(todoRepository)

    @Test
    fun `should call todo repository`() {
        val item = Item(2342, "3242")
        whenever(todoRepository.add(item)).thenReturn(Mono.just(item))
        todoService.add(item)
        verify(todoRepository, times(1)).add(item)
    }
}
