package com.nelioalves.cursomc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.entities.Produto;
import com.nelioalves.cursomc.services.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {
	
	@Autowired
	ProdutoService ProdutoService;
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAll(){
		List<Produto> list = ProdutoService.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "{id}")
	public ResponseEntity<Produto> findById(@PathVariable Long id) {
		Produto obj = ProdutoService.findById(id);
		return ResponseEntity.ok(obj);
	}
}
