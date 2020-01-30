package br.com.PedroDRM.Alunos.service;

import java.util.List;

import br.com.PedroDRM.Alunos.model.Curso;

public interface ICursoService {
	
	public void adicionaCurso(Curso curso);
	public List<Curso> recuperaTodos();
	public Curso recuperaPorId(int id);
	
}
