package unidad8_e_s;

import java.util.*;
import java.io.*;

/* 
 * Programa que recibe a trav�s de un par�metro de l�nea de comando una ruta dentro del sistema de archivos y muestre en la consola la informaci�n siguiente:
 * Si existe el fichero o directorio referenciado
 * Si se trata de un fichero o de un directorio
 * Nombre del fichero o directorio y permisos de acceso
 * Si se trata de un fichero, debe de mostrar adem�s el tama�o del mismo
 */

public class Ejercicio1 {

	public static void main(String[] args) {

		File file;
		if (args.length == 0) {
			Scanner s = new Scanner(System.in);
			System.out.print("Ruta: ");
			file = new File(s.nextLine());
		} else
			file = new File(args[0]);
		if (file.exists()) {
			System.out.println("Nombre: " + file.getName());
			System.out.print("Tipo: ");
			if (file.isFile())
				System.out.println("fichero\nLongitud: " + file.length() + "bytes");
			else
				System.out.println("directorio\nContiene " + file.list().length + " elementos");
			System.out.println("Permisos: " + (file.canWrite() ? "escritura " : "") + (file.canRead() ? "lectura " : "")
					+ (file.canExecute() ? "ejecuci�n" : ""));
		} else
			System.out.println("El fichero o directorio no existe");
	}

}
