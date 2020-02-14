package br.com.aluno.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aluno.datasource.model.Aluno;
import br.com.aluno.exception.AlunoNotFoundException;
import br.com.aluno.resource.model.AlunoResource;
import br.com.aluno.service.BuscarAlunoPorIdServiceImpl;
import br.com.aluno.service.BuscarAlunosServiceImpl;
import br.com.aluno.service.CadastroAlunoServiceImpl;

@RestController
@RequestMapping(value = "/api")
public class AlunoController {
	
	
	@Autowired
	private BuscarAlunosServiceImpl serviceBuscar;
	
	@Autowired
	private CadastroAlunoServiceImpl serviceCadastro;

	@Autowired
	private BuscarAlunoPorIdServiceImpl serviceBuscarPorId;
	
	
	@GetMapping(path = "/alunos")
	public List<Aluno> buscarAlunos() {
		return serviceBuscar.buscarTodosAlunos();	
	}
	
	@GetMapping(path = "/aluno/id/{id}")
	public Aluno buscarAlunoPorid(@PathVariable (name = "id", required = true )Long id) throws AlunoNotFoundException {
		return serviceBuscarPorId.buscarPorId(id);
	}
	
	@PostMapping(path = "aluno/save")
	public void salvarAluno(@RequestBody AlunoResource aluno) {
		serviceCadastro.cadastro(aluno);	
	}
	
	@DeleteMapping(path ="aluno/delte/id/{id}")
	public void deleteAluno(@PathVariable(name ="id", required = true) Long id) throws AlunoNotFoundException {
		serviceBuscarPorId.deletarPorId(id);
	}
}
