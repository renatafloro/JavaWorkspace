package com.testes.rest;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.testes.rest.entity.Contato;
import com.testes.rest.service.ContatoService;


@SpringBootTest
@AutoConfigureMockMvc
public class TestControllerContato {
    private Long idExistente;
    private Long idInexistente;
    
    private Contato contatoExistente;
    private Contato contatoNovo;
    
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ContatoService service;
	
	@Autowired
	ObjectMapper objectMapper;
	
	@BeforeEach
	void setup() {
		idExistente= 1L;
		idInexistente = 2L;
		
		contatoNovo = new Contato();
		contatoExistente = new Contato(idExistente, "maria", "maria@gmail");
		
		Mockito.when(service.pesquisar(idExistente)).thenReturn(contatoExistente);
		Mockito.when(service.pesquisar(idInexistente)).thenThrow(EntityNotFoundException.class);
		Mockito.when(service.salvar(any())).thenReturn(contatoExistente);
		Mockito.when(service.alterar(eq(idExistente), any())).thenReturn(contatoExistente);
		Mockito.when(service.alterar(eq(idInexistente), any())).thenThrow(EntityNotFoundException.class);
	}

	@Test
    void deveRetornarOkQuandoPesquisaIdExistente() throws Exception {
	    ResultActions result =	mockMvc.perform(get("/contato/{idcontato}", idExistente)
		       .accept(MediaType.APPLICATION_JSON));
	    result.andExpect(status().isOk());
	}
	
	@Test
	void deveRetornarStatus404QuandoPesquisaIdInexistente() throws Exception {
		ResultActions obj =	mockMvc.perform(get("/contato/{idcontato}", idInexistente)
			                           .accept(MediaType.APPLICATION_JSON));
		
		    obj.andExpect(status().isNotFound());		    
	}
	
	@Test
	void deveRetornarStatu201QuandoContatoSalvoComSucesso() throws Exception {
		String jsonBody = objectMapper.writeValueAsString(contatoNovo);
		ResultActions result = mockMvc.perform(post("/contato")
			   .content(jsonBody)
			   .contentType(MediaType.APPLICATION_JSON)
			   .accept(MediaType.APPLICATION_JSON));
		
		result.andExpect(status().isCreated());
				
	}
	@Test
	void deveRetornarStatus200QuandoAlterarContatoExistenteComSucesso() throws Exception {
		String jsonBody = objectMapper.writeValueAsString(contatoExistente);
		ResultActions result = mockMvc.perform(put("/contato/{idcontato}", idExistente)
			   .content(jsonBody)
			   .contentType(MediaType.APPLICATION_JSON)
			   .accept(MediaType.APPLICATION_JSON));
		
		result.andExpect(status().isOk());		       
	}
	
	@Test
	void deveRetornarStatus404QuandoAlterarContatoInexistente() throws Exception {
		String jsonBody = objectMapper.writeValueAsString(contatoNovo);
		ResultActions result = mockMvc.perform(put("/contato/{idcontato}", idInexistente)
			   .content(jsonBody)
			   .contentType(MediaType.APPLICATION_JSON)
			   .accept(MediaType.APPLICATION_JSON));
		
		result.andExpect(status().isNotFound());		       
	}
}
