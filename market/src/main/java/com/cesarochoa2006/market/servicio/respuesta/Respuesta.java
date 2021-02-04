package com.cesarochoa2006.market.servicio.respuesta;

import org.springframework.stereotype.Component;

@Component
public class Respuesta {
	public static final Integer ERROR = 99;
	
	private  Integer codigo = 0;
	private  Object datos;
	private  String mensaje = "OK";
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Object getDatos() {
		return datos;
	}
	public void setDatos(Object datos) {
		this.datos = datos;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


}
