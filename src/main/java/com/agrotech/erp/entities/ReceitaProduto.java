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
@Table(name = "ReceitaProduto")
public class ReceitaProduto extends Receita{

    @JsonIgnore
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "produti_id", referencedColumnName = "id")
    private Produto produto;

    private int quantidade;

    private double valor;

    private double desconto;

    private double total;

    public ReceitaProduto() {
    }

    

    public ReceitaProduto(Produto produto, int quantidade, double valor, double desconto, double total) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
        this.desconto = desconto;
        this.total = total;
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



    public Produto getProduto() {
        return produto;
    }



    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    





}   
