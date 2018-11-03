package br.unifacisa.si.treinamento.service;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import br.unifacisa.si.treinamento.interfaces.Contrato;
import br.unifacisa.si.treinamento.exceptions.erro;

@Service
public abstract class ServiceGeral<T extends Contrato> {

	protected MongoRepository<T, String> mongoRepository;

	public ServiceGeral(MongoRepository<T, String> mongoRepository) {
		this.mongoRepository = mongoRepository;
	}

	public T create(T t) {
		return mongoRepository.insert(t);
	}

	public T update(T t) throws erro {
		if (!mongoRepository.existsById(t.getId()))
			throw new erro("Não existe");
		return mongoRepository.save(t);
	}

	public void delete(String id) throws erro {
		if (!mongoRepository.existsById(id)) {
			throw new erro("Não existe");
		}
		mongoRepository.deleteById(id);
	}

	public List<T> readAll() {
		return mongoRepository.findAll();
	}

	public T getById(String id) {
		return mongoRepository.findById(id).get();
	}

}