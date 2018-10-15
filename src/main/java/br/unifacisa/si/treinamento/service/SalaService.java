package br.unifacisa.si.treinamento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.si.treinamento.domain.Sala;
import br.unifacisa.si.treinamento.repository.SalaRepository;

@Service
public class SalaService {
	@Autowired
	private SalaRepository repository;
	
	public Sala criarAluno(Sala sala) 
	{
		return repository.insert(sala);
	}

}
