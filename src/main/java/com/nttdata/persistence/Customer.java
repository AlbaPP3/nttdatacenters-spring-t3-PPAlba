package com.nttdata.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Alba
 *
 */
@Entity
@Table(name = "Customer")
public class Customer implements Serializable{
	//Atributos//
		private static final long serialVersionUID =1L;
		private int id;
		private String name;
		private String surnames;
		private Date birthdate;
		private String dni;
		
		//GETTERS Y SETTERS//
		
		
		/**
		 * Devuelve el id del cliente
		 * 
		 * @return
		 */
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		public int getId() {
			return id;
		}
		/**
		 * Asigna el id 
		 * 
		 * @param id
		 */
		public void setId(int id) {
			this.id = id;
		}
		
		/**
		 * Devuelve el nombre del cliente
		 * 
		 * @return
		 */
		@Column(name="Name")
		public String getName() {
			return name;
		}
		/**
		 * Asigna el nombre del cliente
		 * 
		 * @param name
		 */
		public void setName(String name) {
			this.name = name;
		}
		
		/**
		 * Devuelve los apellidos del cliente
		 * 
		 * @return
		 */
		@Column(name="Surnames")
		public String getSurnames() {
			return surnames;
		}
		/**
		 * Asigna los apellidos del cliente
		 * 
		 * @param surnames
		 */
		public void setSurnames(String surnames) {
			this.surnames = surnames;
		}
		
		/**
		 * Devuelve la fecha de cumpleaños del cliente
		 * 
		 * @return
		 */
		@Column(name="BirthDate")
		public Date getBirthdate() {
			return birthdate;
		}
		/**
		 * Asigna la fecha de cumpleaños del cliente
		 * 
		 * @param birthdate
		 */
		public void setBirthdate(Date birthdate) {
			this.birthdate = birthdate;
		}
		
		/**
		 * Devuelve el DNI del cliente
		 * 
		 * @return
		 */
		@Column(name="DNI")
		public String getDni() {
			return dni;
		}
		/**
		 * Asigna el DNI al cliente
		 * 
		 * @param dni
		 */
		public void setDni(String dni) {
			this.dni = dni;
		}
}
