package com.servicio.productos.models.repository;

import org.springframework.data.repository.CrudRepository;
import com.servicio.commons.models.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {}
