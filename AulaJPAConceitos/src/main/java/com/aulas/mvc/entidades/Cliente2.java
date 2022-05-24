package com.aulas.mvc.entidades;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cliente2")
public class Cliente2 implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	private String nome;
	private String email;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable(name = "tb_cliente_vendas",
	joinColumns = {@JoinColumn(name = "cliente2_id", referencedColumnName = "ID")},
	inverseJoinColumns = {@JoinColumn(name = "vendas2_id", referencedColumnName = "ID")})
	private List<Vendas2> vendas;

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

	public List<Vendas2> getVendas() {
		return vendas;
	}

	public void setVendas(List<Vendas2> vendas) {
		this.vendas = vendas;
	}

	public Cliente2() {

	}

	public Cliente2(int id, String nome, String email, List<Vendas2> vendas) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.vendas = vendas;
	}


}