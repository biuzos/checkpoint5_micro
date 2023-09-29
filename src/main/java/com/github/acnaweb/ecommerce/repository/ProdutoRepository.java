package com.github.acnaweb.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gihub.acnaweb.ecommerce.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
