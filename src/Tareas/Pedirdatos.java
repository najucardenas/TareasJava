package Tareas;

import java.util.Scanner;

public class Pedirdatos {
	
	Scanner teclado=new Scanner(System.in);
	double dato1,dato2, resultado;
	int op;
	
	public void pedirDatosOperacion() {
		
		try {
			System.out.println("Escribe el primer Dato");
			dato1=teclado.nextDouble(); 
			System.out.println("Escribe el primer Dato");
			dato2=teclado.nextDouble();
			
		} catch (Exception e) {
			System.out.println("Los tipos de datos  introducidos son incorrectos para operaciones basicas");
			pedirDatosOperacion();
			
		}
		
	}
	
	
	
	public int datosop() {
		
		try {
			op=teclado.nextInt(); 
			
		} catch (Exception e) {
			System.out.println("El tipos de datos  introducidos es incorrectos para selecionar una opcion de menu");
			//datosop();
			op=6;
		}
		
		
		return op;
		
	}

}
