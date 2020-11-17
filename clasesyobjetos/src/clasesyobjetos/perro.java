package clasesyobjetos;

public class perro {

	String nombre;
	String raza;
	int edad;
	
	//parametros
	
	void establecerAtributos (String nombre, String raza, int edad) {
		
		this.nombre = nombre;
		this.raza= raza;
		this.edad= edad;
	
	}
	void comer() {
		
		System.out.println ("El perro esta comiendo");
	}
	
}
