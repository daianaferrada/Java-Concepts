package Condicionales;

public class while2 {

	public static void main(String[] args) {
		
		int contador = 0;
		int numero = 123456789;
		int cont=10;
		
		while (numero > 0 ) {
			
			numero = numero / 10;
			contador ++ ;
		}
		System.out.println ("El numero posee " + contador + " digitos");

	do {
		System.out.println (cont);
		cont++;
	}
	while (cont <=10);

	}

}
