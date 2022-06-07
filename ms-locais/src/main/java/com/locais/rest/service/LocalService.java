package com.locais.rest.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locais.rest.entities.Local;
import com.locais.rest.repository.LocalRepository;

@Service
public class LocalService {
	@Autowired
	LocalRepository repo;
	
	public List<Local> getAll(){
		return repo.findAll();
	}

	public Local getOne(Long id) {
		Optional<Local>obj = repo.findById(id);
		Local local = obj.orElseThrow(()-> new EntityNotFoundException("Local não existe"));
		return local;
	}
	
	public String reservar(Long idLocal, boolean reservado) {
		Local local = this.getOne(idLocal);
		local.setOcupado(reservado);
		repo.save(local);
		String msg = "Reserva realizada com sucesso";
		if(!reservado) {
			msg= "Cancelamento de reserva realizado com sucesso";
		}
		return msg;
	}
}