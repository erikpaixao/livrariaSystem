package br.e3ti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.e3ti.interfaces.UsuarioRepository;
import br.e3ti.model.Usuario;
import br.e3ti.util.UrlPath;

@RestController
@RequestMapping(UrlPath.USUARIO)
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	//http://localhost:8080/greeting?name=erik
	@RequestMapping
    public List<Usuario> listarTodos(){
		return usuarioRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void salvar(Usuario usuario){
		usuarioRepository.save(usuario.getId());
	}
	 
}
