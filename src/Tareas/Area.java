package Tareas;

import java.util.Scanner;

public class Area {
	
double lado1,lado2;
	
	Scanner teclado=new Scanner(System.in);
	
	Area(){
		System.out.println("Escribe el valor de largp");
		lado1=teclado.nextDouble();
		
		System.out.println("Escribe el valor de ancho");
		lado2=teclado.nextDouble();
		
		
		
		
		System.out.println("EL perimetro del triangulo es: " +lado1*lado2);
		
		
		}
	
	

}
