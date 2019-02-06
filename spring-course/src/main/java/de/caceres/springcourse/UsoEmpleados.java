package de.caceres.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Empleados juan = context.getBean("miEmpleado", Empleados.class);
		System.out.println(juan.getTareas());
		context.close();
	}

}
