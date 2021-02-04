package com.cesarochoa2006.market.aplicacion.excepcion;

public class ExcepcionAplicacion extends Exception {

	private static final long serialVersionUID = -1421745361540515481L;

	public ExcepcionAplicacion() {
		super();
	}

	public ExcepcionAplicacion(String message) {
		super(message);
		
	}

	public ExcepcionAplicacion(Throwable cause) {
		super(cause);
		
	}

	public ExcepcionAplicacion(String message, Throwable cause) {
		super(message, cause);
		
	}

	public ExcepcionAplicacion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}
