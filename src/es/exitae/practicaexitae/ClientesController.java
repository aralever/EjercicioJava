package es.exitae.practicaexitae;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientesController {
	
	/**
	 * Muestra un listado de discos. 
	 */
	public static void listar() {
		for (Cliente cliente: Cliente.getCollection()) {
			System.out.println("Cliente: " + cliente.getCodigo());
		}
	}
	
	/**
	 * Añade un cliente al listado. 
	 */
	public static void crear() {		
		Scanner reader = new Scanner(System.in);
		Cliente cliente = new Cliente();			
		System.out.print("Introduzca nombre:");
		cliente.setNombre(reader.next());			
		System.out.print("Introduzca apellidos:");
		cliente.setApellidos(reader.next());		
		cliente.crear();
		System.out.println("Su número de cliente es: " + cliente.getCodigo());
	}
	
	/**
	 * Elimina un cliente del listado. 
	 * @param codigo
	 */
	public static void eliminar(int codigo) {		
		Cliente cliente = Cliente.get(codigo);		
		if (cliente != null) {		
			System.out.println(String.format("Cliente %s eliminado", codigo));
			cliente.eliminar();
		}		
	}
	
}
