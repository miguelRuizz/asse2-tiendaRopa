package com.example.ropaMetaphorce.services;

import com.example.ropaMetaphorce.models.Producto;
import com.example.ropaMetaphorce.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ProductoService {
    HashMap<String,Object> datos;

    @Autowired
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> getProducto(){
        return this.productoRepository.findAll();
    }

}
