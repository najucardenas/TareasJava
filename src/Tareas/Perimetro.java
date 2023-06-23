package Tareas;

import java.util.Scanner;

public class Perimetro {
	double lado1,lado2,lado3,perimetro;
	
	Scanner teclado=new Scanner(System.in);
	
	Perimetro(){
		System.out.println("Escribe el valor del primer lado");
		lado1=teclado.nextDouble();
		
		System.out.println("Escribe el valor del segudndo lado");
		lado2=teclado.nextDouble();
		
		System.out.println("Escribe el valor del tercer lado");
		lado3=teclado.nextDouble();
		perimetro=lado1+lado2+lado3;
		
		System.out.println("EL perimetro del triangulo es: " +perimetro);
		
		
		}
	
	
	

}
