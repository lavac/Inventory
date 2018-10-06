package com.example.toBackEnd.respository

import com.example.toBackEnd.dto.Item
import com.example.toBackEnd.repository.Repository
import com.example.toBackEnd.repository.TodoRepository
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Test
import reactor.core.publisher.Mono

class TodoRepositoryTest {
    val repository : Repository = mock();
    val todoRepository = TodoRepository(repository)

    @Test
    fun `should call add method of todo repository`() {
        val item = Item(123, "234")
        whenever(repository.save(item)).thenReturn(Mono.just(item))
        todoRepository.add(item)
        verify(repository, times(1)).save(item)
    }

}
