package Tareas;

public class Division {
	
Pedirdatos datos=new Pedirdatos();
	
Division(){
		
		datos.pedirDatosOperacion();
		
	double div=datos.dato1/datos.dato2;
	
	
	System.out.println("La division es   "+ div);
		
		}

}
