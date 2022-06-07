package com.locacao.rest.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locacao.rest.entities.Locacao;
import com.locacao.rest.feignClient.LocalFeignClient;
import com.locacao.rest.repository.LocacaoRepository;

@Service
public class LocacaoService {
	@Autowired
	LocacaoRepository repo;
	
	 @Autowired
	   LocalFeignClient localFeignClient;
	
	public List<Locacao> getAll(){
		return repo.findAll();
	}
	
	public Locacao save(Locacao locacao) {
		localFeignClient.reservar(locacao.getLocal(), true);
		return repo.save(locacao);
	}
	
	public void cancelar(Long idlocacao) {
		Optional<Locacao>obj= repo.findById(idlocacao);
		Locacao locacao = obj.orElseThrow(()-> new EntityNotFoundException("Locação não encontrada"));
		localFeignClient.reservar(idlocacao, false);
	}

}
