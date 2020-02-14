package br.com.aluno.service;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import br.com.aluno.datasource.model.Aluno;
import br.com.aluno.exception.AlunoResourceException;
import br.com.aluno.resource.model.AlunoResource;

@Component
public class AlunoConversor {
	
	public Aluno conversor (AlunoResource alunoResource) throws AlunoResourceException {
		
		try {
			Aluno aluno = new Aluno();
			LocalDate idade = checkIdade(alunoResource.getIdade());
			aluno.setIdade(idade);
			aluno.setNome(alunoResource.getNome());
			
			return aluno;
			
		} catch(Exception e) {
			throw new AlunoResourceException("Falha ao converter o resource para entidade, resource: " + alunoResource);
		}
	}
	
	private LocalDate checkIdade (String idade) {
		return LocalDate.parse(idade);
	}
	
}
