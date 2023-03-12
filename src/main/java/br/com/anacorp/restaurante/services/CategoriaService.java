package br.com.anacorp.restaurante.services;

import java.util.ArrayList;
import br.com.anacorp.restaurante.model.Categoria;

public interface CategoriaService {
	public ArrayList<Categoria> recuperarTodos();
	public Categoria recuperarPorCodigo(int codigo);
	public Categoria adicionarCategoria(Categoria c);
	
}
