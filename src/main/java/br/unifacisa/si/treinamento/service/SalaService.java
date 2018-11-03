package br.unifacisa.si.treinamento.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.si.treinamento.domain.Sala;
import br.unifacisa.si.treinamento.repository.SalaRepository;

@Service
public class SalaService extends ServiceGeral<Sala>
{
	@Autowired
	public SalaService(SalaRepository repository) 
	{
		super(repository);
	}
}
