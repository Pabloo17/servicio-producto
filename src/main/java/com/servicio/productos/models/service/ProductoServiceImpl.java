package com.servicio.productos.models.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.servicio.productos.models.entity.Producto;
import com.servicio.productos.models.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService {

  @Autowired private ProductoRepository productoRepository;

  /** transactional para que se sincronice con la bbdd */
  @Override
  @Transactional(readOnly = true)
  public List<Producto> findAll() {

    return (List<Producto>) productoRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Producto findById(Long id) {

    return productoRepository.findById(id).orElse(null);
  }
}
