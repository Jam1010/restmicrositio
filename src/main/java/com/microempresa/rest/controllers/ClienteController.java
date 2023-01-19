package com.microempresa.rest.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.microempresa.rest.dao.ClienteDao;
import com.microempresa.rest.dao.PedidoDao;
import com.microempresa.rest.dto.ClienteDTO;
import com.microempresa.rest.models.Cliente;
import com.microempresa.rest.models.Pedido;

@RestController
@RequestMapping("microempresa/v1/api/cliente")
public class ClienteController {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private ClienteDao clienteDao;

	@Autowired
	private PedidoDao pedidoDao;

	@GetMapping
	public List<ClienteDTO> getAllCliente() throws JsonProcessingException {

		List<ClienteDTO> dtos = clienteDao.findAll().stream().map(cliente -> modelMapper.map(cliente, ClienteDTO.class))
				.collect(Collectors.toList());

		return dtos;

	}

	@GetMapping("/{id}")
	public ClienteDTO getClienteById(@PathVariable Long id) throws JsonProcessingException {

		Optional<Cliente> cliente = clienteDao.findById(id);

		ClienteDTO clienteDto = modelMapper.map(cliente.get(), ClienteDTO.class);

		return clienteDto;
	}

	@GetMapping("/pedido/{id}")
	public List<ClienteDTO> getClienteByPedido(@PathVariable Long id) {

		Optional<Pedido> pedido = pedidoDao.findById(id);

		List<ClienteDTO> dtos = clienteDao.findByPedidoList(pedido.get()).stream()
				.map(cliente -> modelMapper.map(cliente, ClienteDTO.class)).collect(Collectors.toList());

		return dtos;
	}

	@PutMapping("/{id}")
	public ResponseEntity<ClienteDTO> updateCliente(@PathVariable Long id, @RequestBody ClienteDTO clienteDto) {

		if (Objects.nonNull(clienteDto)) {
			clienteDto.setId(id);
		}

		Cliente cliente = modelMapper.map(clienteDto, Cliente.class);

		cliente = clienteDao.save(cliente);

		clienteDto = modelMapper.map(cliente, ClienteDTO.class);

		return ResponseEntity.ok().body(clienteDto);
	}

	@PostMapping()
	public ResponseEntity<ClienteDTO> crearCliente(@RequestBody ClienteDTO clienteDto) {

		Cliente cliente = modelMapper.map(clienteDto, Cliente.class);

		cliente = clienteDao.save(cliente);

		clienteDto = modelMapper.map(cliente, ClienteDTO.class);

		return ResponseEntity.ok().body(clienteDto);
	}

}
