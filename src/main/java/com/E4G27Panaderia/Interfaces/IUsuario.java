package com.E4G27Panaderia.Interfaces;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.E4G27Panaderia.Modelo.Usuario;

@Repository
public interface IUsuario extends CrudRepository<Usuario, Integer> {

	@Query(value="select * from T_Usuarios where Usuario=:u and Clave_Usu=:clave", nativeQuery=true)
	public Usuario findByUsuarioAndClave_Usu(String u, String clave);
	
}
