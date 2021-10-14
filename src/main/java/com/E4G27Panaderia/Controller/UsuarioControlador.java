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

import com.E4G27Panaderia.InterfacesServicios.IUsuarioService;
import com.E4G27Panaderia.Modelo.Usuario;

@Controller
@RequestMapping
public class UsuarioControlador {
	
	@Autowired
	private IUsuarioService Uservice;
	
	@PostMapping("/logIn")
	public String logIn(Model model, Usuario u)
	{
		boolean valido = Uservice.logInUsu(u.getUsuario(), u.getClave_Usu());
		if(valido)
		{
			return "redirect:/menu";
		}
		else
		{
			return "redirect:/?error=true";
		}
		
	}
	
	@GetMapping("/")
	public String Mostrar_index()
	{
		return "index";
	}
	
	@GetMapping("/menu")
	public String Mostrar_menu()
	{
		return "menu";
	}

	@GetMapping("/listarUsuarios")
	public String listarUsu(Model model)
	{
		List<Usuario> usuarios = Uservice.listarUsu();
		model.addAttribute("usuarios", usuarios);
		return "listaUsuarios";
	}

	@GetMapping("/newUsuario")
	public String agregarUsu(Model model)
	{
		model.addAttribute("usuario", new Usuario());
		return "formUsuarios";
	}
	
	@PostMapping("/saveUsuario")
	public String saveUsu(@Validated Usuario p, Model model)
	{
		Uservice.saveUsu(p);
		return "redirect:/listarUsuarios";
	}
	
	@GetMapping("/editarUsuario/{Cedula_Usu}")
	public String editarUsu(@PathVariable int Cedula_Usu, Model model)
	{
		Optional<Usuario> usuario = Uservice.listarUsuId(Cedula_Usu);
		model.addAttribute("usuario", usuario);
		return "formUsuarios";
	}
	
	@GetMapping("/eliminarUsuario/{Cedula_Usu}")
	public String deleteUsu(@PathVariable int Cedula_Usu, Model model)
	{
		Uservice.deleteUsu(Cedula_Usu);
		return "redirect:/listarUsuarios";
	}
		
}
