package unidad8.colecciones;

import java.util.*;

public class CuentasUsuarios {

	public static void main(String[] args) {
		// creamos cuatro objetos tipo Cliente

		Cliente cl1 = new Cliente("Antonio Banderas", "00001", 200000);

		Cliente cl2 = new Cliente("Rafael Nadal", "00002", 250000);

		Cliente cl3 = new Cliente("Penépole Cruz", "00003", 300000);

		Cliente cl4 = new Cliente("Julio Iglesias", "00004", 500000);

		Cliente cl5 = new Cliente("Antonio Banderas", "00001", 200000);

		// creamos la colección
		Set<Cliente> clientesBanco = new HashSet<Cliente>();

		// añadimos clientes a la colección
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);

		//eliminamos un objeto de la colección
		
		Iterator<Cliente> it = clientesBanco.iterator();

		while (it.hasNext()) {

			String nombre_cliente = it.next().getNombre();

			if (nombre_cliente.equals("Julio Iglesias")) {

				it.remove();
			}
		}

		// listamos con un bucle for each

		for (Cliente cliente : clientesBanco) {

			System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo());

		}

		// iterador para recorrer la colección
		/*
		 * Iterator<Cliente> it = clientesBanco.iterator();
		 * 
		 * while (it.hasNext()) {
		 * 
		 * String nombre_cliente = it.next().getNombre();
		 * System.out.println(nombre_cliente); }
		 */

	}

}
