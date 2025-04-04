package a;

import java.util.ArrayList;
import java.util.List;


public class Empresa {
	private List<Empleado> empleados = new ArrayList<Empleado>();
	private String nombre;
	private int cuit;
	
	public Empresa(String nombre, int cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
		
	}
	
	//getter
	public String nombre() {
		return nombre;
	}
	public int cuit() {
		return cuit;
	}
	public List<Empleado> empleados(){
		return empleados;
	}
	
	
	//setter
	public void contratarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
	
	//calculos
	
	public List<ReciboHaberes> liquidacionSueldos(){
		List<ReciboHaberes> recibos = new ArrayList<ReciboHaberes>();
		for(Empleado e : empleados) {
			ReciboHaberes recibo = new ReciboHaberes(e);
			recibos.add(recibo);
			e.cobrar(recibo);
		}
		
		return recibos;
	}
	
	//se repite codigo, pensar otra forma
	public float totalSueldosNetos() {
		float totalNeto = 0;
		for(Empleado e : empleados) {
			totalNeto = e.sueldoNeto() + totalNeto;
		}
		return totalNeto;
	}
	public float totalSueldosBrutos() {
		float totalBruto = 0;
		for(Empleado e : empleados) {
			totalBruto = e.sueldoBruto() + totalBruto;
		}
		return totalBruto;
	}
	public float totalRetenciones() {
		float totalRetenciones = 0;
		for(Empleado e : empleados) {
			totalRetenciones = e.retenciones() + totalRetenciones;
		}
		return totalRetenciones;
	}
	
	
	//otra alternativam
	
	
	public float calcularMontoEmpleados(TipoCalculo tipo) { //mandar un parametro que sea el tipo de cosa a calcular
		float total = 0;
		for(Empleado e : empleados) {
			total = total + tipo.get(e); //tipoDeCosaACalcular(e)
		}
		
		
		//se puede hacer de esta forma tambien.
		//total = empleados.stream().map(e -> tipo.get(e)).reduce(0.0f, (e, t) -> e + t);
		return total;
		
	}
	
}
