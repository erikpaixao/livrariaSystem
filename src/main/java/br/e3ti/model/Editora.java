package br.e3ti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Email;

@Entity
public class Editora {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String responsável;
	@Email
	private String email;
	private String telefone;
	
	public Editora(String nome, String responsável, String email, String telefone) {
		super();
		this.nome = nome;
		this.responsável = responsável;
		this.email = email;
		this.telefone = telefone;
	}

	public Editora() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getResponsável() {
		return responsável;
	}

	public void setResponsável(String responsável) {
		this.responsável = responsável;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
