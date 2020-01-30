package br.com.PedroDRM.Alunos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.PedroDRM.Alunos.model.Alunos;
import br.com.PedroDRM.Alunos.service.IAlunoService;

@RestController
@CrossOrigin("*")
public class AlunosController {

	@Autowired
	private IAlunoService serve;

	@PostMapping("/aluno/novo")
	public ResponseEntity<Alunos> addAluno(@RequestBody Alunos aluno){
		serve.adicionaAluno(aluno);
		return ResponseEntity.ok(aluno);
	}
	
	@PutMapping("/aluno/atualizar")
	public ResponseEntity<Alunos> upAluno(@RequestBody Alunos aluno){
		serve.adicionaAluno(aluno);
		return ResponseEntity.ok(aluno);
	}
	
	@GetMapping("/aluno")
	public ResponseEntity<List<Alunos>> mostrarTodos() {
		return ResponseEntity.ok(serve.recuperaTodos());
	}

	@GetMapping("/aluno/{ra}")
	public ResponseEntity<Alunos> mostrarPeloId(@PathVariable int ra) {
		Alunos a = serve.recuperaPorId(ra);
		if (a != null) {
			return ResponseEntity.ok(a);
		}
		return ResponseEntity.badRequest().build();
	}
}