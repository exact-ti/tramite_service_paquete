package com.exact.paquete.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tipo_paquete")
@Data
public class TipoPaquete implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="tipo_paquete_id")
	private Long id;	
	private String nombre;
	private boolean interno;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
