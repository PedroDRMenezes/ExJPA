package com.PedroCorp.VitrineVirtual.service;

import java.util.List;

import com.PedroCorp.VitrineVirtual.model.Produto;

public interface IProdutoService {
	
	public List<Produto> recuperaTodos();
	public Produto recuperaPorId(int id);
	
}
