package com.E4G27Panaderia.InterfacesServicios;

import java.util.List;

import com.E4G27Panaderia.Modelo.Venta;

public interface IVentaService {
	
	public int saveVenta(Venta v);
	public List<Venta> listarVentasClientes();

}
