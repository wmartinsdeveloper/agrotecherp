package com.agrotech.erp.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "produto")
public class produto {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Data da Aquisição é uma informação obrigatória.")
    @Column(name = "dataAquisicao")
    private Date dataAquisicao;	 

    @NotBlank(message = "Nome é uma informação obrigatória.")
    @Column(name = "nome")    
    private String nome;

    @NotBlank(message = "Descriçã é uma informação obrigatória.")
    @Column(name = "descricao")    
    private String descricao;

    @NotBlank(message = "Unidade de Peso é uma informação obrigatória.")
    @Column(name = "unidadePeso")
    private unidadePeso unidadePeso;

    @NotBlank(message = "Peso é uma informação obrigatória.")
    @Column(name = "peso")
    private int peso;

    @NotBlank(message = "Quantidade é uma informação obrigatória.")
    @Column(name = "quantidade")    
    private int quantidade;

    @NotBlank(message = "Preço da Aquisição é uma informação obrigatória.")
    @Column(name = "preco")    
    private double preco;

    @NotBlank(message = "Preço da Medida é uma informação obrigatória.")
    @Column(name = "precoMedida")    
    private double precoMedidda;

    @NotBlank(message = "Desconto é uma informação obrigatória.")
    @Column(name = "desconto")
    private double desconto;

    @NotBlank(message = "Preço Total é uma informação obrigatória.")
    @Column(name = "precoTotal")    
    private double precoTotal;

}

