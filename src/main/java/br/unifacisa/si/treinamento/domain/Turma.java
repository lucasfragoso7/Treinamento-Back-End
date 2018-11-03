package br.unifacisa.si.treinamento.domain;
import java.util.ArrayList;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import br.unifacisa.si.treinamento.interfaces.*;;

@Document
public class Turma implements  Contrato {
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public ArrayList<Aluno> getAlunos() {
		return Alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		Alunos = alunos;
	}

	public short getPeriodo() {
		return periodo;
	}

	public void setPeriodo(short periodo) {
		this.periodo = periodo;
	}

	
}
