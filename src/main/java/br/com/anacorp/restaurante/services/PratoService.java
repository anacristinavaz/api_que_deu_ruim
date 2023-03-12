package br.com.anacorp.restaurante.services;

import java.util.ArrayList;
import br.com.anacorp.restaurante.model.Categoria;
import br.com.anacorp.restaurante.model.Prato;

public interface PratoService {
	public Prato adicionarPrato(Prato p);
	public ArrayList<Prato> recuperarMenu();
	public Prato recuperarDetalhePrato(int codigo);
	public ArrayList<Prato> recuperarPorCategoria(Categoria c);
}
