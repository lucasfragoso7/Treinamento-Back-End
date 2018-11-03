package br.unifacisa.si.treinamento.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.si.treinamento.domain.Turma;

import br.unifacisa.si.treinamento.repository.TurmaRepository;

@Service
public class TurmaService extends ServiceGeral<Turma>
{
	@Autowired
	public TurmaService(TurmaRepository repository) 
	{
		super(repository);
	}
	

}