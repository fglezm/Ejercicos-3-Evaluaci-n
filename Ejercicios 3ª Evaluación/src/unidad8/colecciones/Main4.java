package unidad8.colecciones;

/*
 * dadas varias secuencias de números enteros elimina una determinada 
 * cantidad máxima de elementos, elegida con el algoritmo se recorre 
 * desde el principio la secuencia y si se encuentra un número menor
 * que el siguiente se elimina y finaliza el proceso Si llega al final
 * sin encontrar un número menor que el siguiente se elimina el último
 * La entrada de datos se hace por teclado, primero el num de secuencias
 * despues los datos de cada secuencia primeor el num de elementos y 
 * luego el num de elementos a borrar y seguido la lista
 */

import java.util.*;
import java.util.List;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		List<Integer> lista = new LinkedList<Integer>();
		int s = in.nextInt();
		for (int i = 0; i < s; i++) {
			int n = in.nextInt();
			int k = in.nextInt();
			for (int j = 0; j < n; j++) {
				borrarElemento(lista);
				lista.clear();
			}
			in.close();
		}
	}

	private static void borrarElemento(List<Integer> lista) {
		// TODO Auto-generated method stub
		ListIterator<Integer> i = lista.listIterator();
		if (i.hasNext())
			;
		int a = i.next();
		while (i.hasNext()) {
			int b = i.next();
			if (a < b) {
				i.previous();
				i.previous();
				i.remove();
				return;
			} else
				a = b;
		}
		i.remove();
	}
}
