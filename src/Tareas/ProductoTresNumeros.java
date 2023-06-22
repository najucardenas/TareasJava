package Tareas;

import java.util.Scanner;

public class ProductoTresNumeros {
	
	Scanner teclado=new Scanner(System.in);
	
	public void ProductoTresNumeros1(){
	try {
		  System.out.println("Escribe el PRIMERO numero");
			int uno=  Integer.parseInt(teclado.next()); 
			System.out.println("Escribe el SEGUNDO  numero");
			int dos=Integer.parseInt(teclado.next()); 
			System.out.println("Escribe el TERCER  numero");
			int tres=Integer.parseInt(teclado.next()); 
		
		
		System.out.println("EL producto de los tres numeros enteros es: "+uno*dos*tres);
		
		
	} catch (Exception e) {
		// TODO: handle exception
		
		System.out.println("Los numeros tiene que ser enteros ");
		ProductoTresNumeros1();
		
	}
		
		  
		
		
	}

}
