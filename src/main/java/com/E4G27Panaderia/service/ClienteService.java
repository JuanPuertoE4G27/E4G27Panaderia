package com.E4G27Panaderia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.E4G27Panaderia.Interfaces.ICliente;
import com.E4G27Panaderia.InterfacesServicios.IClienteService;
import com.E4G27Panaderia.Modelo.Cliente;

@Service
public class ClienteService implements IClienteService {
	
	@Autowired
	private ICliente data;
	
	@Override
	public List<Cliente> listarCli()
	{
		return (List<Cliente>)data.findAll();
	}
	
	@Override
	public Optional<Cliente> listarCliId(int id)
	{
		return data.findById(id);
	}
	
	@Override
	public int saveCli(Cliente c)
	{
		int res = 0;
		Cliente cliente = data.save(c);
		if(!cliente.equals(null))
			res = 1;
		return res;
	}
	
	@Override
	public void deleteCli(int id)
	{
		data.deleteById(id);
	}
	
}
