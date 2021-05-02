package unidad8.colecciones;

import java.util.Random;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 {

	public static void main(String[] args) {
		List<Integer> lista = new LinkedList<>();
		Random r = new Random();
		for (int i = 0; i < 100; i++)
			lista.add(r.nextInt(100) + 1);
		Iterator<Integer> in = lista.iterator();
		while (in.hasNext())
			System.out.print(in.next() + " ");
		System.out.println();

		Set<Integer> set1 = new HashSet<>(lista);
		for (Integer n : set1)
			System.out.print(n + " ");
		System.err.println();

		Set<Integer> set2 = new TreeSet<>(lista);
		set2.forEach(n -> System.out.print(n + " "));
	}

}
