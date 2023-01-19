package com.microempresa.rest.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.microempresa.rest.models.Producto;

@Transactional
public interface ProductoDao extends CrudRepository<Producto, Long>{

}
