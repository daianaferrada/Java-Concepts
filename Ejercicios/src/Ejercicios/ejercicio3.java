package Ejercicios;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String simbolo= "   *";
		String resultado = "";
		
		int i=1;
				
		for (i=1;i<=6;i++) {

		switch (i) {
		
		case 1 : 
			
		System.out.println ("    ");
		
		break;
		
		case 2 : 
			
		System.out.println ("   ");
		
		break ;
		
		case 3 :
			
		System.out.println ("  ");
		
		break;
		
		case 4:
			
		System.out.println (" ");
		
		break;
		
		case 5:
			
		System.out.println ("");
		
		break;
		}
	}
		 int j = -1;
		for (  ; j <= i ; j ++ )
		{
			System.out.println ("*");
		}
		System.out.println ("");
	}

}
