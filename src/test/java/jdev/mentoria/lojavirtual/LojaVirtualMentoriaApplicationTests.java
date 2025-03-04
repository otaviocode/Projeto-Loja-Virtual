package jdev.mentoria.lojavirtual;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jdev.mentoria.lojavirtual.controller.AcessoController;
import jdev.mentoria.lojavirtual.model.Acesso;

@SpringBootTest(classes = LojaVirtualMentoriaApplication.class)
class LojaVirtualMentoriaApplicationTests {

//	@Autowired
//	private AcessoService acessoService;

	@Autowired
	private AcessoController acessoController;

//	@Autowired
//	private AcessoRepository acessoRepository;

	@Test
	public void testCadastroAcesso() {

		Acesso acesso = new Acesso();

		acesso.setDescricao("ROLE_ADMIN");

		/* E Iremos testar o nosso repository: */
		acessoController.salvarAcesso(acesso);

	}

}
