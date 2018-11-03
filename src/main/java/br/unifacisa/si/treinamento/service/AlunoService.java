package br.unifacisa.si.treinamento.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.unifacisa.si.treinamento.domain.Aluno;
import br.unifacisa.si.treinamento.repository.AlunoRepository;

@Service
public class AlunoService extends ServiceGeral<Aluno>
{
	@Autowired
	public AlunoService(AlunoRepository repository) 
	{
		super(repository);
	}
}
