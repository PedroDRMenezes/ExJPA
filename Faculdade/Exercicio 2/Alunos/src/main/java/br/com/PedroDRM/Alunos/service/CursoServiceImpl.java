package br.com.PedroDRM.Alunos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.PedroDRM.Alunos.DAO.CursoRepo;
import br.com.PedroDRM.Alunos.model.Curso;

@Component
public class CursoServiceImpl implements ICursoService{

	@Autowired
	private CursoRepo repo;
	
	@Override
	public void adicionaCurso(Curso curso) {
		repo.save(curso);
	}

	@Override
	public List<Curso> recuperaTodos() {
		return (List<Curso>)repo.findAll();
	}

	@Override
	public Curso recuperaPorId(int id) {
		return repo.findById(id).orElse(null);
	}
	

}
