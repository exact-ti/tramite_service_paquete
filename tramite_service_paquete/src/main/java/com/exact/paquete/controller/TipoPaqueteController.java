package com.exact.paquete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exact.paquete.dao.IPaqueteDAO;
import com.exact.paquete.entity.Paquete;
import com.exact.paquete.service.PaqueteService;

@RestController
@RequestMapping("/tipospaquetes")
public class TipoPaqueteController {

	PaqueteService paqueteService;

	@Autowired
	@Qualifier("SimplePaqueteDAO")
	IPaqueteDAO simplePaqueteDAO;

	@GetMapping(value = "/{id}/paquetes", params = "codigo")
	public ResponseEntity<Paquete> ListarPaqueteByCodigoAndTipoPaqueteId(@PathVariable("id") Long tipoPaqueteId, @RequestParam("codigo")
			String codigo) {
		PaqueteService paqueteService = new PaqueteService(simplePaqueteDAO);
		return new ResponseEntity<Paquete>(paqueteService.getPaqueteByCodigoAndTipoPaqueteId(codigo, tipoPaqueteId),
				HttpStatus.OK);
	}
}
