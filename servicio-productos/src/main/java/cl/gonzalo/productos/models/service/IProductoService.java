package cl.gonzalo.productos.models.service;

import java.util.List;

import cl.gonzalo.productos.models.entity.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	public Producto findById(Long id);

}
