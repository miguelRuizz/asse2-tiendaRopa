package com.example.ropaMetaphorce.controllers;

import com.example.ropaMetaphorce.models.Producto;
import com.example.ropaMetaphorce.services.ProductoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/producto")
public class ProductoController {
    private final ProductoService productoService;
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/all")
    public List<Producto> getProducto(){
        return this.productoService.getProducto();
    }

}
