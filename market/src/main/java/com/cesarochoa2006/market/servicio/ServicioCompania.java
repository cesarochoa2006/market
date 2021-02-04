package com.cesarochoa2006.market.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesarochoa2006.market.aplicacion.crud.AplicacionCrudCompania;
import com.cesarochoa2006.market.aplicacion.excepcion.ExcepcionAplicacion;
import com.cesarochoa2006.market.servicio.respuesta.Respuesta;

@RestController
@RequestMapping("/compania")
public class ServicioCompania {

	@Autowired
	private AplicacionCrudCompania crudCompania;
	
	@Autowired
	private Respuesta respuesta;
	
	@GetMapping
	public Respuesta buscarTodos() {
		try {
			respuesta.setDatos(crudCompania.buscarTodos());
		} catch(ExcepcionAplicacion e) {
			respuesta.setCodigo(Respuesta.ERROR);
			respuesta.setMensaje(e.getMessage());
		}
		return respuesta;
	}
	
	
}
