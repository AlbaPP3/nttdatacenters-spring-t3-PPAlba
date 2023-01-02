package com.nttdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.persistence.Customer;

public interface CustomerRepositoryI extends JpaRepository<Customer, Long>{
	
	/**
	 * Método para buscar un cliente por nombre y apellidos
	 * 
	 * @param name
	 * @param surnames
	 * @return
	 */
	public Customer findByNameAndSurnames(String name, String surnames);

	public Customer findById(int id);

}
