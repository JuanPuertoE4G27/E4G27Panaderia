package com.E4G27Panaderia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.E4G27Panaderia.Interfaces.IProveedor;
import com.E4G27Panaderia.InterfacesServicios.IProveedorService;
import com.E4G27Panaderia.Modelo.Proveedor;

@Service
public class ProveedorService implements IProveedorService {

	@Autowired
	private IProveedor data;

	@Override
	public List<Proveedor> listarProv()
	{
		return (List<Proveedor>)data.findAll();
	}

	@Override
	public Optional<Proveedor> listarProvId(int id)
	{		
		return data.findById(id);
	}

	@Override
	public int saveProv(Proveedor pr)
	{
		int res = 0;
		Proveedor proveedor = data.save(pr);
		if(!proveedor.equals(null))
			res = 1;
		return res;
	}

	@Override
	public void deleteProv(int id)
	{		
		data.deleteById(id);
	}
	
	
}
