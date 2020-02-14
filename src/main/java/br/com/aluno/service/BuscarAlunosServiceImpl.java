package br.com.aluno.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aluno.datasource.model.Aluno;
import br.com.aluno.repository.AlunoRepository;

@Service
public class BuscarAlunosServiceImpl {
	
	@Autowired
	private AlunoRepository alunoRepository;

	public List<Aluno> buscarTodosAlunos(){
		List<Aluno> listaAlunos = alunoRepository.findAll();
		return listaAlunos;
		
	}

}
