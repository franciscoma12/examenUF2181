
package libs;
/**
 * 
 * @author Francisco Manuel Aguilar Torres
 *
 */


public class Funciones {
	/**
	 * Método que se le pasan 3 números y devuelve el número central del mismo.
	 * @param num1 primero número entero que se le pasa.
	 * @param num2 segundo número entero que se le pasa.
	 * @param num3 tercer número entero que se le pasa.
	 * @return devuelve el número central de los antes mencionados.
	 */
	public int devuelveCentral(int num1, int num2, int num3) {
		
		int enMedio;
		
		if ((num1>num2) && (num1<num3)) {
			enMedio=num1;
		}  else if  ((num2>num1) && (num2<num3)) {
			enMedio= num2;
		} else {
			enMedio = num3;
		}
		return enMedio;
	}
	/**
	 * Método que se le pasa un año y debe de indicar si el año es bisiesto o no.
	 * @param año el año que queremos comprobar.
	 * @return devuelve true si es bisiesto y false si no lo es.
	 */
	public boolean esBisiesto(int año) {
		boolean bisiesto = false;
		if (año %4 == 0 ) {
			if (año%100==0 && año%400!=0) {
				bisiesto=false;
			} else {
				bisiesto=true;
			}
		} else  {
			bisiesto=false;
		}
		return bisiesto;
	}
	/**
	 * Método que se le pasa un array de números y nos indica si es capicua o no.
	 * @param v es el array que se le pasa.
	 * @return nos devuelve si en efecto ese número es capicua con true o si no lo es con false.
	 */
	public static boolean esCapicua(int v[]) {
		boolean capicua = true;
		
		for (int i=0, j=v.length-1; i<v.length/2; i++,j--) {
			if (v[i]!=v[j]) {
				capicua=false;
			}
		}
		return capicua;
	}
	/**
	 * Método para sumar 2 vectores de tamaños iguales.
	 * @param v es el primer array que se le pasa.
	 * @param v2 es el segundo array que se le pasa.
	 * @return devuelve la suma de los 2 arrays anteriores.
	 * @throws hay una excepción, ya que si uno de los 2 Arrays no es del mismo tamaño, te da fallo. 
	 */
	public int [] suma_vectores(int v[], int v2[]) {
		int vector_suma [] = new int[v.length];
		
		if (v.length!=v2.length) 
		   throw new ArithmeticException("Los vectores deben tener el mismo tamaño");
		
		for (int i = 0; i < vector_suma.length; i++) {
			vector_suma[i]=v[i]+v2[i];
		}
		return vector_suma;
	}
	
	
}
