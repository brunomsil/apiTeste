package br.com.aluno.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aluno.datasource.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	

}
