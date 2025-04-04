package a;

import java.time.LocalDate;

public class PlantaPermanente extends Empleado {
	
	private int cantHijos;
	private int antiguedad;

	public PlantaPermanente(String nombre, String direccion, String estadoCivil, LocalDate fecNac, int cantHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fecNac);
		this.cantHijos = cantHijos;
		this.antiguedad = antiguedad;
	}
	
	
	//getter
	public int cantHijos() {
		return cantHijos;
	}
	public int antiguedad() {
		return antiguedad;
	}


	@Override
	//sueldo bruto
	public float sueldoBruto() {
		return this.getSueldoBasico() + salarioFamiliar();
	}


	//salario familiar
	private int salarioFamiliar() {
		return asignacionHijo() + extraPorAnriguedad() + asignacionConyuge();
	}
	
	private int asignacionConyuge() {
		if(this.estadoCivil().equalsIgnoreCase("casado")) {
			return 100;
		}
		return 0;
	}

	private int extraPorAnriguedad() {
		return 50 * antiguedad;
	}

	private int asignacionHijo() {
		return 150 * cantHijos;
	}


	@Override
	//sueldoNeto
	public float sueldoNeto() {

		return sueldoBruto() - retenciones();
	}

	
	//retenciones
	@Override
	public float retenciones() {
		return obraSocial() + aportes() ;
	}
	@Override
	public float obraSocial() {
		return ((sueldoBruto() * 10) / 100) + 20 * cantHijos;
	}
	@Override
	public float aportes() {
		return ((sueldoBruto() * 15 / 100));
	}
	
	
	public String conceptos() {
		return "salarioFamiliar: " + salarioFamiliar() +
				"\nasignacionConyuge: " + asignacionConyuge() +
				"\nasignacionPorHijo: " + asignacionHijo() +
				"\nextraPorAntiguedad: " + extraPorAnriguedad() + 
				"\nretenciones: " + retenciones() + 
				"\nobraSocial: " + obraSocial() + 
				"\naportes: " + aportes();
	}
	

}
