package br.com.anacorp.restaurante.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="prato")
public class Prato {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_prato")
	private int codPrato;
	@Column(name="nome_prato")
	private String nomePrato;
	@Column(name="foto")
	private String foto;
	@Column(name="preco")
	private double preco;
	@ManyToOne
	@JoinColumn(name="cod_categoria")
	private Categoria categoria;
	
	
	public int getCodPrato() {
		return codPrato;
	}
	public void setCodPrato(int codPrato) {
		this.codPrato = codPrato;
	}
	public String getNomePrato() {
		return nomePrato;
	}
	public void setNomePrato(String nomePrato) {
		this.nomePrato = nomePrato;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
}
