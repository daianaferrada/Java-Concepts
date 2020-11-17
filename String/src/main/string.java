package main;

public class string {

	public static void main(String[] args) {
	
		String mensaje = "Hola, soy un string";
				
		int cantidad = mensaje.length();
			
		boolean contiene = mensaje.contains ("u");
	
		boolean comienzacon = mensaje.startsWith("Hola");
		
		boolean finalizacon = mensaje.endsWith ("string");
		
		System.out.println (mensaje);
		
		System.out.println (cantidad);
		
		System.out.println (contiene);
		
		System.out.println (comienzacon);
		
		System.out.println (finalizacon);
		
		String nuevo = mensaje.concat(" estamos en el curso de java");
		
		System.out.println (nuevo);
		
	}

}
