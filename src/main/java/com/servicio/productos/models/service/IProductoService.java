package com.servicio.productos.models.service;

import java.util.List;
import com.servicio.productos.models.entity.Producto;

public interface IProductoService {

  public List<Producto> findAll();

  public Producto findById(Long id);
}
