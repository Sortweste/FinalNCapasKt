package com.sort.capas.pruebakt.domain

import javax.persistence.*

@Entity
@Table(name="orden_compra")
data class Purchase(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "c_orden_compra")
        val id: Long,

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "c_producto")
        val products: Product
)
