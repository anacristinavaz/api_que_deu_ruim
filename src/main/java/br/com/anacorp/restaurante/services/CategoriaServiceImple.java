package br.com.anacorp.restaurante.services;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.anacorp.restaurante.model.Categoria;
import br.com.anacorp.restaurante.repo.CategoriaRepo;

@Component
public class CategoriaServiceImple implements CategoriaService {
	@Autowired
	private CategoriaRepo repo;
	
	@Override
	public ArrayList<Categoria> recuperarTodos() {
		return (ArrayList<Categoria>)repo.findAll();
	}

	@Override
	public Categoria recuperarPorCodigo(int codigo) {
		return repo.findById(codigo).orElse(null);
	}

	@Override
	public Categoria adicionarCategoria(Categoria c) {
		return repo.save(c);
	}

}
