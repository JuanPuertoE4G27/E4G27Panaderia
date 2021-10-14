package com.E4G27Panaderia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.E4G27Panaderia.Interfaces.IVenta;
import com.E4G27Panaderia.InterfacesServicios.IVentaService;
import com.E4G27Panaderia.Modelo.Venta;

@Service
public class VentaService implements IVentaService{
	
	@Autowired
	private IVenta data;

	@Override
	public int saveVenta(Venta v)
	{
		int res =0;
		Venta venta = data.save(v);
		if(!venta.equals(null))
			res=1;
		return res;
	}

}
