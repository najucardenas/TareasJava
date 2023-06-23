package Tareas;

import java.util.Scanner;

public class Menu {
	int op;
	Pedirdatos datos=new Pedirdatos();
	Scanner teclado=new Scanner(System.in);
	public void menu() {
		
		
		do {
		System.out.println("Calculadora           ");
		
		System.out.println("Suma             1");
		System.out.println("Resta            2");
		System.out.println("Division         3");
		System.out.println("Multiplicacion   4");
		System.out.println("Salir            5");
		op=datos.datosop();
		switch (op) {
		case 1: {
		
			Suma suma=new Suma();
			menu();
		}
		case 2: {
			
			Resta resta=new Resta();
			menu();
		}
		case 3: {
			Division div=new Division();
		
			
			menu();
		}
		case 4: {
			
			Multiplicacion multi=new Multiplicacion();
			menu();
		}
		
		case 5: {
			System.exit(0);
		}
		
		//default:
			//throw new IllegalArgumentException("No es una opcion correcta" + op);*/
		}
		
		
		} while(op!=5);
	}
	
	
	

}
