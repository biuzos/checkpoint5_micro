package com.gihub.acnaweb.ecommerce.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "clientes")
@Getter
@Setter
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "nome", nullable = false, length = 100)
	private String nome;

	@Column(name = "CEP", length = 9)
	private String CEP;
	
	
	@Column(name = "logradouro", length = 100)
	private String logradouro;
	
	@Column(name = "numero", length = 10)
	private String numero;
	
	@Column(name = "complemento", length = 20)
	private String complemento;
	
	@Column(name = "bairro", length = 60)
	private String bairro;
	
	@Column(name = "municipio" , length = 60)
	private String municipio;
	
	@Column(name = "UF",  length = 2)
	private String UF;
	
	@Column(name = "data_de_cadastro", nullable = false)
	private Instant dataDeCadastro;
	
	@Column(nullable = false)
	private Boolean ativo;


}
