package com.PedroCorp.VitrineVirtual.DAO;

import org.springframework.data.repository.CrudRepository;

import com.PedroCorp.VitrineVirtual.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Integer> {

}
