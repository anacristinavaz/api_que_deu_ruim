package br.com.anacorp.restaurante.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.anacorp.restaurante.model.Categoria;
import br.com.anacorp.restaurante.model.Prato;
import br.com.anacorp.restaurante.repo.PratoRepo;

@Component
public class ProtoServiceImple implements PratoService{
	@Autowired
	private PratoRepo repo;
	
	@Override
	public Prato adicionarPrato(Prato p) {
		return repo.save(p);
	}

	@Override
	public ArrayList<Prato> recuperarMenu() {
		return (ArrayList<Prato>)repo.findByOrderByCodCategoria();
	}

	@Override
	public Prato recuperarDetalhePrato(int codigo) {
		return repo.findById(codigo).orElse(null);
	}

	@Override
	public ArrayList<Prato> recuperarPorCategoria(Categoria c) {
		return (ArrayList<Prato>)repo.findByCodCategoria(c.getCodCategoria());
	}
}
