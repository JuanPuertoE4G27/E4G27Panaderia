package com.E4G27Panaderia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.E4G27Panaderia.Interfaces.IUsuario;
import com.E4G27Panaderia.InterfacesServicios.IUsuarioService;
import com.E4G27Panaderia.Modelo.Usuario;

@Service
public class UsuarioService implements IUsuarioService {
	
	@Autowired
	private IUsuario data;
	
	@Override
	public boolean logInUsu(String u, String clave)
	{
		Usuario usuario= data.findByUsuarioAndClave_Usu(u, clave);
        return usuario!=null;
	}

	@Override
	public List<Usuario> listarUsu()
	{
		return (List<Usuario>)data.findAll();
	}
	
	@Override
	public Optional<Usuario> listarUsuId(int id)
	{
		return data.findById(id);
	}
	
	@Override
	public int saveUsu(Usuario p)
	{
		int res = 0;
		Usuario usuario = data.save(p);
		if(!usuario.equals(null))
			res = 1;
		return res;
	}
	
	@Override
	public void deleteUsu(int id)
	{
		data.deleteById(id);
	}

}
