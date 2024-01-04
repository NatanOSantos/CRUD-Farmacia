package com.generation.farmacia.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {

	@Id // define as primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // define o Auto_Increment
	private Long id;

	@NotBlank(message = "O Atributo Setor é obrigatório")
	@Size(max = 255, message = "O Atributo Setor deve conter no máximo 255 caractéres.")
	private String setor;

	@NotBlank(message = "O atributo tipo do produto é obrigatório")
	@Size(max = 255, message = "O Atributo tipo do produto é obrigatorio máximo 255 caracteres.")
	public String tipoDoProduto;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getTipoDoProduto() {
		return tipoDoProduto;
	}

	public void setTipoDoProduto(String tipoDoProduto) {
		this.tipoDoProduto = tipoDoProduto;
	}



}
