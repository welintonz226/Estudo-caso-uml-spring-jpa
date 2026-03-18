package com.nelioalves.cursomc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.entities.Estado;
import com.nelioalves.cursomc.services.EstadoService;

@RestController
@RequestMapping(value = "/estados")
public class EstadoResource {
	
	@Autowired
	EstadoService EstadoService;
	
	@GetMapping
	public ResponseEntity<List<Estado>> findAll(){
		List<Estado> list = EstadoService.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "{id}")
	public ResponseEntity<Estado> findById(@PathVariable Long id) {
		Estado obj = EstadoService.findById(id);
		return ResponseEntity.ok(obj);
	}
}
