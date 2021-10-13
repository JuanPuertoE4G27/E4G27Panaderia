package com.E4G27Panaderia.Interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.E4G27Panaderia.Modelo.Producto;

@Repository
public interface IProducto extends CrudRepository<Producto, Integer> {

	
}
