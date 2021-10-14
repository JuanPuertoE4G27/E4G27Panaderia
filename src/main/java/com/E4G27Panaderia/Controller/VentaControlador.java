package com.E4G27Panaderia.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.E4G27Panaderia.Modelo.Venta;

public class VentaControlador {
	@Controller
	@RequestMapping
	public class VentasControlador {
		
		@Autowired
		private IUsuarioService Uservice;
		@Autowired
		private IClienteService Cservice;
		@Autowired
		private IProductoService Pservice;
		@Autowired
		private IVentaService Vservice;
		
		@GetMapping("/listarVentas")
		public String listaVenta(Model model) {
			model.addAttribute("usuarios",Uservice.listarUsu());
			model.addAttribute("clientes",Cservice.listarCli());
			model.addAttribute("productos",Pservice.listarProd());
			return "";//html de venta
		}
		
		@PostMapping("/saveVenta")
		public String saveVenta (Venta v, Model model) {
			Vservice.saveVenta(v);
			return "redirect:/";
		}
	}

}