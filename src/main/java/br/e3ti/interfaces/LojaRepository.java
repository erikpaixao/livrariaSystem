package br.e3ti.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import br.e3ti.model.Loja;

public interface LojaRepository extends JpaRepository<Loja, Long> {
	

}
