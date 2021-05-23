package unidad8_e_s;

import java.io.*;

public class Acceso_Fichero {

	public static void main(String[] args) {

		Leer_Fichero accediendo = new Leer_Fichero();
		accediendo.lee();

	}

}

class Leer_Fichero {

	public void lee() {
		try {
			FileReader entrada = new FileReader("C:\\Users\\fglezm\\Documents\\FP\\Programación/El Quijote UTF-8.txt");

			int c = entrada.read();

			while (c != -1) {
				c = entrada.read();
				char letra = (char) c;
				System.out.print(letra);

			}
		} catch (IOException e) {
			System.out.println("No se ha encontrado el archivo");
		}
	}
}