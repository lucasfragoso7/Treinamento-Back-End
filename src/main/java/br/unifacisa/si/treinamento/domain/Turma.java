package br.unifacisa.si.treinamento.domain;
import java.util.ArrayList;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Turma {
	@Id
	private String id;
	@DBRef
	private Sala sala;
	@DBRef
	private ArrayList<Aluno> Alunos = new ArrayList<Aluno>();
	
	private short periodo;
	
	public Turma() 
	{
		
	}

}
