package Tareas;

import java.util.Scanner;

public class DividirNumeros {
	double Dato=0;
	double Dato2=0;
	double resultado;
	
	int res;
	
	double  resultado2;
	
	double  resultado3;
	
	public void DividirNum(){
		Scanner teclado=new Scanner(System.in);
	
		
		try {
			System.out.println("Escribe el primer numero entre  1 y  17");
			Dato=teclado.nextDouble();
			
			if (Dato<=17) {
				if(Dato<0) {
					Dato=Dato*(-1);
				}
				System.out.println("Escribe el primer numero entre  1 y  3");
				
				 Dato2=teclado.nextDouble();
				if (Dato2<=17) {
					if(Dato2<0) {
						Dato2=Dato2*(-1);
						
					}
					caluclo();
					
				}else { DividirNum();}
					
			}
			else { DividirNum();}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Tiene que introducir valores numericos");	
			DividirNum();	
		}
	
		
		//caluclo();
	}
	
	
	public void caluclo() {
		
		double resultado=Dato/Dato2;
		
		int res=(int)resultado;
		
		double  resultado2=Dato%Dato2;
		
		double  resultado3=Dato/Dato2;
		
		
		
		System.out.println("El cociente es: "+ res+" El residuo es: "+resultado2+" La respuesta real es "+resultado3);
		
		
	}
	

}
