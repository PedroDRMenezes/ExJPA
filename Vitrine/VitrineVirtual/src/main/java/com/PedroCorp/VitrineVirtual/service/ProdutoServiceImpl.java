package com.PedroCorp.VitrineVirtual.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.PedroCorp.VitrineVirtual.DAO.ProdutoRepo;
import com.PedroCorp.VitrineVirtual.model.Produto;

@Component
public class ProdutoServiceImpl implements IProdutoService {
	
	@Autowired
	private ProdutoRepo repo;
	
	public List<Produto> recuperaTodos() {
		return (List<Produto>)repo.findAll();
	}

	public Produto recuperaPorId(int id) {
		return repo.findById(id).orElse(null);
	}

}
