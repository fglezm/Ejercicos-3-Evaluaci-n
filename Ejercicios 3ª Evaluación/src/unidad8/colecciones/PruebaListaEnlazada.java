package unidad8.colecciones;

import java.util.*;

public class PruebaListaEnlazada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> países = new LinkedList<String>();

		países.add("España");
		países.add("Colombia");
		países.add("México");
		países.add("Perú");

		LinkedList<String> capitales = new LinkedList<String>();

		capitales.add("Madrid");
		capitales.add("Bogotá");
		capitales.add("DF");
		capitales.add("Lima");

		// System.out.println(países);
		// System.out.println(capitales);

		// Iterar para incluir en la primera lista las capitales en orden

		ListIterator<String> iterA = países.listIterator();
		ListIterator<String> iterB = capitales.listIterator();

		while (iterB.hasNext()) {

			if (iterA.hasNext()) {

				iterA.next();

			}

			iterA.add(iterB.next());

		}

		System.out.println(países);

		// hacemos que el iterador vuelva a la posición inicial
		iterB = capitales.listIterator();

		while (iterB.hasNext()) {

			iterB.next();

			if (iterB.hasNext()) {

				iterB.next();

				iterB.remove();
			}
		}

		System.out.println(capitales);
		
		países.removeAll(capitales);
		
		System.out.println(países);
	}

}
