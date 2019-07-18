package com.sort.capas.pruebakt.domain

import java.math.BigDecimal
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "producto")
data class Product(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "c_producto")
        val id: Long,

        @Column(name = "nombre")
        val name: String,

        @Column(name = "descripcion")
        val desc: String,

        @Column(name = "inventario")
        val qty: Int,

        @Column(name = "fecha_ingreso")
        val startDate: Date,

        @Column(name = "b_activo")
        val isActive: Boolean,

        @Column(name = "n_precio")
        val cost: BigDecimal,

        @OneToMany(fetch = FetchType.LAZY, mappedBy = "products",cascade = [CascadeType.ALL])
        val purchases: List<Purchase>
)
