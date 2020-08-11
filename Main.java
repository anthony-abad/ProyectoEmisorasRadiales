
public class Main {
	
public static void main(String[] args) {
		
		Sintonizador sin1 = new Sintonizador(80);
		Sintonizador sin2 = new Sintonizador(108);
		Sintonizador sin3 = new Sintonizador(94.5);
		
		
		sin1.encender();
		sin1.verificacion();
		sin1.bajarFrecuencia();
		sin1.display();
		sin2.encender();
		sin2.verificacion();
		sin2.subirFrecuencia();
		sin2.display();
		sin3.encender();
		sin3.verificacion();
		sin3.bajarFrecuencia();
		sin3.bajarFrecuencia();
		sin3.subirFrecuencia();
		sin3.display();
	}

}
