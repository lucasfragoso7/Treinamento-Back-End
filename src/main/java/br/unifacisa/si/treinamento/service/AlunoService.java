package br.unifacisa.si.treinamento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.si.treinamento.domain.Aluno;
import br.unifacisa.si.treinamento.repository.AlunoRepository;

@Service
public class AlunoService {
	@Autowired
	private AlunoRepository repository;
	
	public Aluno criarAluno(Aluno aluno) 
	{
		return repository.insert(aluno);
	}
	

}
