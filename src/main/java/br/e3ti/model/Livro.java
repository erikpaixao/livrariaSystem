package br.e3ti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Livro {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	@OneToOne
	private Editora editora;
	@OneToOne
	private Categoria categoria;
	private String autor;
	
	public Livro(String nome, Editora editora, Categoria categoria, String autor) {
		super();
		this.nome = nome;
		this.editora = editora;
		this.categoria = categoria;
		this.autor = autor;
	}
	
	public Livro() {}
	
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
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	

}
