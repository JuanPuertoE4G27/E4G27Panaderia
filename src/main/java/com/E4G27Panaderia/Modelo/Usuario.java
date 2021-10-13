package com.E4G27Panaderia.Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Usuarios")
public class Usuario {
	
	@Id
	private int Cedula_Usu;
	private String Nombre_Usu;
	private String Correo_Usu;
	private String Usuario;
	private String Clave_Usu;
	
	
	public Usuario() {
		
	}

	public Usuario(int cedula_Usu, String nombre_Usu, String correo_Usu, String usuario, String clave_Usu) {
		super();
		Cedula_Usu = cedula_Usu;
		Nombre_Usu = nombre_Usu;
		Correo_Usu = correo_Usu;
		Usuario = usuario;
		Clave_Usu = clave_Usu;
	}

	public int getCedula_Usu() {
		return Cedula_Usu;
	}

	public void setCedula_Usu(int cedula_Usu) {
		Cedula_Usu = cedula_Usu;
	}

	public String getNombre_Usu() {
		return Nombre_Usu;
	}

	public void setNombre_Usu(String nombre_Usu) {
		Nombre_Usu = nombre_Usu;
	}

	public String getCorreo_Usu() {
		return Correo_Usu;
	}

	public void setCorreo_Usu(String correo_Usu) {
		Correo_Usu = correo_Usu;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getClave_Usu() {
		return Clave_Usu;
	}

	public void setClave_Usu(String clave_Usu) {
		Clave_Usu = clave_Usu;
	}
	
}
