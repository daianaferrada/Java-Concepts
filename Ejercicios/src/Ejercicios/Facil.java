package Ejercicios;

public class Facil {

	public static void main(String[] args) {
//1) Declara dos variables numéricas (con el valor que desees), 
//muestra por consola la suma, resta, multiplicación, división y módulo
//(resto de la división).

		int num1=10, num2= 20;
		
		int suma =num1 + num2;
		
		int resta = num1 - num2;
		
		int mult = num1 * num2;
		 
		int modulo = num1%num2;
		
		int div = num1 / num2;
		
		System.out.printf("El resultado de la suma entre %d y %d es : %d",num1, num2, suma);
		
		System.out.printf("\nEl resultado de la resta entre %d y %d es : %d",num1, num2, resta);
		
		System.out.printf("\nEl resultado de la division entre %d y %d es : %d",num1, num2, div);
		
		System.out.printf("\nEl resultado de la multiplicacion entre %d y %d es : %d",num1, num2, mult);
		
		System.out.printf("\nEl resultado del modulo entre %d y %d es : %d",num1, num2, modulo);
	}

}
