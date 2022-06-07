package com.projeto.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.rest.entity.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
