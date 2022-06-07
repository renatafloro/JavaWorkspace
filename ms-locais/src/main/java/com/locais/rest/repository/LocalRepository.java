package com.locais.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.locais.rest.entities.Local;

@Repository
public interface LocalRepository extends JpaRepository<Local, Long>{

}
