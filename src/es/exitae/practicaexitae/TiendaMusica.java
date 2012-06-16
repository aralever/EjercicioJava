package es.exitae.practicaexitae;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * TienaMusica
 * @author nau
 *
 */
public class TiendaMusica {
	private static Scanner reader;
	public enum Instruccion {
		CREAR, 
		LISTAR, 
		ELIMINAR, 
		CIERRE
	};
	public enum Formato {
		CD, VINILO, CASETE		
	};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TiendaMusica.reader = new Scanner(System.in);		
		Instruccion instruccion;		
		boolean cierre = false;
		
		TiendaMusica.printHelp();
		
		while (!cierre) {
			System.out.print("Esperando instrucción...");
			instruccion = Instruccion.valueOf(reader.next().toUpperCase());
			
			switch (instruccion) {		
			case CREAR:
				TiendaMusica.crear(reader.next());					
				break;
			
			case LISTAR:
				TiendaMusica.listar(reader.next());
				break;
			
			case ELIMINAR:
				TiendaMusica.eliminar(reader.next());
				// @todo Preguntar código si no se ha especificado
				break;
						
			case CIERRE: 
				cierre = true;
				break;
				
			default:
				System.out.println("instrucción no reconocida");
			}
			
		}		
	}
	
	private void crear() {
		/*reader.next().toUpperCase();
		switch () {
		case CLIENTE:
			TiendaMusica.addCliente();
			break;
		case MUSICA:
			TiendaMusica.addMusica();
		}*/
	}
	
	private void listar() {
		/*reader.next().toUpperCase();
		switch () {
		case CLIENTE:
			TiendaMusica.addCliente();
			break;
		case MUSICA:
			TiendaMusica.addMusica();
		}*/
	}
	
	private void eliminar() {
		/*reader.next().toUpperCase();
		switch () {
		case CLIENTE:
			TiendaMusica.addCliente();
			break;
		case MUSICA:
			TiendaMusica.addMusica();
		}*/
	}
	
	private static void printHelp() {
		System.out.println("Instrucciones disponibles:");
		System.out.println("\tcrear \"cliente\"|\"musica\"|\"venta\"");
		System.out.println("\tlistar \"cliente\"|\"musica\"|\"venta\"");
		System.out.println("\teliminar \"cliente\"|\"musica\"|\"venta\"");
		System.out.println("\tcerrar\n");		
	}
	
}
