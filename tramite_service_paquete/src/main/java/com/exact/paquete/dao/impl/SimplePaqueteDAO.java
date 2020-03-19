package com.exact.paquete.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.exact.paquete.dao.IPaqueteDAO;
import com.exact.paquete.entity.Paquete;
import com.exact.paquete.repository.IPaqueteRepository;

@Component
@Qualifier("SimplePaqueteDAO")
public class SimplePaqueteDAO implements IPaqueteDAO {
	
	@Autowired
	IPaqueteRepository paqueteRepo;
	
	@Override
	public Paquete getPaqueteByCodigoAndTipoPaqueteId(String codigo, Long tipoPaqueteId) {
		return paqueteRepo.findFirstByCodigoAndTipoPaqueteId(codigo, tipoPaqueteId);
	}

}
