package Tareas;

import java.util.Scanner;

public class Interes {
	
	double princiupal=0, tasainteres=0, tiempo=0, interes;
	 Scanner teclado=new Scanner(System.in);
	
	
	public void simple() {
		
		interes=(princiupal*tasainteres*tiempo)/100;
		System.out.println("El interes simple es: "+ interes);
	}
	

	public void compuesto() {
		if(interes>5) {
			tiempo=10;
		}
		interes=princiupal * Math.pow( 1 +(tasainteres /100), tiempo)-princiupal;
		
		System.out.println("El interes compuesto  es: "+ interes);
		
	}
	
	
	public void  pedirDatos() {
		System.out.println(" Escribe princupal");
		
		princiupal=teclado.nextDouble();
		
      System.out.println(" Escribe tasa de interes");
      tasainteres=teclado.nextDouble();
      
      System.out.println(" Escribe  el tiempo");
      tiempo=teclado.nextDouble();
		
		
		
		
	}
	
	
	
	

}
