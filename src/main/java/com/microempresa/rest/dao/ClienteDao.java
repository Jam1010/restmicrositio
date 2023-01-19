package com.microempresa.rest.dao;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;


import com.microempresa.rest.models.Cliente;
import com.microempresa.rest.models.Pedido;


@Transactional
@EnableJpaRepositories
public interface ClienteDao extends CrudRepository<Cliente, Long>{
	

	 public Optional<Cliente> findById(Long id);
	 
	 public List<Cliente> findAll();
	 
	 public List<Cliente>findByPedidoList(Pedido pedido);
	 
	 @SuppressWarnings("unchecked")
	public Cliente save(Cliente ciente);
	 	 
} 