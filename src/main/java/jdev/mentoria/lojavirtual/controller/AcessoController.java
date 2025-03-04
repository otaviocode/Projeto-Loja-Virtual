package jdev.mentoria.lojavirtual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import jdev.mentoria.lojavirtual.model.Acesso;
import jdev.mentoria.lojavirtual.service.AcessoService;

@Controller
public class AcessoController {

	@Autowired
	private AcessoService acessoService;

	@PostMapping("/salvarAcesso")
	public Acesso salvarAcesso(Acesso acesso) {

		/*
		 * Estreiando a nossa injeção de dependencia criando uma url para passar nosso
		 * método de salvar
		 */
		return acessoService.save(acesso);

	}

}
