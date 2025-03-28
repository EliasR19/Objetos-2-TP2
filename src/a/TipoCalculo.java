package a;

public abstract class TipoCalculo {

	public abstract float get(Empleado e);
	
	
}

class Neto extends TipoCalculo {
	
	public float get(Empleado emple) {
		return emple.sueldoNeto();

	}
}

class Bruto extends TipoCalculo {
	
	public float get(Empleado emple) {
		return emple.sueldoBruto();

	}
}

class Retenciones extends TipoCalculo {
	
	public float get(Empleado emple) {
		return emple.retenciones();

	}
}