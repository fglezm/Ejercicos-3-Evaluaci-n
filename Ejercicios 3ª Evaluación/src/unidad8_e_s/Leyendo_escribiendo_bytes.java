package unidad8_e_s;

import java.io.*;

public class Leyendo_escribiendo_bytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// para saber cuantos bytes

		int contador = 0;

		// creamos un array para almacenar la información

		int datos_entrada[] = new int[116823];

//instanciamos la clase FileInputStream

		try {

			FileInputStream archivo_lectura = new FileInputStream(
					"C:/Users/fglezm/Documents/FP/Programación/DSC02332.jpg");
			boolean final_ar = false;
			while (!final_ar) {
				int byte_entrada = archivo_lectura.read();
				if (byte_entrada != -1) // para que no guarde el -1 que indica el final en el array
					datos_entrada[contador] = byte_entrada;
				else
					final_ar = true;
				System.out.println(datos_entrada[contador]);

				contador++;
			}
			archivo_lectura.close();
		} catch (IOException e) {
		}
		System.out.println(contador);
	}

}
