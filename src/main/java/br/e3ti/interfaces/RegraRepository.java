package br.e3ti.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import br.e3ti.model.Regra;

public interface RegraRepository extends JpaRepository<Regra, Long> {
	

}
