package com.microempresa.rest.dao;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.microempresa.rest.models.Pedido;

@Transactional
public interface PedidoDao extends CrudRepository<Pedido, Long>{

	public Optional<Pedido> findById(Long id); 
}
