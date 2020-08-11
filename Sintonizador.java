

public class Sintonizador {
	
	double frecuencia;
	boolean encendido;

	public Sintonizador(double frecuencia) {
		super();
		this.frecuencia = frecuencia;
	}
	
	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}
	
	
	public void apagar() {
		encendido = false;
	}
	public void encender() {
		encendido = true;
	}
	
	public void verificacion(){
		if (frecuencia > 79 && frecuencia <180.5) {
		}else {
			System.out.println("LA EMISORA ES INCORRECTA");
		}
	}
	
	public void display () {
		System.out.println("LA FRECUENCIA ES: "+frecuencia+ " MHz");
	}
	
	public void subirFrecuencia() {
		System.out.println("SUBIENDO FRECUENCIA");
		if(encendido) {
			if(frecuencia>80 && frecuencia <108) {
				frecuencia+=0.5;
				setFrecuencia(frecuencia);
			}else {
				System.out.println("EXCEDIO EL RANGO");
				frecuencia=80;
				setFrecuencia(frecuencia);
			}
			
		}
			
	}
	public void bajarFrecuencia() {
		System.out.println("BAJANDO FRECUENCIA");
		if(encendido) {
			if(frecuencia>80 && frecuencia <108) {
				frecuencia-=0.5;
				setFrecuencia(frecuencia);
			}else {
				System.out.println("EXCEDIO EL RANGO");
				frecuencia=108;
				setFrecuencia(frecuencia);
			}
		}
			
	}
	
	
}
