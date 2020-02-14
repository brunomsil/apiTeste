package br.com.aluno.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AlunoResource {
	
	@JsonProperty("nome_aluno")
	private String nome;
	
	@JsonProperty("idade_aluno")
	private String idade;
	
	public AlunoResource(String nome, String idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}


	@Override
	public String toString() {
		return "AlunoResource [nome=" + nome + ", idade=" + idade + "]";
	}
	
	
	
	
	

}
