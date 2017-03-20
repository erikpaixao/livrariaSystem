package br.e3ti.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import br.e3ti.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	

}
