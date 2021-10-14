package com.E4G27Panaderia.Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="")
public class Venta {
	@Id
	private int Codigo_Vta;
	private int Cedula_Usu_Vta;
	private int Cedula_Cli_Vta;
	private double valor_Vta;
	private double valor_IVA;
	private double valor_Total;

	public Venta() {

	}

	public Venta(int codigo_Vta, int cedula_Usu_Vta, int cedula_Cli_Vta, double valor_Vta, double valor_IVA,
			double valor_Total) {
		super();
		Codigo_Vta = codigo_Vta;
		Cedula_Usu_Vta = cedula_Usu_Vta;
		Cedula_Cli_Vta = cedula_Cli_Vta;
		this.valor_Vta = valor_Vta;
		this.valor_IVA = valor_IVA;
		this.valor_Total = valor_Total;
	}

	public int getCodigo_Vta() {
		return Codigo_Vta;
	}

	public void setCodigo_Vta(int codigo_Vta) {
		Codigo_Vta = codigo_Vta;
	}

	public int getCedula_Usu_Vta() {
		return Cedula_Usu_Vta;
	}

	public void setCedula_Usu_Vta(int cedula_Usu_Vta) {
		Cedula_Usu_Vta = cedula_Usu_Vta;
	}

	public int getCedula_Cli_Vta() {
		return Cedula_Cli_Vta;
	}

	public void setCedula_Cli_Vta(int cedula_Cli_Vta) {
		Cedula_Cli_Vta = cedula_Cli_Vta;
	}

	public double getValor_Vta() {
		return valor_Vta;
	}

	public void setValor_Vta(double valor_Vta) {
		this.valor_Vta = valor_Vta;
	}

	public double getValor_IVA() {
		return valor_IVA;
	}

	public void setValor_IVA(double valor_IVA) {
		this.valor_IVA = valor_IVA;
	}

	public double getValor_Total() {
		return valor_Total;
	}

	public void setValor_Total(double valor_Total) {
		this.valor_Total = valor_Total;
	}
}
