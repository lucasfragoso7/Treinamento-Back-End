package br.unifacisa.si.treinamento.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.unifacisa.si.treinamento.interfaces.Contrato;



@Document
public class Aluno implements  Contrato {
	@Id
	private String id;
	private String nome;
	private long matricula;
	private String curso;

	public Aluno(){}
	
	public Aluno(long matricula,String nome) 
	{
		this.matricula = matricula;
		this.nome =  nome;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getNome() {
		return nome;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	public long getMatricula() 
	{
		return matricula;
	}
	public void setNome (String nome) 
	{
		this.nome = nome;
	}
}
