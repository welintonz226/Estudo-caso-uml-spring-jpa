package com.nelioalves.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.entities.Estado;
import com.nelioalves.cursomc.repositories.EstadoRepository;
import com.nelioalves.cursomc.services.exceptions.ResourceNotFoundException;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository repository;
	
	public List<Estado> findAll(){
		return repository.findAll();
	}
	
	public Estado findById(Long id) {
		Optional<Estado> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

}
