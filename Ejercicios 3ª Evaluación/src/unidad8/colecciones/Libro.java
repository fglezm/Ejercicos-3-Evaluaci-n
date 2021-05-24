package unidad8.colecciones;

public class Libro {

	public Libro(String titulo, String autor, int ISBN) {

		this.titulo = titulo;

		this.autor = autor;

		this.ISBN = ISBN;

	}

	public String getDatos() {

		return "El título es: " + titulo + ". El autor es: " + autor + ". Y el ISBN es: " + ISBN;

	}
	
	//reescribimos el método equals
	public boolean equals(Object obj) {
		
		if(obj instanceof Libro) {
			
			//convertimos obj de tipo Object a tipo Libro
			
			Libro otro=(Libro)obj;
			
			if(this.ISBN==otro.ISBN) {
				
				return true;
				
			}else {
				
				return false;
			}
		
		}else {
			
			return false;
			
		}
		
	}

	private String titulo;

	private String autor;

	private int ISBN;

}
