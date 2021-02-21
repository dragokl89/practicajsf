/**
 * 
 */
package com.devpredator.practicajsf.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.practicajsf.entity.Restaurante;
import com.devpredator.practicajsf.services.RestauranteService;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

/**
 * @author c-ado
 *
 */
@ManagedBean(name = "restaurante")
@ViewScoped
public class RestauranteController {
	private List<Restaurante> restaurantes = new ArrayList<>();
	private RestauranteService restauranteServicio = new RestauranteService();

@PostConstruct
	public void init() {
	consultarEmpleados () ;
	}

	private void consultarEmpleados() {
		this.restaurantes = restauranteServicio.consultarRestaurante();

	}

	/**
	 * @return the restaurantes
	 */
	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	/**
	 * @param restaurantes the restaurantes to set
	 */
	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}
}
