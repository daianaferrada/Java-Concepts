package metodos;

public class Metodos2 {

	public static void main(String[] args) {
		
		String mensaje = "";
		
		mensaje = String.format("Bienvenido al curso %s", "Java");
		
		System.out.println(mensaje);


		float valor = 10.98398f;

		System.out.printf("El valor de %d cajas es %.2f %s", 3 ,valor, "pesos");
	}

}
