package br.unifacisa.si.treinamento.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.unifacisa.si.treinamento.domain.Turma;

public interface TurmaRepository extends MongoRepository<Turma,String> {

}
