package com.dev.cisco.domain;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name="aluno")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@Getter
@Setter

public class Aluno implements Serializable {
	
	private static final long serialVersionUID = 4048798961366546485L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Schema(description = "Nome do aluno",example = "Joao Santos",required=true)
	private String nome;
	
	private String cpf;
	private String email;
	
	@Column(length = 4000)
	private String observacao;
}
