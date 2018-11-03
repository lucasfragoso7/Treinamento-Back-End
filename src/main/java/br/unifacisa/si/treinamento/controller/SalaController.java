package br.unifacisa.si.treinamento.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.unifacisa.si.treinamento.service.SalaService;

import br.unifacisa.si.treinamento.domain.Sala;

@RequestMapping("/sala")
@RestController
public class SalaController extends ControllerGeral<Sala> {
	@Autowired
	public SalaController(SalaService categoriaService) {
		 super(categoriaService);
		}
}
