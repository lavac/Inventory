package com.example.inventory.service

import com.example.inventory.dto.Item
import com.example.inventory.repository.TodoRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class InventoryService(val todoRepositry: TodoRepository) {
    fun add(item: Item): Mono<Item> {
        return todoRepositry.add(item)
    }

    fun get(id: Long): Mono<Item> {
        return todoRepositry.get(id)
    }

    fun deleteItem(id: Long): Mono<Void> {
        return todoRepositry.delete(id)
    }

    fun getItems(brand: String?, category: String?): Flux<Item> {
        return todoRepositry.getItems().filter { it -> brand !== null  && it.brand == brand }
                .filter { it -> val b = category !==
                        null && it.category == category
                    b
                }


//
//      return when {
//            brand !== null -> items.filter { it -> it.brand == brand }
//            category !== null -> items.filter { it -> it.category == category }
//            else -> items
//        }
    }

}
