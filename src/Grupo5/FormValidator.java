package Grupo5;

public class FormValidator {

    public boolean validar(String nombre, String email, String telefono, 
            String direccion, String ciudad, String codigoPostal) {

    	if (nombre == null || nombre.isEmpty()) return false;
		if (isInvalidEmail(email)) return false;
		if (isInvalidPhone(telefono)) return false;
		if (direccion == null || direccion.isEmpty()) return false;
		if (ciudad == null || ciudad.isEmpty()) return false;
		if (isInvalidPostalCode(codigoPostal)) return false;
		return true;
	}

	private boolean isInvalidPostalCode(String codigoPostal) {
		return codigoPostal == null || codigoPostal.length() != 5;
	}

	private boolean isInvalidPhone(String telefono) {
		return telefono == null || telefono.length() < 9;
	}

	private boolean isInvalidEmail(String email) {
		return email == null || !email.contains("@");
	}
}