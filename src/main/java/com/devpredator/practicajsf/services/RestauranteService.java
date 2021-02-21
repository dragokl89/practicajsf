/**
 * 
 */
package com.devpredator.practicajsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.practicajsf.entity.Gerente;
import com.devpredator.practicajsf.entity.Restaurante;

/**
 * @author c-ado
 *
 */
public class RestauranteService {
public List<Restaurante> consultarRestaurante (){
	Gerente gerente = new Gerente ("Carlos","Orbe","intriago");
	
	List <Restaurante> restaurantes = new ArrayList <>();
	Restaurante kfc = new Restaurante("kfc","La Colon","Ecuador",gerente);
	Restaurante mcdonald = new Restaurante("mcdonald","La Amazonas","Ecuador",gerente);
	Restaurante mazorca = new Restaurante("mazorca","Carcelen","Ecuador",gerente);
	
	restaurantes.add(mazorca);
	restaurantes.add(kfc);
	restaurantes.add(mcdonald);
	
	
	return restaurantes;
}

}
