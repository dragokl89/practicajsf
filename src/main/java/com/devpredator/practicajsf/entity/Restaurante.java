/**
 * 
 */
package com.devpredator.practicajsf.entity;

/**
 * @author c-ado
 *
 */
public class Restaurante {
private String nombre ;
private String direccion;
private String pais;
private Gerente gerente ;
/**
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}
public Restaurante(String nombre, String direccion, String pais, Gerente gerente) {
	super();
	this.nombre = nombre;
	this.direccion = direccion;
	this.pais = pais;
	this.gerente = gerente;
}
/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}
/**
 * @return the direccion
 */
public String getDireccion() {
	return direccion;
}
/**
 * @param direccion the direccion to set
 */
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
/**
 * @return the pais
 */
public String getPais() {
	return pais;
}
/**
 * @param pais the pais to set
 */
public void setPais(String pais) {
	this.pais = pais;
}
/**
 * @return the gerente
 */
public Gerente getGerente() {
	return gerente;
}
/**
 * @param gerente the gerente to set
 */
public void setGerente(Gerente gerente) {
	this.gerente = gerente;
}
}
