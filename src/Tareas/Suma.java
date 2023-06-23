package Tareas;

public class Suma {
	Pedirdatos datos=new Pedirdatos();
	
	Suma(){
		
		datos.pedirDatosOperacion();
		
	double suma=datos.dato1+datos.dato2;
	
	
	System.out.println("La suma es   "+ suma);
		
		}
	
	
	
	

}
