package com.maycolmohrcursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maycolmohrcursomc.entities.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {	
}
