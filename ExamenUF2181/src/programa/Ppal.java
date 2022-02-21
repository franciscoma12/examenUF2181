/**
 * 
 */
package programa;

import javax.swing.JOptionPane;

import libs.Funciones;

/**
 * @author David
 * Clase que ejecuta un cuadro de diálogo para pedir al usuario un año
 * e indica si el año es bisiesto o no
 */
public class Ppal {

	/**
	 * Método principal de la clase, es el punto de entrada de la aplicación
	 * @param args String [] Son los argumentos de la aplicación. No se usan pero 
	 * se mantienen por compatibilidad
	 */
	public static void main(String[] args) {
		String añoString = JOptionPane.showInputDialog(null, "Introduce un año", 
			"Comprobar si el año es bisiesto", JOptionPane.QUESTION_MESSAGE);
		try {
			int año = Integer.parseInt(añoString);
			Funciones f = new Funciones();
			if (f.esBisiesto(año)) {
				JOptionPane.showMessageDialog(null, "El año es bisiesto",
						"Es bisiesto", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "El año NO es bisiesto",
						"NO Es bisiesto", JOptionPane.WARNING_MESSAGE);
			}
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "No has introducido un dato correcto",
					"Dato incorrecto", JOptionPane.ERROR_MESSAGE);
		}
		
		
	}

}
