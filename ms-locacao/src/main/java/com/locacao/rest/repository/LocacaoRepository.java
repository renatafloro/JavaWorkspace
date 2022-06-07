package com.locacao.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.locacao.rest.entities.Locacao;

@Repository
public interface LocacaoRepository extends JpaRepository<Locacao, Long>{

}
