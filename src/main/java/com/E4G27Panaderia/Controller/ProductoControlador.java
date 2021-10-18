package com.E4G27Panaderia.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.E4G27Panaderia.InterfacesServicios.IProductoService;
import com.E4G27Panaderia.Modelo.Producto;

@Controller
@RequestMapping
public class ProductoControlador {
	
	@Autowired
	private IProductoService Pservice;

	@GetMapping("/listarProductos")
	public String listarProd(Model model)
	{
		List<Producto> productos = Pservice.listarProd();
		model.addAttribute("productos", productos);
		return "listaProductos";
	}

	@GetMapping("/newProducto")
	public String agregarProd(Model model)
	{
		model.addAttribute("producto", new Producto());
		return "formProductos";
	}
	
	@PostMapping("/saveProducto")
	public String saveProd(@Validated Producto p, Model model)
	{
		Pservice.saveProd(p);
		return "redirect:/listarProductos";
	}
	
	@GetMapping("/editarProducto/{Codigo_Prod}")
	public String editarProd(@PathVariable int Codigo_Prod, Model model)
	{
		Optional<Producto> producto = Pservice.listarProdId(Codigo_Prod);
		model.addAttribute("producto", producto);
		return "formProductos";
	}
	
	@GetMapping("/eliminarProducto/{Codigo_Prod}")
	public String deleteProd(@PathVariable int Codigo_Prod, Model model)
	{
		Pservice.deleteProd(Codigo_Prod);
		return "redirect:/listarProductos";
	}
	
}
