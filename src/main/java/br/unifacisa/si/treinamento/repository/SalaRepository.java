package br.unifacisa.si.treinamento.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import br.unifacisa.si.treinamento.domain.Sala;

public interface SalaRepository extends MongoRepository<Sala,String> {

}
