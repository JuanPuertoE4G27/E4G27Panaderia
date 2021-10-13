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

import com.E4G27Panaderia.InterfacesServicios.IProveedorService;
import com.E4G27Panaderia.Modelo.Proveedor;

@Controller
@RequestMapping
public class ProveedorControlador {
	
	@Autowired
	private IProveedorService Pservice;
	
	@GetMapping("/listarProveedores")
	public String listarProv(Model model)
	{
		List<Proveedor> proveedores = Pservice.listarProv();
		model.addAttribute("proveedores", proveedores);
		return "listaProveedores";
	}

	@GetMapping("/newProveedor")
	public String agregarProv(Model model)
	{
		model.addAttribute("proveedor", new Proveedor());
		return "formProveedores";
	}
	
	@PostMapping("/saveProveedor")
	public String saveProv(@Validated Proveedor pr, Model model)
	{
		Pservice.saveProv(pr);
		return "redirect:/listarProveedores";
	}
	
	@GetMapping("/editarProveedor/{NIT_Prov}")
	public String editarProv(@PathVariable int NIT_Prov, Model model)
	{
		Optional<Proveedor> proveedor = Pservice.listarProvId(NIT_Prov);
		model.addAttribute("proveedor", proveedor);
		return "formProveedores";
	}
	
	@GetMapping("/eliminarProveedor/{NIT_Prov}")
	public String deleteProv(@PathVariable int NIT_Prov, Model model)
	{
		Pservice.deleteProv(NIT_Prov);
		return "redirect:/listarProveedores";
	}
	
}
