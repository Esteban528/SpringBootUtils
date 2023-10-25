package com.bytecode.core.model;

import java.util.Date;

public class Categoria {
	private int IdCategoria;
	private String Nombre;
	private String Descripcion;
	private Date Fecha;
	private int  CategoriaSuperior;
	public int getIdCategoria() {
		return IdCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		IdCategoria = idCategoria;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	public int getCategoriaSuperior() {
		return CategoriaSuperior;
	}
	public void setCategoriaSuperior(int categoriaSuperior) {
		CategoriaSuperior = categoriaSuperior;
	}
	
	
}
