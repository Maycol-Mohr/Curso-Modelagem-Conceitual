package com.maycolmohrcursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maycolmohrcursomc.entities.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {	
}
