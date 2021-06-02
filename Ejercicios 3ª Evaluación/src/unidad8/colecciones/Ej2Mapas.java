package unidad8.colecciones;

import java.io.*;
import java.util.*;

/*
 * Programa que lea de la entrada estándar dos o más líneas de texto
 * La primera línea ha de contener el número de líneas que le siguen
 * A medida que va leyendo el resto de las líneas tendrá que ir almacenando, sin que se repitan
 * las palabras que contiene cada una de ellas en diferentes colecciones 
 * Cada colección ha de contener palabras de una longitud determinada y se creará unicamente
 * cuando se necesite
 * Las colecciones de palabras se han de almacenar a su vez en una estructura de datos que 
 * permitar recuperarlas fácilmente
 * Para poner a prueba la estructura de datos crada, el programa leerá de la entrada estándar
 * longitudes y mostrará la lista de palabras de cada una o null si no hay palabras de dicha 
 * longitud 
 * Finalizará cuando se introduzca una longitud menos que 1
 * Este problema se puede resolver con un mapa en el que las claves son una longitud de palabra y
 * los elementos una colección de palabras de dicha longitud
 * El mapa puede ser un HashMap (no es necesario orden por la clave)
 * la coleccion un TreeSet (para mostrar por orden alfabético) 
 */

public class Ej2Mapas {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, TreeSet<String>> mapa = new HashMap<Integer, TreeSet<String>>();
		System.out.println("Líneas: ");
		int n = Integer.valueOf(br.readLine());
		for (int i = 0; i < n; i++) {
			Scanner s = new Scanner(br.readLine());
			while (s.hasNext())
				agregarPalabra(mapa, s.next());
		}
		int longitud;
		do {
			System.out.println("Longitud: ");
			longitud = Integer.valueOf(br.readLine());
			if (longitud > 0)
				System.out.println(mapa.get(longitud));
		} while (longitud > 0);
	}

	static void agregarPalabra(Map<Integer, TreeSet<String>> mapa, String palabra) {
		// TODO Auto-generated method stub
		int longitud = palabra.length();
		TreeSet<String> set = mapa.get(longitud);
		if (set == null) {
			set = new TreeSet<String>();
			mapa.put(longitud, set);
		}
		set.add(palabra);
	}
}
