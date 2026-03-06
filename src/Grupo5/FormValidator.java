package Grupo5;

public class FormValidator {

	final int TAMAÑOTEL = 9;
	final int TAMAÑOCP= 5;
	
    public boolean validar(ValidarParameter parameterObject) {

    	if (parameterObject.nombre == null || parameterObject.nombre.isEmpty()) return false;
		if (parameterObject.email == null || !parameterObject.email.contains("@")) return false;
		if (parameterObject.telefono == null || parameterObject.telefono.length() < TAMAÑOTEL) return false;
		if (parameterObject.direccion == null || parameterObject.direccion.isEmpty()) return false;
		if (parameterObject.ciudad == null || parameterObject.ciudad.isEmpty()) return false;
		if (parameterObject.codigoPostal == null || parameterObject.codigoPostal.length() != TAMAÑOCP ) return false;
		return true;
		
		
	}
}