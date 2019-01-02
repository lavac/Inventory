package com.example.inventory.dto

import javax.validation.Valid

data class Item (val id: String,
                 var name:String?,
                 @field:Valid var price:Price,
                 var brand:String,
                 var category: String)

 data class Price(val price1:String, @field:ReflectRuntime val price2: List<String>)
