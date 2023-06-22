package Tareas;

import java.util.Scanner;

public class DividirNumeros {
	
	public void DividirNum(){
		Scanner teclado=new Scanner(System.in);
		double Dato=0;
		double Dato2=0;
		System.out.println("Escribe el primer numero entre  1 y  17");
		Dato=teclado.nextDouble();
		
		if (Dato>0 && Dato<=17) {
			
			System.out.println("Escribe el primer numero entre  1 y  3");
			
			 Dato2=teclado.nextDouble();
			if (Dato2>0 && Dato2<=17) {
				
			}else DividirNum();
				
		}
		else DividirNum();
		
		
		double resultado=Dato/Dato2;
		
		int res=(int)resultado;
		
		double  resultado2=Dato%Dato2;
		
		double  resultado3=Dato/Dato2;
		
		System.out.println("El cociente es: "+ res+" El residuo es: "+resultado2+" La respuesta real es "+resultado3);
		
		
		
		
		
	}
	

}
