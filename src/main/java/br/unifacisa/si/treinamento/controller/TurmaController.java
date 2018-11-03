package br.unifacisa.si.treinamento.controller;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.unifacisa.si.treinamento.service.TurmaService;

import br.unifacisa.si.treinamento.domain.Turma;
@RequestMapping("/turma")
@RestController
public class TurmaController extends ControllerGeral<Turma>{ 
	@Autowired
	public TurmaController(TurmaService categoriaService) {
		 super(categoriaService);
		}
}
