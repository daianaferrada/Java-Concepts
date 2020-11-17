package main;

public class comparar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena1 = "Hola";
		String cadena2 = "Hola";
	
		boolean comp = cadena1.equals(cadena2);
		
		System.out.println(comp);
		
		String cadena3 = "hola";
		String cadena4 = "hOlA";
		
		boolean resultado = cadena3.equalsIgnoreCase(cadena4); //otra manera de comparar mejor,
		
		System.out.println (resultado);
	
	
	}

}
