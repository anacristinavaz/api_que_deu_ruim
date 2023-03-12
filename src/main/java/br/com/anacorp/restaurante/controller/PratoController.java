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
import br.com.anacorp.restaurante.model.Prato;
import br.com.anacorp.restaurante.services.PratoService;

@RestController
public class PratoController {
	@Autowired
	private PratoService servico;
	
	@GetMapping("/menu")
	public ArrayList<Prato> recuperarMenu(){
		return servico.recuperarMenu();
	}
	
	@GetMapping("/prato/{codigo}")
	public ResponseEntity<Prato> recuperarDetalhePrato(@PathVariable int codigo) {
		Prato p = servico.recuperarDetalhePrato(codigo);
		if (p != null) {
			return ResponseEntity.ok(p);
		}
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/prato/categoria/{codigo}")
	public ResponseEntity<?> recuperarPratosCategoria(@PathVariable Categoria categoria){
		ArrayList<Prato> lista = servico.recuperarPorCategoria(categoria);
		if (lista != null) {
			return ResponseEntity.ok(lista);
		}return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/prato")
	public ResponseEntity<?> adicionarNovo(@RequestBody Prato p){
		Prato c = servico.adicionarPrato(p);
		if(c != null) {
			return ResponseEntity.ok(p);
		}
		return ResponseEntity.notFound().build();
	}
	
	
}
