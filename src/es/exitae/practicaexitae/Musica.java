package es.exitae.practicaexitae;

public class Musica extends Model {
	private String titulo;
	private int formato; 
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setFormato(int formato) {
		this.formato = formato;
	}
	
	public int getFormato() {
		return this.formato;
	}
	
	public String printFormato() {
		switch(this.getFormato()) {
		case 1: 
			return "CD";
		case 2: 
			return "VINILO";
		case 3: 
			return "CASETE";
		default:
			return "";
		}
	}
	
}
