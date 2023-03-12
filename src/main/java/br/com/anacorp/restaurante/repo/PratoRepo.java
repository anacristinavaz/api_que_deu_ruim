package br.com.anacorp.restaurante.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.anacorp.restaurante.model.Prato;

@Repository 
public interface PratoRepo extends CrudRepository<Prato, Integer>{
	public ArrayList<Prato> findByCodCategoria(int codigo);
	public ArrayList<Prato> findByOrderByCodCategoria();
	public Prato findByNomePrato();
}
