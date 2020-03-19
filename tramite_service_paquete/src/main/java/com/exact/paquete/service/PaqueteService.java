package com.exact.paquete.service;

import com.exact.paquete.dao.IPaqueteDAO;
import com.exact.paquete.entity.Paquete;

public class PaqueteService {
	
	IPaqueteDAO paqueteDAO;
	
	public PaqueteService(IPaqueteDAO paqueteDAO) {
		this.paqueteDAO = paqueteDAO;
	}
	
	public Paquete getPaqueteByCodigoAndTipoPaqueteId(String codigo, Long tipoPaqueteId) {
		return paqueteDAO.getPaqueteByCodigoAndTipoPaqueteId(codigo, tipoPaqueteId);
	}
	
}
