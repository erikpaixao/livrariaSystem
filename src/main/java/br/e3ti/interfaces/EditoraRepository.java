package br.e3ti.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import br.e3ti.model.Editora;

public interface EditoraRepository extends JpaRepository<Editora, Long> {
	

}
