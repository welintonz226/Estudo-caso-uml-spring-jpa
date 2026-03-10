package com.nelioalves.cursomc.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.nelioalves.cursomc.entities.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	CategoriaRepository categoriaRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null,"Informática");
		Categoria cat2 = new Categoria(null,"Escritório");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}

}
