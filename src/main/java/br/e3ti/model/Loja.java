package br.e3ti.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Loja {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String endereco;
	private String telefone;
	@JoinColumn
	@OneToMany
	private List<Usuario> funcionarios;
	@JoinColumn
	@OneToMany
	private List<Livro> estoque;
	@OneToOne
	private Usuario gerente;
	
	public Loja() {}

	public Loja(String nome, String endereco, String telefone, List<Usuario> funcionarios, List<Livro> estoque,
			Usuario gerente) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.funcionarios = funcionarios;
		this.estoque = estoque;
		this.gerente = gerente;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Usuario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Usuario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<Livro> getEstoque() {
		return estoque;
	}

	public void setEstoque(List<Livro> estoque) {
		this.estoque = estoque;
	}

	public Usuario getGerente() {
		return gerente;
	}

	public void setGerente(Usuario gerente) {
		this.gerente = gerente;
	}

}

	