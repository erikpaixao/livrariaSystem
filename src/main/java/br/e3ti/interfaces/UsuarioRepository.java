package br.e3ti.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import br.e3ti.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Usuario findByEmail(String email);
	
	public void save(Long id);

	public Usuario findByUsername(String username);

}
