package br.unifacisa.si.treinamento.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.unifacisa.si.treinamento.interfaces.Contrato;



@Document
public class Sala implements  Contrato {
	
	@Id
	private String id;
	private Short capacidade;
	private Integer numero;
	private boolean disponibolidade;
	
	public Short getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Short capacidade) {
		this.capacidade = capacidade;
	}

	public boolean isDisponibolidade() {
		return disponibolidade;
	}

	public void setDisponibolidade(boolean disponibolidade) {
		this.disponibolidade = disponibolidade;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId()
	{
		return id;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}


}
