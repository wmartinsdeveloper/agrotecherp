package com.agrotech.erp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "ReceitaId")
@Table(name = "ReceitaProducao")
public class ReceitaProducao extends Receita{

    @JsonIgnore
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "servico_id", referencedColumnName = "id")
    private Producao producao;

    private int quantidade;

    private double valor;

    private double desconto;

    private double total;

    public ReceitaProducao() {
    }

    public ReceitaProducao(Producao producao, int quantidade, double valor, double desconto, double total) {
        this.producao = producao;
        this.quantidade = quantidade;
        this.valor = valor;
        this.desconto = desconto;
        this.total = total;
    }

    public Producao getProducao() {
        return producao;
    }

    public void setProducao(Producao producao) {
        this.producao = producao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    





}   
