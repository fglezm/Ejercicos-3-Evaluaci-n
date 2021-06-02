package unidad8_e_s;

import java.io.*;
import java.util.*;

/*
 * Programa que lee de la entrada estandar varios compuestos 
 * quimicos y despues de leerlos todos muestra en la salida 
 * estandar todos los elementos qu�micos que forman dichos
 * compuestos sin que se repita ninguno y en orden alfab�tico.
 * La primera l�nea de texto contiene el n�mero de compuestos
 * El resto de l�neas contienen los compuestos a raz�n de uno 
 * por l�nea
 * Cada compuesto se escribe como una secuencia de elementos 
 * qu�micos separados por espcios en blanco
 */

public class Ejemplo2Conjuntos {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> elementos = new TreeSet<String>();
		List<List<String>> compuestos = new ArrayList<List<String>>();
		int n = Integer.valueOf(br.readLine());
		for (int i = 0; i < n; i++) {
			Scanner s = new Scanner(br.readLine());
			List<String> compuesto = new ArrayList<String>();
			while (s.hasNext())
				compuesto.add(s.next());
			compuestos.add(compuesto);
		}
		for (List<String> compuesto : compuestos)
			elementos.addAll(compuesto);
		System.out.println(elementos);
	}

}
