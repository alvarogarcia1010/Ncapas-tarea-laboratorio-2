package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

// Usuario: alvarito
// Contraseña: 12345

@Controller
public class MainController {
	@GetMapping("/login")
	public String enviarForm(Usuario usuario) {
		return "Login";
	}
	
	@PostMapping("/validacion")
	public String procesarForm(Usuario usuario) {
		if(usuario.getName().equals("alvarito") && usuario.getPassword().equals("12345"))
		{
			return "MostrarMensajeV";
		}
		
		return "MostrarMensajeF";

	}
}
