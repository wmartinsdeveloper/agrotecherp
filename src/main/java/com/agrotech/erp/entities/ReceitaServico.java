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
@Table(name = "ReceitaServico")
public class ReceitaServico extends Receita{

    @JsonIgnore
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "servico_id", referencedColumnName = "id")
    private Servico servico;

    private int quantidade;

    private double valor;

    private double desconto;

    private double total;

    public ReceitaServico() {
    }

    public ReceitaServico(Servico servico, int quantidade, double valor, double desconto, double total) {
        this.servico = servico;
        this.quantidade = quantidade;
        this.valor = valor;
        this.desconto = desconto;
        this.total = total;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
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
