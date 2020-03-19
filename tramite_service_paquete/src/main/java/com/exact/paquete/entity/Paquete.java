package com.exact.paquete.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="paquete")
@Data
public class Paquete implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="paquete_id")
	private Long id;
	private String codigo;
	@Column(name="en_uso")
	private boolean enUso;
	
	@ManyToOne
	@JoinColumn(name="tipo_paquete_id")
	private TipoPaquete tipoPaquete;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
