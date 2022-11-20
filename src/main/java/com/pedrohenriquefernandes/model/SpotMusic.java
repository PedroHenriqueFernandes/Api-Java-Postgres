package com.pedrohenriquefernandes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SpotMusic")
public class SpotMusic {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="duracao")
	private String duracao;
	
	@Column(name="autor")
	private String autor;
	
	@Column(name="ano_lancamento")
	private int ano_lancamento;
	
	@Column(name="estilo_musical")
	private String estilo_musical;

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

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno_lancamento() {
		return ano_lancamento;
	}

	public void setAno_lancamento(int ano_lancamento) {
		this.ano_lancamento = ano_lancamento;
	}

	public String getEstilo_musical() {
		return estilo_musical;
	}

	public void setEstilo_musical(String estilo_musical) {
		this.estilo_musical = estilo_musical;
	}
}