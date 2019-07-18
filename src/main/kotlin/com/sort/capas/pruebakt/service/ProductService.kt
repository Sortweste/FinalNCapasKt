package com.sort.capas.pruebakt.service

import com.sort.capas.pruebakt.domain.Product

interface ProductService {

    fun findAll(): List<Product>
    fun findProductById(id: Long): Product

}