package br.com.PedroDRM.Alunos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.PedroDRM.Alunos.DAO.AlunoRepo;
import br.com.PedroDRM.Alunos.model.Alunos;

@Component
public class AlunoServiceImpl implements IAlunoService {
	
	@Autowired
	private AlunoRepo repo;
	
	@Override
	public List<Alunos> recuperaTodos() {
		return (List<Alunos>)repo.findAll();
	}

	@Override
	public Alunos recuperaPorId(int ra) {
		return repo.findById(ra).orElse(null);
	}

	@Override
	public void adicionaAluno(Alunos aluno) {
		repo.save(aluno);
	}
}
