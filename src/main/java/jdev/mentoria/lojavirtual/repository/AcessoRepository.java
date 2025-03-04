package jdev.mentoria.lojavirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import jdev.mentoria.lojavirtual.model.Acesso;

@Transactional
public interface AcessoRepository extends JpaRepository<Acesso, Long> {

}
