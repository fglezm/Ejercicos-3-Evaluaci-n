package unidad8.colecciones;

import java.util.Scanner;
import java.util.Collection;
import java.util.LinkedHashSet;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Collection<String> lista = new LinkedHashSet<>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i=0;i<n;i++) {
			String nombre = in.next();
			if (!lista.contains(nombre))
				lista.add(nombre);
		}
		System.out.println(lista);
		in.close();
	}

}
