package Tareas;

import java.util.Scanner;

public class AreaCirculoP {
	
	Scanner teclado=new Scanner(System.in);
	double radio,area;
	
	
	public void AreaCir() {
		
	area=3.1416*Math.pow(radio,2);
	
	System.out.println("el area de un circulo con radio "+radio+"  es "+area);
	}
	
	
	public void PedirDato() {
		
		System.out.println("Escribe el primer Dato");
		radio=teclado.nextDouble(); 
		AreaCir();
	
	}
	
	
	

}
