package com.E4G27Panaderia.Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Clientes")
public class Cliente {

	@Id
	private int Cedula_Cli;
	private String Nombre_Cli;
	private String Direccion_Cli;
	private String Telefono_Cli;
	private String Correo_Cli;
	
	
	public Cliente() {
		
	}

	public Cliente(int cedula_Cli, String nombre_Cli, String direccion_Cli, String telefono_Cli, String correo_Cli) {
		super();
		Cedula_Cli = cedula_Cli;
		Nombre_Cli = nombre_Cli;
		Direccion_Cli = direccion_Cli;
		Telefono_Cli = telefono_Cli;
		Correo_Cli = correo_Cli;
	}

	public int getCedula_Cli() {
		return Cedula_Cli;
	}

	public void setCedula_Cli(int cedula_Cli) {
		Cedula_Cli = cedula_Cli;
	}

	public String getNombre_Cli() {
		return Nombre_Cli;
	}

	public void setNombre_Cli(String nombre_Cli) {
		Nombre_Cli = nombre_Cli;
	}

	public String getDireccion_Cli() {
		return Direccion_Cli;
	}

	public void setDireccion_Cli(String direccion_Cli) {
		Direccion_Cli = direccion_Cli;
	}

	public String getTelefono_Cli() {
		return Telefono_Cli;
	}

	public void setTelefono_Cli(String telefono_Cli) {
		Telefono_Cli = telefono_Cli;
	}

	public String getCorreo_Cli() {
		return Correo_Cli;
	}

	public void setCorreo_Cli(String correo_Cli) {
		Correo_Cli = correo_Cli;
	}
		
}
