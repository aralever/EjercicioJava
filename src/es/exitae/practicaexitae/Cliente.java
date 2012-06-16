package es.exitae.practicaexitae;

public class Cliente {
	private int codigo;
	private String nombre;
	private String apellidos;
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
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
