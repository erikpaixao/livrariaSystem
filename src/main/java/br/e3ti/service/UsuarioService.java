package br.e3ti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.e3ti.interfaces.UsuarioRepository;
import br.e3ti.model.Usuario;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public void CriaUsuario(Usuario us){
		repository.save(us.getId());
	}
	
	

}
