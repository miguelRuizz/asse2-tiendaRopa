package com.example.ropaMetaphorce.repositories;

import com.example.ropaMetaphorce.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository  extends JpaRepository<Producto,Long> {

}
