package a;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public abstract class Empleado {

	//
	
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fecNac;
	private float sueldoBasico;
	private List<ReciboHaberes> recibos = new ArrayList<ReciboHaberes>();
	
	
	//constructor
	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fecNac) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fecNac = fecNac;
	}
	
	//getter
	
	public String nombre() {
		return nombre;
	}
	public String direccion() {
		return direccion;
	}
	public String estadoCivil() {
		return estadoCivil;
	}
	public LocalDate fecNac() {
		return fecNac;
	}
	public List<ReciboHaberes> recibos() {
		return recibos;
	}
	
	
	//sueldoBasico getter setter
	public float getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(float sueldo) {
		sueldoBasico = sueldo;
	}
	public void cobrar(ReciboHaberes recibo) {
		recibos.add(recibo);
	}
	
	
	//calculos
	public int edad() {
		return Period.between(fecNac, LocalDate.now()).getYears();
	}
	
	public abstract float sueldoBruto();
	public abstract float retenciones();
	public abstract float sueldoNeto();
	public abstract float obraSocial();
	public abstract float aportes();
	
	
}
