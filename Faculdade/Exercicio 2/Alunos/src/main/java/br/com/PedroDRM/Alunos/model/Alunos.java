package br.com.PedroDRM.Alunos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Tbl_Alunos")
public class Alunos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ra")
	private int ra;

	@Column(name = "nome", length = 100)
	private String nome;

	@Column(name = "telefone", length = 100)
	private String telefone;

	@ManyToOne
	@JsonIgnoreProperties("aluno")
	private Curso curso;

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
