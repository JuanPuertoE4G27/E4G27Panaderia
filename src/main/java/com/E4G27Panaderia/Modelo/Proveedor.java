package com.E4G27Panaderia.Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Proveedores")
public class Proveedor {
	
	@Id
	private int NIT_Prov;
	private String Nombre_Prov;
	private String Direccion_Prov;
	private String Telefono_Prov;
	private String Ciudad_Prov;
	
	
	public Proveedor() {
		
	}

	public Proveedor(int nIT_Prov, String nombre_Prov, String direccion_Prov, String telefono_Prov,
			String ciudad_Prov) {
		super();
		NIT_Prov = nIT_Prov;
		Nombre_Prov = nombre_Prov;
		Direccion_Prov = direccion_Prov;
		Telefono_Prov = telefono_Prov;
		Ciudad_Prov = ciudad_Prov;
	}

	public int getNIT_Prov() {
		return NIT_Prov;
	}

	public void setNIT_Prov(int nIT_Prov) {
		NIT_Prov = nIT_Prov;
	}

	public String getNombre_Prov() {
		return Nombre_Prov;
	}

	public void setNombre_Prov(String nombre_Prov) {
		Nombre_Prov = nombre_Prov;
	}

	public String getDireccion_Prov() {
		return Direccion_Prov;
	}

	public void setDireccion_Prov(String direccion_Prov) {
		Direccion_Prov = direccion_Prov;
	}

	public String getTelefono_Prov() {
		return Telefono_Prov;
	}

	public void setTelefono_Prov(String telefono_Prov) {
		Telefono_Prov = telefono_Prov;
	}

	public String getCiudad_Prov() {
		return Ciudad_Prov;
	}

	public void setCiudad_Prov(String ciudad_Prov) {
		Ciudad_Prov = ciudad_Prov;
	}

}
