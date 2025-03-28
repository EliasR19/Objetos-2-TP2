package a;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlantaPermanente a =new PlantaPermanente("Elías", "Varela", "Casado", LocalDate.of(2003, 6, 19), 0, 10);
		a.setSueldoBasico(1000);
		
		
		System.out.println("\n---A---\n");
		System.out.println("bruto: " + a.sueldoBruto());
		System.out.println("neto: " + a.sueldoNeto());
		System.out.println(a.conceptos());
			
	
		PlantaTemporaria b = new PlantaTemporaria("Pepe", "Quilmes", "Soltero", LocalDate.of(1990, 11, 7), LocalDate.of(2024, 12, 14));
		b.setSueldoBasico(1000);
		b.setCantHorasExtras(4);
		
		System.out.println("\n---B---\n");
		System.out.println("bruto: " + b.sueldoBruto());
		System.out.println("neto: " + b.sueldoNeto());
		System.out.println(b.conceptos());
		
		Contratado c = new Contratado("Roberto", "Bernal", "Soltero", LocalDate.of(2009, 4, 18),0001, "Efectivo" );
		c.setSueldoBasico(1000);
		
		System.out.println("\n---C---\n");
		System.out.println("bruto: " + c.sueldoBruto());
		System.out.println("neto: " + c.sueldoNeto());
		System.out.println(c.conceptos());
		
		
		System.out.println("\n---EMPRESA---\n");
		Empresa empresa = new Empresa("RolerosRojos", 123456789);
		empresa.contratarEmpleado(a);
		empresa.contratarEmpleado(b);
		empresa.contratarEmpleado(c);
		
		
		System.out.println("Empleados: " +empresa.empleados());
		System.out.println("TotalNetos: " + empresa.totalSueldosNetos());
		System.out.println("TotalBrutos: " + empresa.totalSueldosBrutos());
		System.out.println("TotalRetenciones: " + empresa.totalRetenciones());
		
		//otra alternatiba
		Neto neto = new Neto();
		Bruto bruto = new Bruto();
		Retenciones retenciones = new Retenciones();
		
		System.out.println("\nTotalNetos: " + empresa.calcularMontoEmpleados(neto));
		System.out.println("TotalNetos: " + empresa.calcularMontoEmpleados(bruto));
		System.out.println("TotalNetos: " + empresa.calcularMontoEmpleados(retenciones));
		
		//recibos
		System.out.println(empresa.liquidacionSueldos());
	}

}
