package com.E4G27Panaderia.Modelo;

public class ProductosParaVender extends Producto {

	private double cantidad;

	public ProductosParaVender(int codigo_Prod, String nombre_Prod, int nIT_Prov, double precio_Compra,
			double iVA_Compra, double precio_Venta, double cantidad) {
		super();
		this.cantidad = cantidad;
	}

	public void aumentarCantidad() {
		this.cantidad++;
	}

	public double getCantidad() {
		return cantidad;
	}
	
	public double getTotal() {
		return this.getPrecio_Venta() * this.cantidad;
	}	
	
}

	
