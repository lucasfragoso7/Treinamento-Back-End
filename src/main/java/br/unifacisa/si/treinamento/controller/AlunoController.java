package br.unifacisa.si.treinamento.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import br.unifacisa.si.treinamento.domain.Aluno;
import br.unifacisa.si.treinamento.service.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoController extends ControllerGeral<Aluno> {
	@Autowired
	public AlunoController(AlunoService categoriaService) {
		 super(categoriaService);
		}
}