package com.gihub.acnaweb.ecommerce.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "produtos")
@Getter
@Setter
public class Produto {
	
	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private Long id;

		@Column(name = "nome", length = 100, nullable = false)
		@Size(max = 100)
		private String nome;

		@Column(name = "data_de_cadastro", nullable = false)
		private Instant dataDeCadastro;
	}

