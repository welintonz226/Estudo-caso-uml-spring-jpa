package com.nelioalves.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.entities.Cidade;
import com.nelioalves.cursomc.repositories.CidadeRepository;
import com.nelioalves.cursomc.services.exceptions.ResourceNotFoundException;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository repository;
	
	public List<Cidade> findAll(){
		return repository.findAll();
	}
	
	public Cidade findById(Long id) {
		Optional<Cidade> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

}
