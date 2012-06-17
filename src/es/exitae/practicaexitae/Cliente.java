package es.exitae.practicaexitae;

public class Cliente extends Model {	
	private String nombre;
	private String apellidos;
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
}
