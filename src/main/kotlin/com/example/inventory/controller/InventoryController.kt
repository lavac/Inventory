package com.example.inventory.controller

import com.example.inventory.dto.Item
import com.example.inventory.service.InventoryService
import org.springframework.context.annotation.ComponentScan
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import javax.validation.Valid


@ComponentScan("com.example.inventory")
@RequestMapping("/todo")
@RestController
@Validated
class InventoryController(val inventoryService: InventoryService) {
    @PostMapping("/add")
    fun addItem(@Valid @RequestBody item: Item): Mono<Item> {
        return inventoryService.add(item)
    }

    @GetMapping("/get/{id}")
    fun getItem(@PathVariable id: Long): Mono<Item> {
        return inventoryService.get(id)
    }

    @DeleteMapping("/delete/{id}")
    fun deleteItem(@PathVariable id:Long): Mono<Void> {
        return inventoryService.deleteItem(id)
    }

    @GetMapping("/get")
    fun getItems(@RequestParam brand: String?, @RequestParam category:
    String?) :
    Flux<Item> {
        return inventoryService.getItems(brand, category)
    }
}
