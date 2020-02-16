package br.com.aluno.datasource.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "aluno")
@Data
public class Aluno implements Serializable {
	

	private static final long serialVersionUID = 4365261870168373988L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private LocalDate idade;
	
	

	public Aluno() {
	}
	
	
	

}
