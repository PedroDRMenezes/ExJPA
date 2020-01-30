package br.com.PedroDRM.Alunos.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.PedroDRM.Alunos.model.Alunos;

public interface AlunoRepo  extends CrudRepository<Alunos, Integer> {

}
