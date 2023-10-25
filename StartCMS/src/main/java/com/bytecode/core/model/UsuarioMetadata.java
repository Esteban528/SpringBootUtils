package com.bytecode.core.model;

public class UsuarioMetadata {
	private long IdUsuarioMetadata;
	
	private int IdUsuario;
	
	private String Clave;
	
	private String Valor;
	
	private String Tipo;

	public long getIdUsuarioMetadata() {
		return IdUsuarioMetadata;
	}

	public void setIdUsuarioMetadata(long idUsuarioMetadata) {
		IdUsuarioMetadata = idUsuarioMetadata;
	}

	public int getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}

	public String getClave() {
		return Clave;
	}

	public void setClave(String clave) {
		Clave = clave;
	}

	public String getValor() {
		return Valor;
	}

	public void setValor(String valor) {
		Valor = valor;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
	
}
