package com.tiburcio.example.pruebas;

//@Entity
public class Ciclo {
	int PK_ID;
	String nombre;
	String abreviatura;

	public int getPK_ID() {
		return PK_ID;
	}
	public void setPK_ID(int pK_ID) {
		PK_ID = pK_ID;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
}
