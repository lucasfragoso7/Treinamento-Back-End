package br.unifacisa.si.treinamento.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Sala {
	
	 @Id
	 private String id;
	 private Short capacidade;
	 private Integer numero;
	 private boolean disponibolidade;

}
