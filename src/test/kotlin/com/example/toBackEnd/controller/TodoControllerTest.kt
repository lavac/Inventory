package com.example.toBackEnd.controller

import com.example.toBackEnd.dto.Item
import com.example.toBackEnd.service.TodoService
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import reactor.core.publisher.Mono

class TodoControllerTest {


    @Autowired
    val todoService: TodoService = mock()


    @Autowired
    val todoController: TodoController = TodoController(todoService)

    @Test
    fun `should Call Todo Service`() {
        val item = Item(2432, "wewe")

        whenever(todoService.add(item)).thenReturn(Mono.just(item))
        todoController.addItem(item)
        verify(todoService, times(1)).add(item)
    }
}
