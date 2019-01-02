package com.example.inventory.repository

import com.example.inventory.dto.Item
import com.example.inventory.error.RepositoryException
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Document(collection = "todoItems")

interface Repository : ReactiveCrudRepository<Item, Long>

@org.springframework.stereotype.Repository
class TodoRepository(val repository: Repository) {
    fun add(item: Item): Mono<Item> {
        return repository.save(item)
    }

    fun get(id: Long): Mono<Item> {
        return repository.findById(id)
    }

    fun delete(id: Long): Mono<Void> {
        return repository.deleteById(id)
    }

    fun getItems(): Flux<Item> {
        return try {
         repository.findAll().doOnError({ t -> throw RepositoryException(t)})
        } catch (e : Exception) {
            throw RepositoryException(e)
        }
    }

}
