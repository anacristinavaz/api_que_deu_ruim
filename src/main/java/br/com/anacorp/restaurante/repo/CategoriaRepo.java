package br.com.anacorp.restaurante.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.anacorp.restaurante.model.Categoria;

@Repository
public interface CategoriaRepo extends CrudRepository<Categoria, Integer>{
	public ArrayList<Categoria> findByOrderByNomeCategoria();
	public Categoria findByCodCategoria();
}
