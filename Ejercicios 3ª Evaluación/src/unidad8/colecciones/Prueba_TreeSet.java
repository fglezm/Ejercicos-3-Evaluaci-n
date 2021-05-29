package unidad8.colecciones;

import java.util.*;

public class Prueba_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*TreeSet<String> ordenaPersonas= new TreeSet<String>();
		
		ordenaPersonas.add("Sandra");
		
		ordenaPersonas.add("Amanda");
		
		ordenaPersonas.add("Diana");
		
		for(String s:ordenaPersonas) {
			
			System.out.println(s);
			
		}*/
	
		Articulo primero=new Articulo(1, "Primer Articulo");
		Articulo segundo=new Articulo(2, "Segundo Articulo");
		Articulo tercer=new Articulo(3, "Tercer Articulo");
	
		TreeSet<Articulo> ordenaArticulos=new TreeSet<Articulo>();
		
		ordenaArticulos.add(tercer);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		
		for(Articulo art:ordenaArticulos) {
			
			System.out.println(art.getDescripcion());
			
		}
	}

}

class Articulo implements Comparable<Articulo>{
	
	public Articulo(int num, String desc) {
		
		numero_articulo=num;
		
		descripcion=desc;
		
	}
	
	@Override
	public int compareTo(Articulo o) {
		// TODO Auto-generated method stub
		return numero_articulo - o.numero_articulo;
	}
	
	public String getDescripcion(){
		
		return descripcion;
		
	}
	
	private int numero_articulo;
	
	private String descripcion;
	
}