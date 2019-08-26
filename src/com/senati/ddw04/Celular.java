package com.senati.ddw04;

public class Celular {
	//Atributos de la Clase
	int id;
	String modelo;
	float precio;
	//Constructor se emplea al momento de crear el objecto 
	//Este constructor recibe automaticamente los parametros 
	public Celular(int id, String modelo, float precio) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.precio = precio;
	}
	//Constructor que no recibe parametros
	public Celular() {
		super();
	}

	//Getters y Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Celular [id=" + id + ", modelo=" + modelo + ", precio=" + precio + "]";
	}
}
