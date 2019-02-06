package de.caceres.springcourse;

public class SecretarioEmpleado implements Empleados {

	@Override
	public String getTareas() {
		return "Gestionar la agenda de los jefes";
	}

}
