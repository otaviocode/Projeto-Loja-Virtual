package jdev.mentoria.lojavirtual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jdev.mentoria.lojavirtual.model.Acesso;
import jdev.mentoria.lojavirtual.repository.AcessoRepository;
import jdev.mentoria.lojavirtual.service.AcessoService;

@Controller
public class AcessoController {

	@Autowired /* Commenting this line, we caused an erro > NullPointerException */
	private AcessoService acessoService;

	@Autowired
	private AcessoRepository acessoRepository;

	@PostMapping("**/salvarAcesso")
	public ResponseEntity<Acesso> salvarAcesso(
			@RequestBody Acesso acesso) { /* Receives a JSON and converts it to an object.! */

		Acesso acessoSalvo = acessoService.save(acesso);

		return new ResponseEntity<Acesso>(acessoSalvo, HttpStatus.OK);

	}

	@PostMapping("**/deleteAcesso")
	public ResponseEntity<Acesso> deleteAcesso(
			@RequestBody Acesso acesso) { /* Receives a JSON and converts it to an object.! */

		acessoRepository.deleteById(acesso.getId());

		return new ResponseEntity(" Access Removed! ",
				HttpStatus.OK); /* The correct anotation is T Body, HttpStatus status! */
		/* if there is an error, add (ResponseEntity<Acesso>(HttpStatus.OK)) */
	}

}
