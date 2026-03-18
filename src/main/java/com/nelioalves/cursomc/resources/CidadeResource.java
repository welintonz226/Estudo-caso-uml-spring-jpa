package com.nelioalves.cursomc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.entities.Cidade;
import com.nelioalves.cursomc.services.CidadeService;

@RestController
@RequestMapping(value = "/cidades")
public class CidadeResource {
	
	@Autowired
	CidadeService CidadeService;
	
	@GetMapping
	public ResponseEntity<List<Cidade>> findAll(){
		List<Cidade> list = CidadeService.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "{id}")
	public ResponseEntity<Cidade> findById(@PathVariable Long id) {
		Cidade obj = CidadeService.findById(id);
		return ResponseEntity.ok(obj);
	}
}
