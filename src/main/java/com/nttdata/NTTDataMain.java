package com.nttdata;


import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.nttdata.persistence.Customer;
import com.nttdata.services.CustomerManagementServiceI;

public class NTTDataMain implements CommandLineRunner{
	
	
	private static final Logger log = LoggerFactory.getLogger(NTTDataMain.class);
	
	@Autowired 
	private CustomerManagementServiceI customerService;
	
	
	public static void main(String[]args) {
		SpringApplication.run(NTTDataMain.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		log.info("Creación de clientes");
		
		log.info("Ceación Cliente 1");
	
		Customer c1 = new Customer();
		c1.setId(1);
		c1.setName("Alba");
		c1.setSurnames("Parrón Pérez");
		c1.setDni("77807151Z");
		c1.setBirthdate(Date.valueOf("1993-06-26"));
	
		log.info("Creación Cliente 2");
		
		Customer c2 = new Customer();
		c2.setId(2);
		c2.setName("Santiago");
		c2.setSurnames("López Arredondo");
		c2.setDni("60813254L");
		c2.setBirthdate(Date.valueOf("2003-04-21"));
		
		log.info("Creación Cliente 3");
		
		Customer c3= new Customer();
		c3.setId(3);
		c3.setName("Christian");
		c3.setSurnames("Lobón Sevilla");
		c3.setDni("54320981J");
		c3.setBirthdate(Date.valueOf("2000-09-15"));
		
		log.info("Inserción de clientes");
		
		customerService.create(c1);
		customerService.create(c2);
		customerService.create(c3);
		
		log.info("Busqueda de Clientes");
		
		customerService.searchByNameAndSurnames("Alba", "Parrón Pérez");
		customerService.searchById(2);
		
		log.info("Eliminación de un cliente");
		
		customerService.delete(c3);
		
		log.info("Actualización de un cliente");
		
		c2.setName("Rafael");
		c2.setSurnames("Blanco Aranda");
		customerService.update(c2);
	}
   
}
