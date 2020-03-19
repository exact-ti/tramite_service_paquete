package com.exact.paquete.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exact.paquete.entity.Paquete;

@Repository
public interface IPaqueteRepository extends CrudRepository<Paquete, Long> {
	
	Paquete findFirstByCodigoAndTipoPaqueteId(String codigo, Long tipoPaqueteId);
	
}
