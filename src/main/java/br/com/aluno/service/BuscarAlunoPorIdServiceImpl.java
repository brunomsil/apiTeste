package br.com.aluno.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aluno.datasource.model.Aluno;
import br.com.aluno.exception.AlunoNotFoundException;
import br.com.aluno.repository.AlunoRepository;

@Service
public class BuscarAlunoPorIdServiceImpl {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	public Aluno buscarPorId(Long id) throws AlunoNotFoundException {
		Optional<Aluno> optionalAluno = getOptional(id);
		
		Aluno aluno = null;
		if(!optionalAluno.isPresent()) {
			throw new AlunoNotFoundException("Aluno não encontrado através do ID: " + id);			
		} else {
			aluno = optionalAluno.get();
		}
		
		return aluno;
	}

	private Optional<Aluno> getOptional(Long id) {
		Optional<Aluno> optionalAluno =  alunoRepository.findById(id);
		return optionalAluno;
	}
	
	public void deletarPorId(Long id) throws AlunoNotFoundException {
		Optional<Aluno> optionalAluno = getOptional(id);
		if(!optionalAluno.isPresent()) {
			throw new AlunoNotFoundException("Aluno não encontrado através do ID: " + id);			
		}else {
			alunoRepository.delete(optionalAluno.get());
		}

	}

}
