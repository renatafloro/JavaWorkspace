package com.projeto.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.rest.dtos.UsuarioDTO;
import com.projeto.rest.entity.Usuario;
import com.projeto.rest.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	@Autowired
	UsuarioService service;
	
	@PostMapping 
	public ResponseEntity<UsuarioDTO> salvar(@RequestBody Usuario usuario){
		UsuarioDTO usuarioDTO = service.salvar(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioDTO);
	}
	@GetMapping
	public ResponseEntity<List<UsuarioDTO>> listarTodos(){
		return ResponseEntity.status(HttpStatus.OK).body(service.listrarTodos());
	}
}