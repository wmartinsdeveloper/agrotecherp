package com.agrotech.erp.entities;

import com.agrotech.erp.entities.enums.unidadePeso;
import com.agrotech.erp.entities.enums.unidadeTempo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "cultura")
public class cultura {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é uma informação obrigatória.")
    @Column(name = "nome", unique = true)
    private String nome;

    @NotBlank(message = "Ciclo de Vida é uma informação obrigatória.")
    @Column(name = "cicloVida")
    private int cicloVida;

    @NotBlank(message = "Unidade de Tempo do Ciclo de Vida é uma informação obrigatória.")
    @Column(name = "unidadeCicloVida")
    private unidadeTempo unidadeCicloVida;

    @NotBlank(message = "Tempo de Inicio da Produção de Vida é uma informação obrigatória.")
    @Column(name = "inicioProducao")
    private String inicioProducao;

    @NotBlank(message = "Unidade do Inicio da Produção é uma informação obrigatória.")
    @Column(name = "unidadeInicioProducao")
    private unidadeTempo unidadeInicioProducao;
    
    @NotBlank(message = "Safra Unica é uma informação obrigatória.")
    @Column(name = "safraUnica")    
    private boolean safraUnica;

    @NotBlank(message = "Tempo entre Safra é uma informação obrigatória.")
    @Column(name = "tempoEntreSafra")    
    private String tempoEntreSafra;

    @NotBlank(message = "Unidade Entre Safra é uma informação obrigatória.")
    @Column(name = "unidadeEntreSafra")
    private unidadeTempo unidadeEntreSafra;    

    @NotBlank(message = "Intervalo de Colheita é uma informação obrigatória.")
    @Column(name = "intervaloColheita")    
    private String intervaloColheita;

    @NotBlank(message = "Unidade do intervalo de Colheita é uma informação obrigatória.")
    @Column(name = "unidadeIntervaloColheita")
    private unidadeTempo unidadeIntervaloColheita;   

    @NotBlank(message = "Unidade de Venda é uma informação obrigatória.")
    @Column(name = "unidadeVenda")    
    private String unidadeVenda;    

    @NotBlank(message = "Peso da Unidade de Venda é uma informação obrigatória.")
    @Column(name = "unidadePeso")    
    private unidadePeso unidadePeso;    

}
