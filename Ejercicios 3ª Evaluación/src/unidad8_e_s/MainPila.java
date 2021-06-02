package unidad8_e_s;

/*
 * Programa que lee por teclado una línea con varios números enteros separados por
 * espacios y los muestra en orden inverso 
 */

import java.util.*;
import java.io.*;

public class MainPila {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Deque<Integer> pila = new ArrayDeque<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Números: ");
		Scanner in = new Scanner(br.readLine());
		while (in.hasNextInt())
			pila.addFirst(in.nextInt());
		while (!pila.isEmpty())
			System.out.printf("%d ", pila.removeFirst());
		in.close();
	}

}
