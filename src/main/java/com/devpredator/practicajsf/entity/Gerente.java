/**
 * 
 */
package com.devpredator.practicajsf.entity;

/**
 * @author c-ado
 *
 */
public class Gerente {
private String nombre;
private String primerApellido;
private String segundoApellido;
/**
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}
public Gerente(String nombre, String primerApellido, String segundoApellido) {
	super();
	this.nombre = nombre;
	this.primerApellido = primerApellido;
	this.segundoApellido = segundoApellido;
}
/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}
/**
 * @return the primerApellido
 */
public String getPrimerApellido() {
	return primerApellido;
}
/**
 * @param primerApellido the primerApellido to set
 */
public void setPrimerApellido(String primerApellido) {
	this.primerApellido = primerApellido;
}
/**
 * @return the segundoApellido
 */
public String getSegundoApellido() {
	return segundoApellido;
}
/**
 * @param segundoApellido the segundoApellido to set
 */
public void setSegundoApellido(String segundoApellido) {
	this.segundoApellido = segundoApellido;
}

}
