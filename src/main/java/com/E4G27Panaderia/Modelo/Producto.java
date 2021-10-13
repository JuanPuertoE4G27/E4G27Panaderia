package com.E4G27Panaderia.Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Productos")
public class Producto {
	
	@Id
	private int Codigo_Prod;
	private String Nombre_Prod;
	private int NIT_Prov;
	private double Precio_Compra;
	private double IVA_Compra;
	private double Precio_Venta;
	
	
	public Producto() {
		
	}

	public Producto(int codigo_Prod, String nombre_Prod, int nIT_Prov, double precio_Compra, double iVA_Compra,
			double precio_Venta) {
		super();
		Codigo_Prod = codigo_Prod;
		Nombre_Prod = nombre_Prod;
		NIT_Prov = nIT_Prov;
		Precio_Compra = precio_Compra;
		IVA_Compra = iVA_Compra;
		Precio_Venta = precio_Venta;
	}

	public int getCodigo_Prod() {
		return Codigo_Prod;
	}

	public void setCodigo_Prod(int codigo_Prod) {
		Codigo_Prod = codigo_Prod;
	}

	public String getNombre_Prod() {
		return Nombre_Prod;
	}

	public void setNombre_Prod(String nombre_Prod) {
		Nombre_Prod = nombre_Prod;
	}

	public int getNIT_Prov() {
		return NIT_Prov;
	}

	public void setNIT_Prov(int nIT_Prov) {
		NIT_Prov = nIT_Prov;
	}

	public double getPrecio_Compra() {
		return Precio_Compra;
	}

	public void setPrecio_Compra(double precio_Compra) {
		Precio_Compra = precio_Compra;
	}

	public double getIVA_Compra() {
		return IVA_Compra;
	}

	public void setIVA_Compra(double iVA_Compra) {
		IVA_Compra = iVA_Compra;
	}

	public double getPrecio_Venta() {
		return Precio_Venta;
	}

	public void setPrecio_Venta(double precio_Venta) {
		Precio_Venta = precio_Venta;
	}
	
}
