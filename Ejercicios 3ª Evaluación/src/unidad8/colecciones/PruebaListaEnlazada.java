package unidad8.colecciones;

import java.util.*;

public class PruebaListaEnlazada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> pa�ses = new LinkedList<String>();

		pa�ses.add("Espa�a");
		pa�ses.add("Colombia");
		pa�ses.add("M�xico");
		pa�ses.add("Per�");

		LinkedList<String> capitales = new LinkedList<String>();

		capitales.add("Madrid");
		capitales.add("Bogot�");
		capitales.add("DF");
		capitales.add("Lima");

		// System.out.println(pa�ses);
		// System.out.println(capitales);

		// Iterar para incluir en la primera lista las capitales en orden

		ListIterator<String> iterA = pa�ses.listIterator();
		ListIterator<String> iterB = capitales.listIterator();

		while (iterB.hasNext()) {

			if (iterA.hasNext()) {

				iterA.next();

			}

			iterA.add(iterB.next());

		}

		System.out.println(pa�ses);

		// hacemos que el iterador vuelva a la posici�n inicial
		iterB = capitales.listIterator();

		while (iterB.hasNext()) {

			iterB.next();

			if (iterB.hasNext()) {

				iterB.next();

				iterB.remove();
			}
		}

		System.out.println(capitales);
		
		pa�ses.removeAll(capitales);
		
		System.out.println(pa�ses);
	}

}
