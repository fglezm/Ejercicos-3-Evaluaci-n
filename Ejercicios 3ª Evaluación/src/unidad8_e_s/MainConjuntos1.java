package unidad8_e_s;

import java.io.*;
import java.util.*;

/*
 * Programa que lee una línea de texto de la entrada estándar y muestra qué caracteres están
 * repetidos y qué caracteres aparecen una sola vez, ignorando los espacios en blanco
 */
public class MainConjuntos1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Set<Character> repetidos = new HashSet<Character>();
		Set<Character> sinRepetir = new HashSet<Character>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linea = br.readLine();
		for (Character c : linea.toCharArray())
			if (!Character.isSpaceChar(c)) {
				if (sinRepetir.contains(c)) {
					repetidos.add(c);
					sinRepetir.remove(c);
				} else if (!repetidos.contains(c))
					sinRepetir.add(c);
			}
		System.out.println("Caracteres sin repetir: " + sinRepetir);
		System.out.println("Caracteres repetidos " + repetidos);
	}

}
