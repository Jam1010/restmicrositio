package com.microempresa.rest;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.microempresa.rest.dao.ClienteDao;

@SpringBootApplication
public class RestApplication {
	
	
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

}
