package com.cursoMC.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursoMC.domain.Categoria;
import com.cursoMC.respositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria Buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		
		return obj;
	}
	
}
