package Ejercicios;

import javax.swing.JOptionPane;

public class optionpane {

	public static void main(String[] args) {
		
		String Nombre;
		String NombreEntrada= "daiana";
	
		
		Nombre = JOptionPane.showInputDialog("Escriba su nombre porfavor");
		// si el usuario quiere cerrar que pregunte confirmacion
		
		int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
		//si el nombre esta mal que vuelva a ingresar
		String respuesta = JOptionPane.showInputDialog(null, "Escriba nuevamente su nombre", "Error!", JOptionPane.ERROR_MESSAGE);
		//falta condicion para igualar y que de este mensaje
		JOptionPane.showMessageDialog(null, "Bienvenido " + Nombre);
		
	}
}

