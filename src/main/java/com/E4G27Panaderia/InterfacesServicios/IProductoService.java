package com.E4G27Panaderia.InterfacesServicios;

import java.util.List;
import java.util.Optional;

import com.E4G27Panaderia.Modelo.Producto;

public interface IProductoService {

	public List<Producto> listarProd();
	public Optional<Producto> listarProdId(int id);
	public int saveProd(Producto p);
	public void deleteProd(int id);
	
}
