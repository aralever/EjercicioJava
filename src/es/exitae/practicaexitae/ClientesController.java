package es.exitae.practicaexitae;

import java.util.List;
import java.util.Scanner;

public class ClientesController {
	
	/**
	 * Muestra un listado de discos. 
	 */
	public static void listar() {
		List<Model> clientes = Cliente.getCollection();
		if (clientes.size() == 0) {
			System.out.println("No se han encontrado clientes.");
			return;
		}
		
		for (Model model: clientes) {
			Cliente cliente = (Cliente) model;
			System.out.println("Cliente: " + cliente.getCodigo() + " " + cliente.getNombre() + " " + cliente.getApellidos());
		}
	}
	
	/**
	 * Añade un cliente al listado. 
	 */
	public static void crear() {		
		Scanner reader = new Scanner(System.in);
		Cliente cliente = new Cliente();			
		System.out.print("Introduzca nombre: ");
		cliente.setNombre(reader.nextLine());			
		System.out.print("Introduzca apellidos: ");		
		cliente.setApellidos(reader.nextLine());
		cliente.crear();
		System.out.println("Su número de cliente es: " + cliente.getCodigo());
	}
	
	/**
	 * Elimina un cliente del listado. 
	 * @param codigo
	 */
	public static void eliminar(int codigo) {		
		Cliente cliente = (Cliente) Cliente.get(codigo);
		if (cliente == null) {
			System.out.println("No se ha encontrado el cliente con código " + codigo);
			return;
		}
		
		cliente.eliminar();
		System.out.println(String.format("Cliente %s eliminado", codigo));
	}
	
}
