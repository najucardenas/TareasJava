package Tareas;

import java.util.Scanner;

public class Nomina {
	
	Scanner teclado=new Scanner(System.in);
	double sueldoB;
	double horanormal=72.87, horaextra=25.96;
	double sueldoneto, descuento;
	
	Persona persona=new Persona();
	
	
	
	
	
	public void  calcularNomina() {
		
		
		double salario=persona.getHoras()*72.87;	
		double salarioextra=persona.getHoras()*25.96;	
		
		 sueldoB=salario+salarioextra;
		
		if(sueldoB<=2000) {
			
			descuento=	sueldoB*0.16;
			sueldoneto=sueldoB-descuento;
			
		}
		else
		
			descuento=	sueldoB*0.18;
		
		
		System.out.println("El sueldo bruto es: "+ (float)sueldoB +" El esuledo neto es "+(float)sueldoneto);
	}
	
	
	public void pedirDatos() {
		
		System.out.println("Escribe tu Nombre");
		persona.setNombre(teclado.next());
		System.out.println("Escribe tu  Puesto");
		persona.setPuesto(teclado.next());
		System.out.println("Escribe tus horas de trabajo");
		persona.setHoras(teclado.nextDouble());
		System.out.println("Escribe tu Nombre");
		persona.setTiempoExtra(teclado.nextDouble());
		calcularNomina();
		
	}
	
	

}
