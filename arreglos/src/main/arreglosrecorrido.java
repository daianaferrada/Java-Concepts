package main;

public class arreglosrecorrido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int calificaciones [] = {9,8,7,8,8,6,7,8,9,10};
		int suma = 0;
		
		System.out.println (calificaciones.length) ; //para saber cuantos lugares tine
		
		for (int indice = 0; indice <calificaciones.length;indice++)
		{	suma += calificaciones [indice];
		}
	System.out.println("El total de calificaciones es: "+suma);
	
	float promedio = suma / calificaciones.length;
	
	System.out.println ("El promedio es: "+promedio);
	
	}
	

}
