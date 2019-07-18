package com.sort.capas.pruebakt.controllers

import com.sort.capas.pruebakt.service.ProductService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("Purchase")
class PurchaseController(val productService: ProductService) {

    @GetMapping("/")
    fun main(model: Model):String{
        model.addAttribute("products", productService.findAll())
        return "index"
    }


}