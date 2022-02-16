package com.maycolmohrcursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maycolmohrcursomc.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {	
}
