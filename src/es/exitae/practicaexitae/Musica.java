package es.exitae.practicaexitae;

import java.util.List;



public class Musica extends Modelo {
	private static int codigo	=	0;	
	private static List<Musica> musica;
	
	private int codigo;
	private String titulo;
	private int formato; 
	
	/**
	 * 
	 */
	public void crear() {
		if (Musica.musica == null) {
			//Musica.musica = new ArrayList<Musica>();
			System.out.println("Musica.musica is null!");
		}		
		
		this.codigo = ++Musica.codigo;		
		Musica.musica.add(this);
	}
	
	/**
	 * 
	 */
	public void eliminar() {				
		System.out.println(String.format("Música %s eliminada", codigo));
		Musica.musica.remove(this);
	}
	
	/**
	 * Devuelve un objeto de tipo Musica del mismo código.  
	 * @param codigo
	 * @return
	 */
	public static Musica get(int codigo) {
		for (Musica musica: Musica.musica) {
			if (musica.getCodigo() == codigo) {
				return musica;
			}
		}
		return null;				
	} 
	
	/**
	 * Devuelve un listado con todos los elementos. 
	 * @return
	 */
	public static List<Musica> getCollection() {
		return Musica.musica;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
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
	
}
