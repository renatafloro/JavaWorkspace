package com.projeto.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.projeto.rest.dtos.UsuarioDTO;
import com.projeto.rest.entity.Usuario;
import com.projeto.rest.repository.UsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService {
	@Autowired
	UsuarioRepository repo;
	
	@Autowired
	private BCryptPasswordEncoder passwordEnconder;
	
	public UsuarioDTO salvar(Usuario usuario) {
		usuario.setSenha(passwordEnconder.encode(usuario.getSenha()));
		Usuario user = repo.save(usuario);
		
		return new UsuarioDTO(user);
	}
	
	public List<UsuarioDTO> listrarTodos(){
		List<Usuario> usuarios = repo.findAll();
		List<UsuarioDTO> usuariosDTO = new ArrayList<>();
		for(Usuario user: usuarios) {
			usuariosDTO.add(new UsuarioDTO(user));	
		}
		return usuariosDTO;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = repo.findByEmail(username);
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuario não encontrado");
		}
		return usuario;
	}

}
