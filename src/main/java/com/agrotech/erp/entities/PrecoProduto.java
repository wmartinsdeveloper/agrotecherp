package com.agrotech.erp.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity(name="PrecoProduto")
public class PrecoProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date data;


    @ManyToOne
    private Produto produto;

     @Column(name = "quantidade")    
    private int quantidade;

    @Column(name = "preco")    
    private double preco;

    @Column(name = "precoMedida")   
    private double precoMedidda;

    @Column(name = "desconto")
    private double desconto;

    @Column(name = "precoTotal")
    private double precoTotal;

    public PrecoProduto() {
    }

    public PrecoProduto(Date data, Produto produto, int quantidade, double preco, double precoMedidda, double desconto,
            double precoTotal) {
        this.data = data;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.precoMedidda = precoMedidda;
        this.desconto = desconto;
        this.precoTotal = precoTotal;
    }

    public Long getId() {
        return id;
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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoMedidda() {
        return precoMedidda;
    }

    public void setPrecoMedidda(double precoMedidda) {
        this.precoMedidda = precoMedidda;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    @Override
    public String toString() {
        return "PrecoProduto [id=" + id + ", data=" + data + ", produto=" + produto + ", quantidade=" + quantidade
                + ", preco=" + preco + ", precoMedidda=" + precoMedidda + ", desconto=" + desconto + ", precoTotal="
                + precoTotal + "]";
    }





    
}
