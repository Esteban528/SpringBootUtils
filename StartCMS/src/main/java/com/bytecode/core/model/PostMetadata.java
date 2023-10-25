package com.bytecode.core.model;

public class PostMetadata {
	private int IdPostMetadata;
	
	private String Clave;
	
	private String Valor;
	
	private String Tipo;
	
	private int IdPost;

	public int getIdPostMetadata() {
		return IdPostMetadata;
	}

	public void setIdPostMetadata(int idPostMetadata) {
		IdPostMetadata = idPostMetadata;
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

	public int getIdPost() {
		return IdPost;
	}

	public void setIdPost(int idPost) {
		IdPost = idPost;
	}
}
