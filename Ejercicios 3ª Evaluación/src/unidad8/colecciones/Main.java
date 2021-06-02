package unidad8.colecciones;

/*
 * programa que simule la ejecución organizada de una serie de procesos que se identifican
 * con un num entero de 1 a N siendo N el num de procesos.Los datos de entrada son:
 * El num N de procesos
 * Los N pares de procesos e id
 * Los N id en el orden ideal
 */
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Queue<Proceso> procesos = new LinkedList<Proceso>();
		for (int i = 0; i < n; i++)
			procesos.add(new Proceso(s.next(), s.nextInt()));
		Queue<Integer> ideal = new LinkedList<Integer>();
		for (int i = 0; i < n; i++)
			ideal.add(s.nextInt());
		int esperado;
		Proceso proceso;
		while (!procesos.isEmpty()) {
			proceso = procesos.poll();
			esperado = ideal.poll();
			while (proceso.getId() != esperado) {
				procesos.add(proceso);
				proceso = procesos.poll();
			}
			proceso.ejecutar();
		}
	}

}
