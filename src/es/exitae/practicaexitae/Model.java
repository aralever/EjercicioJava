package es.exitae.practicaexitae;

import java.util.List;
import java.util.ArrayList;

public class Model {
	private static int auto_id = 0;	
	private static List<Model> elements;
	private int id;
	
	/**
	 * Añade un elemento al listado. 
	 */
	public void crear() {
		if (Model.elements == null) {
			Model.elements = new ArrayList<Model>();
		}
		
		this.id = ++Model.auto_id;		
		Model.elements.add(this);
	}
	
	/**
	 * Elimina un elemento del listado. 
	 */
	public void eliminar() {
		Model.elements.remove(this);
	}
	
	/**
	 * Devuelve un elemento del listado a partir del código.   
	 * @param codigo
	 * @return
	 */
	public static Model get(int codigo) {
		for (Model model: Model.elements) {
			if (model.getCodigo() == codigo) {
				return model;
			}
		}
		return null;				
	} 
	
	/**
	 * Devuelve un listado con todos los elementos. 
	 * @return
	 */
	public static List<Model> getCollection() {
		return Model.elements;
	}
	
	/**
	 * Setter/getter para el código del elemento. 
	 */
	public void setCodigo(int codigo) {
		this.id = codigo;
	}	
	public int getCodigo() {
		return this.id;
	}

}
