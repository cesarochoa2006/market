package com.cesarochoa2006.market.aplicacion.crud;

import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.cesarochoa2006.market.aplicacion.excepcion.ExcepcionAplicacion;
import com.cesarochoa2006.market.persistencia.Compania;
import com.cesarochoa2006.market.persistencia.crud.CrudCompania;

@Component
public class AplicacionCrudCompania {
	private static final Log LOG = LogFactory.getLog(AplicacionCrudCompania.class);
	@Autowired
	private CrudCompania crud;

	public List<Compania> buscarTodos() throws ExcepcionAplicacion {
		try {
			return crud.findAll(Sort.by("fechaCreacion").descending());
		} catch (Exception e) {
			LOG.error("Error en buscar todos", e);
			throw new ExcepcionAplicacion("Ocurrió un problema buscando los elementos, por favor intente nuevamente");
		}
	}

	public Compania buscarPorId(Long id) throws ExcepcionAplicacion {
		try {
			return crud.findById(id).get();
		} catch (NoSuchElementException e) {
			throw new ExcepcionAplicacion("No se encontraron companias con el id enviado, por favor verifique");
		} catch (Exception e) {
			throw new ExcepcionAplicacion("Ocurrió un problema buscando los elementos, por favor intente nuevamente");
		}
	}

}
