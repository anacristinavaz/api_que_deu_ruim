package br.com.anacorp.restaurante.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.anacorp.restaurante.model.Categoria;
import br.com.anacorp.restaurante.services.CategoriaService;

@RestController
public class CategoriaController {
	@Autowired
	private CategoriaService servico;
	
	@GetMapping("/categoria")
	public ArrayList<Categoria> recuperarTodasCategorias(){
		return servico.recuperarTodos();
	}
	
	@GetMapping("/categoria/{codigo}")
	public ResponseEntity<Categoria> recuperarPorCodigo(@PathVariable int codigo) {
		Categoria c = servico.recuperarPorCodigo(codigo);
		if (c != null) {
			return ResponseEntity.ok(c);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/categoria")
	public ResponseEntity<?> adicipnarNova(@RequestBody Categoria nova){
		Categoria c = servico.adicionarCategoria(nova);
		if(c != null) {
			return ResponseEntity.ok(nova);
		}
		return ResponseEntity.notFound().build();
	}
	
}
