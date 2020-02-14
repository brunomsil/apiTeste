package br.com.aluno.service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aluno.datasource.model.Aluno;
import br.com.aluno.exception.AlunoResourceException;
import br.com.aluno.repository.AlunoRepository;
import br.com.aluno.resource.model.AlunoResource;

@Service
public class CadastroAlunoServiceImpl {
	
	private static final Logger LOG = Logger.getLogger(CadastroAlunoServiceImpl.class);

	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private AlunoConversor service;
	
	public void cadastro(AlunoResource alunoResource) {
		Aluno aluno = null;
		try {
			aluno = service.conversor(alunoResource);
			alunoRepository.saveAndFlush(aluno);
		} catch (AlunoResourceException e){
			LOG.error("Erro ao salvar o aluno: "+ e.getMessage(), e);
			
		}
	}
}
