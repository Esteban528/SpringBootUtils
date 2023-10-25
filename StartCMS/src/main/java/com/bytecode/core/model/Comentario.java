package com.bytecode.core.model;

import java.util.Date;

public class Comentario {
	private int IdComentario;
	private String Comentario;
	private int IdPost;
	private int IdUsuario;
	private Date Fecha;
	private String Respuesta;
	
	public int getIdComentario() {
		return IdComentario;
	}
	public void setIdComentario(int idComentario) {
		IdComentario = idComentario;
	}
	public String getComentario() {
		return Comentario;
	}
	public void setComentario(String comentario) {
		Comentario = comentario;
	}
	public int getIdPost() {
		return IdPost;
	}
	public void setIdPost(int idPost) {
		IdPost = idPost;
	}
	public int getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	public String getRespuesta() {
		return Respuesta;
	}
	public void setRespuesta(String respuesta) {
		Respuesta = respuesta;
	}
	
	
} 
