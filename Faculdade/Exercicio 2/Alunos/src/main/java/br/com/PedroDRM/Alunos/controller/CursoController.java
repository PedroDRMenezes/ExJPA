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

import br.com.PedroDRM.Alunos.model.Curso;
import br.com.PedroDRM.Alunos.service.ICursoService;

@RestController
@CrossOrigin("*")
public class CursoController {
	
	@Autowired
	private ICursoService serve;
	
	@PutMapping("/curso/atualiza")
	public ResponseEntity<Curso> upCurso(@RequestBody Curso curso){
		serve.adicionaCurso(curso);
		return ResponseEntity.ok(curso);
	}
	
	@PostMapping("/curso/novo")
	public ResponseEntity<Curso> addCurso(@RequestBody Curso curso){
		serve.adicionaCurso(curso);
		return ResponseEntity.ok(curso);
	}
	
	@GetMapping("/curso")
	public ResponseEntity<List<Curso>> getAllCurso(){
		return ResponseEntity.ok(serve.recuperaTodos());
	}
	
	@GetMapping("/curso/{id}")
	public ResponseEntity<Curso> getCursoById(@PathVariable int id){
		 Curso c = serve.recuperaPorId(id);
		if(c != null){
			return ResponseEntity.ok(c);
		}
		return ResponseEntity.badRequest().build();
	}

}
