package com.sort.capas.pruebakt.repositories

import com.sort.capas.pruebakt.domain.Product
import org.springframework.data.jpa.repository.JpaRepository
import javax.transaction.Transactional


@Transactional(Transactional.TxType.MANDATORY)
interface ProductRepository: JpaRepository<Product, Long> { fun findProductById(id: Long): Product }
