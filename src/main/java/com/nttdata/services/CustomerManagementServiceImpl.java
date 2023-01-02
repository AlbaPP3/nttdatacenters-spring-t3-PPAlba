package com.nttdata.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.nttdata.persistence.Customer;
import com.nttdata.repository.CustomerRepositoryI;

public class CustomerManagementServiceImpl implements CustomerManagementServiceI{

	@Autowired
	CustomerRepositoryI customerRepo;

	//CRUD//
	@Override
	public void create(Customer c) {
		customerRepo.save(c);		
	}

	@Override
	public Customer searchByNameAndSurnames(String name, String surnames) {
		
		return customerRepo.findByNameAndSurnames(name, surnames);
	}

	@Override
	public Customer searchById(int id) {
		return customerRepo.findById(id);
	}

	@Override
	public void update(Customer c) {
		customerRepo.save(c);
		
	}

	@Override
	public void delete(Customer c) {
		customerRepo.delete(c);
		
	}
	
	
}
