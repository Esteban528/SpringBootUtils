package com.bytecode.core.model;

public class Usuario {
	private int IdUsuario;
	private String Nombre;
	private String apellido;
	private String Contrasena;
	private String Correo;
	
	private int IdGrupo;
	public int getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getContrasena() {
		return Contrasena;
	}
	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}
	public int getIdGrupo() {
		return IdGrupo;
	}
	public void setIdGrupo(int idGrupo) {
		IdGrupo = idGrupo;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	
	
}
