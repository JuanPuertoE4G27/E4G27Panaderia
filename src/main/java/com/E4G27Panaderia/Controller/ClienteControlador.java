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

import com.E4G27Panaderia.InterfacesServicios.IClienteService;
import com.E4G27Panaderia.Modelo.Cliente;

@Controller
@RequestMapping
public class ClienteControlador {
	
	@Autowired
	private IClienteService Cservice;
	
	@GetMapping("/listarClientes")
	public String listarCli(Model model)
	{
		List<Cliente> clientes = Cservice.listarCli();
		model.addAttribute("clientes", clientes);
		return "listaClientes";
	}

	@GetMapping("/newCliente")
	public String agregarCli(Model model)
	{
		model.addAttribute("cliente", new Cliente());
		return "formClientes";
	}
	
	@PostMapping("/saveCliente")
	public String saveCli(@Validated Cliente c, Model model)
	{
		Cservice.saveCli(c);
		return "redirect:/listarClientes";
	}
	
	@GetMapping("/editarCliente/{Cedula_Cli}")
	public String editarCli(@PathVariable int Cedula_Cli, Model model)
	{
		Optional<Cliente> cliente = Cservice.listarCliId(Cedula_Cli);
		model.addAttribute("cliente", cliente);
		return "formClientes";
	}
	
	@GetMapping("/eliminarCliente/{Cedula_Cli}")
	public String deleteCli(@PathVariable int Cedula_Cli, Model model)
	{
		Cservice.deleteCli(Cedula_Cli);
		return "redirect:/listarClientes";
	}

}
