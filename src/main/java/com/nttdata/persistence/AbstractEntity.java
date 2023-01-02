package com.nttdata.persistence;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity implements Serializable{
	//Implementación Versión Serializable//
	private static final long serialVersionUID = 1L;
}
