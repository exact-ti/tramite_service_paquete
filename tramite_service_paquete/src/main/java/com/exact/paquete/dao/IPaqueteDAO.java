package com.exact.paquete.dao;

import com.exact.paquete.entity.Paquete;

public interface IPaqueteDAO {
	
	Paquete getPaqueteByCodigoAndTipoPaqueteId(String codigo, Long tipoPaqueteId);
}
