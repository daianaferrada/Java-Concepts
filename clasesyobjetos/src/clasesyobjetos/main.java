package clasesyobjetos;

public class main {

	public static void main(String[] args) {
		// Clases y objetos
		
		perro lassie = new perro(); //intancia es el objeto creado
		
		lassie.establecerAtributos("lassie", "collie", 4); //Argumentos
		
		System.out.println ("El nombre es : " + lassie.nombre);
		
		System.out.println ("La raza es : " + lassie.raza);

		System.out.println ("La edad es : " + lassie.edad);
		
		lassie.comer();
	}

}
