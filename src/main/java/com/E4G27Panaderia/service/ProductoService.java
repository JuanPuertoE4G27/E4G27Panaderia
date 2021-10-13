package com.E4G27Panaderia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.E4G27Panaderia.Interfaces.IProducto;
import com.E4G27Panaderia.InterfacesServicios.IProductoService;
import com.E4G27Panaderia.Modelo.Producto;

@Service
public class ProductoService implements IProductoService {
	
	@Autowired
	private IProducto data;

	@Override
	public List<Producto> listarProd()
	{
		return (List<Producto>)data.findAll();
	}
	
	@Override
	public Optional<Producto> listarProdId(int id)
	{
		return data.findById(id);
	}
	
	@Override
	public int saveProd(Producto p)
	{
		int res = 0;
		Producto producto = data.save(p);
		if(!producto.equals(null))
			res = 1;
		return res;
	}
	
	@Override
	public void deleteProd(int id)
	{
		data.deleteById(id);
	}
	
}
