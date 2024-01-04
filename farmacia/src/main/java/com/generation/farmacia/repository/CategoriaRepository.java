package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.farmacia.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	// Achar por tipo de Produto
	List<Categoria> findAllByTipoDoProdutoContainingIgnoreCase(@Param("produto") String tipoDoProduto);

	// Achar por Setor
	List<Categoria> findAllBySetorContainingIgnoreCase(@Param("setor") String setor);

}

