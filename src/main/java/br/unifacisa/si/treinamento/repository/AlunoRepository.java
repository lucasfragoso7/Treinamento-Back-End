package br.unifacisa.si.treinamento.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.unifacisa.si.treinamento.domain.Aluno;

public interface AlunoRepository extends MongoRepository<Aluno,String> {

}
