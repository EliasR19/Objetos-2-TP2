package a;

import java.time.LocalDate;

public class PlantaTemporaria extends Empleado{
	
	private LocalDate fecFinDesignacion;
	private int cantHorasExtras;
	
	public PlantaTemporaria(String nombre, String direccion, String estadoCivil, LocalDate fecNac, LocalDate fecFinDesignacion) {
		super(nombre, direccion, estadoCivil, fecNac);
		this.fecFinDesignacion = fecFinDesignacion;
		this.cantHorasExtras = 0;
		
	}
	
	//getters
	public LocalDate fecFinDesignasion() {
		return fecFinDesignacion;
	}
	public int getCantHorasExtras() {
		return cantHorasExtras;
	}
	
	//setter
	public void setCantHorasExtras(int cantHoras) {
		cantHorasExtras = cantHoras;
	}

	//Calculos
	@Override
	public float sueldoBruto() {
		return getSueldoBasico() + pagaHorasExtras();
	}

	private float pagaHorasExtras() {
		return 40 * cantHorasExtras;
	}

	@Override
	public float retenciones() {
		return obraSocial() + aportes();
	}

	@Override
	public float sueldoNeto() {
		return sueldoBruto() - retenciones();
	}

	@Override
	public float obraSocial() {
		float retencion =((sueldoBruto() * 10) / 100);
		if(this.edad() >= 50) {
			return retencion + 25;
		}
		return retencion;
			
	}

	@Override
	public float aportes() {
		return ((sueldoBruto() * 10) / 100) + (5 * cantHorasExtras);
	}
	
	
	public String conceptos() {
		return "pagaPorHorasExtras: " + pagaHorasExtras() +
				"\nretenciones: " + retenciones() + 
				"\nobraSocial: " + obraSocial() + 
				"\naportes: " + aportes();
	}

}
