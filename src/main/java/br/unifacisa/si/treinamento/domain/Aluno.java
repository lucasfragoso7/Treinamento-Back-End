package br.unifacisa.si.treinamento.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Aluno {
	@Id
	private String id;
	private String nome;
	private long matricula;

	public Aluno() 
	{
		
	}
}
