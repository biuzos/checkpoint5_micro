package com.github.acnaweb.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gihub.acnaweb.ecommerce.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
