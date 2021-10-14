package com.E4G27Panaderia.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class ReporteControlador {
	
	@GetMapping("/listarReportes")
	public String listarReportes(Model model) {
		return "listaReportes";
	}
}

// Buenas noches, hoy es 13/10/2021