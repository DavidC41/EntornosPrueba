package Grupo5;

public class FormValidator {
	
	final int TAMAÑOTEL = 9;
	final int TAMAÑOCP =5;

    public boolean validar(ValidarParameter parameterObject) {

    	if (parameterObject.nombre == null || parameterObject.nombre.isEmpty()) return false;
		if (isInvalidEmail(parameterObject)) return false;
		if (isInvalidPhone(parameterObject)) return false;
		if (parameterObject.direccion == null || parameterObject.direccion.isEmpty()) return false;
		if (parameterObject.ciudad == null || parameterObject.ciudad.isEmpty()) return false;
		if (isInvalidPostalCode(parameterObject)) return false;
		return true;
	}

	private boolean isInvalidPostalCode(ValidarParameter parameterObject) {
		return parameterObject.codigoPostal == null || parameterObject.codigoPostal.length() != TAMAÑOCP;
	}

	private boolean isInvalidPhone(ValidarParameter parameterObject) {
		return parameterObject.telefono == null || parameterObject.telefono.length() < TAMAÑOTEL;
	}

	private boolean isInvalidEmail(ValidarParameter parameterObject) {
		return parameterObject.email == null || !parameterObject.email.contains("@");
	}
}