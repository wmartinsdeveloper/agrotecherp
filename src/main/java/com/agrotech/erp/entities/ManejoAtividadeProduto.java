package com.agrotech.erp.entities;

import java.util.Date;

import com.agrotech.erp.entities.Enums.UnidadePeso;
import com.agrotech.erp.entities.Enums.UnidadeTempo;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ManejoAtividadeProduto")
public class ManejoAtividadeProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Manejo manejo;

    private Date data;

    private String nome; 

    private String descricao; 

    private String observacao; 

    @JsonIgnore
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "produto_id", referencedColumnName = "id")
    private Produto produto;

    private int intervaloTempoProduto; // 1

    @Enumerated(EnumType.STRING)
    private UnidadeTempo unidadeTempoProduto; // MES

    private int intervaloRepeticaoProduto; // 1

    @Enumerated(EnumType.STRING)
    private UnidadeTempo unidadeTempoRepeticaoProduto; // MES

    private int quantidadeUtilizadaProduto; // 20 

    @Enumerated(EnumType.STRING)
    private UnidadePeso unidadePesoUtilizadoProduto; //Gramas

    public ManejoAtividadeProduto() {
    }

    public ManejoAtividadeProduto(Manejo manejo, String nome, String descricao, String observacao, Produto produto,
            int intervaloTempoProduto, UnidadeTempo unidadeTempoProduto, int intervaloRepeticaoProduto,
            UnidadeTempo unidadeTempoRepeticaoProduto, int quantidadeUtilizadaProduto,
            UnidadePeso unidadePesoUtilizadoProduto) {
        this.manejo = manejo;
        this.nome = nome;
        this.descricao = descricao;
        this.observacao = observacao;
        this.produto = produto;
        this.intervaloTempoProduto = intervaloTempoProduto;
        this.unidadeTempoProduto = unidadeTempoProduto;
        this.intervaloRepeticaoProduto = intervaloRepeticaoProduto;
        this.unidadeTempoRepeticaoProduto = unidadeTempoRepeticaoProduto;
        this.quantidadeUtilizadaProduto = quantidadeUtilizadaProduto;
        this.unidadePesoUtilizadoProduto = unidadePesoUtilizadoProduto;
    }

    public Long getId() {
        return id;
    }


    public Manejo getManejo() {
        return manejo;
    }

    public void setManejo(Manejo manejo) {
        this.manejo = manejo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getIntervaloTempoProduto() {
        return intervaloTempoProduto;
    }

    public void setIntervaloTempoProduto(int intervaloTempoProduto) {
        this.intervaloTempoProduto = intervaloTempoProduto;
    }

    public UnidadeTempo getUnidadeTempoProduto() {
        return unidadeTempoProduto;
    }

    public void setUnidadeTempoProduto(UnidadeTempo unidadeTempoProduto) {
        this.unidadeTempoProduto = unidadeTempoProduto;
    }

    public int getIntervaloRepeticaoProduto() {
        return intervaloRepeticaoProduto;
    }

    public void setIntervaloRepeticaoProduto(int intervaloRepeticaoProduto) {
        this.intervaloRepeticaoProduto = intervaloRepeticaoProduto;
    }

    public UnidadeTempo getUnidadeTempoRepeticaoProduto() {
        return unidadeTempoRepeticaoProduto;
    }

    public void setUnidadeTempoRepeticaoProduto(UnidadeTempo unidadeTempoRepeticaoProduto) {
        this.unidadeTempoRepeticaoProduto = unidadeTempoRepeticaoProduto;
    }

    public int getQuantidadeUtilizadaProduto() {
        return quantidadeUtilizadaProduto;
    }

    public void setQuantidadeUtilizadaProduto(int quantidadeUtilizadaProduto) {
        this.quantidadeUtilizadaProduto = quantidadeUtilizadaProduto;
    }

    public UnidadePeso getUnidadePesoUtilizadoProduto() {
        return unidadePesoUtilizadoProduto;
    }

    public void setUnidadePesoUtilizadoProduto(UnidadePeso unidadePesoUtilizadoProduto) {
        this.unidadePesoUtilizadoProduto = unidadePesoUtilizadoProduto;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
   


    

}
