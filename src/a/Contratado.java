package a;

import java.time.LocalDate;

public class Contratado extends Empleado {
	
	private int nroContratado;
	private String medioPago;
	
	public Contratado(String nombre, String direccion, String estadoCivil, LocalDate fecNac, int nroContratado, String medioPago) {
	super(nombre, direccion, estadoCivil, fecNac);
	this.nroContratado = nroContratado;
	this.medioPago = medioPago;
	}
	
	//getters
	public int nroContratado() {
		return nroContratado;
	}
	public String medioPago() {
		return medioPago;
	}
	
	
	//calculos
	@Override
	public float sueldoBruto() {
		return getSueldoBasico();
	}

	@Override
	public float retenciones() {
		return 50;
	}

	@Override
	public float sueldoNeto() {
		return sueldoBruto() - retenciones();
	}

	@Override
	public float obraSocial() {
		return 0;
	}

	@Override
	public float aportes() {
		return 0;
	}
	
	
	public String conceptos() {
		return "retenciones: " + retenciones();
	}

}
