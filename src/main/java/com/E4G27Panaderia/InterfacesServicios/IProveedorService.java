package com.E4G27Panaderia.InterfacesServicios;

import java.util.List;
import java.util.Optional;

import com.E4G27Panaderia.Modelo.Proveedor;

public interface IProveedorService {

	public List<Proveedor> listarProv();
	public Optional<Proveedor> listarProvId(int id);
	public int saveProv(Proveedor pr);
	public void deleteProv(int id);
}
