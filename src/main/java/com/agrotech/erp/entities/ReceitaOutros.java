package com.agrotech.erp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "ReceitaId")
@Table(name = "ReceitaOutros")
public class ReceitaOutros extends Receita{


    private int quantidade;

    private double valor;

    private double desconto;

    private double total;

    public ReceitaOutros() {
    }

    public ReceitaOutros(int quantidade, double valor, double desconto, double total) {
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






}   
