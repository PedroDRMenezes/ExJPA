package com.PedroCorp.VitrineVirtual.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.PedroCorp.VitrineVirtual.model.Produto;
import com.PedroCorp.VitrineVirtual.service.IProdutoService;

@RestController
@CrossOrigin("*")
public class ProdutoController {
	
	@Autowired
	private IProdutoService servico;
	
	@GetMapping("/produto")
	public ResponseEntity<List<Produto>> mostrarTodos(){
		return ResponseEntity.ok(servico.recuperaTodos());
	}
	
	@GetMapping("/produto/{id}")
	public ResponseEntity<Produto> mostrarPeloId(@PathVariable int id){
		Produto p = servico.recuperaPorId(id);
		if(p!=null) {
			return ResponseEntity.ok(p);
		}
		return ResponseEntity.notFound().build();
		
	}
}
