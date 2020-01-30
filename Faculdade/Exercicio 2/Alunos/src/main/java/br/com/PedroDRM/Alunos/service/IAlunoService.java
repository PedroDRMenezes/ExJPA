package br.com.PedroDRM.Alunos.service;

import java.util.List;

import br.com.PedroDRM.Alunos.model.Alunos;

public interface IAlunoService {

	public void adicionaAluno(Alunos aluno);
	public List<Alunos> recuperaTodos();
	public Alunos recuperaPorId(int ra);
}
