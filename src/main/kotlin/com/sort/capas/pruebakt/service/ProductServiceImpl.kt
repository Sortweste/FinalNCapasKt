package com.sort.capas.pruebakt.service

import com.sort.capas.pruebakt.domain.Product
import com.sort.capas.pruebakt.repositories.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl(val productRepository: ProductRepository): ProductService {

    override fun findAll(): List<Product> {
        return productRepository.findAll()
    }

    override fun findProductById(id: Long): Product {
        return  productRepository.findProductById(id)
    }
}