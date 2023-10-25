package com.bytecode.core.model;

public class Post {
	private int IdPost;
	private String Titulo;
	private String Slug;
	private String Extracto;
	private int IdUsuario;
	private int Categoria;
	private String ImagenDestacada;
	private String Tipo;
	public int getIdPost() {
		return IdPost;
	}
	public void setIdPost(int idPost) {
		IdPost = idPost;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getSlug() {
		return Slug;
	}
	public void setSlug(String slug) {
		Slug = slug;
	}
	public String getExtracto() {
		return Extracto;
	}
	public void setExtracto(String extracto) {
		Extracto = extracto;
	}
	public int getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}
	public int getCategoria() {
		return Categoria;
	}
	public void setCategoria(int categoria) {
		Categoria = categoria;
	}
	public String getImagenDestacada() {
		return ImagenDestacada;
	}
	public void setImagenDestacada(String imagenDestacada) {
		ImagenDestacada = imagenDestacada;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
}
