package com.E4G27Panaderia.InterfacesServicios;

import java.util.List;
import java.util.Optional;

import com.E4G27Panaderia.Modelo.Cliente;

public interface IClienteService {

	public List<Cliente> listarCli();
	public Optional<Cliente> listarCliId(int id);
	public int saveCli(Cliente c);
	public void deleteCli(int id);
	
}
