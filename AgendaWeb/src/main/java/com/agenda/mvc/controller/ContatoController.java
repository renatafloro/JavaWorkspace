package com.agenda.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.agenda.mvc.entidades.Contato;

@Controller
@RequestMapping("/contato")
public class ContatoController {
  
	@GetMapping
	public String verContato(Model model) {
		Contato ct = new Contato(1,"Renata", "renata@gmail.com");
		
		model.addAttribute("contato", ct);
		
		return "consultacontato";
	}
	
	@GetMapping ("/consulta")
	public String listacontatos(Model model) {
		List<Contato> lista = new ArrayList<>();
		lista.add(new Contato(1, "Josefa","josefa@gmail.com"));
		lista.add(new Contato(2, "Ivani","ivani@gmail.com"));
		lista.add(new Contato(3, "Silva","silvagmail.com"));
		
		model.addAttribute("lista",lista);
		return "tabelaContato";
		
	}
	
}