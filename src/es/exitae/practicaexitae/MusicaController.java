package es.exitae.practicaexitae;

import java.util.List;
import java.util.Scanner;

public class MusicaController {
	
	/**
	 * Muestra un listado de discos. 
	 */
	public static void listar() {
		for (Musica musica: Musica.getCollection()) {
			System.out.println("Código: " + musica.getCodigo());
		}
	}
	
	/**
	 * Añade un disco al listado. 
	 */
	static void crear() {
		Scanner reader = new Scanner(System.in);
		Musica musica = new Musica();		
		System.out.print("Introduzca el título de la obra: ");
		musica.setTitulo(reader.next());		
		System.out.println("Seleccione el formato de la obra: ");
		System.out.println("\t1. CD");
		System.out.println("\t2. VINILO");
		System.out.println("\t3. CASETE");
		musica.setFormato(reader.nextInt());
		musica.crear();				
		System.out.println("Se ha asignado el identificador " + musica.getCodigo());
	}
	
	/**
	 * Elimina un disco del listado. 
	 * @param codigo
	 */
	static void eliminar(int codigo) {		
		Musica musica = Musica.get(codigo);				
		if (musica != null) {		
			System.out.println(String.format("Música %s eliminada", codigo));
			musica.eliminar();
		}		
	} 
		
}
