package com.E4G27Panaderia.InterfacesServicios;

import java.util.List;
import java.util.Optional;

import com.E4G27Panaderia.Modelo.Usuario;

public interface IUsuarioService {

	public boolean logInUsu(String u, String clave);
	public List<Usuario> listarUsu();
	public Optional<Usuario> listarUsuId(int id);
	public int saveUsu(Usuario p);
	public void deleteUsu(int id);
	
}
