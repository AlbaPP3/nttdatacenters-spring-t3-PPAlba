package com.nttdata.services;

import com.nttdata.persistence.Customer;

public interface CustomerManagementServiceI {
	
	/**
	 * create - Inserta/crea/alamcena un cliente en la BBDD
	 * 
	 * @param c - Customer
	 */
	public void create(Customer c);
	
	/**
	 * searchByNameAndSurnames - Devuelve un cliente por su nombre y apellidos
	 * 
	 * @param name
	 * @param surnames
	 * @return Customer
	 */
	public Customer searchByNameAndSurnames(String name, String surnames);
	
	/**
	 * searchById - Devuelve un cliente por su ID
	 * 
	 * @param id
	 * @return Customer
	 */
	public Customer searchById(int id);
	
	/**
	 * update - Actualiza un cliente en la BBDD
	 * 
	 * @param c - Customer
	 */
	public void update (Customer c);
	
	/**
	 * delete - Elimina un cliente de la BBDD
	 * 
	 * @param c - Customer
	 */
	public void delete ( Customer c);
}
