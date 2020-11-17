package retornarvaloresclasesyobjetos;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangulo triangulo = new Triangulo();
		triangulo.base =10;
		triangulo.altura=20;
		
		float resultado = triangulo.area();
		
		System.out.println (resultado);
		
		
	}

}
