package com.aulas.mvc.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//armazena classes que representam as tabelas do banco de dados

@Entity
@Table(name = "tb_contato")
public class Contato2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String email;
	@OneToOne (mappedBy = "contato")
	private Compromisso2 compromisso;
	
    
	public Contato2(int id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	
	public Contato2() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Compromisso2 getCompromisso() {
		return compromisso;
	}

	public void setCompromisso(Compromisso2 compromisso) {
		this.compromisso = compromisso;
	}
	
	
	
}
