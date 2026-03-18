package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nelioalves.cursomc.entities.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
