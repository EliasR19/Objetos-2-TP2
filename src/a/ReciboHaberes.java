package a;

import java.time.LocalDate;

public class ReciboHaberes {
	
	private String nombreEmpleado;
	private String direccion;
	private LocalDate fechaEmicion;
	private float sueldoBruto;
	private float sueldoNeto;
	
	public ReciboHaberes(Empleado e) {
		this.nombreEmpleado = e.nombre();
		this.direccion = e.direccion();
		this.sueldoBruto = e.sueldoBruto();
		this.sueldoNeto = e.sueldoNeto();
		
		this.fechaEmicion = LocalDate.now();
	}
}
