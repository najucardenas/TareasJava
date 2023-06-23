package Tareas;

import java.util.Scanner;

public class Promedio {
	
	Scanner teclado=new Scanner(System.in);
	double promedio,suma=0;
	int numeros;
	

	
	
	Promedio() {
		
		System.out.println("Escribe cuando datos quieres ingresar");
		numeros=teclado.nextInt(); 
		
		
		for(int i=1; i<=numeros; i++) {
			
			System.out.println("Escribe el dato " +i );
			suma= suma+teclado.nextInt(); 
			}
		
		
		System.out.println("El promedio de los numeros es  " + suma/numeros );
	
	}
	
	
	

	
	

}
