package Tareas;

public class Multiplicacion {
Pedirdatos datos=new Pedirdatos();
	
Multiplicacion(){
		
		datos.pedirDatosOperacion();
		
	double multi=datos.dato1*datos.dato2;
	
	
	System.out.println("La Multiplicacion  es   "+ multi);
		
		}

}
