package es.exitae.practicaexitae;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * TienaMusica
 * @author nau
 *
 */
public class TiendaMusica {
	private static String[] cmd;
	
	public enum Instruccion {
		CREAR, LISTAR, ELIMINAR, CERRAR
	}
	public enum Objeto {
		CLIENTE, MUSICA, VENTA	
	}
	//public enum Formato {
	//	CD, VINILO, CASETE		
	//}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean cerrar = false;
		
		TiendaMusica.printHelp();
		while (!cerrar) {
			System.out.print("Esperando instrucción... ");
			
			try {
				cmd = br.readLine().split(" ");
				Instruccion instruccion = Instruccion.valueOf(cmd[0].toUpperCase());				
				if (instruccion == Instruccion.LISTAR) {
					TiendaMusica.listar();
				} else if (instruccion == Instruccion.CREAR) {
					TiendaMusica.crear();
				} else if (instruccion == Instruccion.ELIMINAR) {
					TiendaMusica.eliminar();
				} else if (instruccion == Instruccion.CERRAR) {
					cerrar = true;
				}
			} catch (Exception e) {
				System.out.println("Instrucción no reconocida");
			}
		}
		
		System.out.println("Cerrando aplicación...");
	}
	
	/**
	 * 
	 */
	private static void listar() {
		try {
			Objeto objeto = Objeto.valueOf(cmd[1].toUpperCase());			
			if (objeto == Objeto.CLIENTE) {
				ClientesController.listar();
			} else if (objeto == Objeto.MUSICA) {
				MusicaController.listar();
			} else if (objeto == Objeto.VENTA) {
				//VentasController.listar();
			}
		} catch (Exception e) {
			System.out.println("Debe especificar el tipo de objeto. Ej: listar cliente|musica|venta");
		}
	}
	
	/**
	 * 
	 */
	private static void crear() {					
		try {
			Objeto objeto = Objeto.valueOf(cmd[1].toUpperCase());			
			if (objeto == Objeto.CLIENTE) {
				ClientesController.crear();
			} else if (objeto == Objeto.MUSICA) {
				MusicaController.crear();
			} else if (objeto == Objeto.VENTA) {
				//VentasController.crear();
			}
		} catch (Exception e) {
			System.out.println("Debe especificar el tipo de objeto. Ej: crear cliente|musica|venta");
		}
	}
	
	/**
	 * 
	 */
	private static void eliminar() {
		try {
			Objeto objeto = Objeto.valueOf(cmd[1].toUpperCase());
						
			if (cmd.length ==2) {			
				System.out.print("Por favor especifique el código del elemento que esea eliminar: ");
				Scanner reader = new Scanner(System.in);
				cmd[2] = reader.next();
			}
			
			int codigo = Integer.parseInt(cmd[2]);
			
			if (objeto == Objeto.CLIENTE) {
				ClientesController.eliminar(codigo);
			} else if (objeto == Objeto.MUSICA) {
				MusicaController.eliminar(codigo);
			} else if (objeto == Objeto.VENTA) {
				//VentasController.eliminar();
			}
		} catch (Exception e) {
			System.out.println("Debe especificar el tipo de objeto. Ej: crear cliente|musica|venta");
			System.out.println(e.getMessage());
		}						
	}
	
	/**
	 * Prints program usage. 
	 */
	private static void printHelp() {
		System.out.println("Instrucciones disponibles:");
		System.out.println("\tcrear\t\tcliente|musica|venta");
		System.out.println("\tlistar\t\tcliente|musica|venta");
		System.out.println("\teliminar\tcliente|musica|venta\t[codigo]");
		System.out.println("\tcerrar\n");		
	}
	
}
