/**
package com.E4G27Panaderia.Controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.E4G27Panaderia.Modelo.Producto;
import com.E4G27Panaderia.Modelo.ProductosParaVender;

public class CompraControlador {

	private ArrayList<ProductosParaVender> obtenerCarrito(HttpServletRequest request) {
		ArrayList<ProductosParaVender> carrito = (ArrayList<ProductosParaVender>) request.getSession().getAttribute("carrito");
		if(carrito==null) {
			carrito = new ArrayList<>();
		}
		return carrito;
	}
	
	private void guardarCarrito(ArrayList<ProductosParaVender> carrito, HttpServletRequest request) {
		request.getSession().setAttribute("carrito", carrito);
	}
	
	@GetMapping(value="/")
	public String interfazVender(Model model, HttpServletRequest request) {
		model.addAttribute("producto", new Producto());
		double total = 0;
		ArrayList<ProductosParaVender> carrito = this.obtenerCarrito(request);
		for(ProductosParaVender p: carrito) total += p.getTotal();
		model.addAttribute("total", total);
		return "vender";
	}
	
}**/
