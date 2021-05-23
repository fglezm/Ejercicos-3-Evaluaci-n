package unidad8_e_s;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Acceso_fichero_Buffer {

	public static void main(String[] args) {

		Leer_Fichero accediendo = new Leer_Fichero();
		accediendo.lee();

	}

}

class Leer_Fichero {

	public void lee() {
		try {
			FileReader entrada = new FileReader("C:\\Users\\fglezm\\Documents\\FP\\Programación/El Quijote UTF-8.txt");
//almacenamos en una memeoria intermedia el fichero de texto

			BufferedReader mibuffer = new BufferedReader(entrada);
			String linea = "";
			// lee mientras haya linea
			while (linea != null) {
				linea = mibuffer.readLine();
				if (linea != null)
					System.out.println(linea);

			}

			entrada.close();
		} catch (IOException e) {
			System.out.println("No se ha encontrado el archivo");
		}
	}

}
