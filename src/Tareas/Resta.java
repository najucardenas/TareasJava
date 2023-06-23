package Tareas;

public class Resta {
Pedirdatos datos=new Pedirdatos();
	
	Resta(){
		
		datos.pedirDatosOperacion();
		
	double resta=datos.dato1-datos.dato2;
	
	
	System.out.println("La resta es   "+ resta);
		
		}

}
