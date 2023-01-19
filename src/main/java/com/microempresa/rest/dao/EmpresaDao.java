package com.microempresa.rest.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.microempresa.rest.models.Empresa;

@Transactional
public interface EmpresaDao extends CrudRepository<Empresa, Long> {

}
