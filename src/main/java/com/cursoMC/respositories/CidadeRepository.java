package com.cursoMC.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursoMC.domain.cidade;

@Repository
public interface CidadeRepository extends JpaRepository<cidade, Integer> {
	
}
