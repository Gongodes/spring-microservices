package cl.gonzalo.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import cl.gonzalo.productos.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto,Long>{

}
