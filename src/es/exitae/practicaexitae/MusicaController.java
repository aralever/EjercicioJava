package es.exitae.practicaexitae;

import java.util.List;
import java.util.Scanner;

public class MusicaController {
	
	/**
	 * Muestra un listado de discos. 
	 */
	public static void listar() {
		List<Model> collection = Musica.getCollection();
		if (collection.size() == 0) {
			System.out.println("No se han encontrado clientes.");
			return;
		}
		
		for (Model model: collection) {
			Musica musica = (Musica) model;
			System.out.println("Música: " + musica.getCodigo() + " " + musica.getTitulo() + " " + musica.printFormato());
		}
	}
	
	/**
	 * Añade un disco al listado. 
	 */
	static void crear() {
		Scanner reader = new Scanner(System.in);
		Musica musica = new Musica();		
		System.out.print("Introduzca el título de la obra: ");
		musica.setTitulo(reader.nextLine());		
		System.out.println("Seleccione el formato de la obra: ");
		System.out.println("\t1. CD");
		System.out.println("\t2. VINILO");
		System.out.println("\t3. CASETE");		
		while (!reader.hasNextInt()) {
			musica.setFormato(reader.nextInt());
		}
		musica.crear();
		System.out.println("Se ha asignado el identificador " + musica.getCodigo());
	}
	
	/**
	 * Elimina un disco del listado. 
	 * @param codigo
	 */
	static void eliminar(int codigo) {		
		Musica musica = (Musica) Musica.get(codigo);
		if (musica == null) {
			System.out.println("No se ha encontrado el disco con código " + codigo);
			return;
		}
				
		musica.eliminar();
		System.out.println(String.format("Música %s eliminada", codigo));
	} 
		
}
