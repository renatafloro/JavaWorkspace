package com.testes.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testes.rest.entity.Contato;



@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long>{

}